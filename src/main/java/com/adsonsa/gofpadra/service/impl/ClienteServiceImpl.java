package com.adsonsa.gofpadra.service.impl;

import com.adsonsa.gofpadra.model.Cliente;
import com.adsonsa.gofpadra.model.ClienteRepository;
import com.adsonsa.gofpadra.model.Endereco;
import com.adsonsa.gofpadra.model.EnderecoRepository;
import com.adsonsa.gofpadra.service.ClienteService;
import com.adsonsa.gofpadra.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // buscar todos os clientes
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // buscar Cliente por id
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        // Inserir Cliente
        salvaClienteComCep(cliente);
    }
    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Atualizar Cliente
        Optional<Cliente> clientebd = clienteRepository.findById(id);
        if (clientebd.isPresent()) {
            salvaClienteComCep(cliente);
        }
    }
    private void salvaClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Salvar Cliente, vinculando o endereco (novo ou existente)
        clienteRepository.save(cliente);
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente
        clienteRepository.deleteById(id);
    }
}

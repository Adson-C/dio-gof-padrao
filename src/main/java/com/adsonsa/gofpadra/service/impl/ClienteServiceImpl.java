package com.adsonsa.gofpadra.service.impl;

import com.adsonsa.gofpadra.model.Cliente;
import com.adsonsa.gofpadra.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Iterable<Cliente> buscarTodos() {
        // buscar todos os clientes
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // buscar Cliente por id
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}

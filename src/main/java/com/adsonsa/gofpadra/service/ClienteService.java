package com.adsonsa.gofpadra.service;

import com.adsonsa.gofpadra.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}

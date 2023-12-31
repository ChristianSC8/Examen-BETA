package com.examen.cliente.cliente.service;

import com.examen.cliente.cliente.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public List<Cliente> list();

    public Cliente save(Cliente cliente);

    public Cliente update(Cliente cliente);

    public Optional<Cliente> listById(Integer id);

    public void deleteById(Integer id);
}

package com.examen.cliente.cliente.service.impl;

import com.examen.cliente.cliente.entity.Cliente;
import com.examen.cliente.cliente.repository.ClienteRepository;
import com.examen.cliente.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> listById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }
}

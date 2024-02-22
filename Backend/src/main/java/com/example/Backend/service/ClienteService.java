package com.example.Backend.service;

import com.example.Backend.model.Cliente;
import com.example.Backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscarClientePorId(Long clienteId) {
        return clienteRepository.findById(clienteId);

    }
}


package com.example.Backend.service;

import com.example.Backend.model.Cliente;
import com.example.Backend.model.Factura;
import com.example.Backend.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public List<Factura> buscarFacturasPorCliente(Optional<Cliente> cliente) {
        return facturaRepository.findByCliente(cliente);
    }


}

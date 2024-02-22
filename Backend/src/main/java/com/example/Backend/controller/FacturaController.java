package com.example.Backend.controller;

import com.example.Backend.model.Cliente;
import com.example.Backend.model.Factura;
import com.example.Backend.service.ClienteService;
import com.example.Backend.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;
    @Autowired
    private ClienteService clienteService;
    @PostMapping
    public ResponseEntity<Factura> guardarFactura(@RequestBody Factura factura) {
        Factura nuevaFactura = facturaService.guardarFactura(factura);
        return new ResponseEntity<>(nuevaFactura, HttpStatus.CREATED);
    }

    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<Factura>> obtenerFacturasPorCliente(@PathVariable Long clienteId) {
        Optional<Cliente> cliente = clienteService.buscarClientePorId(clienteId);
        List<Factura> facturas = facturaService.buscarFacturasPorCliente(cliente);
        return new ResponseEntity<>(facturas, HttpStatus.OK);
    }
}

package com.example.Backend.repository;

import com.example.Backend.model.Cliente;
import com.example.Backend.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    List<Factura> findByCliente(Cliente cliente);

}

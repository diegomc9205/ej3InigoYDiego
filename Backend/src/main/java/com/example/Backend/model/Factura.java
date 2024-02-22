package com.example.Backend.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal importeTotal;
    // Otras propiedades de la factura

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public  Factura(){}
    public Factura(Long id, BigDecimal importeTotal, Cliente cliente) {
        this.id = id;
        this.importeTotal = importeTotal;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

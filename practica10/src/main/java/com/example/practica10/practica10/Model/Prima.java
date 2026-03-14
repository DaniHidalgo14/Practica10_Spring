package com.example.practica10.practica10.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "primas")
public class Prima {
    @Id
    private int id;
    private String tipo;
    private double aumento;
    @ManyToOne
    @JoinColumn(name = "id_contrato")
    private Contrato contrato;

    public Prima(int id, String tipo, double aumento) {
        this.id = id;
        this.tipo = tipo;
        this.aumento = aumento;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}

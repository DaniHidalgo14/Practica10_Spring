package com.example.practica10.practica10.Model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    private int id;

    private int duracion;
    private double salario;
    private LocalDate fechaFin;
    @OneToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Prima> primas;

    public Contrato(int id, int duracion, double salario, LocalDate fechaFin, Jugador jugador) {
        this.duracion = duracion;
        this.fechaFin = fechaFin;
        this.id = id;
        this.jugador = jugador;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public List<Prima> getPrimas() {
        return primas;
    }

    public void setPrimas(List<Prima> primas) {
        this.primas = primas;
    }
}

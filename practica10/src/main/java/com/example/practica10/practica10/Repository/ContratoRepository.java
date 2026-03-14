package com.example.practica10.practica10.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practica10.practica10.Model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
    Contrato findByJugador(int id_jugador);
}

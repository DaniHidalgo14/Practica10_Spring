package com.example.practica10.practica10.Service;

import java.util.List;

import com.example.practica10.practica10.Model.Jugador;

public interface JugadorService {
    List<Jugador> findAll();
    Jugador findById(int id);
}

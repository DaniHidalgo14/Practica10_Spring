package com.example.practica10.practica10.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practica10.practica10.Repository.JugadorRepository;
import java.util.List;
import com.example.practica10.practica10.Model.Jugador;
import com.example.practica10.practica10.Service.JugadorService;

@Service
public class JugadorServiceImpl implements JugadorService {
    @Autowired
    private JugadorRepository repo;

    @Override
    public List<Jugador> findAll() {
        return repo.findAll();
    }

    @Override
    public Jugador findById(int id) {
        return repo.findById(id).orElse(null);
    }
}

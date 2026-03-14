package com.example.practica10.practica10.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practica10.practica10.Service.ContratoService;
import com.example.practica10.practica10.Repository.ContratoRepository;
import com.example.practica10.practica10.Model.Contrato;

@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    private ContratoRepository repo;

    @Override
    public Contrato findByJugador(Integer id_jugador) {
        return repo.findByJugador(id_jugador);
    }
}

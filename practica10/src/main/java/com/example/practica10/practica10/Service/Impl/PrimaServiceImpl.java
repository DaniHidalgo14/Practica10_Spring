package com.example.practica10.practica10.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practica10.practica10.Repository.PrimaRepository;
import com.example.practica10.practica10.Model.Prima;
import java.util.List;
import com.example.practica10.practica10.Service.PrimaService;

@Service
public class PrimaServiceImpl implements PrimaService {
    @Autowired
    private PrimaRepository repo;

    @Override
    public List<Prima> findByContrato(Integer id_contrato) {
        return repo.findByContrato(id_contrato);
    }
}

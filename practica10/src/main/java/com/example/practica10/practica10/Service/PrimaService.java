package com.example.practica10.practica10.Service;
import com.example.practica10.practica10.Model.Prima;
import java.util.List;

public interface PrimaService {
    List<Prima> findByContrato(Integer id_contrato);
}

package com.example.practica10.practica10.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.practica10.practica10.Model.Prima;

public interface PrimaRepository extends JpaRepository<Prima, Integer> {
    List<Prima> findByContrato(int id_contrato);
}

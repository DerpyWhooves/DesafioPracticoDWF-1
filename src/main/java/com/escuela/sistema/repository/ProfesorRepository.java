package com.escuela.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.sistema.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
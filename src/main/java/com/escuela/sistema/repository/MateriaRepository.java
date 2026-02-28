package com.escuela.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.sistema.entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
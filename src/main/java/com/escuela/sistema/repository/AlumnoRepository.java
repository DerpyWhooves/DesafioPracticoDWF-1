package com.escuela.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.escuela.sistema.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
package com.escuela.sistema.repository;

import com.escuela.sistema.entity.AlumnoMateria;
import com.escuela.sistema.entity.AlumnoMateriaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoMateriaRepository
        extends JpaRepository<AlumnoMateria, AlumnoMateriaId> {
}
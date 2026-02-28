package com.escuela.sistema;

import com.escuela.sistema.entity.*;
import com.escuela.sistema.repository.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import org.springframework.test.annotation.Commit;

@SpringBootTest
@Transactional
public class PersistenceTest {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private AlumnoMateriaRepository alumnoMateriaRepository;

    @Test
    @Commit
    void insertarDatos() {

        // ====== PROFESORES ======
        Profesor profesor1 = profesorRepository.save(new Profesor("Ricardo"));
        Profesor profesor2 = profesorRepository.save(new Profesor("Elena"));

        // ====== MATERIAS ======
        Materia materia1 = materiaRepository.save(
                new Materia("Matemática", profesor1.getId())
        );

        Materia materia2 = materiaRepository.save(
                new Materia("Historia", profesor2.getId())
        );

        // ====== ALUMNOS ======
        Alumno alumno1 = alumnoRepository.save(
                new Alumno("Carlos", "Pérez")
        );

        Alumno alumno2 = alumnoRepository.save(
                new Alumno("María", "López")
        );

        // ====== INSCRIPCIONES (tabla intermedia) ======
        alumnoMateriaRepository.save(
                new AlumnoMateria(alumno1.getId(), materia1.getId())
        );

        alumnoMateriaRepository.save(
                new AlumnoMateria(alumno2.getId(), materia2.getId())
        );
    }
}
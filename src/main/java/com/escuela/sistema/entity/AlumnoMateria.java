package com.escuela.sistema.entity;

import jakarta.persistence.*;

@Entity
@IdClass(AlumnoMateriaId.class)
@Table(name = "alumno_materia")
public class AlumnoMateria {

    @Id
    @Column(name = "id_alumno")
    private Long idAlumno;

    @Id
    @Column(name = "id_materia")
    private Long idMateria;

    public AlumnoMateria() {
    }

    public AlumnoMateria(Long idAlumno, Long idMateria) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public Long getIdMateria() {
        return idMateria;
    }
}
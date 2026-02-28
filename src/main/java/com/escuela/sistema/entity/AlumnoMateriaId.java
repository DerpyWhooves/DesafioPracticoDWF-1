package com.escuela.sistema.entity;

import java.io.Serializable;
import java.util.Objects;

public class AlumnoMateriaId implements Serializable {

    private Long idAlumno;
    private Long idMateria;

    public AlumnoMateriaId() {
    }

    public AlumnoMateriaId(Long idAlumno, Long idMateria) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlumnoMateriaId)) return false;
        AlumnoMateriaId that = (AlumnoMateriaId) o;
        return Objects.equals(idAlumno, that.idAlumno) &&
                Objects.equals(idMateria, that.idMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, idMateria);
    }
}
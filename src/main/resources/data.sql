INSERT INTO profesor(nombre) VALUES ('Carlos');
INSERT INTO profesor(nombre) VALUES ('Maria');
INSERT INTO profesor(nombre) VALUES ('Luis');
INSERT INTO profesor(nombre) VALUES ('Andrea');
INSERT INTO profesor(nombre) VALUES ('Jose');

INSERT INTO alumno(nombre, apellido) VALUES ('Juan', 'Perez');
INSERT INTO alumno(nombre, apellido) VALUES ('Ana', 'Lopez');
INSERT INTO alumno(nombre, apellido) VALUES ('Pedro', 'Martinez');
INSERT INTO alumno(nombre, apellido) VALUES ('Lucia', 'Gomez');
INSERT INTO alumno(nombre, apellido) VALUES ('Miguel', 'Rojas');

INSERT INTO materia(nombre, id_profesor) VALUES ('Matematica', 1);
INSERT INTO materia(nombre, id_profesor) VALUES ('Historia', 2);
INSERT INTO materia(nombre, id_profesor) VALUES ('Fisica', 3);
INSERT INTO materia(nombre, id_profesor) VALUES ('Quimica', 4);
INSERT INTO materia(nombre, id_profesor) VALUES ('Programacion', 5);

INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (1,1);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (2,2);
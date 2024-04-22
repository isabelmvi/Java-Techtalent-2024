CREATE DATABASE cientificos_proyecto,
USE cientificos_proyecto,

CREATE TABLE cientificos(
    DNI VARCHAR(9) NOT NULL,
    PRIMARY KEY (DNI),
    NomApels VARCHAR(255)
)

CREATE TABLE proyecto(
    id CHAR(4) NOT NULL,
    PRIMARY KEY(id),
    Nombre VARCHAR(255),
    Horas int NOT NULL
)

CREATE TABLE asignado_a(
    Cientifico VARCHAR(8) NOT NULL,
    FOREIGN KEY(Cientifico) REFERENCES cientificos(DNI),
    Proyecto CHAR(4) NOT NULL,
    FOREIGN KEY(Proyecto) REFERENCES proyecto(id),
)
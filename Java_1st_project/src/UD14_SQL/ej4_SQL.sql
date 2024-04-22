CREATE DATABASE empleados,
USE empleados,

CREATE TABLE departamentos(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Presupuesto int
)

CREATE TABLE empleados(
    DNI VARCHAR(9) NOT NULL,
    PRIMARY KEY(DNI),
    Nombre VARCHAR(100),
    Apellidos VARCHAR(255),
    Departamento int NOT NULL,
    FOREIGN KEY (Departamento) REFERENCES departamentos(Codigo)
)
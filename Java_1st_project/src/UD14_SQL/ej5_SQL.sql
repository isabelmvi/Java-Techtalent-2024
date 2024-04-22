CREATE DATABASE almacenes,
USE almacenes,

CREATE TABLE almacenes(
    Codigo int NOT NULL,
    PRIMARY KEY(Codigo),
    Lugar VARCHAR(100),
    Capacidad int NOT NULL
)

CREATE TABLE cajas(
    NumReferencia CHAR(5) NOT NULL,
    PRIMARY KEY (NumReferencia),
    Contenido VARCHAR(100),
    Valor int NOT NULL,
    Almacen int NOT NULL,
    FOREIGN KEY (Almacen) REFERENCES almacenes(Codigo)
)
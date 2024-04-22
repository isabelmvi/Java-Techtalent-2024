CREATE DATABASE tienda_informatica,
USE tienda_informatica,

CREATE TABLE fabricantes(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100)
)

CREATE TABLE articulos(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Precio int NOT NULL,
    Fabricante int NOT NULL,
    FOREIGN KEY (Fabricante) REFERENCES fabricantes(Codigo)
)
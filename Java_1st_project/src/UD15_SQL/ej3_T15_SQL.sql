CREATE DATABASE tienda_informatica,
USE tienda_informatica,

CREATE TABLE fabricantes(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100)
)
INSERT INTO fabricantes (Codigo, Nombre) VALUES
(1, 'Fabricante A'),
(2, 'Fabricante B'),
(3, 'Fabricante C'),
(4, 'Fabricante D'),
(5, 'Fabricante E'),
(6, 'Fabricante F'),
(7, 'Fabricante G'),
(8, 'Fabricante H'),
(9, 'Fabricante I'),
(10, 'Fabricante J');


CREATE TABLE articulos(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Precio int NOT NULL,
    Fabricante int NOT NULL,
    FOREIGN KEY (Fabricante) REFERENCES fabricantes(Codigo)
)
INSERT INTO articulos (Codigo, Nombre, Precio, Fabricante) VALUES
(101, 'Artículo 1', 50, 1),
(102, 'Artículo 2', 60, 1),
(103, 'Artículo 3', 70, 2),
(104, 'Artículo 4', 80, 2),
(105, 'Artículo 5', 90, 3),
(106, 'Artículo 6', 100, 3),
(107, 'Artículo 7', 110, 4),
(108, 'Artículo 8', 120, 4),
(109, 'Artículo 9', 130, 5),
(110, 'Artículo 10', 140, 5);
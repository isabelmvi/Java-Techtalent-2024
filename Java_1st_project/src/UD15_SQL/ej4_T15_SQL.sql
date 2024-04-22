CREATE DATABASE IF NOT EXISTS `grandes_almacenes` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `grandes_almacenes`;

CREATE TABLE `cajeros` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `NomApels` varchar(255)
)
INSERT INTO cajeros (Codigo, NomApels) VALUES
(1, 'Juan Perez'),
(2, 'Maria Rodriguez'),
(3, 'Luis Garcia'),
(4, 'Ana Martinez'),
(5, 'Pedro Sanchez'),
(6, 'Laura Gomez'),
(7, 'Carlos Fernandez'),
(8, 'Sara Lopez'),
(9, 'Pablo Diaz'),
(10, 'Elena Ruiz');

CREATE TABLE `maquinas_registradoras` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `Piso` int
)
INSERT INTO maquinas_registradoras (Codigo, Piso) VALUES
(101, 1),
(102, 1),
(103, 2),
(104, 2),
(105, 3),
(106, 3),
(107, 4),
(108, 4),
(109, 5),
(110, 5);


CREATE TABLE `productos` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `Nombre` varchar(100) DEFAULT NULL,
  `Precio` int DEFAULT NULL
)
INSERT INTO productos (Codigo, Nombre, Precio) VALUES
(1001, 'Camiseta', 20),
(1002, 'Pantalón', 30),
(1003, 'Zapatos', 50),
(1004, 'Bufanda', 15),
(1005, 'Sombrero', 25),
(1006, 'Gorra', 10),
(1007, 'Calcetines', 5),
(1008, 'Guantes', 8),
(1009, 'Chaqueta', 40),
(1010, 'Falda', 25);

CREATE TABLE `venta` (
  `Cajero` int,
  FOREIGN KEY (Cajero) REFERENCES cajeros(Codigo),
  `Maquina` int,
  FOREIGN KEY Maquina REFERENCES maquinas_registradoras(Codigo),
  `Producto` int,
  FOREIGN KEY Producto REFERENCES productos(Codigo)
)
INSERT INTO venta (Cajero, Maquina, Producto) VALUES
(1, 101, 1001),
(2, 102, 1002),
(3, 103, 1003),
(4, 104, 1004),
(5, 105, 1005),
(6, 106, 1006),
(7, 107, 1007),
(8, 108, 1008),
(9, 109, 1009),
(10, 110, 1010);

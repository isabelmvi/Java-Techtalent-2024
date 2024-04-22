CREATE DATABASE IF NOT EXISTS `grandes_almacenes` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `grandes_almacenes`;

CREATE TABLE `cajeros` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `NomApels` varchar(255)
)

CREATE TABLE `maquinas_registradoras` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `Piso` int
)

CREATE TABLE `productos` (
  `Codigo` int NOT NULL,
  PRIMARY KEY(Codigo),
  `Nombre` varchar(100) DEFAULT NULL,
  `Precio` int DEFAULT NULL
)

CREATE TABLE `venta` (
  `Cajero` int,
  FOREIGN KEY (Cajero) REFERENCES cajeros(Codigo),
  `Maquina` int,
  FOREIGN KEY Maquina REFERENCES maquinas_registradoras(Codigo),
  `Producto` int,
  FOREIGN KEY Producto REFERENCES productos(Codigo)
)

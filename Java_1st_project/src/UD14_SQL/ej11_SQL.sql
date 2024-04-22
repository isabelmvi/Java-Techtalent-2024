CREATE DATABASE investigadores_facultad,
USE investigadores_facultad,

CREATE TABLE `equipos` (
  `NumSerie` char(4) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Facultad` int(11) DEFAULT NULL
) 

CREATE TABLE `facultad` (
  `Codigo` int(11) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL
) 

CREATE TABLE `investigadores` (
  `DNI` varchar(9) NOT NULL,
  `NomApels` varchar(255) DEFAULT NULL,
  `Facultad` int(11) DEFAULT NULL
) 

CREATE TABLE `reserva` (
  `DNI` varchar(9) DEFAULT NULL,
  `NumSerie` char(4) DEFAULT NULL,
  `Comienzo` date DEFAULT '2024-05-04',
  `Fin` date DEFAULT '2025-05-03'
)
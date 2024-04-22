CREATE DATABASE investigadores_facultad,
USE investigadores_facultad,

CREATE TABLE `equipos` (
  `NumSerie` char(4) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Facultad` int(11) DEFAULT NULL
) 
INSERT INTO equipos (NumSerie, Nombre, Facultad) VALUES
('1234', 'Equipo A', 1),
('5678', 'Equipo B', 2),
('9101', 'Equipo C', 3),
('2345', 'Equipo D', 1),
('6789', 'Equipo E', 2),
('1011', 'Equipo F', 3),
('3456', 'Equipo G', 1),
('7890', 'Equipo H', 2),
('1112', 'Equipo I', 3),
('4567', 'Equipo J', 1);

CREATE TABLE `facultad` (
  `Codigo` int(11) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL
) 
INSERT INTO facultad (Codigo, Nombre) VALUES
(1, 'Facultad de Ciencias'),
(2, 'Facultad de Ingeniería'),
(3, 'Facultad de Medicina'),
(4, 'Facultad de Artes'),
(5, 'Facultad de Derecho'),
(6, 'Facultad de Economía'),
(7, 'Facultad de Educación'),
(8, 'Facultad de Psicología'),
(9, 'Facultad de Comunicación'),
(10, 'Facultad de Veterinaria');

CREATE TABLE `investigadores` (
  `DNI` varchar(9) NOT NULL,
  `NomApels` varchar(255) DEFAULT NULL,
  `Facultad` int(11) DEFAULT NULL
) 
INSERT INTO investigadores (DNI, NomApels, Facultad) VALUES
('123456789', 'Juan Pérez', 1),
('987654321', 'María Gómez', 2),
('567890123', 'Pedro Martínez', 3),
('321098765', 'Ana López', 1),
('135792468', 'Luis García', 2),
('246801357', 'Laura Rodríguez', 3),
('111222333', 'Carlos Sánchez', 1),
('444555666', 'Elena Fernández', 2),
('777888999', 'Sofía Díaz', 3),
('888999000', 'David Ruiz', 1);


CREATE TABLE `reserva` (
  `DNI` varchar(9) DEFAULT NULL,
  `NumSerie` char(4) DEFAULT NULL,
  `Comienzo` date DEFAULT '2024-05-04',
  `Fin` date DEFAULT '2025-05-03'
)
INSERT INTO reserva (DNI, NumSerie, Comienzo, Fin) VALUES
('123456789', '1234', '2024-05-04', '2025-05-03'),
('987654321', '5678', '2024-05-05', '2025-05-04'),
('567890123', '9101', '2024-05-06', '2025-05-05'),
('321098765', '2345', '2024-05-07', '2025-05-06'),
('135792468', '6789', '2024-05-08', '2025-05-07'),
('246801357', '1011', '2024-05-09', '2025-05-08'),
('111222333', '3456', '2024-05-10', '2025-05-09'),
('444555666', '7890', '2024-05-11', '2025-05-10'),
('777888999', '1112', '2024-05-12', '2025-05-11'),
('888999000', '4567', '2024-05-13', '2025-05-12');
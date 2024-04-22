CREATE DATABASE IF NOT EXISTS `directores_despachos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `directores_despachos`;

CREATE TABLE `despachos` (
  `num` int(11) NOT NULL,
  `Capacidad` int(11) NOT NULL
  ADD PRIMARY KEY (`num`)
   MODIFY `num` int(11) NOT NULL AUTO_INCREMENT;
)
INSERT INTO `despachos` (`num`, `Capacidad`) VALUES
(1, 5),
(2, 4),
(3, 6),
(4, 3),
(5, 7),
(6, 5),
(7, 4),
(8, 6),
(9, 3),
(10, 8);

CREATE TABLE `directores` (
  `DNI` varchar(9) NOT NULL,
  `NomApels` varchar(255) DEFAULT NULL,
  `DNIJefe` varchar(9) DEFAULT NULL,
  `despacho` int(11) NOT NULL
   ADD PRIMARY KEY (`DNI`),
  ADD KEY `DNIJefe` (`DNIJefe`),
  ADD KEY `despacho` (`despacho`);
  ADD CONSTRAINT `directores_ibfk_1` FOREIGN KEY (`DNIJefe`) REFERENCES `directores` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `directores_ibfk_2` FOREIGN KEY (`despacho`) REFERENCES `despachos` (`num`) ON DELETE CASCADE ON UPDATE CASCADE;
)
INSERT INTO `directores` (`DNI`, `NomApels`, `DNIJefe`, `despacho`) VALUES
('123456789', 'Juan Pérez', NULL, 1),
('987654321', 'María López', '123456789', 2),
('234567890', 'Pedro Martínez', '123456789', 3),
('345678901', 'Ana García', '987654321', 4),
('456789012', 'Carlos Sánchez', '987654321', 5),
('567890123', 'Laura Rodríguez', '234567890', 6),
('678901234', 'David Fernández', '234567890', 7),
('789012345', 'Sofía Ruiz', '234567890', 8),
('890123456', 'Elena Gómez', '345678901', 9),
('901234567', 'Javier Díaz', '345678901', 10);
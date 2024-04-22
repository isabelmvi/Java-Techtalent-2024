CREATE DATABASE IF NOT EXISTS `directores_despachos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `directores_despachos`;

CREATE TABLE `despachos` (
  `num` int(11) NOT NULL,
  `Capacidad` int(11) NOT NULL
  ADD PRIMARY KEY (`num`)
)

CREATE TABLE `directores` (
  `DNI` varchar(9) NOT NULL,
  `NomApels` varchar(255) DEFAULT NULL,
  `DNIJefe` varchar(9) DEFAULT NULL,
  `despacho` int(11) NOT NULL
)

ALTER TABLE `directores`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `DNIJefe` (`DNIJefe`),
  ADD KEY `despacho` (`despacho`);

ALTER TABLE `despachos`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `directores`
  ADD CONSTRAINT `directores_ibfk_1` FOREIGN KEY (`DNIJefe`) REFERENCES `directores` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `directores_ibfk_2` FOREIGN KEY (`despacho`) REFERENCES `despachos` (`num`) ON DELETE CASCADE ON UPDATE CASCADE;

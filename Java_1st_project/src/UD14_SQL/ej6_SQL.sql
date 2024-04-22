CREATE DATABASE IF NOT EXISTS `peliculasysalas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `peliculasysalas`;

CREATE TABLE `peliculas` (
  `Codigo` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`);
  `Nombre` varchar(100) DEFAULT NULL,
  `CalificacionEdad` int(11) DEFAULT NULL
   MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT;
)

CREATE TABLE `salas` (
  `Codigo` int(11) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Pelicula` int(11) DEFAULT NULL
   ADD PRIMARY KEY (`Codigo`),
   ADD KEY `Pelicula` (`Pelicula`);
   MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT;
   ADD CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`Pelicula`) REFERENCES `peliculas` (`Codigo`);
)
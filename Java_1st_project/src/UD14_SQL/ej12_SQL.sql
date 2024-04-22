CREATE DATABASE IF NOT EXISTS `academia_idiomas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `academia_idiomas`;

CREATE TABLE `alumnos` (
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido1` varchar(50) DEFAULT NULL,
  `Apellido2` varchar(50) DEFAULT NULL,
  `DNI` varchar(9) NOT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Sexo` char(1) DEFAULT NULL CHECK (`Sexo` in ('M','H')),
  `FechaNacimiento` date DEFAULT NULL,
  `Curso` int(11) DEFAULT NULL
   ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`Curso`) REFERENCES `cursos` (`cod_Curso`);
) 

CREATE TABLE `cursos` (
  `Nombre_curso` varchar(100) DEFAULT NULL,
  `cod_Curso` int(11) NOT NULL,
  `DNI_profesor` varchar(9) DEFAULT NULL,
  `Max_alumnos` int(11) DEFAULT NULL,
  `Fecha_inicio` date DEFAULT NULL,
  `Fecha_fin` date DEFAULT NULL,
  `Num_horas` int(11) DEFAULT NULL
  ADD CONSTRAINT `cursos_ibfk_1` FOREIGN KEY (`DNI_profesor`) REFERENCES `profesores` (`DNI`)
) ;

CREATE TABLE `profesores` (
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido1` varchar(50) DEFAULT NULL,
  `Apellido2` varchar(50) DEFAULT NULL,
  `DNI` varchar(9) NOT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Titulo` varchar(100) DEFAULT NULL,
  `Gana` varchar(100) NOT NULL
)
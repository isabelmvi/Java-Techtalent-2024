CREATE DATABASE IF NOT EXISTS `estacionmeteorologica` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `estacionmeteorologica`;

CREATE TABLE `estacion` (
  `identificador` int(11) NOT NULL,
  `latitud` decimal(10,6) DEFAULT NULL,
  `longitud` decimal(10,6) DEFAULT NULL,
  `altitud` int(11) DEFAULT NULL
    ADD PRIMARY KEY (`identificador`);
    MODIFY `identificador` int(11) NOT NULL AUTO_INCREMENT;
)

CREATE TABLE `muestra` (
  `id` int(11) NOT NULL,
  `identificadorEstacion` int(11) DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Temperatura_min` decimal(5,2) DEFAULT NULL,
  `Temperatura_max` decimal(5,2) DEFAULT NULL,
  `Precipitaciones` decimal(5,2) DEFAULT NULL,
  `Humedad_min` decimal(5,2) DEFAULT NULL,
  `Humedad_max` decimal(5,2) DEFAULT NULL,
  `Velocidad_viento_min` decimal(5,2) DEFAULT NULL,
  `Velocidad_viento_max` decimal(5,2) DEFAULT NULL
  ADD PRIMARY KEY (`id`),
  ADD KEY `identificadorEstacion` (`identificadorEstacion`);
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
  ADD CONSTRAINT `muestra_ibfk_1` FOREIGN KEY (`identificadorEstacion`) REFERENCES `estacion` (`identificador`);

)
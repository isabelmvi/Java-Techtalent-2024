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
INSERT INTO estacion (latitud, longitud, altitud) VALUES
(40.7128, -74.0060, 10),
(34.0522, -118.2437, 50),
(51.5074, -0.1278, 20),
(48.8566, 2.3522, 30),
(41.8781, -87.6298, 15),
(35.6895, 139.6917, 25),
(55.7558, 37.6173, 40),
(52.5200, 13.4050, 35),
(-33.8688, 151.2093, 45),
(-22.9068, -43.1729, 55);

INSERT INTO muestra (identificadorEstacion, Fecha, Temperatura_min, Temperatura_max, Precipitaciones, Humedad_min, Humedad_max, Velocidad_viento_min, Velocidad_viento_max) VALUES
(1, '2024-04-22', 10.5, 20.5, 5.2, 40, 70, 5.0, 15.0),
(2, '2024-04-22', 15.0, 25.0, 10.0, 45, 75, 6.0, 18.0),
(3, '2024-04-22', 8.0, 18.0, 2.5, 38, 68, 4.0, 12.0),
(4, '2024-04-22', 12.0, 22.0, 7.0, 42, 72, 5.5, 16.0),
(5, '2024-04-22', 9.5, 19.5, 3.0, 39, 69, 4.5, 14.0),
(6, '2024-04-22', 14.5, 24.5, 9.0, 44, 74, 6.5, 17.0),
(7, '2024-04-22', 11.0, 21.0, 6.0, 41, 71, 5.0, 15.5),
(8, '2024-04-22', 13.0, 23.0, 8.0, 43, 73, 6.0, 16.5),
(9, '2024-04-22', 10.0, 20.0, 4.5, 40, 70, 5.0, 15.0),
(10, '2024-04-22', 12.5, 22.5, 7.5, 42, 72, 5.5, 16.0);

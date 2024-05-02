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

INSERT INTO peliculas (Nombre, CalificacionEdad) VALUES
('Titanic', 13),
('The Shawshank Redemption', 16),
('The Godfather', 18),
('Forrest Gump', 12),
('Pulp Fiction', 18),
('The Matrix', 16),
('Inception', 13),
('The Silence of the Lambs', 18),
('The Lion King', 0),
('The Dark Knight', 16);

INSERT INTO salas (Nombre, Pelicula) VALUES
('Sala 1', 1),
('Sala 2', 2),
('Sala 3', 3),
('Sala 4', 4),
('Sala 5', 5),
('Sala 6', 6),
('Sala 7', 7),
('Sala 8', 8),
('Sala 9', 9),
('Sala 10', 10);

-- 4.1 Mostrar el nombre de todas las películas
SELECT Nombre
FROM peliculas;

-- 4.2 Mostrar las distintas calificaciones de edad que existen
SELECT DISTINCT CalificacionEdad
FROM peliculas;

-- 4.3 Mostrar todas las películas que no han sido calificadas
SELECT Nombre
FROM peliculas
WHERE CalificacionEdad IS NULL;

-- 4.4 Mostrar todas las salas que no proyectan ninguna película
SELECT *
FROM salas
WHERE Pelicula IS NULL;

-- 4.5 Mostrar la información de todas las salas y, si se proyecta alguna película en la sala, mostrar también la información de la película
SELECT s.Codigo AS Codigo_sala, s.Nombre AS Nombre_sala, p.Codigo AS Codigo_pelicula, p.Nombre AS Nombre_pelicula
FROM salas s
LEFT JOIN peliculas p ON s.Pelicula = p.Codigo;

-- 4.6 Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala
SELECT p.Codigo AS Codigo_pelicula, p.Nombre AS Nombre_pelicula, p.CalificacionEdad, s.Codigo AS Codigo_sala, s.Nombre AS Nombre_sala
FROM peliculas p
LEFT JOIN salas s ON p.Codigo = s.Pelicula;

-- 4.7 Mostrar los nombres de las películas que no se proyectan en ninguna sala
SELECT Nombre
FROM peliculas
WHERE Codigo NOT IN (SELECT Pelicula FROM salas WHERE Pelicula IS NOT NULL);

-- 4.8 Añadir una nueva película 'Uno, Dos, Tres', para mayores de 7 años
INSERT INTO peliculas (Nombre, CalificacionEdad)
VALUES ('Uno, Dos, Tres', 7);

-- 4.9 Hacer constar que todas las películas no calificadas han sido calificadas 'no recomendables para menores de 13 años'
UPDATE peliculas
SET CalificacionEdad = 13
WHERE CalificacionEdad IS NULL;

-- 4.10 Eliminar todas las salas que proyectan películas recomendadas para todos los públicos
DELETE FROM salas
WHERE Pelicula IN (SELECT Codigo FROM peliculas WHERE CalificacionEdad = 0);
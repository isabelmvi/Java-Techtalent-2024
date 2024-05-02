CREATE DATABASE almacenes,
USE almacenes,

CREATE TABLE almacenes(
    Codigo int NOT NULL,
    PRIMARY KEY(Codigo),
    Lugar VARCHAR(100),
    Capacidad int NOT NULL
)

CREATE TABLE cajas(
    NumReferencia CHAR(5) NOT NULL,
    PRIMARY KEY (NumReferencia),
    Contenido VARCHAR(100),
    Valor int NOT NULL,
    Almacen int NOT NULL,
    FOREIGN KEY (Almacen) REFERENCES almacenes(Codigo)
)

INSERT INTO almacenes (Codigo, Lugar, Capacidad) VALUES
(1, 'Almacén A', 100),
(2, 'Almacén B', 150),
(3, 'Almacén C', 200),
(4, 'Almacén D', 120),
(5, 'Almacén E', 180),
(6, 'Almacén F', 220),
(7, 'Almacén G', 130),
(8, 'Almacén H', 190),
(9, 'Almacén I', 170),
(10, 'Almacén J', 210);

INSERT INTO cajas (NumReferencia, Contenido, Valor, Almacen) VALUES
('A1234', 'Libros', 50, 1),
('B5678', 'Ropa', 100, 2),
('C91011', 'Electrodomésticos', 200, 3),
('D121314', 'Juguetes', 80, 4),
('E151617', 'Herramientas', 120, 5),
('F181920', 'Electrónica', 150, 6),
('G212223', 'Muebles', 300, 7),
('H242526', 'Comida', 70, 8),
('I272829', 'Artículos deportivos', 90, 9),
('J303132', 'Productos de limpieza', 60, 10);

-- 3.1 Obtener todos los almacenes 
SELECT * FROM almacenes;

-- 3.2 Obtener todas las cajas cuyo contenido tenga un valor superior a 150 €
SELECT *
FROM cajas
WHERE Valor > 150;

-- 3.3 Obtener los tipos de contenidos de las cajas
SELECT DISTINCT Contenido
FROM cajas;

-- 3.4 Obtener el valor medio de todas las cajas
SELECT AVG(Valor) AS Valor_medio
FROM cajas;

-- 3.5 Obtener el valor medio de las cajas de cada almacen
SELECT Almacen, AVG(Valor) AS Valor_medio
FROM cajas
GROUP BY Almacen;

-- 3.6 Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150 €
SELECT Almacen
FROM cajas
GROUP BY Almacen
HAVING AVG(Valor) > 150;

-- 3.7 Obtener el numero de referencia de cada caja junto con el nombre de la ciudad en el que se encuentra
SELECT c.NumReferencia, a.Lugar AS Ciudad
FROM cajas c
JOIN almacenes a ON c.Almacen = a.Codigo;

-- 3.8 Obtener el numero de cajas que hay en cada almacén
SELECT Almacen, COUNT(*) AS Num_cajas
FROM cajas
GROUP BY Almacen;

-- 3.9 Obtener los códigos de los almacenes que están saturados (los almacenes donde el número de cajas es superior a la capacidad)
SELECT Almacen
FROM (
    SELECT c.Almacen, COUNT(*) AS Num_cajas, a.Capacidad
    FROM cajas c
    JOIN almacenes a ON c.Almacen = a.Codigo
    GROUP BY c.Almacen
) AS subquery
WHERE Num_cajas > Capacidad;

-- 3.10 Obtener los numeras de referencia de las cajas que están en Bilbao
SELECT c.NumReferencia
FROM cajas c
JOIN almacenes a ON c.Almacen = a.Codigo
WHERE a.Lugar = 'Bilbao';

-- 3.11 Insertar un nuevo almacén en Barcelona con capacidad para 3 cajas
INSERT INTO almacenes (Codigo, Lugar, Capacidad)
VALUES (11, 'Barcelona', 3);

-- 3.12 Insertar una nueva caja, con número de referencia 'H5RT', con contenido 'Papel', valor 200, y situada en el almacén F Rebajar el valor de todas las cajas un 15 %
INSERT INTO cajas (NumReferencia, Contenido, Valor, Almacen)
VALUES ('H5RT', 'Papel', 200, 'F');

UPDATE cajas
SET Valor = Valor * 0.85;

-- 3.13 Rebajar el valor de todas las cajas un 15 %
UPDATE cajas
SET Valor = Valor * 0.85;

-- 3.14 Rebajar un 20 % el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas
UPDATE cajas
SET Valor = Valor * 0.8
WHERE Valor > (
    SELECT AVG(Valor)
    FROM cajas
);

-- 3.15 Eliminar todas las cajas cuyo valor sea inferior a 100 €
DELETE FROM cajas
WHERE Valor < 100;

-- 3.16 Vaciar el contenido de los almacenes que están saturados
DELETE FROM cajas
WHERE Almacen IN (
    SELECT Codigo
    FROM almacenes
    WHERE (SELECT COUNT(*) FROM cajas WHERE cajas.Almacen = almacenes.Codigo) > Capacidad
);
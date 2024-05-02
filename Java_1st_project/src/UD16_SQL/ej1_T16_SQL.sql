-- Create database
CREATE DATABASE IF NOT EXISTS tienda_informatica;
USE tienda_informatica;

-- Create fabricantes table
CREATE TABLE IF NOT EXISTS fabricantes (
    Codigo INT NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100)
);

-- Insert 10 valid tuples into fabricantes table
INSERT INTO fabricantes (Codigo, Nombre) VALUES
(1, 'Fabricante A'),
(2, 'Fabricante B'),
(3, 'Fabricante C'),
(4, 'Fabricante D'),
(5, 'Fabricante E'),
(6, 'Fabricante F'),
(7, 'Fabricante G'),
(8, 'Fabricante H'),
(9, 'Fabricante I'),
(10, 'Fabricante J');

-- Create articulos table
CREATE TABLE IF NOT EXISTS articulos (
    Codigo INT NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Precio INT NOT NULL,
    Fabricante INT NOT NULL,
    FOREIGN KEY (Fabricante) REFERENCES fabricantes(Codigo)
);

-- Insert 10 valid tuples into articulos table
INSERT INTO articulos (Codigo, Nombre, Precio, Fabricante) VALUES
(1, 'Articulo 1', 100, 1),
(2, 'Articulo 2', 200, 2),
(3, 'Articulo 3', 150, 3),
(4, 'Articulo 4', 300, 4),
(5, 'Articulo 5', 120, 5),
(6, 'Articulo 6', 180, 6),
(7, 'Articulo 7', 250, 7),
(8, 'Articulo 8', 350, 8),
(9, 'Articulo 9', 220, 9),
(10, 'Articulo 10', 280, 10);

-- 1.1 Obtener los nombres de los artículos de la tienda
SELECT Nombre FROM articulos;

-- 1.2  Obtener los nombres y los precios de los productos de la tienda
SELECT Nombre, Precio FROM articulos;

-- 1.3 Obtener el nombre de los productos cuyo precio sea menor o igual a 200€
SELECT Nombre FROM articulos WHERE Precio <= 200;

-- 1.4 Obtener todos los datos de los artículos cuyo precio esté entre los 60€ y los 120€
SELECT * FROM articulos
WHERE Precio BETWEEN 60 AND 120;

-- 1.5 Obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166’386)
SELECT Nombre, Precio * 166386 AS Precio_pesetas FROM articulos;

-- 1.6 Seleccionar el precio medio de todos los productos
SELECT AVG(Precio) AS Precio_medio FROM articulos;

-- 1.7 Obtener el precio medio de los artículos cuyo código de fabricante sea 2
SELECT AVG(Precio) AS Precio_medio FROM articulos
WHERE Fabricante = 2;

-- 1.8  Obtener el número de artículos cuyo precio sea mayor o igual a 180€
SELECT COUNT(*) AS Numero_de_articulos FROM articulos
WHERE Precio >= 180;

-- 1.9 Obtener el nombre y precio de los artículos cuyo precio sea mayor o igual a 180€ y ordenarlos descendentemente por precio, y luego ascendentemente por nombre
SELECT Nombre, Precio FROM articulos
WHERE Precio >= 180
ORDER BY Precio DESC, Nombre ASC;

-- 1.10 Obtener un listado completo de artículos, incluyendo por cada artículo los datos del artículo y su fabricante
SELECT a.Codigo AS Codigo_articulo, 
       a.Nombre AS Nombre_articulo, 
       a.Precio, 
       f.Codigo AS Codigo_fabricante, 
       f.Nombre AS Nombre_fabricante
FROM articulos a
JOIN fabricantes f ON a.Fabricante = f.Codigo;

-- 1.11 Obtener un listado de artículos, incluyendo el nombre del artículo, su precio y el nombre de su fabricante
SELECT a.Nombre AS Nombre_articulo, 
       a.Precio, 
       f.Nombre AS Nombre_fabricante
FROM articulos a
JOIN fabricantes f ON a.Fabricante = f.Codigo;

-- 1.12 Obtener el precio medio de los productos de cada fabricante, mostrando solo los códigos del fabricante
SELECT Fabricante, AVG(Precio) AS Precio_medio
FROM articulos
GROUP BY Fabricante;

-- 1.13 Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante
SELECT f.Nombre AS Nombre_fabricante, AVG(a.Precio) AS Precio_medio
FROM articulos a
JOIN fabricantes f ON a.Fabricante = f.Codigo
GROUP BY f.Nombre;

-- 1.14 Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 150€
SELECT f.Nombre
FROM fabricantes f
JOIN articulos a ON f.Codigo = a.Fabricante
GROUP BY f.Nombre
HAVING AVG(a.Precio) >= 150;

-- 1.15 Obtener el nombre y precio del artículo más barato
SELECT Nombre, Precio
FROM articulos
WHERE Precio = (SELECT MIN(Precio) FROM articulos);

-- 1.16 Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor)
SELECT f.Nombre AS Nombre_proveedor, a.Nombre AS Nombre_articulo, a.Precio AS Precio_articulo
FROM fabricantes f
JOIN articulos a ON f.Codigo = a.Fabricante
WHERE (a.Precio, a.Fabricante) IN (
    SELECT MAX(Precio), Fabricante
    FROM articulos
    GROUP BY Fabricante
);

-- 1.17 Añadir un nuevo producto
INSERT INTO articulos (Codigo, Nombre, Precio, Fabricante) 
VALUES (11, 'Nuevo producto', 150, 3);

-- 1.18 Cambiar el nombre del producto 8 a ‘Impresora Laser’
UPDATE articulos
SET Nombre = 'Impresora Laser'
WHERE Codigo = 8;

-- 1.19 Aplicar un descuento del 10% (multiplicar el precio por 0’9) a todos los productos
UPDATE articulos
SET Precio = Precio * 0.9;

-- 1.20 Aplicar un descuento de 10€ a todos los productos cuyo precio sea mayor o igual a 120€
UPDATE articulos
SET Precio = Precio - 10
WHERE Precio >= 120;
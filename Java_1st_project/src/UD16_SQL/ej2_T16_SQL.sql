CREATE DATABASE empleados,
USE empleados,

CREATE TABLE departamentos(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Presupuesto int
)

CREATE TABLE empleados(
    DNI VARCHAR(9) NOT NULL,
    PRIMARY KEY(DNI),
    Nombre VARCHAR(100),
    Apellidos VARCHAR(255),
    Departamento int NOT NULL,
    FOREIGN KEY (Departamento) REFERENCES departamentos(Codigo)
)

INSERT INTO departamentos (Codigo, Nombre, Presupuesto) VALUES
(1, 'Ventas', 10000),
(2, 'Recursos Humanos', 15000),
(3, 'Marketing', 20000),
(4, 'Desarrollo', 12000),
(5, 'Finanzas', 18000),
(6, 'Producción', 22000),
(7, 'Logística', 13000),
(8, 'Calidad', 19000),
(9, 'Tecnología', 17000),
(10, 'Administración', 21000);

INSERT INTO empleados (DNI, Nombre, Apellidos, Departamento) VALUES
('11111111A', 'Juan', 'González', 1),
('22222222B', 'María', 'Martínez', 2),
('33333333C', 'Antonio', 'Rodríguez', 3),
('44444444D', 'Carmen', 'Pérez', 4),
('55555555E', 'José', 'López', 5),
('66666666F', 'Ana', 'Sánchez', 6),
('77777777G', 'Manuel', 'Gómez', 7),
('88888888H', 'Laura', 'Díaz', 8),
('99999999I', 'Miguel', 'Fernández', 9),
('10101010J', 'Elena', 'Ruiz', 10);


-- 2.1 Obtener los apellidos de los empleados
SELECT Apellidos FROM empleados;

-- 2.2 Obtener los apellidos de los empleados sin repeticiones
SELECT DISTINCT Apellidos FROM empleados;

-- 2.3 Obtener todos los datos de los empleados que se apellidan 'López'
SELECT * FROM empleados
WHERE Apellidos = 'López';

-- 2.4 Obtener todos los datos de los empleados que se apellidan 'López' y los que se apellidan 'Pérez'.
SELECT * FROM empleados
WHERE Apellidos = 'López' OR Apellidos = 'Pérez';

-- 2.5 Obtener todos los datos de los empleados que trabajan para el departamento 9
SELECT * FROM empleados
WHERE Departamento = 9;

-- 2.6 Obtener todos los datos de los empleados que trabajan para el departamento 3 y para el departamento 7
SELECT * FROM empleados
WHERE Departamento IN (3, 7);

-- 2.7 Obtener todos los datos de los empleados cuyo apellido comience por 'P'
SELECT * FROM empleados
WHERE Apellidos LIKE 'P%';

-- 2.8 Obtener el presupuesto total de todos los departamentos
SELECT SUM(Presupuesto) AS Presupuesto_total
FROM departamentos;

-- 2.9 Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento
SELECT e.*, d.Nombre AS Nombre_departamento, d.Presupuesto
FROM empleados e
JOIN departamentos d ON e.Departamento = d.Codigo;

-- 2.10 Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento
SELECT empleados.*, departamentos.Nombre AS Nombre_departamento, departamentos.Presupuesto
FROM empleados
JOIN departamentos ON empleados.Departamento = departamentos.Codigo;

-- 2.11 Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento
SELECT e.Nombre, e.Apellidos, d.Nombre AS Nombre_departamento, d.Presupuesto
FROM empleados e
JOIN departamentos d ON e.Departamento = d.Codigo;

-- 2.12 Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor de 60.000 €
SELECT e.Nombre, e.Apellidos
FROM empleados e
JOIN departamentos d ON e.Departamento = d.Codigo
WHERE d.Presupuesto > 60000;

-- 2.13 Obtener los datos de los departamentos cuyo presupuesto es superior al presupuesto medio de todos los departamentos
SELECT *
FROM departamentos
WHERE Presupuesto > (
    SELECT AVG(Presupuesto)
    FROM departamentos
);

-- 2.14 Obtener los nombres (únicamente los nombres) de los departamentos que tienen más de dos empleados
SELECT d.Nombre
FROM departamentos d
JOIN empleados e ON d.Codigo = e.Departamento
GROUP BY d.Codigo
HAVING COUNT(*) > 2;

-- 2.15 Añadir un nuevo departamento: 'Calidad', con presupuesto de 40.000 € y código11. Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI: 89267109

-- Añadir el nuevo departamento 'Calidad'
INSERT INTO departamentos (Codigo, Nombre, Presupuesto)
VALUES (11, 'Calidad', 40000);

-- Añadir el nuevo empleado Esther Vázquez vinculado al departamento 'Calidad'
INSERT INTO empleados (DNI, Nombre, Apellidos, Departamento)
VALUES ('89267109', 'Esther', 'Vázquez', 11);

-- 2.16 Aplicar un recorte presupuestario del 10 % a todos los departamentos
UPDATE departamentos
SET Presupuesto = Presupuesto * 0.9;

-- 2.17 Reasignar a los empleados del departamento de investigación ( código 4) al departamento de informática ( código 9)
UPDATE empleados
SET Departamento = 9
WHERE Departamento = 4;

-- 2.18 Despedir a todos los empleados que trabajan para el departamento de informática ( código 9)
DELETE FROM empleados
WHERE Departamento = 9;

-- 2.19 Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior a los 60.000 €
DELETE FROM empleados
WHERE Departamento IN (
    SELECT Codigo
    FROM departamentos
    WHERE Presupuesto > 60000
);

-- 2.20 Despedir a todos los empleados
DELETE FROM empleados;
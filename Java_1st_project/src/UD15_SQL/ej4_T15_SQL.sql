CREATE DATABASE empleados,
USE empleados,

CREATE TABLE departamentos(
    Codigo int NOT NULL,
    PRIMARY KEY (Codigo),
    Nombre VARCHAR(100),
    Presupuesto int
)
INSERT INTO departamentos (Codigo, Nombre, Presupuesto) VALUES
(1, 'Departamento de Ventas', 50000),
(2, 'Departamento de Marketing', 60000),
(3, 'Departamento de Recursos Humanos', 55000),
(4, 'Departamento de Finanzas', 70000),
(5, 'Departamento de Tecnología', 80000),
(6, 'Departamento de Logística', 45000),
(7, 'Departamento de Investigación y Desarrollo', 75000),
(8, 'Departamento de Calidad', 65000),
(9, 'Departamento de Producción', 70000),
(10, 'Departamento de Servicio al Cliente', 60000);

CREATE TABLE empleados(
    DNI VARCHAR(9) NOT NULL,
    PRIMARY KEY(DNI),
    Nombre VARCHAR(100),
    Apellidos VARCHAR(255),
    Departamento int NOT NULL,
    FOREIGN KEY (Departamento) REFERENCES departamentos(Codigo)
)
INSERT INTO empleados (DNI, Nombre, Apellidos, Departamento) VALUES
('123456789', 'Juan', 'González', 1),
('987654321', 'María', 'López', 2),
('456789123', 'Pedro', 'Martínez', 3),
('789123456', 'Laura', 'Pérez', 4),
('321654987', 'Ana', 'Rodríguez', 5),
('654987321', 'Carlos', 'Sánchez', 6),
('879546231', 'Sara', 'García', 7),
('234651978', 'David', 'Fernández', 8),
('874512369', 'Elena', 'Díaz', 9),
('965874123', 'Javier', 'Alonso', 10);
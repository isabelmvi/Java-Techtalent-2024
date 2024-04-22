CREATE DATABASE cientificos_proyecto,
USE cientificos_proyecto,

CREATE TABLE cientificos(
    DNI VARCHAR(9) NOT NULL,
    PRIMARY KEY (DNI),
    NomApels 
    VARCHAR(255)
)
INSERT INTO cientificos (DNI, NomApels) VALUES
('123456789', 'Juan Pérez'),
('987654321', 'María García'),
('456789123', 'Pedro López'),
('789123456', 'Ana Martínez'),
('321654987', 'Carlos Sánchez'),
('654987321', 'Laura Rodríguez'),
('147258369', 'David Fernández'),
('258369147', 'Sofía Ruiz'),
('369147258', 'Pablo Gómez'),
('741852963', 'Elena Díaz');


CREATE TABLE proyecto(
    id CHAR(4) NOT NULL,
    PRIMARY KEY(id),
    Nombre VARCHAR(255),
    Horas int NOT NULL
)
INSERT INTO proyecto (id, Nombre, Horas) VALUES
('P001', 'Proyecto A', 100),
('P002', 'Proyecto B', 150),
('P003', 'Proyecto C', 200),
('P004', 'Proyecto D', 120),
('P005', 'Proyecto E', 180),
('P006', 'Proyecto F', 90),
('P007', 'Proyecto G', 140),
('P008', 'Proyecto H', 170),
('P009', 'Proyecto I', 130),
('P010', 'Proyecto J', 160);


CREATE TABLE asignado_a(
    Cientifico VARCHAR(8) NOT NULL,
    FOREIGN KEY(Cientifico) REFERENCES cientificos(DNI),
    Proyecto CHAR(4) NOT NULL,
    FOREIGN KEY(Proyecto) REFERENCES proyecto(id),
)
INSERT INTO asignado_a (Cientifico, Proyecto) VALUES
('12345678', 'P001'),
('98765432', 'P002'),
('45678912', 'P003'),
('78912345', 'P004'),
('32165498', 'P005'),
('65498732', 'P006'),
('14725836', 'P007'),
('25836914', 'P008'),
('36914725', 'P009'),
('74185296', 'P010');
CREATE DATABASE piezas_proveedores,
USE piezas_proveedores,

CREATE TABLE piezas(
    Codigo int NOT NULL,
    PRIMARY KEY(Codigo),
    Nombre VARCHAR(100)
)
INSERT INTO piezas (Codigo, Nombre) VALUES
(1, 'Tornillo'),
(2, 'Tuerca'),
(3, 'Arandela'),
(4, 'Perno'),
(5, 'Abrazadera'),
(6, 'Remache'),
(7, 'Varilla'),
(8, 'Espárrago'),
(9, 'Pasador'),
(10, 'Clip');

CREATE TABLE proveedores(
    id CHAR(4),
    PRIMARY KEY(id),
    Nombre VARCHAR(100)
)
INSERT INTO proveedores (id, Nombre) VALUES
('001', 'Proveedor A'),
('002', 'Proveedor B'),
('003', 'Proveedor C'),
('004', 'Proveedor D'),
('005', 'Proveedor E'),
('006', 'Proveedor F'),
('007', 'Proveedor G'),
('008', 'Proveedor H'),
('009', 'Proveedor I'),
('010', 'Proveedor J');

CREATE TABLE suminstra(
    CodigoPieza int,
    FOREIGN KEY (CodigoPieza) REFERENCES piezas(Codigo),
    idProveedor CHAR(4),
    FOREIGN KEY (idProveedor) REFERENCES proveedores(id),
    precio int NOT NULL
)
INSERT INTO suministra (CodigoPieza, idProveedor, precio) VALUES
(1, '001', 10),
(2, '002', 15),
(3, '003', 8),
(4, '004', 12),
(5, '005', 20),
(6, '006', 7),
(7, '007', 9),
(8, '008', 14),
(9, '009', 11),
(10, '010', 18);
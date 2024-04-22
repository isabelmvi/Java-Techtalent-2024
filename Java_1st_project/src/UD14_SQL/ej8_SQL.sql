CREATE DATABASE piezas_proveedores,
USE piezas_proveedores,

CREATE TABLE piezas(
    Codigo int NOT NULL,
    PRIMARY KEY(Codigo),
    Nombre VARCHAR(100)
)

CREATE TABLE proveedores(
    id CHAR(4),
    PRIMARY KEY(id),
    Nombre VARCHAR(100)
)

CREATE TABLE suminstra(
    CodigoPieza int,
    FOREIGN KEY (CodigoPieza) REFERENCES piezas(Codigo),
    idProveedor CHAR(4),
    FOREIGN KEY (idProveedor) REFERENCES proveedores(id),
    precio int NOT NULL
)
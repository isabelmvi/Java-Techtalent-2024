CREATE DATABASE biblio;
USE biblio;

biblio
CREATE TABLE tema (
    clavetema SMALLINT NOT NULL,
    nombre VARCHAR(40),
    PRIMARY KEY (clavetema));
INSERT INTO tema (clavetema, nombre) VALUES
(1, 'Romance'),
(2, 'Ciencia ficción'),
(3, 'Misterio'),
(4, 'Aventura'),
(5, 'Biografía'),
(6, 'Fantasía'),
(7, 'Histórico'),
(8, 'Terror'),
(9, 'Humor'),
(10, 'Drama');


CREATE TABLE autor (biblio
    claveautor SMALLINT NOT NULL,
    nombre VARCHAR(60),
    PRIMARY KEY (claveautor));
INSERT INTO autor (claveautor, nombre) VALUES
(1, 'Gabriel García Márquez'),
(2, 'J.K. Rowling'),
(3, 'Agatha Christie'),
(4, 'J.R.R. Tolkien'),
(5, 'Stephen King'),
(6, 'George R.R. Martin'),
(7, 'Dan Brown'),
(8, 'Harper Lee'),
(9, 'Mario Vargas Llosa'),
(10, 'Jane Austen');


CREATE TABLE socio (
    clavesocio SMALLINT NOT NULL,
    nombre VARCHAR(60),      
    direccion VARCHAR(60),
    telefono VARCHAR(15),
    categoria CHAR,
    PRIMARY KEY (clavesocio));
INSERT INTO socio (clavesocio, nombre, direccion, telefono, categoria) VALUES
(1, 'Juan Pérez', 'Calle 123', '123456789', 'A'),
(2, 'María García', 'Avenida XYZ', '987654321', 'B'),
(3, 'Pedro Martínez', 'Carrera 456', '456123789', 'C'),
(4, 'Ana Rodríguez', 'Plaza ABC', '789123456', 'A'),
(5, 'Carlos López', 'Camino 789', '321654987', 'B'),
(6, 'Laura Gómez', 'Paseo 321', '654987321', 'C'),
(7, 'David Sánchez', 'Ruta 654', '987321654', 'A'),
(8, 'Sofía Hernández', 'Pasaje 987', '159357246', 'B'),
(9, 'Roberto Díaz', 'Travesía 852', '357159246', 'C'),
(10, 'Elena Vázquez', 'Rambla 159', '624357198', 'A');


CREATE TABLE libro (
        clavelibro INT NOT NULL, 
        titulo VARCHAR(60), 
        idioma VARCHAR(15), 
        formato VARCHAR(15),    
        claveditorial SMALLINT, 
    PRIMARY KEY (clavelibro), 
    KEY (claveditorial),
    FOREIGN KEY (claveditorial) 
    REFERENCES editorial (claveditorial) 
    ON DELETE SET NULL
    ON UPDATE CASCADE);
INSERT INTO libro (clavelibro, titulo, idioma, formato, claveditorial) VALUES
(1, 'Cien años de soledad', 'Español', 'Impreso', 1),
(2, 'Harry Potter y la piedra filosofal', 'Inglés', 'Digital', 2),
(3, 'Asesinato en el Orient Express', 'Inglés', 'Impreso', 3),
(4, 'El señor de los anillos', 'Español', 'Digital', 4),
(5, 'It', 'Inglés', 'Impreso', 5),
(6, 'Juego de tronos', 'Español', 'Digital', 6),
(7, 'El código Da Vinci', 'Español', 'Impreso', 7),
(8, 'Matar a un ruiseñor', 'Español', 'Digital', 8),
(9, 'La ciudad y los perros', 'Español', 'Impreso', 9),
(10, 'Orgullo y prejuicio', 'Inglés', 'Digital', 10);


CREATE TABLE ejemplar (
        claveejemplar INT NOT NULL, 
        clavelibro INT NOT NULL,
        numerorden SMALLINT NOT NULL,
        edicion SMALLINT, 
        ubicacion VARCHAR(15),
        categoria CHAR, 
    PRIMARY KEY (claveejemplar), 
    KEY (clavelibro),
    FOREIGN KEY (clavelibro) 
    REFERENCES libro (clavelibro) 
    ON DELETE CASCADE
    ON UPDATE CASCADE);
INSERT INTO ejemplar (claveejemplar, clavelibro, numerorden, edicion, ubicacion, categoria) VALUES
(1, 1, 1, 1, 'Estantería 1', 'A'),
(2, 2, 1, 1, 'Estantería 2', 'B'),
(3, 3, 1, 1, 'Estantería 3', 'C'),
(4, 4, 1, 1, 'Estantería 4', 'A'),
(5, 5, 1, 1, 'Estantería 5', 'B'),
(6, 6, 1, 1, 'Estantería 6', 'C'),
(7, 7, 1, 1, 'Estantería 7', 'A'),
(8, 8, 1, 1, 'Estantería 8', 'B'),
(9, 9, 1, 1, 'Estantería 9', 'C'),
(10, 10, 1, 1, 'Estantería 10', 'A');


CREATE TABLE prestamo ( 
        clavesocio INT,
        claveejemplar INT,
        numerorden SMALLINT,
        fechaprestamo DATE NOT NULL,
        fechadevolucion DATE DEFAULT NULL,
        notas BLOB,
        edicion SMALLINT, 
        ubicacion VARCHAR(15),
        categoria CHAR, 
    PRIMARY KEY (claveprestamo), 
    KEY (clavelibro),
    FOREIGN KEY (clavelibro) 
    REFERENCES libro (clavelibro) 
    ON DELETE CASCADE
    ON UPDATE CASCADE);CREATE TABLE escrito_por (
      clave_libro INT NOT NULL,
      clave_autor INT NOT NULL,
      FOREIGN KEY (clave_libro)
      REFERENCES libro (clave_libro),
      ON DELETE CASCADE,
      ON UPDATE CASCADE,
      FOREIGN KEY (clave_autor),
      REFERENCES autor (clave_autor),
      ON DELETE CASCADE,
      ON UPDATE CASCADE);
      CREATE TABLE trata_sobre (
      clave_libro INT NOT NULL,
      clave_tema SMALLINT NOT NULL,
      FOREIGN KEY (clave_libro)
      REFERENCES libro (clave_libro),
      ON DELETE SET NULL,
      ON UPDATE CASCADE);
      FOREIGN KEY (clave_tema)
      REFERENCES tema (clave_tema)
      ON DELETE CASCADE,
      ON UPDATE CASCADE;
INSERT INTO prestamo (clavesocio, claveejemplar, numerorden, fechaprestamo, fechadevolucion, notas, edicion, ubicacion, categoria) VALUES
(1, 1, 1, '2024-04-01', '2024-04-15', 'Prestamo en curso', 1, 'Estantería 1', 'A'),
(2, 2, 1, '2024-04-03', '2024-04-17', 'Prestamo en curso', 1, 'Estantería 2', 'B'),
(3, 3, 1, '2024-04-05', '2024-04-19', 'Prestamo en curso', 1, 'Estantería 3', 'C'),
(4, 4, 1, '2024-04-07', '2024-04-21', 'Prestamo en curso', 1, 'Estantería 4', 'A'),
(5, 5, 1, '2024-04-09', '2024-04-23', 'Prestamo en curso', 1, 'Estantería 5', 'B'),
(6, 6, 1, '2024-04-11', '2024-04-25', 'Prestamo en curso', 1, 'Estantería 6', 'C'),
(7, 7, 1, '2024-04-13', '2024-04-27', 'Prestamo en curso', 1, 'Estantería 7', 'A'),
(8, 8, 1, '2024-04-15', '2024-04-29', 'Prestamo en curso', 1, 'Estantería 8', 'B'),
(9, 9, 1, '2024-04-17', '2024-05-01', 'Prestamo en curso', 1, 'Estantería 9', 'C'),
(10, 10, 1, '2024-04-19', '2024-05-03', 'Prestamo en curso', 1, 'Estantería 10', 'A');
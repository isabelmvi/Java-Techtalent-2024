CREATE TABLE prestamo (
      clave_socio INT,
      clave_ejemplar INT,
      numero_orden SMALLINT,
      fecha_prestamo DATE NOT NULL,
      fecha_devolucion DATE DEFAULT NULL,
      notas BLOB
      FOREIGN KEY (clave_socio)
      REFERENCES socio (clave_socio)
      ON DELETE SET NULL,
      ON UPDATE CASCADE);
      FOREIGN KEY (clave_ejemplar)
      REFERENCES ejemplar (clave_ejemplar)
      ON DELETE SET NULL
      ON UPDATE CASCADE;
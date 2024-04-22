-- Creación de la tabla Alumnos
CREATE TABLE Alumnos (
    Nombre VARCHAR(50),
    Apellido1 VARCHAR(50),
    Apellido2 VARCHAR(50),
    DNI VARCHAR(9) PRIMARY KEY,
    Direccion VARCHAR(100),
    Sexo CHAR(1) CHECK (Sexo IN ('M', 'H')),
    FechaNacimiento DATE,
    Curso INT,
    FOREIGN KEY (Curso) REFERENCES Cursos(cod_Curso)
);

-- Creación de la tabla Cursos
CREATE TABLE Cursos (
    Nombre_curso VARCHAR(100) UNIQUE,
    cod_Curso INT PRIMARY KEY,
    DNI_profesor VARCHAR(9),
    Max_alumnos INT,
    Fecha_inicio DATE,
    Fecha_fin DATE,
    Num_horas INT,
    CHECK (Fecha_inicio < Fecha_fin),
    FOREIGN KEY (DNI_profesor) REFERENCES Profesores(DNI)
);

-- Creación de la tabla Profesores
CREATE TABLE Profesores (
    Nombre VARCHAR(50),
    Apellido1 VARCHAR(50),
    Apellido2 VARCHAR(50),
    DNI VARCHAR(9) PRIMARY KEY,
    Direccion VARCHAR(100),
    Titulo VARCHAR(100),
    Gana VARCHAR(100) NOT NULL
);

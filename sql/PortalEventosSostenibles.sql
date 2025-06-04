USE master;
GO
IF DB_ID (N'PortalEventosSostenibles') IS NOT NULL
DROP DATABASE PortalEventosSostenibles;
GO
CREATE DATABASE PortalEventosSostenibles;
USE PortalEventosSostenibles;

CREATE TABLE Usuario (
    correo VARCHAR(100) PRIMARY KEY ,
    nombre VARCHAR(50) NOT NULL,
    contraseña VARCHAR(255) NOT NULL
)

CREATE TABLE Organizadores (
    nombre VARCHAR(100) PRIMARY KEY ,
    contacto VARCHAR(100) NOT NULL
)

CREATE TABLE Evento (
    nombre VARCHAR(100) PRIMARY KEY,
    fecha DATE NOT NULL,
    duracion INT NOT NULL,
    ubicacion VARCHAR(255) NOT NULL
)

CREATE TABLE se_inscribe (
    usuario VARCHAR(100),
    evento VARCHAR(100),
    fecha date,
    HORA TIME NOT NULL,
    PRIMARY KEY (usuario, evento,fecha,HORA),
    FOREIGN KEY (usuario) REFERENCES Usuario(correo),
    FOREIGN KEY (evento) REFERENCES Evento(nombre)
)

CREATE TABLE participa (
    usuario VARCHAR(100),
    evento VARCHAR(100),
    fecha date,
    HORA TIME NOT NULL,
    PRIMARY KEY (usuario, evento,fecha,HORA),
    FOREIGN KEY (usuario) REFERENCES Usuario(correo),
    FOREIGN KEY (evento) REFERENCES Evento(nombre)
)

CREATE TABLE Localizacion (
    direccion VARCHAR(255) PRIMARY KEY,
    evento VARCHAR(100),
    tipo VARCHAR(50) NOT NULL,
    FOREIGN KEY (evento) REFERENCES Evento(nombre)
)
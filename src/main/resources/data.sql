DROP TABLE IF EXISTS persona;
CREATE TABLE persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250) NOT NULL,
    apellido VARCHAR(250) NOT NULL,
    direccion VARCHAR(250) DEFAULT NULL,
    telefono VARCHAR(250) DEFAULT NULL
);
INSERT INTO persona (id, nombre, apellido,direccion,telefono) VALUES (1, 'Joan', 'Rivas','Cl 123','5555555');

DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         usuario VARCHAR(250) NOT NULL,
                         clave VARCHAR(250) NOT NULL,
                         roleName VARCHAR(250) DEFAULT NULL
);

INSERT INTO usuario (id, usuario, clave,roleName) VALUES (1, 'admin', 'admin','ADMIN');
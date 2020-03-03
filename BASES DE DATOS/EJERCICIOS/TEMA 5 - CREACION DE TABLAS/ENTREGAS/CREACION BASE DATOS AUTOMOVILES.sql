CREATE TABLE MARCAS
(
  CIFM NUMBER(4) PRIMARY KEY,
  NOMBRE VARCHAR2(10),
  CIUDAD VARCHAR2(15)
);

CREATE TABLE CONCESIONARIOS
(
  CIFC NUMBER(4) PRIMARY KEY,
  NOMBRE VARCHAR2(4),
  CIUDAD VARCHAR2(15) CHECK (CIUDAD IN ('CUENCA','GUADALAJARA','TOLEDO','CIUDAD REAL','ALBACETE'))
);

CREATE TABLE CLIENTES
(
  DNI VARCHAR2(9) PRIMARY KEY,
  NOMBRE VARCHAR2(20),
  APELLIDO VARCHAR2(40),
  CIUDAD VARCHAR2(15),
  
  CONSTRAINT MAYUS1_NOMBRE CHECK (NOMBRE = INITCAP (NOMBRE)),
  CONSTRAINT MAYUS1_APE CHECK (APELLIDO = INITCAP (APELLIDO))
);


CREATE TABLE COCHES
(
  CODCOCHE NUMBER(4) PRIMARY KEY,
  NOMBRE VARCHAR2(10),
  MODELO VARCHAR2(10),
  CIFM NUMBER(4) FOREIGN KEY REFERENCES MARCAS
  CONSTRAINT MARCA_NOT_NULL CHECK (CIFM IS NOT NULL)  
);



CREATE TABLE DISTRIBUCION
(
  CIFC NUMBER(4) FOREIGN KEY REFERENCES CONCESIONARIOS,
  CODCOCHE NUMBER(4) FOREIGN KEY REFERENCES COCHES,
  CANTIDAD NUMBER(2) CHECK (CANTIDAD BETWEEN 0 AND 10)
);


CREATE TABLE VENTAS
(
  CIFC NUMBER(4) FOREIGN KEY REFERENCES CONCESIONARIOS,
  DNI VARCHAR2(9) FOREIGN KEY REFERENCES CLIENTES,
  CODCOCHE NUMBER(4) FOREIGN KEY REFERENCES COCHES,
  COLOR VARCHAR2(10) CHECK (COLOR IN ('BLANCO','AZUL','VERDE','ROJO')),
  
  CONSTRAINT BLANCO_ROJO CHECK ((CIFC=0001) AND (COLOR='BLANCO') OR (CIFC=0001) AND (COLOR='ROJO'))
);

INSERT INTO 
  
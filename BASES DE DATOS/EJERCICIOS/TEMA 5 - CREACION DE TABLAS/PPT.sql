DROP TABLE PROVINCIAS CASCADE CONSTRAINTS;
CREATE TABLE PROVINCIAS
( 
  CODPROVIN NUMBER(2) PRIMARY KEY,
  NOM_PROVINCIA VARCHAR2(15)
);

DROP TABLE PERSONAS CASCADE CONSTRAINTS;
CREATE TABLE PERSONAS
(
  DNI NUMBER(8) PRIMARY KEY,
  NOMBRE  VARCHAR2(15),
  DIRECCION VARCHAR(25),
  POBLACION VARCHAR2(20),
  CODPROVIN NUMBER(2) NOT NULL REFERENCES PROVINCIAS
);

INSERT INTO PROVINCIAS
VALUES (15, 'VALENCIA');

INSERT INTO PROVINCIAS
VALUES (23, 'CUENCA');

INSERT INTO PROVINCIAS
VALUES (31, 'MADRID');

INSERT INTO PERSONAS
VALUES (11111111, 'SERGIO', 'CALLE A', 'CUENCA', 23);

INSERT INTO PERSONAS
VALUES (22222222, 'DANIEL', 'CALLE B', 'VALENCIA', 15);

INSERT INTO PERSONAS
VALUES (33333333, 'AINHOA', 'CALLE C', 'MADRID', 31);

DROP TABLE EJEMPLO2
CREATE TABLE EJEMPLO2
( 
  DNI VARCHAR2(10) NOT NULL,
  NOMBRE VARCHAR(30) DEFAULT 'NO DEFINIDO',
  USUARIO VARCHAR(3) DEFAULT UID
);

INSERT INTO EJEMPLO2 (DNI)
VALUES ('123456789A');

SELECT * FROM EJEMPLO2;

DROP TABLE ACTIVIDAD4;
CREATE TABLE ACTIVIDAD4
( 
  DNI VARCHAR2(10) PRIMARY KEY,
  NOMBRE VARCHAR2(30) NOT NULL CHECK (NOMBRE = UPPER(NOMBRE)),
  EDAD NUMBER(3) CHECK (EDAD BETWEEN 5 AND 20),
  CURSO NUMBER(3) CHECK (CURSO IN (1, 2, 3)) 
);

INSERT INTO ACTIVIDAD4
VALUES ('123456789A', 'SERGIO', 6, 3);

SELECT * FROM ACTIVIDAD4

DROP TABLE ARTICULOS2;
DROP TABLE FABRICANTES2;
CREATE TABLE FABRICANTES2
( 
  COD_FABRICANTE NUMBER(3) PRIMARY KEY,
  NOMBRE VARCHAR2(15) CHECK (NOMBRE = UPPER(NOMBRE)),
  PAIS VARCHAR2(15) CHECK (PAIS = UPPER(PAIS))
);
CREATE TABLE ARTICULOS2
( 
  ARTICULO VARCHAR2(20) NOT NULL,
  COD_FABRICANTE NUMBER(3) NOT NULL REFERENCES FABRICANTES2,
  PESO NUMBER(3) NOT NULL CHECK(PESO>0),
  CATEGORIA VARCHAR2(15) NOT NULL CHECK (CATEGORIA IN ('Primera', 'Segunda', 'Tercera')) ,
  PRECIO_VENTA NUMBER(6,2) CHECK(PRECIO_VENTA>0),
  PRECIO_COSTO NUMBER(6,2) CHECK(PRECIO_COSTO>0),
  EXISTENCIAS NUMBER(5),
  CONSTRAINT PK_ART PRIMARY KEY (ARTICULO, PESO, CATEGORIA)
);

INSERT INTO FABRICANTES2
VALUES (123, 'ARROCES CANSINO', 'ESPA�A');

INSERT INTO ARTICULOS2
VALUES ('ARROZ', 123, 2, 'Primera', 4, 2, 30);

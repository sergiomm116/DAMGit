DROP TABLE PROFESOR;
DROP TABLE ALUMNO;
DROP TABLE MATRICULA;
DROP TABLE ASIGNATURA;
DROP TABLE PERSONA;

CREATE TABLE PERSONA
(
  DNI 				VARCHAR2(9) PRIMARY KEY CHECK (UPPER(SUBSTR(DNI,9,1))=SUBSTR(DNI,9,1)),
  NOMBRE 			VARCHAR2(30) NOT NULL,
  APELLIDO 		VARCHAR2(30) NOT NULL,
  FECHANAC 		DATE,
  SEXO 				CHAR(1) CHECK (SEXO='H' OR SEXO='M'),
  PADRE       VARCHAR2(9) REFERENCES PERSONA,
  CONSTRAINT NOM_APE UNIQUE (NOMBRE,APELLIDO)
);

CREATE TABLE PROFESOR
(
  DNI 				VARCHAR2(9) PRIMARY KEY,
  EXPERIENCIA VARCHAR2(2) NOT NULL CHECK (EXPERIENCIA >= 0),
  FOREIGN KEY (DNI) REFERENCES PERSONA ON DELETE CASCADE
);

CREATE TABLE ALUMNO
(
  DNI 				VARCHAR2(9) PRIMARY KEY,
  RESIDENCIA 	VARCHAR2(2) NOT NULL CHECK(RESIDENCIA = 'SI' OR RESIDENCIA = 'NO'),
  FOREIGN KEY (DNI) REFERENCES PERSONA ON DELETE CASCADE
);

CREATE TABLE ASIGNATURA
(
  COD_ASIGNATURA 	  NUMBER(3) PRIMARY KEY,
  NOMBRE_ASIGNATURA VARCHAR2(30) NOT NULL UNIQUE,
  CREDITOS 			    NUMBER(2) NOT NULL CHECK(CREDITOS BETWEEN 1 AND 10),
  DNI 				      VARCHAR2(9),
  FOREIGN KEY (DNI) REFERENCES PERSONA
);

CREATE TABLE MATRICULA
(
  DNI 				    VARCHAR2(9),
  COD_ASIGNATURA 	NUMBER(3),
  A�O 				    NUMBER,
  PRECIO 			    NUMBER(3),
  FOREIGN KEY (DNI) REFERENCES PERSONA ON DELETE CASCADE,
  FOREIGN KEY (COD_ASIGNATURA) REFERENCES ASIGNATURA ON DELETE CASCADE,
  PRIMARY KEY (DNI, COD_ASIGNATURA),
  CHECK((A�O<=2000 AND PRECIO=100) OR (A�O>=2010 AND PRECIO=200))
);
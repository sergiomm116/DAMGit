DROP TABLE CONTR_SERV;
DROP TABLE CONTRATOS;
DROP TABLE CLIENTES;
DROP TABLE NODOS;
DROP TABLE SERVICIOS;


CREATE TABLE CLIENTES
(
  DNI 			VARCHAR2(9) PRIMARY KEY,
  NOMBRE 		VARCHAR2(30) CHECK (NOMBRE = UPPER(NOMBRE)),
  DOMICILIO 	VARCHAR2(30),
  EDAD 			NUMBER(3) CHECK (EDAD >= 18)
);

CREATE TABLE NODOS
(
  ID_NODO 		NUMBER(3) PRIMARY KEY,
  ANCHO_BANDA 	NUMBER(4),
  LOCALIZACION 	VARCHAR2(15)
);

CREATE TABLE CONTRATOS
(
  ID_CONTRATO 	NUMBER(3) PRIMARY KEY,
  TIPO 			VARCHAR2(5) NOT NULL,
  TELEFONO 		VARCHAR2(9),
  DNI           varchar2(9)    REFERENCES CLIENTES,
  ID_NODO       NUMBER(3)    REFERENCES NODOS,
  
  
  CHECK (((TIPO='FIJO') AND (ID_NODO IS NOT NULL)) OR ((TIPO='MOVIL') AND (ID_NODO IS NULL))),
  CONSTRAINT FK_NODOS FOREIGN KEY (ID_NODO) REFERENCES NODOS
);

CREATE TABLE SERVICIOS
(
  COD_SERVICIO 	VARCHAR2(3) PRIMARY KEY,
  DESCRIPCION 	VARCHAR2(60) NOT NULL,
  PRECIO 		NUMBER(2) NOT NULL CHECK (PRECIO IN (20, 30, 40))
);

CREATE TABLE CONTR_SERV
(
  COD_SERVICIO 	VARCHAR2(3) NOT NULL,
  ID_CONTRATO 	NUMBER(3),
  DURACION 		NUMBER(2) NOT NULL,
  CONSTRAINT FK_SERVICIOS FOREIGN KEY (COD_SERVICIO) REFERENCES SERVICIOS,
  CONSTRAINT FK_CONTRATOS FOREIGN KEY (ID_CONTRATO) REFERENCES CONTRATOS
);

INSERT INTO CLIENTES
VALUES ('13451234J', 'SERGIO', 'CALLE A', 21);

INSERT INTO CLIENTES
VALUES ('24562345K', 'DANIEL', 'CALLE B', 18);

INSERT INTO CLIENTES
VALUES ('23562343B', 'AINHOA', 'CALLE C', 18);

INSERT INTO CLIENTES
VALUES ('31413413H', 'DIEGO', 'CALLE D', 99);

INSERT INTO NODOS
VALUES (232, 600, 'MADRID');

INSERT INTO NODOS
VALUES (234, 300, 'MADRID');

INSERT INTO SERVICIOS
VALUES ('A12','FIBRA 600MB' ,40);

INSERT INTO SERVICIOS
VALUES ('A08','FIBRA 300MB' ,30);

INSERT INTO SERVICIOS
VALUES ('F12','MOVIL ILIMITADO' ,30);

INSERT INTO SERVICIOS
VALUES ('F08','MOVIL 10GB' ,20);

INSERT INTO CONTRATOS
VALUES ('123', 'FIJO', '969123432', '13451234J', 232);

INSERT INTO CONTRATOS
VALUES ('686', 'FIJO', '934871398', '24562345K', 234);

INSERT INTO CONTRATOS
VALUES ('453', 'MOVIL', '629087035','23562343B', NULL);

INSERT INTO CONTRATOS
VALUES ('213', 'MOVIL', '635677542','31413413H', NULL);

INSERT INTO CONTR_SERV
VALUES ('F08', '686', 12);

INSERT INTO CONTR_SERV
VALUES ('F12', '123', 24);

INSERT INTO CONTR_SERV
VALUES ('A08', '453', 12);

INSERT INTO CONTR_SERV
VALUES ('A12', '213', 6);
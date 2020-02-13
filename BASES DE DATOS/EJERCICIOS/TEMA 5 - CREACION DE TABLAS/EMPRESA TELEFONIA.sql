CREATE TABLE CONTRATOS
(
  ID_CONTRATO NUMBER(3) PRIMARY KEY,
  TIPO VARCHAR2(5) NOT NULL CHECK (TIPO IN ('MOVIL' OR 'FIJO');
  TELEFONO VARCHAR2(9)
);

CREATE TABLE CLIENTES
(
  DNI VARCHAR2(9) PRIMARY KEY,
  NOMBRE VARCHAR2(30) CHECK (NOMBRE = UPPER(NOMBRE)),
  DOMICILIO VARCHAR2(30),
  EDAD NUMBER(3) CHECK (EDAD > 18)
);

CREATE TABLE NODOS
(
  ID_NODO NUMBER(3) PRIMARY KEY,
  ANCHO_BANDA NUMBER(3),
  LOCALIZACION VARCHAR2(15)
);

CREATE TABLE SERVICIOS
(
  COD_SERVICIO VARCHAR2(3) PRIMARY KEY,
  DESCRIPCION VARCHAR2(60) NOT NULL,
  PRECIO NUMBER(2) NOT NULL CHECK (PRECIO IN (20, 30 OR 40))
);

  
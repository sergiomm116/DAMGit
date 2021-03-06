-- EJERCICIO 1 --
DROP TABLE PEDIDOS2;
CREATE TABLE PEDIDOS2 (
NIF varchar2(10),
ARTICULO varchar2(20),
COD_FABRICANTE number(3),
PESO number(3),
CATEGORIA varchar2(10),
FECHA_PEDIDO date,
UNIDADES_PEDIDAS number(4),
CONSTRAINT PK_PEDIDOS2 PRIMARY KEY (NIF, ARTICULO, COD_FABRICANTE, PESO, CATEGORIA, FECHA_PEDIDO),
CONSTRAINT FK_COD_PEDIDOS2 FOREIGN KEY (COD_FABRICANTE) REFERENCES FABRICANTES(COD_FABRICANTE),
CONSTRAINT UNIDADES_PEDIDOS2 CHECK (UNIDADES_PEDIDAS > 0),
CONSTRAINT CATEGORIA_PEDIDOS2 CHECK (CATEGORIA IN ('Primera', 'Segunda', 'Tercera')),
CONSTRAINT FK_PEDIDOS2 FOREIGN KEY (ARTICULO, COD_FABRICANTE, PESO, CATEGORIA) REFERENCES ARTICULOS ON DELETE CASCADE,
CONSTRAINT FK_NIF_PEDIDOS2 FOREIGN KEY (NIF) REFERENCES TIENDAS(NIF)
);

DROP TABLE VENTAS2;
CREATE TABLE VENTAS2 (
NIF varchar2(10),
ARTICULO varchar2(20),
COD_FABRICANTE number(3),
PESO number(3),
CATEGORIA varchar2(10),
FECHA_VENTA date,
UNIDADES_VENDIDAS number(4),
CONSTRAINT PK_VENTAS2 PRIMARY KEY (NIF, ARTICULO, COD_FABRICANTE, PESO, CATEGORIA, FECHA_VENTA),
CONSTRAINT FK_COD_VENTAS2 FOREIGN KEY (COD_FABRICANTE) REFERENCES FABRICANTES(COD_FABRICANTE),
CONSTRAINT UNIDADES_VENTAS2 CHECK (UNIDADES_VENDIDAS > 0),
CONSTRAINT CATEGORIA_VENTAS2 CHECK (CATEGORIA IN ('Primera', 'Segunda', 'Tercera')),
CONSTRAINT FK_VENTAS2 FOREIGN KEY (ARTICULO, COD_FABRICANTE, PESO, CATEGORIA) REFERENCES ARTICULOS ON DELETE CASCADE,
CONSTRAINT FK_NIF_VENTAS2 FOREIGN KEY (NIF) REFERENCES TIENDAS(NIF)
);

-- EJERCICIO 3 --
ALTER TABLE PEDIDOS MODIFY (UNIDADES_PEDIDAS number(6));
ALTER TABLE VENTAS MODIFY (UNIDADES_VENDIDAS number(6));

-- EJERCICIO 4 --
ALTER TABLE TIENDAS
ADD CONSTRAINT TIENDA_TOLEDO
CHECK (PROVINCIA != 'TOLEDO') NOVALIDATE

-- EJERCICIO 5 --
ALTER TABLE PEDIDOS ADD (PVP number(6,2));
ALTER TABLE VENTAS ADD (PVP number(6,2));

-- EJERCICIO 6 --
CREATE OR REPLACE VIEW CONSERJES
AS SELECT C.NOMBRE, P.APELLIDOS
FROM CENTROS C, PERSONAL P
WHERE C.COD_CENTRO = P.COD_CENTRO AND FUNCION = 'CONSERJE';

-- EJERCICIO 7 --
CREATE SYNONYM CONSER FOR CONSERJES;

-- EJERCICIO 8 --
ALTER TABLE PROFESORES ADD (COD_ASIG number(2));

-- EJERCICIO 9 --
DROP TABLE TASIG;
CREATE TABLE TASIG (
COD_ASIG number (2),
NOM_ASIG varchar2(20)
);

-- EJERCICIO 10 --
ALTER TABLE TASIG 
ADD CONSTRAINT PK_COD_ASIG PRIMARY KEY (COD_ASIG);

-- EJERCICIO 11 --
ALTER TABLE PROFESORES
ADD CONSTRAINT FK_COD_ASIG FOREIGN KEY (COD_ASIG) REFERENCES TASIG(COD_ASIG);
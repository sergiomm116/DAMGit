**1***

ALTER TABLE DISTRIBUCION MODIFY(CANTIDAD NUMBER(4))

ALTER TABLE COCHES MODIFY(COCHES VARCHAR(40))

**2***

ALTER TABLE AACOCHES ADD STOCK NUMBER(2) CHECK(STOCK<100);



AFTER TABLE AACLIENTES ADD TELEFONO VARCHAR(9) 

UPDATE AACLIENTES
SET TELEFONO='999999999'

AFTER TABLE AACLIENTES MODIFY TELEFONO COSTRAINT TEFEFONO NOT NULL 

***3***

AFTER TABLE COCHES ADD CONSTRAINT AUDI CHECK( (CIFM<>0004) OR( CIFM=0004 AND MODELO <> 'gti'))

***4***
CAMBIAR A MI TABLA CAMBIAR A MI TABLA CAMBIAR A MI TABLA CAMBIAR A MI TABLA CAMBIAR A MI TABLA CAMBIAR A MI TABLA 
CREATE OR REPLACE VIEW COCHES
AS SELECT C.NOMBRE, C.MODELO, M.NOMBRE, D.CANTIDAD
FROM AAMARCAS M, AACOCHES C, AADISTRIBUCION D
WHERE D.CODCOCHE = C.CODCOCHE 
AND C.NOMBRE IN (SELECT COUNT(CODCOCHE) FROM AADISTRIBUCION GROUP BY CODCOCHE HAVING COUNT(CIFC)<1)
GROUP BY C.NOMBRE, C.MODELO, M.NOMBRE;
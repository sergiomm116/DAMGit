-- EJERCICIO 1
SELECT APELLIDO||' ES '||OFICIO "PUESTO DE TRABAJO" FROM EMPLE

-- EJERCICIO 2
SELECT RPAD ('X', 5, '*.') "Der", LPAD ('X', 5, '*.') "Izq" FROM DUAL;
-- RPAD: ESCRIBIRA UNA X, RELLENARA HASTA 5 ESPACIOS A LA DERECHA DE LA X CON LOS CARACTERES *. EN UNA COLUMNA
-- LPAD: ESCRIBIRA UNA X, RELLENARA HASTA 5 ESPACIOS A LA IZQUIERDA DE LA X CON LOS CARACTERES *. EN UNA COLUMNA

-- EJERCICIO 3
SELECT REPLACE(REPLACE(TITULO,'.',''),'"','') FROM MISTEXTOS
SELECT LTRIM(RTRIM(TITULO,'".'),'"') FROM MISTEXTOS

-- EJERCICIO 4
SELECT LOWER(SUBSTR(APELLIDO,1,1))||SUBSTR(APELLIDO,2) FROM EMPLE

-- EJERCICIO 5
SELECT REPLACE(TITULO,'."') FROM MISTEXTOS

-- EJERCICIO 6
SELECT SUM(LENGTH(RTRIM(TEMA)))"CARACTERES TOTALES" FROM LIBRERIA

-- EJERCICIO 7
SELECT ADD_MONTHS(FECHA_ALT, -36) FROM EMPLE
-- EJERCICIO 8
SELECT LAST_DAY(TO_DATE('010208'))"FEBRERO 2008",LAST_DAY(TO_DATE('010209'))"FEBRERO 2009" FROM DUAL

-- EJERCICIO 9
SELECT REGEXP_REPLACE(TO_CHAR(SYSDATE,'"Hoy es "day", "dd" de "month" de "yyyy'),'*  *',' ')"FECHA DE HOY" FROM DUAL

-- EJERCICIO 10
SELECT TO_CHAR(SUM(SALARIO),'999G999G999D99L')"SALARIOS FORMATEADO" FROM EMPLE

-- EJERCICIO 11
SELECT REGEXP_REPLACE(TO_CHAR(TO_DATE('110698'),'"Nac� el "dd" de "month" de "yyyy", era "day"'),'*  *',' ')"MI FECHA DE NACIMIENTO" 
FROM DUAL

-- EJERCICIO 12
SELECT TEMA"ORIGINAL", REPLACE(REPLACE(TEMA, 'DIBUJO','DISE�O'),'LABORES','HOGAR')"SUSTITUIDO" FROM LIBRERIA

SELECT TEMA, DECODE(RTRIM(TEMA),'DIBUJO','DISE�O','LABORES','HOGAR',TEMA)"SUSTITUIDO" FROM LIBRERIA

-- EJERCICIO 13
SELECT DUMP(APELLIDO,17,1,4) FROM EMPLE WHERE APELLIDO='SALA'
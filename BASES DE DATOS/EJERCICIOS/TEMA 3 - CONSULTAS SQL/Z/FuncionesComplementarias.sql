--Obtén en una columna el apellido y el oficio de cada uno de los empleados de la tabla EMPLE,de la siguiente manera: APELLIDO es OFICIO, por ejemplo, SANCHEZ es EMPLEADO (hay que anidar dos funciones CONCAT).

SELECT CONCAT (CONCAT(APELLIDO, ' ES '),OFICIO) "CONCATENACION"
FROM EMPLE;

--Visualiza la columna TITULO de la tabla MISTEXTOS sin las comillas de la derecha y de laizquierda; y el punto de la derecha.

SELECT LTRIM (RTRIM(TITULO,'."'), '"' )
FROM MISTEXTOS;


--Visualiza el apellido del empleado y la primera letra del apellido en minúscula.

SELECT APELLIDO, LOWER((SUBSTR(APELLIDO,1,1))) 
FROM EMPLE;

--A partir de la tabla MISTEXTOS visualiza la columna TITULO sin los caracteres punto y comillas dobles (. ").

SELECT TRANSLATE (TITULO,'.”', ' ')
FROM MISTEXTOS;

--Calcula el número de caracteres de la columna TEMA para todas las filas de la tablaLIBRERÍA. Comenta el resultado obtenido.

SELECT TEMA, LENGTH (TEMA) FROM LIBRERIA;
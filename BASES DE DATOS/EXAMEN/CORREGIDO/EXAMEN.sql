-- Muestra el apellido, oficio y salario de los empleados del departamento de
-- "FERNANDEZ" que tengan su mismo salario.
SELECT * FROM DEPART
WHERE DEPT_NO NOT IN (SELECT DEPT_NO FROM EMPLE)

-- Datos de los departamentos que no tengan empleados
SELECT * FROM DEPART WHERE DEPT_NO IN (SELECT DEPT_NO FROM EMPLE)

-- Visualiza los departamentos en los que el salario medio es menor
-- que la media de todos los salarios
SELECT DEPT_NO FROM EMPLE 
GROUP BY DEPT_NO
HAVING AVG(SALARIO)<(SELECT AVG(SALARIO)FROM EMPLE)

-- Numero de departamento, nombre de departamento y numero de empleados,
-- para los departamentos con menos de 4 empleados (tambien mostrara
-- si hay departamentos con 0 empleados)
SELECT D.DEPT_NO, DNOMBRE, COUNT(APELLIDO) FROM EMPLE E, DEPART D
WHERE D.DEPT_NO=E.DEPT_NO (+)
GROUP BY D.DEPT_NO, DNOMBRE
HAVING COUNT(APELLIDO)<4



-- 1. Nombre de las facultades que tienen 2 investigadores adscritos en ellas.

SELECT NOMFACULTAD 
FROM FACULTAD 
WHERE IDFACULTAD IN (SELECT IDFACULTAD 
                     FROM INVESTIGADORES 
                     GROUP BY IDFACULTAD 
                     HAVING COUNT(DNI)=2);
					 
-- 2. Obtener el DNI y el nombre de los investigadores que han reservado algun equipo que no es de su facultad.

SELECT *
FROM RESERVA R, EQUIPOS E
WHERE R.IDEQUIPO = E.IDEQUIPO AND R.DNI = I.DNI AND I.IDFACULTAD <> E.IDFACULTADO

-- 3. Muestra el nombre y apellidos de los investigadores a cargo de "QUERALT ANGUERA VILAFRANCA" que trabajan en facultades con mas de un investigador asociado.

SELECT NOMBRE, APELLIDOS FROM INVESTIGADORES 
WHERE DNIJEFE IN (SELECT DNI FROM INVESTIGADORES WHERE APELLIDOS='ANGUERA VILAFRANCA' AND NOMBRE='QUERALT')
AND IDFACULTAD IN (SELECT IDFACULTAD FROM INVESTIGADORES GROUP BY IDFACULTAD HAVING COUNT(DNI)>1);

-- 4. Muestra IDRESERVA, DNI, IDEQUIPO e informe_fechas (ej. "del martes 9 al jueves 11 de septiembre de 2005") de las reservas del equipo o equipos reservados.

SELECT IDRESERVA, DNI, IDEQUIPO, 
REGEXP_REPLACE(TO_CHAR(FECHAINICIO, '"del "day" "d"')||
               TO_CHAR(FECHAFIN, '" al "day" "d" de "month" de "yyyy"'),'*  *',' ')"informe_fechas" 
FROM RESERVA
WHERE IDEQUIPO IN 
(SELECT IDEQUIPO FROM RESERVA GROUP BY IDEQUIPO 
HAVING COUNT(*) = (SELECT MAX(COUNT(*)) FROM RESERVA GROUP BY IDEQUIPO));

-- 5. Informacion de las facultades (ID, nombre y ciudad) con algun investigador asignado que sea jefe de otros investigadores, pero que no tenga ningun equipo asignado.

SELECT IDFACULTAD, NOMFACULTAD, CIUDAD
FROM FACULTAD
WHERE IDFACULTAD NOT IN (SELECT IDFACULTAD FROM EQUIPOS)
AND IDFACULTAD IN (SELECT IDFACULTAD FROM INVESTIGADORES
                   WHERE DNI IN (SELECT DNIJEFE FROM INVESTIGADORES))

-- 6. ID y nmbre de la facultado o facultades que menos han gastado al comprar sus equipos.

SELECT IDFACULTAD, NOMFACULTAD FROM FACULTAD
WHERE IDFACULTAD IN (SELECT IDFACULTAD FROM EQUIPOS 
                     GROUP BY IDFACULTAD HAVING SUM(PRECIO) IN
                                      (SELECT MIN(SUM(PRECIO)) FROM EQUIPOS GROUP BY IDEQUIPO));
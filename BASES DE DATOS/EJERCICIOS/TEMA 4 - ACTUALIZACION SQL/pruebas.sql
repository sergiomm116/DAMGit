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
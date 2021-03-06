-- EJERCICIO 1
SELECT APELLIDO, OFICIO, LOC FROM DEPART D, EMPLE E WHERE E.DEPT_NO=D.DEPT_NO AND OFICIO='ANALISTA'

-- EJERCICIO 2
SELECT * FROM EMPLE WHERE DIR=(SELECT EMP_NO FROM EMPLE WHERE APELLIDO='CEREZO')

-- EJERCICIO 3
SELECT * FROM EMPLE WHERE DEPT_NO IN (SELECT DEPT_NO FROM DEPART WHERE DNOMBRE='VENTAS')

-- EJERCICIO 4
SELECT * FROM DEPART WHERE DEPT_NO NOT IN (SELECT DEPT_NO FROM EMPLE)

-- EJERCICIO 5
SELECT * FROM DEPART WHERE DEPT_NO IN (SELECT DEPT_NO FROM EMPLE)

-- EJERCICIO 6
SELECT APELLIDO, SALARIO FROM EMPLE WHERE DEPT_NO!=20 AND SALARIO>ALL(SELECT SALARIO FROM EMPLE WHERE DEPT_NO=20)

-- EJERCICIO 7
SELECT TEMA, ESTANTE, EJEMPLARES FROM LIBRERIA WHERE EJEMPLARES BETWEEN 8 AND 15

-- EJERCICIO 8
SELECT TEMA, ESTANTE, EJEMPLARES  FROM LIBRERIA WHERE ESTANTE NOT BETWEEN 'B' AND 'D'

-- EJERCICIO 9
SELECT TEMA FROM LIBRERIA WHERE EJEMPLARES < (SELECT EJEMPLARES FROM LIBRERIA WHERE TEMA = 'MEDICINA')

-- EJERCICIO 10
SELECT TEMA FROM LIBRERIA WHERE EJEMPLARES NOT BETWEEN 15 AND 20

-- EJERCICIO 11
SELECT  NOMBRE FROM ASIGNATURAS 
WHERE NOMBRE LIKE '%o%o%o%' AND COD IN (SELECT COD FROM NOTAS WHERE DNI IN (SELECT DNI FROM ALUMNOS WHERE POBLA='Madrid'))

-- EJERCICIO 12
SELECT APENOM FROM ALUMNOS WHERE POBLA='Madrid' AND NOTAS<(5)

-- EJERCICIO 13
SELECT APENOM FROM ALUMNOS WHERE DNI IN (SELECT DNI FROM NOTAS WHERE NOTA=(SELECT NOTA FROM NOTAS 
WHERE DNI=(SELECT DNI FROM ALUMNOS WHERE APENOM='D�az Fern�ndez, Mar�a') AND COD=(SELECT COD FROM ASIGNATURAS WHERE NOMBRE = 'FOL')))

-- EJERICIO 14
SELECT NOMBRE FROM ASIGNATURAS WHERE NOT EXISTS (SELECT COD FROM NOTAS WHERE NOTAS.COD=ASIGNATURAS.COD)

-- EJERCICIO 15
SELECT APENOM FROM ALUMNOS WHERE DNI IN (SELECT DNI FROM NOTAS WHERE COD='1')

-- EJERCICIOS 16
SELECT APENOM FROM ALUMNOS WHERE DNI NOT IN (SELECT DNI FROM NOTAS WHERE COD='1')

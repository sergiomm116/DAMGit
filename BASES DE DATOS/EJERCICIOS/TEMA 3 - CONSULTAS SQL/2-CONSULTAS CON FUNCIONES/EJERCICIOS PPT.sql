-- GRUPOS VALORES 1
SELECT COUNT(APELLIDO) FROM EMPLE WHERE APELLIDO LIKE 'A%'

-- GRUPO VALORES 2
SELECT APELLIDO FROM EMPLE WHERE APELLIDO LIKE 'A%' 
AND SALARIO=(SELECT MAX(SALARIO) FROM EMPLE WHERE APELLIDO LIKE 'A%')
	-- EJERCICIO 1 -- 
SELECT OFICIO, SUM(SALARIO)"SUMA SALARIOS" FROM EMPLE
WHERE DEPT_NO = (SELECT DEPT_NO FROM DEPART WHERE DNOMBRE = 'VENTAS')
GROUP BY OFICIO

-- EJERCICIO 2 --
SELECT APELLIDO FROM EMPLE E WHERE SALARIO = (SELECT AVG(SALARIO) FROM EMPLE WHERE E.DEPT_NO=DEPT_NO)

-- EJERCICIO 3 --
SELECT DEPT_NO, COUNT(*)"N� EMPLEADOS" FROM EMPLE WHERE OFICIO='EMPLEADO' GROUP BY DEPT_NO

-- EJERCICIO 4 --
SELECT DEPT_NO FROM EMPLE WHERE OFICIO='EMPLEADO' 
GROUP BY DEPT_NO HAVING COUNT(*)=(SELECT MAX(COUNT(*)) FROM EMPLE WHERE OFICIO='EMPLEADO' GROUP BY DEPT_NO)

-- EJERCICIO 5 --
SELECT E.DEPT_NO, DNOMBRE, COUNT(*)"N� EMPLEADOS" FROM EMPLE E, DEPART D 
WHERE OFICIO='EMPLEADO' AND E.DEPT_NO=D.DEPT_NO GROUP BY E.DEPT_NO, DNOMBRE
HAVING COUNT(*)=(SELECT MAX(COUNT(*)) FROM EMPLE WHERE OFICIO='EMPLEADO' GROUP BY DEPT_NO)

-- EJERCICIO 6 --
SELECT DEPT_NO FROM EMPLE E GROUP BY DEPT_NO, OFICIO HAVING COUNT(DEPT_NO)>2

-- EJERCICIO 7 --
SELECT NOMBRE FROM ALUM INTERSECT
(SELECT NOMBRE FROM NUEVOS UNION SELECT NOMBRE FROM ANTIGUOS)

-- EJERCICIO 8 --
SELECT NOMBRE FROM ALUM
WHERE NOMBRE IN (SELECT NOMBRE FROM NUEVOS UNION SELECT NOMBRE FROM ANTIGUOS)

(SELECT NOMBRE FROM ALUM INTERSECT
SELECT NOMBRE FROM NUEVOS) UNION 
(SELECT NOMBRE FROM ALUM INTERSECT
SELECT NOMBRE FROM ANTIGUOS);

-- EJERCICIO 9 --
(SELECT NOMBRE FROM ALUM MINUS 
SELECT NOMBRE FROM ANTIGUOS) MINUS 
SELECT NOMBRE FROM NUEVOS

SELECT NOMBRE FROM ALUM MINUS
(SELECT NOMBRE FROM ANTIGUOS UNION SELECT NOMBRE FROM NUEVOS)

-- EJERCICIO 10 --
SELECT C.NOMBRE, P.ESPECIALIDAD, COUNT(P.DNI) FROM CENTROS C, PROFESORES P
WHERE C.COD_CENTRO = P.COD_CENTRO (+)
GROUP BY C.NOMBRE, P.ESPECIALIDAD

-- EJERCICIO 11 --
SELECT C.NOMBRE, COUNT (P.DNI)
FROM CENTROS C, PERSONAL P
WHERE C.COD_CENTRO = P.COD_CENTRO (+)
GROUP BY C.NOMBRE

-- EJERCICIO 12 --
SELECT ESPECIALIDAD, COUNT(DNI) FROM PROFESORES GROUP BY ESPECIALIDAD 
HAVING COUNT(DNI)= (SELECT MIN(COUNT(*)) FROM PROFESORES GROUP BY DNI)

-- EJERCICIO 13 --
SELECT B.NOMBRE_BANC, COUNT(S.COD_SUCUR) 
FROM BANCOS B, SUCURSALES S
WHERE B.COD_BANCO = S.COD_BANCO
GROUP BY B.NOMBRE_BANC 
HAVING COUNT(S.COD_SUCUR) = (SELECT MAX(COUNT(COD_SUCUR)) FROM SUCURSALES GROUP BY COD_BANCO)

-- EJERCICIO 14 --
SELECT B.NOMBRE_BANC, SUM(C.SALDO_DEBE)"SALDO DEBE", SUM(C.SALDO_HABER)"SALDO HABER"
FROM CUENTAS C, BANCOS B
WHERE POBLACION='GUADALAJARA' AND B.COD_BANCO = C.COD_BANCO
GROUP BY B.NOMBRE_BANC

-- EJERCICIO 15 --
SELECT NOMBRE_CTA, COUNT(*)
FROM CUENTAS C, MOVIMIENTOS M
WHERE C.NUM_CTA = M.NUM_CTA AND C.COD_SUCUR=M.COD_SUCUR AND C.COD_BANCO = M.COD_BANCO
GROUP BY NOMBRE_CTA
HAVING COUNT(*) = (SELECT MAX(COUNT(*)) FROM MOVIMIENTOS GROUP BY COD_BANCO, COD_SUCUR, NUM_CTA)

-- EJERCICIO 16 --
SELECT NOMBRE_SUC, SUM(IMPORTE)
FROM SUCURSALES S, MOVIMIENTOS M
WHERE TIPO_MOV='R' AND M.COD_BANCO = S.COD_BANCO AND S.COD_SUCUR = M.COD_SUCUR
GROUP BY S.NOMBRE_SUC, S.COD_BANCO, S.
HAVING SUM(IMPORTE) = (SELECT MAX(SUM(IMPORTE)) FROM MOVIMIENTOS M, SUCURSALES S 
                       WHERE TIPO_MOV='R' AND M.COD_BANCO = S.COD_BANCO AND S.COD_SUCUR = M.COD_SUCUR
                       GROUP BY S.COD_SUCUR)
                       

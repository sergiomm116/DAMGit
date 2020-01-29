UPDATE EMPLE
SET DEPT_NO=(SELECT DEPT_NO FROM EMPLE WHERE OFICIO='EMPLEADO'
             GROUP BY DEPT_NO
             HAVING COUNT(*)=(SELECT MAX(COUNT(*))
                              FROM EMPLE
                              WHERE OFICIO='EMPLEADO'
                              GROUP BY DEPT_NO))
WHERE APELLIDO='CEREZO'

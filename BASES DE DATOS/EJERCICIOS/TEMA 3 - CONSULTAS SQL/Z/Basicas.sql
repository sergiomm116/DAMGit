select nombre from asignaturas 
where cod not in
(select cod from notas where nota > 5 );

--Consulta que muestre el nº de empleado, apellido y oficio de los empleados de los departamentos VENTAS o CONTABILIDAD.



select emp_no, apellido, oficio
from emple
where dept_no in (select dept_no from depart where dnombre='VENTAS' or dnombre='CONTABILIDAD');


--obten los datos de los departamentos que no tengan empleados

select * from depart where dept_no not in
(select dept_no from emple);

--visualiza con una sola orden select todos los temas de libreria cuyo numero de ejemplares sea inferior a los que hay en medicina

select tema from libreria
where ejemplares<(select ejemplares
from libreria
where tema='MEDICINA');

--OBTEN EL NOMBRE Y APELLIDO DE LOS ALUMNOS QUE NO TENGAN NOTA EN LAS ASIGNATURA DE CODIGO 1

select apenom
from alumnos

select * from asignatura
where cod_asignatura=1;



--EJERCICIOS ENTREGAR

--1 selecciona el apellido, oficio y la localidad de los departamentos de aquellos empleados cuyo oficio sea ANALISTA

select emple.apellido, emple.oficio, depart.loc
from emple, depart
where oficio='ANALISTA' and emple.emp_no=depart.emp_no;

--2 obten los datos de los empleados cuyo director se CEREZO

select *
from emple
where apellido='CEREZO';

--3 obten los datos de los empleados del departamento de VENTAS


select *
from emple
where dept_no=(select dept_no from depart where dnombre='VENTAS');

--4 obten los datos de los departamentos que no tengan empleados

select *
from emple;

select *
from depart
where dept_no not in (select distinct dept_no from emple);

--5 obten los datos de los departamentos que tengan empleados

select *
from depart
where dept_no in (select distinct dept_no from emple);

--6 obten el apellido y el salario de los empleados que superen todos los salarios de los empleados del departamento 20

select apellido, salario
from emple where salario> all
(select salario
from emple
where dept_no=20);

--visualiza el tema, estante y ejemplares de las filas de LIBRERIA con ejemplares comprendidos entre 8 y 15

select *
from libreria;

select tema, estante, ejemplares
from libreria
where ejemplares between 8 and 15;

--visualiza el tema, estante y ejemplares de las filas cuyo estante no este comprendido entre la B y la D

select tema, estante, ejemplares
from libreria
where estante NOT BETWEEN 'B' AND 'D';

--visualza los temas de libreria cuyo numero de ejemplares no este entre 15 y 20

select tema from libreria
where ejemplares not between 15 and 20;

--visualiza todas las asignaturas que contengan tres letras 'o' en su interior y tengan alumnos matriculados de 'madrid'
--TABLAS ALUMNOS ASIGNATURAS NOTAS


select nombre
from asignaturas asi, alumnos alu, notas n
where asi.cod=n.cod and alu.dni=n.dni and
nombre like '%o%o%o%' and pobla='Madrid';

--visualiza los nombres de alumnos de madrid que tengan alguna asignatura suspensa

select *
from alumnos;

select *
from notas;

select apenom
from alumnos al, notas n
where al.dni=n.dni and pobla='Madrid' and nota<5;

--MUESTRA LOS NOMBRES DE ALUMNOS QUE TENGAN LA MISMA NOTA DE DIAZ FERNANDEZ MARIA EN FOL EN ALGUNA ASIGNATURA

select *
from alumnos;

select *
from notas; 

select *
from asignaturas;

select apenom 
from notas n, asignaturas asi, alumnos alu
where alu.dni=n.dni and n.cod=asi.cod and n.cod=(select cod from asignaturas where nombre='FOL' and alu.apenom='Díaz Fernández, María');

--obten los datos de las asignaturas que no tengan alumnos

select *
from asignaturas;

select *
from alumnos;

select *
from asignaturas where cod not in(select cod from notas);

--obten el nombre y apellido de los alumnos que no tengan nota en la asignatura con codigo 1
select *
from notas;

select apenom from alumnos
where dni not in(select dni from notas where cod=1);

--Visualiza los nombres de alumnos de "Madrid" que tengan alguna asignatura suspensa.
 
SELECT apenom
FROM alumnos
WHERE pobla='Madrid' AND dni=(SELECT dni
                              FROM notas
                              WHERE nota < 5);
 
--Muestra los nombres de alumnos que tengan la misma nota que tiene "Díaz Fernández, María" en "FOL" en alguna asignatura.
 
SELECT apenom, nota
FROM alumnos, notas, asignaturas
WHERE asignaturas.cod=notas.COD AND
      alumnos.dni=notas.dni AND
      nota=(SELECT nota
            FROM notas
            WHERE dni=(SELECT dni
                        FROM alumnos
                        WHERE apenom='Díaz Fernández, María')
            AND cod=(SELECT cod
                      FROM asignaturas
                      WHERE nombre='FOL')
                      );
 

 

 
--14. Obtén los datos de las asignaturas que no tengan alumnos.
 
SELECT *
FROM asignaturas
WHERE cod NOT IN (SELECT cod
                  FROM notas);
 
--Obtén el nombre y apellidos de los alumnos que tengan nota en la asignatura con código 1.
 
SELECT apenom
FROM alumnos, notas
WHERE alumnos.dni=notas.dni AND
      cod=1;
 
--Obtén el nombre y apellidos de los alumnos que no tengan nota en la signatura con código 1.
 
SELECT UNIQUE apenom
FROM alumnos
WHERE dni NOT IN (SELECT dni
                  FROM notas
                  WHERE cod=1);





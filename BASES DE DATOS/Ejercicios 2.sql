REM *** Tablas EMPLE y DEPART ***


select APELLIDO, OFICIO, LOC
from DEPART D, EMPLE E
where D.DEPT_NO = E.DEPT_NO
and
OFICIO = 'ANALISTA';


select *
from EMPLE
where DIR = (
  select EMP_NO
  from EMPLE
  where APELLIDO = 'CEREZO'
  );
  

REM Ciudado con el *, si el from se refiriera a más de una tabla, sacaría todos 
REM los datos de todas las tablas y una declaración de tipo X.* es inválida
REM Los campos se deben poner entonces a mano
select *
from EMPLE
where DEPT_NO = (
  select DEPT_NO
  from DEPART
  where DNOMBRE = 'VENTAS'
  );
  

REM usar DISTINCT en el select interno reduce el número de operaciones del externo
select *
from DEPART
where DEPT_NO not in (
  select DEPT_NO
  from EMPLE
  );
  
  
select *
from DEPART
where DEPT_NO in (
  select DEPT_NO
  from EMPLE
  );
REM alternativa exists
select *
from DEPART
where not exists (
  select *
  from EMPLE
  where DEPART.DEPT_NO = EMPLE.DEPT_NO
  );
  
  
select APELLIDO, SALARIO
from EMPLE
where SALARIO > all (
  select SALARIO
  from EMPLE
  where DEPT_NO = 20
  );
  
  
  
REM *** Tabla LIBRERIA ***


select *
from LIBRERIA
where EJEMPLARES between 8 and 15;


select *
from LIBRERIA
where ESTANTE not between 'B' and 'D';


select TEMA
from LIBRERIA
where EJEMPLARES < (
  select EJEMPLARES
  from LIBRERIA
  where TEMA = 'MEDICINA'
);


select TEMA
from LIBRERIA
where EJEMPLARES not between 15 and 20;



REM *** Tablas ALUMNOS, ASIGNATURAS, NOTAS ***

select * from ALUMNOS;

select * from ASIGNATURAS;

select * from NOTAS;



select distinct  *
from ASIGNATURAS
where NOMBRE like '%o%o%o%'
and
COD in (
  select COD
  from NOTAS
  where exists (
    select DNI
    from ALUMNOS
    where ALUMNOS.DNI = NOTAS.DNI
    and
    POBLA = 'Madrid'
  )
);


select APENOM
from ALUMNOS
where DNI in (
  select DNI
  from NOTAS
  where NOTA < 5
);

REM ¿Por qué no funciona con exists justo delante de where?


select APENOM
from ALUMNOS
where DNI in (
  select DNI
  from NOTAS
  where NOTA = (
    select NOTA
    from NOTAS
    where COD = (
      select COD
      from ASIGNATURAS
      where NOMBRE = 'FOL'
    )
    and
    DNI = (
      select DNI
      from ALUMNOS
      where APENOM = 'Díaz Fernández, María'
    )
  )
);


select *
from ASIGNATURAS
where not exists (
  select COD
  from NOTAS
  where NOTAS.COD = ASIGNATURAS.COD
);


select APENOM
from ALUMNOS
where DNI in (
  select DNI
  from NOTAS
  where COD = '1'
);

select APENOM
from ALUMNOS
where DNI not in (
  select DNI
  from NOTAS
  where COD = '1'
);
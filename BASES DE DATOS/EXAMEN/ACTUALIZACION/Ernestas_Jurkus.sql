REM *** Ejercicio 1 ***

insert into INVESTIGADORES
select '321321321R', 'EDUARDO', APELLIDOS, IDFACULTAD, DNIJEFE
from INVESTIGADORES
where DNI = '234353433P';



REM *** Ejercicio 2 ***

update INVESTIGADORES
set NOMBRE = concat('JEFE ', NOMBRE)
where DNI in (select DNIJEFE
              from INVESTIGADORES
              group by DNIJEFE
              having count(*)>1);


             
REM *** Ejercicio 3 ***

delete from EQUIPOS
where (IDEQUIPO not in (select distinct IDEQUIPO from RESERVA)) or 
      (IDEQUIPO in (select distinct IDEQUIPO from RESERVA where FECHAINICIO < to_date('12/09/05','dd/mm/yy')));



REM *** Ejercicio 4 ***

update EQUIPOS
set PRECIO = PRECIO*0.9
where (IDFACULTAD = (select IDFACULTAD from FACULTAD where NOMFACULTAD = 'Ciencias Naturales' and CIUDAD = 'Barcelona') and
      (IDEQUIPO not in (select distinct IDEQUIPO from RESERVA)));


      
REM *** Ejercicio 5 ***

insert into EQUIPOS
select 'K232', IDFACULTAD, 'Microprocesador i7', PRECIO*2
from EQUIPOS
where DESCRIPCION = 'Cámara digital SONY';



REM *** Ejercicio 6 ***

delete from FACULTAD
where IDFACULTAD in (select distinct IDFACULTAD
                     from EQUIPOS
                     group by IDFACULTAD
                     having sum(PRECIO) = (select max(sum(PRECIO))
                                           from EQUIPOS
                                           group by IDFACULTAD));



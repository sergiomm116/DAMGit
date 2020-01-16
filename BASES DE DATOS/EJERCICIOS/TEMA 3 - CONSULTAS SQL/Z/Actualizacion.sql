insert into alum
 select distinct * from nuevos n
 where nombre not in (select nombre from alum);
 
 
 ROLLBACK;
 
 INSERT INTO EMPLE SELECT 2000, 'SAAVEDRA', OFICIO, DIR, SYSDATE, SALARIO+(SALARIO*0.20), COMISION, DEPT_NO 
 FROM EMPLE 
 WHERE apellido='SALA';
 
 --EJERCICIOS INSERT , UPDATE, DELETE1- El supermercado necesita incrementar 
 --en un 10% el sueldo de los empleados de la sucursal de "Cruz del Eje". 
 --Actualice el campo "sueldo" de la tabla "empleados" de todos los empleados 
 --de dicha sucursal empleando subconsulta
update empleados
set sueldo=sueldo+(sueldo*0.1)
where codigosucursal=(select codigosucursal from sucursal where ciudad like 'Cruz del Eje');

 select *
 from sucursal;
--7- Inserta otro empleado en la sucursal con menos emplados (inventa los datos necesarios). 
--¿qué problema puede presentar este ejercicio?

insert into empleado
select 00000000, 'pepe Sanz', codigo, 9999
from sucursal
where codigo in(select codigosucursal from empleados
group by codigosucursal
having count(*)=(select min(count(*))
from empleados
group by codigosucursal));

--modifica el numero de departamento de SAAVEDRA.El nuevo departamento sera el 
--departamento donde hay mas empleados cuyo oficio sea EMPLEADO

SELECT *
FROM EMPLE;


UPDATE EMPLE
SET DEPT_NO=(select dept_no
from emple
where oficio='EMPLEADO'
group by dept_no
having count(*)=(SELECT max(count(*)) from emple where oficio='EMPLEADO' group by dept_no))
WHERE APELLIDO='SAAVEDRA';

--2- El supermercado quiere incrementar en un 20% el sueldo de los empleados de 
--las sucursales de la provincia de Córdoba. Actualice el campo "sueldo" de la tabla 
--"empleados" de todos los empleados de tales sucursales empleando subconsulta.

update empleados
set sueldo=sueldo+(sueldo*0.2)
where codigosucursal in(select codigo from sucursal where provincia like 'Cordoba');


--3- La empleada "Ana Acosta" es trasladada a la sucursal de Carlos Paz. Se necesita 
--actualizar el sueldo y la sucursal de tal empleada empleando subconsultas, debe 
--tener el mismo sueldo que la empleada "Maria Morales". 

update empleados
set codigosucursal=(select codigosucursal from empleados where nombre='Carlos Paz'),
sueldo=(SELECT sueldo from empleados where nombre='Maria Morales')
where nombre='Ana Acosta';

--4- El empleado "Carlos Caseros" se traslada a la sucursal de "La Plata".
--Se necesita actualizar el sueldo y sucursal de tal empleado con los mismos 
--valores que la empleada "Maria Morales" (emplear subconsulta).

update empleados
set codigosucursal=(select codigosucursal from empleados where nombre='Maria Morales'), sueldo=(select sueldo from empleados where nombre='Maria Morales')
where nombre='Carlos Caseros';

select *
from empleados;
select *
from sucursal;

--

--modifica el numero de plazas con un valor igual a la mitad en aquellos centros con menos de dos profesores

update centros
set num_plazas=num_plazas/2
where cod_centro in(select cod_centro
                    from porfesores
                    group by cod_centro
                    having count(dni)/2);
select *
from profesores;

-- Eliminar los centros que no tengan personal.
DELETE FROM centros
 WHERE cod_centro IN (SELECT cod_centro FROM profesores
 GROUP BY cod_centro
 HAVING COUNT(*) =0);

--Añadir un nuevo profesor en el centro o en los centros cuyo número de administrativos sea 1 en la
--especialidad de ‘idioma’, con dni 8790055 y de nombre ‘Clara Salas’.

INSERT INTO profesores
 (cod_centro, dni, apellidos, especialidad)
 SELECT cod_centro, 8790055, 'CLARA SALAS', 'IDIOMA'
 FROM centros
 WHERE cod_centro IN (SELECT cod_centro FROM personal
 WHERE funcion='ADMINISTRATIVO'
 GROUP BY cod_centro
 HAVING COUNT(*)=1);

--Borrar el personal que esté en centros de menos de 300 plazas y con menos de dos profesores.

DELETE FROM personal
 WHERE cod_centro IN (SELECT cod_centro FROM centros
 WHERE num_plazas < 300 AND cod_centro IN
 (SELECT cod_centro FROM profesores
 GROUP BY cod_centro
 HAVING COUNT(*)<2));


--Borrar a los profesores que estén en la tabla PROFESORES y que no estén en la tabla PERSONAL.

 DELETE FROM profesores
 WHERE dni NOT IN (SELECT dni FROM personal
 WHERE funcion='PROFESOR');


--Dar de alta un nuevo artículo de ‘Primera’ categoría para los fabricantes de ‘francia’ y abastecer con cinco
--unidades de ese artículo a todas las tiendas y en la fecha de hoy.


INSERT INTO articulos 
Ejercicios transacciones 2
 SELECT 'Chocolate',cod_fabricante,1,'Primera',100,75,35
 FROM fabricantes
 WHERE pais='FRANCIA';

--Insertar un pedido de 20 unidades en la tienda ‘1111-a’ con el artículo que mayor número de ventas
--haya realizado.


INSERT INTO ventas
 SELECT '1111-A', articulo, cod_fabricante, peso, categoria, SYSDATE, 20
 FROM ventas
 WHERE articulo=(SELECT articulo FROM ventas
 GROUP BY articulo
 HAVING SUM(unidades_vendidas) =
 (SELECT (MAX(SUM(unidades_vendidas)))
 FROM ventas
 GROUP BY articulo));


-- Dar de alta una tienda en la provincia de Madrid y abastecerla con 20 unidades de cada uno de los
--artículos existentes.
 INSERT INTO tiendas
 VALUES ('6755-J','Mercancias Andres','C/nose 32','Zaragoza','Zaragoza',50012);

INSERT INTO pedidos
 SELECT '6755-J',articulo, cod_fabricante, peso,categoria, SYSDATE, 20
 FROM articulos;

--Dar de alta dos tiendas en la provincia de Sevilla y abastecerlas con 30 unidades de artículos de la
marca de fabricante gallo.
INSERT INTO tiendas
 VALUES('2349-D','OSCAR MARKET','C/nOSE 34','SEVILLA','SEVILLA',41253)




INSERT INTO pedidos
 SELECT nif, articulo, cod_fabricante, peso, categoria, SYSDATE, 30
 FROM articulos, tiendas
 WHERE tiendas.provincia='SEVILLA'
 AND cod_fabricante = (SELECT cod_fabricante FROM fabricantes
 WHERE nombre='GALLO') ;


--Realizar una venta para todas las tiendas de toledo de 10 unidades en los artículos de primera
categoría.

INSERT INTO ventas
 SELECT nif,articulo,cod_fabricante,peso,categoria,SYSDATE,10
 FROM articulos,tiendas
 WHERE categoria='Primera'
 AND provincia='TOLEDO';


--Para aquellos artículos de los que se hayan vendido más de 30 unidades, realizar un pedido de 10
--unidades para la tienda con NIF ‘5555-B’con la fecha actual.

INSERT INTO pedidos
 SELECT '555-D',articulo,cod_fabricante,peso,categoria,SYSDATE,10
 FROM ventas
 WHERE articulo IN (SELECT articulo FROM ventas
 GROUP BY articulo
 HAVING SUM(unidades_vendidas)>30);


--Cambiar todos los artículos de ‘primera’ categoría del país ITALIA

UPDATE articulos
 SET categoria='Quinta'
 WHERE categoria='Primera' AND
 cod_fabricante = (SELECT cod_fabricante FROM fabricantes
 WHERE pais='ITALIA');

-- Eliminar aquellas tiendas que no han realizado ventas.
  DELETE FROM TIENDAS
  WHERE NIF NOT IN (SELECT NIF FROM VENTAS)


--Eliminar los artículo que no hayan tenido no compras ni ventas.

  DELETE FROM ARTICULOS
  WHERE ARTICULO NOT IN (SELECT ARTICULO FROM VENTAS
  GROUP BY ARTICULO)
  AND ARTICULO NOT IN (SELECT ARTICULO FROM PEDIDOS
  GROUP BY ARTICULO)

--Borrar los pedidos de ‘primera’ categoría cuyo país de procedencia sea BÉLGICA.

DELETE FROM PEDIDOS
WHERE COD_FABRICANTE = (SELECT COD_FABRICANTE FROM FABRICANTES 
WHERE PAIS='BELGICA');

--Borrar los pedidos que no tengan tienda.

 DELETE FROM PEDIDOS
  WHERE NIF NOT IN(SELECT NIF FROM TIENDAS);

--Restar uno a las unidades de los últimos pedidos de la tienda con nif 555-B
UPDATE PEDIDOS
 SET UNIDADES_PEDIDAS=UNIDADES_PEDIDAS-1
 WHERE NIF='5555-B' AND
 FECHA_PEDIDO=(SELECT MAX(FECHA_PEDIDO) FROM PEDIDOS WHERE NIF='5555-B') ;


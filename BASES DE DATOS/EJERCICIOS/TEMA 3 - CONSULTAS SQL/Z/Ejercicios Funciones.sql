--Dada la tabla EMPLE, obtén el sueldo medio, el número de comisiones no nulas, el máximo sueldo y el mínimo sueldo de los empleados del departamento 30. Emplea el formato adecuado para la salida para las cantidades numéricas.

SELECT AVG(salario), count(comision), max(salario), min(salario)
FROM emple
where dept_no=30;


-- Visualiza los temas con mayor número de ejemplares de la tabla LIBRERIA y que tengan, al menos, una 'E' (pueden ser un tema o varios).

select tema "TEMAS CON MAS EJEMPLARES"
from libreria
where libreria.tema like '%E%';

--Dada la tabla MISTEXTOS, ¿qué sentencia SELECT se debe ejecutar para tener este resultado
select rpad(rtrim(ltrim(titulo, '"'), '."'),38, '_^')
from mistextos;



/*4Visualiza los títulos de la tabla MISTEXTOS sin los caracteres punto y comillas, y en minúscula, de dos formas conocidas. */
select * from mixtextos
select lower(rtrim(ltrim(titulo, '"'), '."'))
from mistextos;


/*5 Dada la tabla LIBROS, escribe la sentencia SELECT que visualice dos columnas, una con el AUTOR y otra con el apellido del autor.*/
select * from libros
select rtrim(substr(autor,1,instr(autor, ',')), ',') as APELLIDO ,
autor
from libros;


/*6Escribe la sentencia SELECT que visualice las columna de AUTOR y otra columna con el nombre del autor (sin el apellido) de la tabla LIBROS.*/

select autor, rtrim(substr(autor,1,instr(autor, ',')), ',') as APELLIDO
from libros;



/*7 A partir de la tabla LIBROS, realiza una sentencia SELECT que visualice en una columna, primero el nombre del autor y, luego, su apellido.*/

select concat(rtrim(substr(autor,1,instr(autor, ',')), ','),
rtrim(substr(autor,instr(autor, ',')), ','))as NOMBRE
from libros;

/*8 A partir de la tabla LIBROS, realiza una sentencia SELECT para que aparezcan los títulos ordenados por su número de caracteres.*/

select titulo
from libros
order by length(titulo);

/*9 Dada la tabla NACIMIENTOS, realiza una sentencia SELECT que obtenga la siguiente salida:
NOMBRE, FECHANAC, FECHA_FORMATEADA, donde FECHA_FORMATEADA tiene el siguieten formato: "Nació el 12 de mayo de 1982".*/

select nombre, fechanac, 'Nació el ' || to_char(fechanac, 'DD') || ' de ' || rtrim(to_char(fechanac, 'MONTH')) || ' de ' || to_char(fechanac, ' YYYY ')
from nacimientos;


--Dada la tabla LIBRERIA, haz una sentencia SELECT que visualice el tema, el último carácter del tema que no sea blanco y el número de caracteres de tema(sin contar los blancos de la derecha) ordenados por tema.

select rtrim(tema,' ') , length(rtrim(tema,' '))
from libreria;



--A partir de la tabla NACIMIENTOS, visualiza en una columna el NOMBRE seguido de su fecha de nacimiento formateada (quita blancos del nombre).

select length(rtrim(nombre,' ')) as PruebaEspacios, rtrim(nombre,' ') || ' ' ||
( 'Nació el ' || to_char(fechanac, 'DD') || ' de ' ||
lower(to_char(fechanac, 'MONTH')) || 'de ' ||
to_char(fechanac, 'YYYY') || '.' ) as nombre_y_fecha_formateada
from nacimientos;

--Convierte la cadena '010712' a fecha y visualiza su nombre de mes en mayúsculas.

select to_char(to_date('010712','DDMMYY'),'MONTH') as fecha
from dual;

--Visualiza aquellos temas de la tabla LIBRERIA cuyos ejemplares sean 7 con el nombre de tema de 'SEVEN'; el resto de temas que no tengan 7 ejemplares se visualizarán como están.

select tema, decode(ejemplares,7,'SEVEN', ejemplares)
from libreria;

--A partir de la tabla EMPLE, obtén el apellido de los empleados que lleven más de 15 años trabajando.

select APELLIDO,(to_char(current_date,'YYYY') - to_char(fecha_alt,'YYYY'))
FROM EMPLE
WHERE(to_char(current_date,'YYYY') - to_char(fecha_alt,'YYYY'))>15;



--Selecciona el apellido de los empleados de la tabla EMPLE que lleven más de 16 años trabajando en el departamento 'VENTAS'.

select APELLIDO,(to_char(current_date,'YYYY') - to_char(fecha_alt,'YYYY'))
FROM EMPLE
WHERE(to_char(current_date,'YYYY') - to_char(fecha_alt,'YYYY'))>16 AND
EMPLE.DEPT_NO=(SELECT DEPT_NO
FROM DEPART
WHERE DNOMBRE='VENTAS');



-- Visualiza el apellido, el salario y el número de departamento de aquellos empleados de la tabla EMPLE cuyo salario sea el mayor de su departamento.

SELECT apellido, salario, dept_no as numero_departamento
from emple e
where salario=(select max(salario)
from emple
where emple.dept_no=e.dept_no)
order by dept_no;

--Visualiza el apellido, el salario y el número de departamento de aquellos empledados de la tabla EMPLE cuyo salario supere a la media en su departamento.

SELECT apellido, salario, dept_no as numero_departamento
from emple e
where salario>(select avg(salario)
from emple
where emple.dept_no=e.dept_no)
order by dept_no;
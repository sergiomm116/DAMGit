

--avanzadas
--1
select oficio, sum(salario)
from emple e,depart d
where e.dept_no=d.dept_no and dnombre='VENTAS'
group by oficio;

--2

select apellido from emple e
where salario =(select avg(salario) from emple group by dept_no
  having dept_no=e.dept_no);
  
  --3
  select *
  from emple;
  
  select dept_no,count(emp_no)
  from emple
  where oficio='EMPLEADO'
  GROUP BY dept_no;
  
  --4
  
  select * from depart;
  
  select dept_no
  from emple
  where oficio='EMPLEADO'
  GROUP BY dept_no
  having count(*)=(select max(count(emp_no)) from emple  where oficio='EMPLEADO' group by dept_no);
  
  
  --5
  
    select e.dept_no, dnombre
  from emple e, depart d
  where oficio='EMPLEADO' and d.dept_no=e.dept_no
  GROUP BY e.dept_no, dnombre
  having count(*)=(select max(count(emp_no)) from emple  where oficio='EMPLEADO' group by dept_no);
  
  --6 busca los departamentos que tienen mas de dos personas trabajando
  
  select dept_no
  from emple
  group by emple.dept_no, oficio
  having count(dept_no)>2;
  
  --7 visualiza los nombres de los alumnos que aparezcan en las tablas ANTIGUOS Y NUEVOS
  

  
  select nombre 
  from alum 
  where nombre in (select nombre from nuevos) and nombre in (select nombre from antiguos);
  
  --
  
  --9 visualiza los nombres de los alumnos que no esten  en las tablas ANTIGUOS Y NUEVOS
  
  select nombre
  from alum
  where nombre not in(select nombre from nuevos) and nombre not in (select nombre from antiguos);
  
  select nombre, especialidad, count(pro.apellidos)"NUmero de profesores"
  from centros cen, profesores pro
  where cen.cod_centro=pro.cod_centro(+)--join externo
  group by nombre, especialidad;
  
  --12 obten la especialidad con menos profesores
  
  select especialidad, count(especialidad)
  from profesores
  group by especialidad
  having count(especialidad)=(select min(count(especialidad)) from profesores group by especialidad);
  
  --13 obtener el banco con mas sucursales
  
  select *
  from bancos;
  
  select *
  from sucursales;
  
  select nombre_banc, count(s.cod_sucur)"Numero de sucursales"
  from bancos b,sucursales s 
  where b.cod_banco=s.cod_banco
  GROUP BY nombre_banc
  having count(cod_sucur)=(select max(count(cod_sucur)) from sucursales group by cod_banco);
  
  --14 el saldo actual de los bancos de guadalajara, 1 fila por cada banco
  --nombre saldo debe saldo haber
  
  select *
  from bancos;
  
  select nombre_banc, sum(saldo_debe), sum(saldo_haber)
  from bancos b, cuentas cu
  where poblacion='GUADALAJARA' and cu.cod_banco=b.cod_banco
  group by nombre_banc;
  
  --15 datos de la cuentas con mas movimientos
  
  select *
  from cuentas;
  
  select *
  from movimientos;
  
  select nombre_cta, count(fecha_mov)
  from cuentas cu, movimientos mo
  where cu.num_cta=mo.num_cta and cu.cod_sucur=mo.cod_sucur
  group by nombre_cta
  having count(fecha_mov)=(select max(count(fecha_mov)) from movimientos group by cod_banco);
  
  --16 el nombre de la sucursal que haya tenido mas suma de reintegros
  

  
  select nombre_suc,sum(importe)
  from sucursales s, movimientos m
  where s.cod_sucur=m.cod_sucur and s.cod_banco=m.cod_banco and tipo_mov='R'
  group by nombre_suc
  having sum(importe)=(select max(sum(importe)) from movimientos m, sucursales s
                                                where  s.cod_sucur=m.cod_sucur and s.cod_banco=m.cod_banco and tipo_mov='R'
                                                group by s.cod_sucur);
  
 
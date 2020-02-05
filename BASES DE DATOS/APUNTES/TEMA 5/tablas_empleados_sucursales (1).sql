

 drop table empleados;
 drop table sucursal;


 create table sucursal( 
  codigo number(2),
  ciudad varchar2(30) not null,
  provincia varchar2(30),
  primary key(codigo)
 ); 


 create table empleados( 
  documento char(8) not null,
  nombre varchar2(30) not null,
  codigosucursal number(2),
  sueldo number(6,2),
  primary key(documento),
  constraint FK_empleados_sucursal
   foreign key (codigosucursal)
   references sucursal(codigo)
 ); 


 insert into sucursal values(1,'Cordoba','Cordoba');
 insert into sucursal values(2,'Tucuman','Tucuman');
 insert into sucursal values(3,'Carlos Paz','Cordoba');
 insert into sucursal values(4,'Cruz del Eje','Cordoba');
 insert into sucursal values(5,'La Plata','Buenos Aires');

 insert into empleados values('22222222','Ana Acosta',1,500);
 insert into empleados values('23333333','Carlos Caseros',1,610);
 insert into empleados values('24444444','Diana Dominguez',2,600);
 insert into empleados values('25555555','Fabiola Fuentes',5,700);
 insert into empleados values('26666666','Gabriela Gonzalez',3,800);
 insert into empleados values('27777777','Juan Juarez',4,850);
 insert into empleados values('28888888','Luis Lopez',4,500);
 insert into empleados values('29999999','Maria Morales',5,800);

COMMIT
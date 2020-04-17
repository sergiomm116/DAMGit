drop table detalle_dep;
drop table pedido;
drop table vendedor;
drop table clientes;
drop table articulo;

create table clientes (
numcli varchar2(9),
nomcli varchar2(20),
dircli varchar2(40),
fax varchar2(9),
e_mail varchar2(40),

constraint PK_CLIENTES primary key (numcli),
constraint CLIENTES_NOTNULL check (dircli is not null)
);

insert into clientes values ('999999999', 'Alberto', 'Calle perdida 123', '000000000', 'email@falso.com');
insert into clientes values ('888888888', 'Sergio', 'Calle falsa 234', '444444444', 'email@falso.com');
insert into clientes values ('777777777', 'Javier', 'Calle patata 567', '333333333', 'email@falso.com');
insert into clientes values ('666666666', 'Sara', 'Calle manzana 132', '222222222', 'email@falso.com');
insert into clientes values ('555555555', 'Julia', 'Calle pizza 125', '111111111', 'email@falso.com');

create table articulo (
numart varchar2(6),
descripcion varchar2(40),
precio number(3),
existencia number(3),
categoria_art varchar2(7),

constraint PK_ARTICULO primary key (numart),
constraint ARTICULO_NOTNULL check (precio is not null),
constraint CATEGORIA_ART_VALIDA check (categoria_art in('Primera','Segunda', 'Tercera')),
constraint PRECIO_CATEGORIA_VALIDO check ((categoria_art='Primera' and precio>=50) or ((categoria_art='Segunda') and (precio between 20 and 50)) or (categoria_art='Tercera' and precio<=20))
);

insert into articulo values ('A00000', 'Manzana', 10, '915', 'Tercera');
insert into articulo values ('A11111', 'Mango', 20, '820', 'Tercera');
insert into articulo values ('A22222', 'Pera', 30, '720', 'Segunda');
insert into articulo values ('A33333', 'Platano', 40, '660', 'Segunda');
insert into articulo values ('A44444', 'Naranja', 50, '580', 'Primera');
insert into articulo values ('A55555', 'Fresa', 60, '490', 'Primera');


create table vendedor (
codvendedor varchar2(4),
nomvendedor varchar2(20),
apellvend varchar2(20),
telvend varchar2(9),
e_mail varchar2(40),
cuota number(2),
ventas number(3),

constraint PK_VENDEDOR primary key (codvendedor),
constraint VENDEDOR_NOTNULL check (telvend is not null),
constraint COUTA_VALIDA check (cuota between 15 and 60)
);

insert into vendedor values ('1111', 'Julian', 'Castillo', '911111111', 'email@falso.com', 15, 230);
insert into vendedor values ('2222', 'Carlos', 'Torres', '922222222', 'email@falso.com', 20, 430);
insert into vendedor values ('3333', 'Sergio', 'Casas', '933333333', 'email@falso.com', 30, 130);
insert into vendedor values ('4444', 'Amancio', 'ortega', '944444444', 'email@falso.com', 40, 123);
insert into vendedor values ('5555', 'Luis', 'Paredes', '955555555', 'email@falso.com', 60, 990);

alter session set NLS_DATE_FORMAT='DD/MM/YYYY';

create table pedido (
numped varchar2(6),
numcli varchar2(9),
fecha_ped date,
totdesc varchar2(40),
codvendedor varchar2(4),

constraint PK_PEDIDO primary key (numped),
constraint FK_PEDIDO_NUMCLI foreign key (numcli) references clientes(numcli),
constraint FK_PEDIDO_CODVENDEDOR foreign key (codvendedor) references vendedor(codvendedor),
constraint PEDIDO_NOTNULL check (fecha_ped is not null)
);

insert into pedido values ('111111', '999999999', to_date('14/07/2019'), 'descripcion pedido', '1111');
insert into pedido values ('222222', '888888888', to_date('16/07/2019'), 'descripcion pedido', '2222');
insert into pedido values ('333333', '777777777', to_date('20/07/2019'), 'descripcion pedido', '3333');
insert into pedido values ('444444', '666666666', to_date('25/07/2019'), 'descripcion pedido', '4444');
insert into pedido values ('555555', '555555555', to_date('30/07/2019'), 'descripcion pedido', '5555');


create table detalle_dep (
numped varchar2(6),
numart varchar2(6),
cantidad number(3),

constraint PK_DETALLE_DEP primary key (numped, numart),
constraint FK_DETALLE_DEP_NUMPED foreign key (numped) references pedido(numped),
constraint FK_DETALLE_DEP_NUMART foreign key (numart) references articulo(numart),
constraint DETALLE_DEP_NOTNULL check (cantidad is not null),
constraint CANTIDAD_VALIDA check (cantidad>0)
);

insert into detalle_dep values ('111111', 'A00000', 30);
insert into detalle_dep values ('222222', 'A11111', 15);
insert into detalle_dep values ('333333', 'A22222', 20);
insert into detalle_dep values ('444444', 'A33333', 5);
insert into detalle_dep values ('555555', 'A44444', 30);
insert into detalle_dep values ('555555', 'A55555', 10);
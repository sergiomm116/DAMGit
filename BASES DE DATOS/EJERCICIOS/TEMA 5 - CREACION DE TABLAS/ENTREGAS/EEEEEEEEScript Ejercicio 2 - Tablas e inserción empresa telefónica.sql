REM ***************** Creación de tablas *******************

create table CLIENTES (

    DNI         varchar2(10)    primary key,
    NOMBRE      varchar2(30),
    CALLE       varchar2(20),
    NUMERO      varchar2(10),
    LOCALIDAD   varchar2(20),
    EDAD        number(2)       constraint nominor check (EDAD>18),
    
    constraint allcapsN check (NOMBRE=upper(NOMBRE))

  );
  
  
create table NODOS (

    ID_NODO   varchar2(10)    primary key,
    BAND_W    number(4),
    LOC       varchar2(30)

  );
  
create table CONTRATOS (
  
    ID_CONTRATO   varchar2(10)    primary key,
    TIPO          varchar2(5)     not null,
    TELEFONO      varchar2(20),
    ID_NODO       varchar2(10)    references NODOS,
    DNI           varchar2(10)    references CLIENTES,
    
    constraint noptionT check (TIPO in ('FIJO','MOVIL')),
    constraint nonullDNI check (DNI is not null),
    constraint CtypeCOMP check ( ( (TIPO='FIJO') and (ID_NODO is not null) ) or ( (TIPO='MOVIL') and (ID_NODO is null) ) )
     
  );
  
  
create table SERVICIOS (

    COD_SERVICIO    varchar2(10)          primary key,
    DESCRIPCION     varchar2(2000 BYTE)   not null,
    PRECIO          varchar2(2)           not null,
    
    constraint nopotionP check (PRECIO in ('20','30','40'))

  );
  
create table CON_SER (

    COD_SERVICIO    varchar2(10)    not null,
    ID_CONTRATO     varchar2(10),
    DURACION        number(3)       not null,
    
    foreign key (COD_SERVICIO) references SERVICIOS,
    foreign key (ID_CONTRATO) references CONTRATOS

  );
  
  
REM ************** Pruebas de insert *******************

REM Orden dados los campos clave y foráneos: CLIENTES|NODOS|SERVICIOS > CONTRATOS > CON_SER

insert into CLIENTES
values ('11111111-H', null, null, null, null, null);

REM insert mínimo válido. Solo la primary key no puede tomar nulls, incluyendo 
REM campos a los que pongamos restricciones. Tampoco podemos ejecutarlo dos veces,
REM por ser DNI campo clave


insert into CLIENTES
values (null, 'ERNESTAS', 'Baker', '221b', 'London', 22);

REM No se pueden dejar como null los campos clave, aunque el resto de valores sean válidos


insert into CLIENTES
values ('22222222-J',null, null, null, null, 13);

REM Los clientes tienen que ser mayores de edad, falla el insert


insert into CLIENTES
values ('22222222-J', 'Ernestas', null, null, null, null);

REM El nombre de los clientes tiene que introducirse en mayúscula


insert into CLIENTES
values ('33333333-K', 'JURKUS', 'Smith', '222a', 'Stilondon', 25);

REM Otro insert válido


insert into NODOS
values ('N0001','2048', 'Cuenca');
insert into NODOS
values ('N0002','1024', 'Madrid');
insert into NODOS
values ('N0003','2048', 'Barcelona');

REM inserts válidos para NODOS (no hay restricciones que comprobar aparte de la primary key)


insert into SERVICIOS
values ('S0001', null, '40');

REM DESCRIPCION es un campo que no puede ser null


insert into SERVICIOS
values ('S0001', 'Internet, movil y tele', 35);

REM El precio que se intenta insertar no está entre las opciones


insert into SERVICIOS
values ('S0001', 'Internet, movil y TV', '40');
insert into SERVICIOS
values ('S0002', 'Internet', '20');

REM Algunos insert válidos


REM ***** Comprobar referencias existentes para CONTRATOS *****

select * from NODOS;
select * from CLIENTES;


insert into CONTRATOS
values ('C0001', 'FIJO', '987654321', 'N9999', '11111111-H');

REM No existe el ID_NODO especificado


insert into CONTRATOS
values ('C0001', 'MOVIL', '987654321', null, '99999999-V');

REM No existe el DNI especificado


insert into CONTRATOS
values ('C0001', 'FIJO', '987654321', null, '11111111-H');

REM Nodo no se puede anular si el tipo es FIJO


insert into CONTRATOS
values ('C0001', 'MOVIL', '987654321', 'NOOO1', '11111111-H');

REM Nodo -debe- ser nulo si el tipo es MOVIL


insert into CONTRATOS
values ('C0001', 'FIJO', '987654321', 'N0002', '11111111-H');
insert into CONTRATOS
values ('C0002', 'MOVIL', '987654321', null, '11111111-H');

REM Dos insert válidos para contratos


REM ***** Comprobar referencias existentes para CON_SER *****

select * from SERVICIOS;
select * from CONTRATOS;


insert into CON_SER
values ('S9999', 'C0001', 45);

REM No existe la referencia a SERVICIOS


insert into CON_SER
values ('S0001', 'C9999', 45);

REM No existe la referencia a CONTRATOS


insert into CON_SER
values ('S0001', 'C0001', 45);

REM Un insert válido


select * from CON_SER;
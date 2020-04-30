-- MODIFICACION 1 --
alter table vendedor add experiencia number(2);
alter table vendedor add constraint EXPERIENCIA_NOTNULL check (experiencia is not null) novalidate;
alter table vendedor add constraint EXPERIENCIA_VALIDA check (experiencia>0) novalidate;

-- MODIFICACION 2 --
alter table clientes modify nomcli varchar2(50);
alter table clientes add constraint NOMBRE_UNICO unique (nomcli);
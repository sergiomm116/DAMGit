create or replace view VISTARESERVA
as select i.dni, nombre, apellidos, count(r.dni)"NUMERO DE RESERVAS"
from investigadores i, reserva r
where r.dni = i.dni and i.dnijefe is null
group by i.dni, r.dni, nombre, apellidos;
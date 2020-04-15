DROP TABLE HTRABAJADOR;
DROP TABLE HPERSONA;
DROP TABLE HHOSPITAL;

CREATE TABLE HPERSONA (
dni varchar2(9),
nombre varchar2(30),
apellido varchar2(30),
direccion varchar2(30),
telefono varchar2(9),

CONSTRAINT PK_HPERSONA PRIMARY KEY (dni)
);

INSERT INTO HPERSONA VALUES ('11111111A', 'Ramon', 'Torres', 'Calle Perdida 123', '123456789');
INSERT INTO HPERSONA VALUES ('22222222A', 'Tomas', 'Alcazar', 'Calle Perdida 123', '123456789');
INSERT INTO HPERSONA VALUES ('33333333A', 'Alberto', 'Carrera', 'Calle Perdida 123', '123456789');
INSERT INTO HPERSONA VALUES ('44444444A', 'Sara', 'Padro', 'Calle Perdida 123', '123456789');
INSERT INTO HPERSONA VALUES ('55555555A', 'Julia', 'Garcia', 'Calle Perdida 123', '123456789');


CREATE TABLE HHOSPITAL (
id_hospital varchar2(2),
nombre_hospital varchar2(30),
camas number(3),
ciudad varchar2(30),
provincia varchar2(30),
capacidad number(4),
activo varchar2(2),

CONSTRAINT PK_HHOSPITAL PRIMARY KEY (id_hospital)
);

INSERT INTO HHOSPITAL VALUES ('10', 'Hospital Virgen de la Luz', 305, 'Cuenca', 'Cuenca', 305, 'SI');
INSERT INTO HHOSPITAL VALUES ('20', 'Hospital de la Paz', 90, 'Ciudad Real', 'Ciudad Real', 90, 'SI');
INSERT INTO HHOSPITAL VALUES ('30', 'Hospital Manzanas', 120, 'Toledo', 'Toledo', 120, 'NO');
INSERT INTO HHOSPITAL VALUES ('40', 'Hospital Peras', 400, 'Madrid', 'Madrid', 400, 'SI');


CREATE TABLE HTRABAJADOR (
id_trabajador varchar2(9),
id_hospital varchar2(2),
categoria varchar2(20),
jefe varchar2(9),
dedicacion varchar2(2),

CONSTRAINT PK_HTRABAJADOR PRIMARY KEY (id_trabajador),
CONSTRAINT FK_HTRABAJADOR_JEFE FOREIGN KEY (jefe) REFERENCES HTRABAJADOR(id_trabajador),
CONSTRAINT FK_HTRABAJADOR_IDH FOREIGN KEY (id_hospital) REFERENCES HHOSPITAL(id_hospital),
CONSTRAINT FK_HTRABAJADOR_IDT FOREIGN KEY (id_trabajador) REFERENCES HPERSONA(dni)
);

INSERT INTO HTRABAJADOR VALUES ('33333333A', '10', 'Director Cirugia', null, 'TC');
INSERT INTO HTRABAJADOR VALUES ('22222222A', '10', 'Cirujano', '33333333A', 'TC');
INSERT INTO HTRABAJADOR VALUES ('11111111A', '10', 'Enfermero', '22222222A', 'TP');
INSERT INTO HTRABAJADOR VALUES ('44444444A', '20', 'Gerente', null, 'TC');
INSERT INTO HTRABAJADOR VALUES ('55555555A', '40', 'Gerente', null, 'TC');


-- SELECT 1 --
SELECT nombre, apellido
FROM HPERSONA
WHERE dni in (SELECT id_trabajador 
			  FROM HTRABAJADOR 
			  WHERE id_hospital in (SELECT id_hospital 
									FROM HHOSPITAL 
									WHERE camas > 100));
									
-- SELECT 2 --

SELECT id_trabajador
FROM HTRABAJADOR
WHERE (dedicacion='TP') or (id_trabajador in (SELECT dni FROM HPERSONA WHERE apellido='Garcia'));

-- SELECT 3 --

SELECT provincia, SUM(camas)
FROM HHOSPITAL
WHERE (provincia = 'Ciudad Real') or (provincia = 'Cuenca')
GROUP BY provincia;

-- SELECT 4 --
SELECT id_trabajador, P.nombre
FROM HTRABAJADOR T, HPERSONA P
WHERE id_trabajador in (SELECT jefe FROM HTRABAJADOR WHERE id_hospital in 
                       (SELECT id_hospital FROM HHOSPITAL WHERE provincia in 
                       ('Cuenca', 'Ciudad Real', 'Toledo', 'Albacete', 'Guadalajara'))) 
                        and T.id_trabajador = P.dni;
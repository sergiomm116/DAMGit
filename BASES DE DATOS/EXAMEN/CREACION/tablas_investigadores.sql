DROP TABLE reserva;
DROP TABLE equipos;
DROP TABLE investigadores;
DROP TABLE facultad;
CREATE TABLE facultad
  (
    IdFacultad NUMBER(2) PRIMARY KEY,
    nomFacultad varchar2 (50),
	ciudad varchar2(50),
	cod_postal char(5)
  );
CREATE TABLE investigadores
  (
    DNI CHAR(10) PRIMARY KEY,
    Nombre varchar2(50),
    Apellidos varchar2(50),
    IdFacultad NUMBER(2),
	dnijefe CHAR(10)
  );
CREATE TABLE equipos
  (
    IdEquipo   VARCHAR2(4) PRIMARY KEY,
    idFacultad NUMBER(2),
    Descripcion varchar2 (50),
    precio number(4)	
  );
CREATE TABLE reserva
  (
    IdReserva NUMBER(3) PRIMARY KEY,
    DNI       VARCHAR2(10),
    IdEquipo  VARCHAR2(4),
    FechaInicio DATE,
    FechaFin DATE
  );
--inserts tabla facultad 
INSERT INTO facultad VALUES(1,'Ciencias Exactas','Madrid','28045');
INSERT INTO facultad VALUES(2,'Ciencias Naturales','Barcelona','23123');
INSERT INTO facultad VALUES(3,'Ciencia y Tecnología','Cuenca','16002');
INSERT INTO facultad VALUES(4,'Bioquímica y ciencias Biológicas','Cuenca','16004');
--inserts tabla investigadores 
INSERT INTO investigadores VALUES('384868311X','ESTEFANIA','LÓPEZ DE PABLO GARCIA UCEDA',1,'562342333K');
INSERT INTO investigadores VALUES('562342333K','QUERALT','ANGUERA VILAFRANCA',1,NULL);
INSERT INTO investigadores VALUES('234353433P','JOAN','BASTARDES SOTO',2,'562342333K');
INSERT INTO investigadores VALUES('135430988R','RAQUEL','RAYA GAVILAN',3,NULL);
INSERT INTO investigadores VALUES('325443333I','ELIOT','BIDAULT CULLERÉS',4,'135430988R');
INSERT INTO investigadores VALUES('378799988D','LLUIS','VISO GILABERT',4,'135430988R');
--inserts tabla equipos 
INSERT INTO equipos VALUES('H503',2,'Telemetro laser SICK',1200);
INSERT INTO equipos VALUES('H235',3,'Multimetro digital FLUKE',900);
INSERT INTO equipos VALUES('M142',3,'Fuente de Voltaje TEKTRONIX',1800);
INSERT INTO equipos VALUES('M234',4,'Cámara digital SONY',650);
INSERT INTO equipos VALUES('K231',2,'Lente para camara FUJINON-TV',2100);
--insert tabla reservas 
INSERT INTO reserva VALUES(1,'378799988D','H235','09/09/2005','23/09/2005');
INSERT INTO reserva VALUES(2,'384868311X','H235','09/09/2005','14/09/2005');
INSERT INTO reserva VALUES(3,'325443333I','M234','13/09/2005','21/09/2005');
INSERT INTO reserva VALUES(4,'384868311X','M142','16/09/2005','01/10/2005');
INSERT INTO reserva VALUES(5,'562342333K','K231','20/09/2005','25/09/2005');
COMMIT;

                                     
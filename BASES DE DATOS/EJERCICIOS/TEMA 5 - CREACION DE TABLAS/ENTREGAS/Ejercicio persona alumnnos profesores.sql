DROP TABLE MATRICULA;
DROP TABLE ALUMNO;
DROP TABLE ASIGNATURA;
DROP TABLE PROFESOR;
DROP TABLE PERSONA;

CREATE TABLE PERSONA (
dni varchar2(9),
nombre varchar2(30),
apellido varchar2(30),
fechanac date,
sexo varchar2(1),
padre varchar2(9),

CONSTRAINT PK_PERSONA PRIMARY KEY (dni),
CONSTRAINT FK_PADRE FOREIGN KEY (padre) REFERENCES PERSONA(dni),
CONSTRAINT SEXO_VALIDO CHECK (sexo in('H', 'M')),
CONSTRAINT DNI_VALIDO CHECK (upper(substr(DNI,9,1))=substr(DNI,9,1)),
CONSTRAINT NOT_NULL_PERSONA CHECK (nombre is not null and apellido is not null),
CONSTRAINT UNIQUE_PERSONA UNIQUE (nombre, apellido)
);

CREATE TABLE PROFESOR (
dni varchar2(9),
experiencia number(2),

CONSTRAINT PK_PROFESOR PRIMARY KEY (dni),
CONSTRAINT FK_DNI_PROFESOR FOREIGN KEY (dni) REFERENCES PERSONA(dni),
CONSTRAINT EXPERIENCIA_VALIDO CHECK (experiencia>=0),
CONSTRAINT NOT_NULL_PROFESOR CHECK (experiencia is not null)
);

CREATE TABLE ALUMNO (
dni varchar2(9),
residencia varchar2(2),

CONSTRAINT PK_ALUMNO PRIMARY KEY (dni),
CONSTRAINT FK_DNI_ALUMNO FOREIGN KEY (dni) REFERENCES PERSONA(dni),
CONSTRAINT RESIDENCIA_VALIDO CHECK (residencia in('SI','NO')),
CONSTRAINT NOT_NULL_ALUMNO CHECK (residencia is not null)
);

CREATE TABLE ASIGNATURA (
cod_asignatura varchar2(3),
nombre_asignatura varchar2(30),
creditos number(2),
dni varchar2(9),

CONSTRAINT PK_ASIGNATURA PRIMARY KEY (cod_asignatura),
CONSTRAINT FK_DNI_ASIGNATURA FOREIGN KEY (dni) REFERENCES PROFESOR(dni),
CONSTRAINT CREDITOS_VALIDOS CHECK (creditos between 1 and 10),
CONSTRAINT NOT_NULL_ASIGNATURA CHECK (nombre_asignatura is not null and creditos is not null),
CONSTRAINT UNIQUE_ASIGNATURA UNIQUE (nombre_asignatura)
);

CREATE TABLE MATRICULA (
dni varchar2(9),
cod_asignatura varchar2(3),
anio number(4),
precio number(4),

CONSTRAINT FK_MATRICULA FOREIGN KEY (dni) REFERENCES ALUMNO(dni),
CONSTRAINT FK_CA_MATRICULA FOREIGN KEY (cod_asignatura) REFERENCES ASIGNATURA(cod_asignatura),
CONSTRAINT PRECIO_VALIDO CHECK ((anio<=2000 and precio=100) OR ((anio between 2000 and 2010) and (precio=150)) OR (anio>=2010 and precio=200))
);

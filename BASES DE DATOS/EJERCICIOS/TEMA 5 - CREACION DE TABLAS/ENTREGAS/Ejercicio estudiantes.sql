DROP TABLE ESTUDIANTES;

CREATE TABLE ESTUDIANTES (
dni number(8) primary key,
nombre varchar2(30),
edad number(2),
nomtutor varchar2(30),

CONSTRAINT TUTOR CHECK ((edad<18 and nomtutor is not null) or (edad>=18 and nomtutor is null))
);

INSERT INTO ESTUDIANTES
VALUES ('99999999', 'Sergio', 22, null);

INSERT INTO ESTUDIANTES
VALUES ('88888888', 'Lucas', 16, null);

INSERT INTO ESTUDIANTES
VALUES ('88888888', 'Lucas', 16, 'Sergio');
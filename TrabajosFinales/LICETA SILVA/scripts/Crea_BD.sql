-- =============================================
-- CONECTARSE A LA APLICACIÓN
-- =============================================

CONNECT eureka/admin


-- =============================================
-- CREACIÓN DE LOS OBJETOS DE LA BASE DE DATOS
-- =============================================


--CREAR TABLA TMEMPRESA
create table tmEmpresa(
emp_cod varchar(6) not null,
emp_nombre  varchar(30),
emp_descripcion varchar(50),
PRIMARY KEY (emp_cod));


--CREAR TABLA TMPERFIL
create table tmPerfil(
perf_cod varchar(6) not null,
perf_nombre varchar(15),
perf_descripcion varchar(30),
PRIMARY KEY (perf_cod));



--CREAR TABLA TMTABLA
create table tmTabla(
tabl_cod varchar(6) not null,
tabl_nombre varchar(15),
PRIMARY KEY (tabl_cod));


--CREAR TABLA TMPERFILDETALLE
create table tmPerfilDetalle(
tabl_cod_perf varchar(6) REFERENCES tmPerfil(perf_cod) not null,
tabl_cod_tabl varchar(6) REFERENCES tmTabla(tabl_cod) not null,
tabl_estado varchar(13),
tabl_tipo varchar(9),
PRIMARY KEY (tabl_cod_perf,tabl_cod_tabl));



--CREAR TABLA TMUSUARIO
create table tmUsuario(
cod_usu varchar(6) not null,
nombre  varchar(30),
ape_pate varchar(20),
ape_mate varchar(20),
telefono varchar(9),
usu_perf_cod varchar(6) not null,
correo varchar(30),
pass   varchar(12),
PRIMARY KEY (cod_usu),
FOREIGN KEY (usu_perf_cod) REFERENCES tmPerfil(perf_cod));


--CREAR TABLA TMPROYECTO
create table tmProyecto(
pro_cod varchar(6) not null,
pro_respcod varchar(6) not null,
pro_nombre  varchar(200),
pro_descripcion varchar(2000),
pro_emp_cod varchar(6) not null,
PRIMARY KEY (pro_cod),
FOREIGN KEY (pro_respcod) REFERENCES tmUsuario(cod_usu),
FOREIGN KEY (pro_emp_cod) REFERENCES tmEmpresa(emp_cod));


--CREAR TABLA TMTICKET
create table tmTicket(
tic_cod varchar(6) not null,
tic_pro_cod varchar(6) not null,
tic_nombre  varchar(200),
tic_fcreate varchar(8),
tic_descripcion varchar(2000),
PRIMARY KEY (tic_cod),
FOREIGN KEY (tic_pro_cod) REFERENCES tmProyecto(pro_cod)
);



--CREAR TABLA TMTICKET
create table tmDetalleTicket(
dtic_cod varchar(6) not null,
dtic_tic_cod varchar(6) not null,
dtic_usu_cod varchar(6) not null,
dtic_tarea   varchar(20),
dtic_fcreate varchar(8),
dtic_hora int,
dtic_minuto int,
PRIMARY KEY (dtic_cod),
FOREIGN KEY (dtic_tic_cod) REFERENCES tmTicket(tic_cod),
FOREIGN KEY (dtic_usu_cod) REFERENCES tmUsuario(cod_usu)
);

--CREAR TABLA CLIENTE
create database contactdb;
 
CREATE TABLE Contacto (
contacto_id CHAR(5) NOT NULL,
nombre varchar(45) NOT NULL,
ape_pate varchar(45) NOT NULL,
ape_mate varchar(45) NOT NULL,
email varchar(45) NULL,
direccion varchar(45) NOT NULL,
telefono varchar(45) NULL,
PRIMARY KEY (contacto_id)
);

CREATE TABLE Contador (
       vch_conttabla        VARCHAR(30) NOT NULL,
       int_contitem         NUMBER(6,0) NOT NULL,
       int_contlongitud     NUMBER(3,0) NOT NULL,
       CONSTRAINT XPKContador 
              PRIMARY KEY (vch_conttabla)
);

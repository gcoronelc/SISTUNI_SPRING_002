-- =============================================
-- CONECTARSE A LA APLICACIÓN
-- =============================================

CONNECT eureka/admin


-- =============================================
-- CREACIÓN DE LOS OBJETOS DE LA BASE DE DATOS
-- =============================================

--INTSERTAR EMPRESA
insert into tmEmpresa values ('EMP001','HIPER S.A.','TECNOLOGIAS DE LA INFORMACION');
insert into tmEmpresa values ('EMP002','BCP','BANCO DE CREDITO DEL PERU');
insert into tmEmpresa values ('EMP003','BBVA','BANCO CONTINENTAL');
insert into tmEmpresa values ('EMP004','PROCESOSMC','MASTERCARD PERU');


--INTSERTAR PERFIL
insert into tmPerfil values ('PER001','ADMINISTRADOR','Solo para administradores');
insert into tmPerfil values ('PER002','SUPERVISOR','Solo para supervisores');
insert into tmPerfil values ('PER003','EMPLEADO','Solo para empleados');


--INTSERTAR TABLA
insert into tmTabla values ('TAB001','USUARIOS');
insert into tmTabla values ('TAB002','CLIENTES');
insert into tmTabla values ('TAB003','PROYECTOS');
insert into tmTabla values ('TAB004','TICKETS');
insert into tmTabla values ('TAB005','REPORTES');
insert into tmTabla values ('TAB006','PERFIL');
insert into tmTabla values ('TAB007','ASIGNARPERFIL');


--INTSERTAR PERFILDETALLE
insert into tmPerfilDetalle values ('PER001','TAB001','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB002','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB003','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB004','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB005','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB006','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB007','ACTIVO','ESCRITURA');

--INSERTAR USUARIO
insert into tmusuario values ('USU001','German','Liceta','Silva','941385146','PER001', 'epaiva@hiper.com.pe', 'admin');
insert into tmusuario values ('USU002','Emily','Mego','Davila','900000000','PER002', 'emgo@bcp.com.pe', 'admin');
insert into tmusuario values ('USU003','Dora','Juarez','Mora','900000000','PER003', 'djuarez@bbva.com.pe', 'admin');

--INSERTAR PROYECTO
insert into tmProyecto values ('PRO001','USU001','MANTENIMIENTO PROCESOS','-EVALUACION-MONITOREO','EMP001');
insert into tmProyecto values ('PRO002','USU001','MANTENIMIENTO PROCESOS','-EVALUACION-MONITOREO','EMP001');
insert into tmProyecto values ('PRO003','USU001','MANTENIMIENTO PROCESOS','-EVALUACION-MONITOREO','EMP001');
insert into tmProyecto values ('PRO004','USU002','MANTENIMIENTO PROCESOS','-EVALUACION-MONITOREO','EMP001');
insert into tmProyecto values ('PRO005','USU002','MANTENIMIENTO PROCESOS','-EVALUACION-MONITOREO','EMP001');

--INSERTAR PROYECTO
insert into tmTicket values ('TIC001','PRO001','MEJORA MODULO CHIPS','20151010','MEJORA MODULO CHIPS');
insert into tmTicket values ('TIC002','PRO001','MEJORA DE REPLICOR','20151010','MEJORA DE REPLICOR');

--INSERTAR CLIENTE
insert into Contacto values ('00001','Pedro','Lopez','Mendez','plopez@bbva.com.pe','Av. Sta. Mercedes 460 - Los Jasminez','95687452');
commit;

insert into Contador Values( 'Contacto', 1, 7 );
commit;

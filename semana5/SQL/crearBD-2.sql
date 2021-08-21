use libreria;

# Crear tabla
create table cliente (
	id_cliente int auto_increment not null,
    nombre varchar(50) not null,
    primary key(id_cliente)
);

# Seleccionar elementos
select * from cliente;

# Crear tabla con foranea a cliente
create table venta (
	id_venta int auto_increment not null,
    id_cliente_venta int not null,
    cantidad int not null,
    primary key(id_venta),
    foreign key(id_cliente_venta) references cliente(id_cliente)
);

# Mostrar tablas
show tables;

# Mostrar columnas de una tabla
show columns from venta;

describe libro;

# Eliminar tabla
drop table libro4;

# Insertar datos
INSERT INTO libro(
	nombre,
    anio_publicacion
) values (
	'100 anios de soledad',
    1993
);

INSERT INTO libro(
	id_libro,
	nombre,
    anio_publicacion
) values (
	23,
	'100 anios de soledad',
    1993
);

INSERT INTO libro(
	nombre,
    anio_publicacion
) values (
	'Rafael Pombo y sus cuentos',
    2021
);

select * from libro;

# Actualizar un registro en tabla
# IMPORTANTE EL WHERE
UPDATE libro
SET nombre = 'cien anios de soledad'
WHERE id_libro = 1;

UPDATE libro
SET nombre = 'El coronel no tiene quien le escriba'
WHERE id_libro = 24;

# Borrar un registro de tabla
# IMPORTANTE EL WHERE
delete from libro
where id_libro = 666;

# Agregar una columna
ALTER TABLE libro
add paginas int,
add editorial varchar(50);

# borrar una columna
ALTER TABLE libro
drop paginas;

# renombrar una columna
ALTER TABLE libro
rename column editorial to casa_editora;


select nombre, id_libro
from libro
where nombre like '%rafael%';



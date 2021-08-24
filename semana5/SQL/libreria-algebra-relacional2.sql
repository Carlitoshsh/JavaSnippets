use libreria;

# Proyeccion
(recuperar columnas)
select libNombre
from libro;

select *
from libro;

# Seleccion
(con condicion)
select *
from libro
where libPub > 1960;

select *
from libro
where libNombre like '%que%'
    and libPub > 1990;

select *
from libro
where libNombre not like '%que%';

select *
from libro
where libNombre like '%a_o%';

select lower("EsTe Es Un MEnSajE deL 2011");

# Eliminar espacios
select rtrim("HOLA     ");
select trim("   HOLA     ");

# Composicion
(proyeccion y seleccion)
select upper(libNombre), libPub
from libro
where libPub > 1960 and libNombre not like '%Años%';

# Composicion
(proyeccion y seleccion)
select upper(libNombre), libPub
from libro
where libPub > 1960 and libNombre not like '%Años%';

# Con ordenamiento
select upper(libNombre), libPub
from libro
where libPub > 1960 and libNombre not like '%Años%'
order by libPub asc limit 3;

select upper
(libNombre), libPub
from libro
where libPub > 1960 and libNombre not like '%Años%'
order by length
(libNombre) asc limit 3;

# Libro mas reciente
select max(libPub) as MaxAnioPublicacion
from libro;

# Promedio del precio
select avg(libPrecio) as PromedioPrecio
from libro;

# Cuantos libros
(registros) hay?
select count(1)
from libro
where libPub > 1970;

#
select @valorMaximo
:= max
(libPrecio) from libro;

select libNombre, libPrecio
from libro
where libPrecio = (select max(libPrecio)
from libro);

# Cuanto fue el promedio de venta agrupado por libro
(usando Group by)
select libId, avg(vtaTotal) as promedio
from venta
group by libId
order by promedio;

# Renombrar
select libNombre as 'Titulo', libPrecio as 'Precio (COP)'
from libro
where libPrecio > 1960;

select l.libNombre
from libro as l
where libPrecio > 1960;

select *
from libro, autor
where libro.autId = autor.autId;

# Condicion con producto cartesiano
select libro.libNombre, editorial.ediNombre
from libro, editorial
where libro.ediId = editorial.ediId;

# Usando join
select libNombre, ediNombre
from libro join editorial
 using (ediId) 
;

select libNombre, ediNombre
from libro join editorial
    on libro.ediId = editorial.ediId;

select libNombre, ediNombre
from libro NATURAL join editorial 
;

select distinct autPais
from autor;

select libNombre, ediNombre
from libro NATURAL join editorial 
;

# Cantidad de libros con autor
select *
from libro natural join autor 
;

select concat(autNombre, concat(" ", autApellido)) as NombreCompleto,
    count(libId)
from libro natural join autor 
group by NombreCompleto;


select *
from autor
where autEmail is not null;

select concat(autNombre, concat(" ", autApellido)) as NombreCompleto,
    count(libId)
from libro left join autor
 using (autId) 
group by NombreCompleto;
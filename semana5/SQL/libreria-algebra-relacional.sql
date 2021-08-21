use libreria;

# Proyeccion 

select libNombre from libro;

select * from libro;

# Seleccion
select * from libro
where libPub > 1960;

select * from libro
where libNombre like '%que%'
	and libPub > 1990;
    
select * from libro
where libNombre not like '%que%';

select * from libro
where libNombre like '%a_o%';


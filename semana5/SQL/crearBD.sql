create schema libreria;

use libreria;

CREATE TABLE libro4 (
	id_libro int not null ,
	id_libro_bib int not null auto_increment,
    PRIMARY KEY(id_libro_bib),
    nombre varchar(240) not null,
    anio_publicacion int null
);

select * from libro4;

INSERT INTO libro4 (
	id_libro,
    nombre,
    anio_publicacion
) values (
	'666',
    "Necronomicon",
    2019
);

INSERT INTO libro4 (
	id_libro,
    nombre,
    anio_publicacion
) values (
	'667',
    "Necronomicon",
    2019
);

INSERT INTO libro4 (
	id_libro,
    nombre,
    anio_publicacion
) values (
	'668',
    "Necronomicon",
    2019
);
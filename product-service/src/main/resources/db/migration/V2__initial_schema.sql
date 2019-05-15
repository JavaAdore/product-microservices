 CREATE SEQUENCE product_pk_seq START WITH 50;

create table product 
(
        id int8 not null,
        name_en varchar(255),
        description varchar(255),
        price decimal,
        primary key (id)
);
 
 
 
 CREATE SEQUENCE product_review_pk_seq START WITH 50;

create table product_review (
       id int8 not null,
       product_id int8 not null,
	   content varchar(255),
       number_of_stars int4 not null, 
       primary key (id)
);
  
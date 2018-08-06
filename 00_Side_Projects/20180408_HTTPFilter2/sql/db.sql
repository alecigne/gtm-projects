CREATE DATABASE `httpfilter`;

create table user (
id int(8) auto_increment,
login varchar(25) not null,
pwd varchar(25),
primary key (id)
);

insert into `user` (`login`, `pwd`) values ("mdupont", "1234");
-- Création des tables
create table client (
idclient int auto_increment,
nom varchar(25) not null,
prenom varchar(25),
adresse varchar(25),
codepostal varchar(25),
ville varchar(25),
telephone varchar(25),
constraint pk_client primary key (idclient)
);

create table compte (
numcompte int(8) zerofill,
solde int,
datecreation varchar(25),
idclient int,
constraint pk_compte primary key (numcompte),
foreign key (idclient) references client(idclient) on delete cascade
);
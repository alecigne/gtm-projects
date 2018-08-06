CREATE DATABASE `proxibanque`;

create table Client (
id int NOT NULL AUTO_INCREMENT,
nom varchar(25) NOT NULL,
prenom varchar(25),
adresse varchar(60),
codepostal char(5),
ville varchar(25),
telephone char(11),
primary key (id)
);

create table Conseiller (
id int NOT NULL AUTO_INCREMENT,
login varchar(25) NOT NULL UNIQUE,
password varchar(25) NOT NULL,
nom varchar(25) NOT NULL,
prenom varchar(25),
primary key (id)
);

INSERT INTO `client` (`nom`, `prenom`, `adresse`, `codepostal`, `ville`, `telephone`) VALUES ('Dupont', 'Jean', '2 place de la Source', '75000', 'Paris', '0186279841');
INSERT INTO `conseiller` (`login`, `password`, `nom`, `prenom`) VALUES ('Durand', 'Martin', 'mdurand', '1234');


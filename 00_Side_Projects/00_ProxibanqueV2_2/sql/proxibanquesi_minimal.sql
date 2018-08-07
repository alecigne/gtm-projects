-- Création des tables
create table conseiller (
idconseiller int(8) auto_increment,
nom varchar(25) not null,
prenom varchar(25),
login varchar(25) not null,
pwd varchar(25),
primary key (idconseiller)
);

create table client (
idclient int(8) auto_increment,
nom varchar(25) not null,
prenom varchar(25),
adresse varchar(60),
codepostal char(5),
ville varchar(25),
telephone char(10),
idconseiller int(8),
primary key (idclient)
);

create table comptecourant (
numcompte int(8) ,
solde double,
dateouverture varchar(10),
idclient int unique,
primary key (numcompte),
foreign key (idclient) references client(idclient) on delete cascade
);

create table compteepargne (
numcompte int(8) ,
solde double,
dateouverture varchar(10),
tauxremun double(5, 2),
idclient int unique,
primary key (numcompte),
foreign key (idclient) references client(idclient) on delete cascade
);

create table carteelectron (
numcarte int(8) ,
numcompte int(8) ,
primary key (numcarte),
foreign key (numcompte) references comptecourant(numcompte) on delete cascade
);

create table cartepremier (
numcarte int(8) ,
numcompte int(8),
primary key (numcarte),
foreign key (numcompte) references comptecourant(numcompte) on delete cascade
);
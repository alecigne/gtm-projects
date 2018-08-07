-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 04 avr. 2018 à 16:22
-- Version du serveur :  10.1.31-MariaDB
-- Version de PHP :  7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanquesi`
--

-- --------------------------------------------------------

--
-- Structure de la table `carteelectron`
--

CREATE TABLE `carteelectron` (
  `numcarte` int(8) NOT NULL,
  `numcompte` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `cartepremier`
--

CREATE TABLE `cartepremier` (
  `numcarte` int(8) NOT NULL,
  `numcompte` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idclient` int(8) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `adresse` varchar(60) DEFAULT NULL,
  `codepostal` char(5) DEFAULT NULL,
  `ville` varchar(25) DEFAULT NULL,
  `telephone` char(10) DEFAULT NULL,
  `idconseiller` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `comptecourant`
--

CREATE TABLE `comptecourant` (
  `numcompte` int(8) NOT NULL,
  `solde` double DEFAULT NULL,
  `dateouverture` varchar(10) DEFAULT NULL,
  `idclient` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compteepargne`
--

CREATE TABLE `compteepargne` (
  `numcompte` int(8) NOT NULL,
  `solde` double DEFAULT NULL,
  `dateouverture` varchar(10) DEFAULT NULL,
  `tauxremun` double(5,2) DEFAULT NULL,
  `idclient` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

CREATE TABLE `conseiller` (
  `idconseiller` int(8) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `login` varchar(25) NOT NULL,
  `pwd` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`idconseiller`, `nom`, `prenom`, `login`, `pwd`) VALUES
(6, 'Attan', 'Charles', 'cattan', 'proxi1');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `carteelectron`
--
ALTER TABLE `carteelectron`
  ADD PRIMARY KEY (`numcarte`),
  ADD KEY `numcompte` (`numcompte`);

--
-- Index pour la table `cartepremier`
--
ALTER TABLE `cartepremier`
  ADD PRIMARY KEY (`numcarte`),
  ADD KEY `numcompte` (`numcompte`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idclient`);

--
-- Index pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  ADD PRIMARY KEY (`numcompte`),
  ADD UNIQUE KEY `idclient` (`idclient`);

--
-- Index pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD PRIMARY KEY (`numcompte`),
  ADD UNIQUE KEY `idclient` (`idclient`);

--
-- Index pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD PRIMARY KEY (`idconseiller`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idclient` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `conseiller`
--
ALTER TABLE `conseiller`
  MODIFY `idconseiller` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `carteelectron`
--
ALTER TABLE `carteelectron`
  ADD CONSTRAINT `carteelectron_ibfk_1` FOREIGN KEY (`numcompte`) REFERENCES `comptecourant` (`numcompte`) ON DELETE CASCADE;

--
-- Contraintes pour la table `cartepremier`
--
ALTER TABLE `cartepremier`
  ADD CONSTRAINT `cartepremier_ibfk_1` FOREIGN KEY (`numcompte`) REFERENCES `comptecourant` (`numcompte`) ON DELETE CASCADE;

--
-- Contraintes pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  ADD CONSTRAINT `comptecourant_ibfk_1` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE;

--
-- Contraintes pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD CONSTRAINT `compteepargne_ibfk_1` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 25 jan. 2019 à 14:28
-- Version du serveur :  5.7.21
-- Version de PHP :  7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `securityimie`
--

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(24) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `role`) VALUES
(1, 'Super Admin'),
(2, 'Admin'),
(3, 'Utilisateur');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mail` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `sel` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `tel` int(12) DEFAULT NULL,
  `role` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `mail`, `mdp`, `sel`, `nom`, `prenom`, `tel`, `role`) VALUES
(14, 'SuperAdmin@SuperAdmin.fr', 'baPRau1BIvFutD59Q0eMr6Og7lZUuKQKaPnHtSnuLuQ=', 'Qo6DriXbCj6bKeoWhSxrql8nXOOCCu', 'SAdmin', 'SAdmin', 666666666, 1),
(15, 'Admin1@Admin1.fr', 'wgw8vj4MCg8+HN7QNQMNjhJrM4mT0UPG/hB/JYRWu1o=', 'A29Qh8vb3db2ixP9fFkwDQH7Ze3etK', 'Admin1', 'Admin1', 666666666, 2),
(16, 'Admin2@Admin2.fr', 'La/R2wlCycemonIjlnX4DlcfiuLHrDZaVKUXPfZjjRk=', 'waVYlRrnK0cutRNEyimfhcUcqdYudO', 'Admin2', 'Admin2', 666666666, 2),
(17, 'User1@User1.fr', 'nE6qPy+9lugu0i1uYCINkBfDvlpV6qagwkRjlToQvR8=', '1bmVBM8g6DSQz89urA4S4XoLCS1yUA', 'User1', 'User1', 666666666, 3),
(18, 'User2@User2.fr', 'RLxqHDHVDVvS4Ogyl/ZKoEpi3okJgAQI+AZoEjicBwc=', 'ERecelY67eeVYZELIgT0dmbpLFnkKE', 'User2', 'User2', 666666666, 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

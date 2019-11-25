-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 25-11-2019 a las 04:11:19
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro`
--
CREATE DATABASE IF NOT EXISTS `registro` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `registro`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `Telefono` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `tipodoc` varchar(255) DEFAULT NULL,
  `documento` varchar(2555) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`Id`, `nombres`, `apellido`, `correo`, `direccion`, `tipodoc`, `documento`) VALUES
(1, 'dayana', 'ccss', 'dayanacogaria@gmail.com', 'calle', 'cc', '1002222'),
(4, 'prueba', 'ppp', 'dayanacogaria@gmail.com', 'ddddd', 'cc', '333333'),
(5, 'aaa', 'a', 'aaa', 'a', 'ti', '87654');
(4, 'Juan Cancino', 'JMC', 'cancinju@gmail.com', 'ddddd', 'cc', '80888756'),

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productos`
--

DROP TABLE IF EXISTS `tbl_productos`;
CREATE TABLE IF NOT EXISTS `tbl_productos` (
  `PK_PDT_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT,
  `PDT_Nombre` varchar(255) NOT NULL,
  `PDT_Marca` varchar(255) NOT NULL,
  `PDT_Precio` decimal(10,0) NOT NULL,
  `PDT_Cantidad` int(11) NOT NULL,
  `PDT_Peso` decimal(10,0) NOT NULL,
  `PDT_Tamaño` varchar(255) NOT NULL,
  PRIMARY KEY (`PK_PDT_PRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

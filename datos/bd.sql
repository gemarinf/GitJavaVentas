-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 13-12-2019 a las 22:07:11
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

CREATE TABLE `persona` (
  `Id` int(11) NOT NULL,
  `nombres` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `tipodoc` varchar(255) DEFAULT NULL,
  `documento` varchar(2555) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`Id`, `nombres`, `apellido`, `correo`, `direccion`, `tipodoc`, `documento`) VALUES
(1, 'dayana', 'ccss', 'dayanacogaria@gmail.com', 'calle', 'cc', '1002222'),
(4, 'prueba', 'ppp', 'dayanacogaria@gmail.com', 'ddddd', 'cc', '333333'),
(5, 'aaa', 'a', 'aaa', 'a', 'ti', '87654');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_pedidos`
--

CREATE TABLE `tbl_pedidos` (
  `id_pedido` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_total` decimal(20,0) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `estado` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_pedidos`
--

INSERT INTO `tbl_pedidos` (`id_pedido`, `id_producto`, `cantidad`, `precio_total`, `id_empleado`, `estado`) VALUES
(1, 1, 1, '0', 4, 'En Tramite');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBL_Productos`
--

CREATE TABLE `TBL_Productos` (
  `PK_PDT_PRODUCTO` int(11) NOT NULL,
  `PDT_Nombre` varchar(255) NOT NULL,
  `PDT_Marca` varchar(255) NOT NULL,
  `PDT_Precio` decimal(10,0) NOT NULL,
  `PDT_Cantidad` int(11) NOT NULL,
  `PDT_Peso` decimal(10,0) NOT NULL,
  `PDT_Tamaño` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `TBL_Productos`
--

INSERT INTO `TBL_Productos` (`PK_PDT_PRODUCTO`, `PDT_Nombre`, `PDT_Marca`, `PDT_Precio`, `PDT_Cantidad`, `PDT_Peso`, `PDT_Tamaño`) VALUES
(1, 'producto 1', 'marca 1', '200', 2, '23', 'grande');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_proveedor`
--

CREATE TABLE `tbl_proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nit` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `tbl_pedidos`
--
ALTER TABLE `tbl_pedidos`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indices de la tabla `TBL_Productos`
--
ALTER TABLE `TBL_Productos`
  ADD PRIMARY KEY (`PK_PDT_PRODUCTO`);

--
-- Indices de la tabla `tbl_proveedor`
--
ALTER TABLE `tbl_proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tbl_pedidos`
--
ALTER TABLE `tbl_pedidos`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `TBL_Productos`
--
ALTER TABLE `TBL_Productos`
  MODIFY `PK_PDT_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tbl_proveedor`
--
ALTER TABLE `tbl_proveedor`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

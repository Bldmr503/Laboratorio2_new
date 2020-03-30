-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-03-2020 a las 01:14:03
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmacias_despertad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

CREATE TABLE `medicamentos` (
  `cod_medicamento` int(11) NOT NULL,
  `nombre_medicamento` varchar(255) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`cod_medicamento`, `nombre_medicamento`, `marca`, `tipo`, `precio`, `fecha_vencimiento`, `cantidad`) VALUES
(1, 'Fluarix', 'GlaxoSmithKline', 'Vacuna', 5, '2020-11-10', 2),
(2, 'HEMOFIL M', 'Baxter', 'Vacuna', 10, '2020-11-10', 20),
(3, 'MERAPUR', 'Biomas', 'Frasco liquido', 11, '2021-02-20', 50),
(4, 'PENTAXIM', 'SANOFI PASTEUR', 'Vacuna', 15, '2020-11-03', 100),
(5, 'ROTATEQ', 'Dohme Corp.', 'Pastillas', 16, '2021-10-03', 200),
(6, 'SURVANTA', 'AbbVie Inc.', 'Frasco liquido', 20, '2020-10-05', 100),
(7, 'TOXOIDES TETANICO ', 'SANOFI ', 'Vacuna', 10, '2020-09-17', 50),
(8, 'RUDI-ROUVAX', 'SANOF', 'Vacuna ', 30, '2021-03-10', 50),
(9, 'VAXIGRIP', 'PASTEUR, INC. ', 'Frasco liquido', 10, '2020-10-16', 100),
(10, 'TOXOIDES TETANICO ', 'SANOFI ', 'Vacuna', 10, '2020-09-17', 50),
(11, 'Albeldazol', 'PASTEUR, INC. ', 'Tableta', 5, '2021-03-11', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(10) NOT NULL,
  `usuario` varchar(25) NOT NULL,
  `password` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`) VALUES
(1, 'UFG', 0x75666732303230);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `medicamentos`
--
ALTER TABLE `medicamentos`
  ADD PRIMARY KEY (`cod_medicamento`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

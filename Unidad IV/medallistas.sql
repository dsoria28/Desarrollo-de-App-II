-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-12-2017 a las 01:40:19
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `medallistas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_medallistas`
--

CREATE TABLE IF NOT EXISTS `tb_medallistas` (
`id` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `disciplina` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `categoria` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `medalla` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `pais` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `evento` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `tb_medallistas`
--

INSERT INTO `tb_medallistas` (`id`, `nombre`, `disciplina`, `categoria`, `medalla`, `pais`, `evento`) VALUES
(3, 'Caroline', 'natacion', '2mts', 'Oro', 'Mexico', 'Olimpiadas'),
(4, 'Jocian', 'Clavados', 'Galacticos', 'Oro', 'Mexico', 'Olimpiadas'),
(6, 'Poulet', 'Futbol', 'rapido', 'Diamante', 'Mexico', 'Olimpiadas'),
(7, 'Ganso', 'Hacer corajes', 'master', 'Diamante', 'Mexico', 'Olimpiadas'),
(9, 'Ramon', 'Atletismo', 'Sub-20', 'Bronce', 'Mexico', 'Escolar'),
(10, 'Willy', 'Danza', 'Tango', 'Bronce', 'Mexico', 'Escolar'),
(11, 'Tapia', 'Atletismo', '800mts', 'Diamante', 'Mexico', 'Escolar'),
(12, 'Ulises', 'natacion', 'mariposa', 'Plata', 'Mexico', 'Escolar'),
(13, 'Manuel', 'Atletismo', '300mts', 'Oro', 'Mexico', 'Escolar'),
(14, 'Daniel', 'Futbol', 'rapido', 'Plata', 'Mexico', 'Nacional'),
(15, 'Vianey', 'Clavados', 'mariposa', 'Oro', 'Mexico', 'Nacional'),
(16, 'Perla', 'Atletismo', '300mts', 'Oro', 'Mexico', 'Nacional'),
(17, 'Edgar', 'Gimnasia', '18-20', 'Oro', 'Mexico', 'Olimpiadas'),
(18, 'ernesto canto', 'caminata ', '50 km', 'Oro', 'Mexico', 'Olimpiadas 68'),
(24, 'Oribe Peralta', 'Futbol', 'Masculino', 'Oro Olimpico', 'Mexico', 'Olimpiadas 2015');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_medallistas`
--
ALTER TABLE `tb_medallistas`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_medallistas`
--
ALTER TABLE `tb_medallistas`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=25;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

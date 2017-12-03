-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2017 at 10:35 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestorpacientes`
--

-- --------------------------------------------------------

--
-- Table structure for table `cita`
--

CREATE TABLE `cita` (
  `id_cita` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `causa` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `medico` int(11) NOT NULL,
  `paciente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `especialidad`
--

CREATE TABLE `especialidad` (
  `id_especialidad` int(11) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `medicamento`
--

CREATE TABLE `medicamento` (
  `id_medicamento` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `medico`
--

CREATE TABLE `medico` (
  `id_medico` int(11) NOT NULL,
  `especialidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `cedula` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `direccion` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `alergias` varchar(120) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Ninguna.',
  `foto` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fumador` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `padecimiento`
--

CREATE TABLE `padecimiento` (
  `id_padecimiento` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `prueba`
--

CREATE TABLE `prueba` (
  `id_prueba` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `receta`
--

CREATE TABLE `receta` (
  `id_receta` int(11) NOT NULL,
  `medico` int(11) NOT NULL,
  `paciente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `receta_medicamento`
--

CREATE TABLE `receta_medicamento` (
  `id_receta_medicamento` int(11) NOT NULL,
  `receta` int(11) NOT NULL,
  `medicamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `receta_padecimiento`
--

CREATE TABLE `receta_padecimiento` (
  `id_receta_padecimiento` int(11) NOT NULL,
  `receta` int(11) NOT NULL,
  `padecimiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `resultados_prueba`
--

CREATE TABLE `resultados_prueba` (
  `id_resultados_prueba` int(11) NOT NULL,
  `paciente` int(11) NOT NULL,
  `prueba` int(11) NOT NULL,
  `resultado` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `clave` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cedula` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `direccion` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `tipo` enum('administrador','medico','asistente') COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`id_cita`),
  ADD KEY `paciente` (`paciente`),
  ADD KEY `medico` (`medico`);

--
-- Indexes for table `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`id_especialidad`);

--
-- Indexes for table `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`id_medicamento`);

--
-- Indexes for table `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id_medico`),
  ADD KEY `especialidad` (`especialidad`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- Indexes for table `padecimiento`
--
ALTER TABLE `padecimiento`
  ADD PRIMARY KEY (`id_padecimiento`);

--
-- Indexes for table `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`id_prueba`);

--
-- Indexes for table `receta`
--
ALTER TABLE `receta`
  ADD PRIMARY KEY (`id_receta`),
  ADD KEY `medico` (`medico`),
  ADD KEY `paciente` (`paciente`);

--
-- Indexes for table `receta_medicamento`
--
ALTER TABLE `receta_medicamento`
  ADD PRIMARY KEY (`id_receta_medicamento`),
  ADD KEY `receta` (`receta`),
  ADD KEY `medicamento` (`medicamento`);

--
-- Indexes for table `receta_padecimiento`
--
ALTER TABLE `receta_padecimiento`
  ADD PRIMARY KEY (`id_receta_padecimiento`),
  ADD KEY `receta` (`receta`),
  ADD KEY `padecimiento` (`padecimiento`);

--
-- Indexes for table `resultados_prueba`
--
ALTER TABLE `resultados_prueba`
  ADD PRIMARY KEY (`id_resultados_prueba`),
  ADD KEY `paciente` (`paciente`),
  ADD KEY `prueba` (`prueba`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cita`
--
ALTER TABLE `cita`
  MODIFY `id_cita` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `id_especialidad` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `id_medicamento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id_prueba` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `receta`
--
ALTER TABLE `receta`
  MODIFY `id_receta` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `receta_medicamento`
--
ALTER TABLE `receta_medicamento`
  MODIFY `id_receta_medicamento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `receta_padecimiento`
--
ALTER TABLE `receta_padecimiento`
  MODIFY `id_receta_padecimiento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `resultados_prueba`
--
ALTER TABLE `resultados_prueba`
  MODIFY `id_resultados_prueba` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE CASCADE,
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`medico`) REFERENCES `medico` (`id_medico`) ON DELETE CASCADE;

--
-- Constraints for table `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`id_medico`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE,
  ADD CONSTRAINT `medico_ibfk_2` FOREIGN KEY (`especialidad`) REFERENCES `especialidad` (`id_especialidad`) ON DELETE CASCADE;

--
-- Constraints for table `receta`
--
ALTER TABLE `receta`
  ADD CONSTRAINT `receta_ibfk_1` FOREIGN KEY (`medico`) REFERENCES `medico` (`id_medico`) ON DELETE CASCADE,
  ADD CONSTRAINT `receta_ibfk_2` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE CASCADE;

--
-- Constraints for table `receta_medicamento`
--
ALTER TABLE `receta_medicamento`
  ADD CONSTRAINT `receta_medicamento_ibfk_1` FOREIGN KEY (`receta`) REFERENCES `receta` (`id_receta`) ON DELETE CASCADE,
  ADD CONSTRAINT `receta_medicamento_ibfk_2` FOREIGN KEY (`medicamento`) REFERENCES `medicamento` (`id_medicamento`) ON DELETE CASCADE;

--
-- Constraints for table `receta_padecimiento`
--
ALTER TABLE `receta_padecimiento`
  ADD CONSTRAINT `receta_padecimiento_ibfk_1` FOREIGN KEY (`receta`) REFERENCES `receta` (`id_receta`) ON DELETE CASCADE,
  ADD CONSTRAINT `receta_padecimiento_ibfk_2` FOREIGN KEY (`padecimiento`) REFERENCES `padecimiento` (`id_padecimiento`) ON DELETE CASCADE;

--
-- Constraints for table `resultados_prueba`
--
ALTER TABLE `resultados_prueba`
  ADD CONSTRAINT `resultados_prueba_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE CASCADE,
  ADD CONSTRAINT `resultados_prueba_ibfk_2` FOREIGN KEY (`prueba`) REFERENCES `prueba` (`id_prueba`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

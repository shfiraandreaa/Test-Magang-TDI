-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2021 at 11:00 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shafira_andrea`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_penduduk`
--

CREATE TABLE `tabel_penduduk` (
  `nip` bigint(20) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `tempat_lahir` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_penduduk`
--

INSERT INTO `tabel_penduduk` (`nip`, `nama_lengkap`, `tanggal_lahir`, `tempat_lahir`) VALUES
(32732800000000, 'Shafira Andrea', '2000-08-06', 'Cianjur'),
(32732800000001, 'Nevisa Putri S', '1994-10-11', 'Cianjur'),
(32732800000003, 'Enjang Sutisna', '1997-03-20', 'Garut');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_penduduk`
--
ALTER TABLE `tabel_penduduk`
  ADD PRIMARY KEY (`nip`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_penduduk`
--
ALTER TABLE `tabel_penduduk`
  MODIFY `nip` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32732800000004;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

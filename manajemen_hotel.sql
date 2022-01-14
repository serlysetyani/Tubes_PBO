-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2022 at 06:42 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajemen_hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `nomor_kamar` int(20) NOT NULL,
  `tipe` varchar(255) NOT NULL,
  `harga` int(255) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`nomor_kamar`, `tipe`, `harga`, `status`) VALUES
(101, 'Single Bed', 150000, 'terisi'),
(201, 'Double Bed', 300000, 'terisi'),
(301, 'Deluxe', 500000, 'terisi'),
(302, 'Deluxe', 500000, 'terisi'),
(401, 'Suite', 700000, 'terisi'),
(402, 'Suite', 700000, 'terisi');

-- --------------------------------------------------------

--
-- Table structure for table `layanan_dipesan`
--

CREATE TABLE `layanan_dipesan` (
  `id_layanan_dipesan` int(20) NOT NULL,
  `id_kamar` int(20) NOT NULL,
  `id_layanan` int(20) NOT NULL,
  `jumlah_layanan` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `layanan_dipesan`
--

INSERT INTO `layanan_dipesan` (`id_layanan_dipesan`, `id_kamar`, `id_layanan`, `jumlah_layanan`) VALUES
(1, 101, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `layanan_lain`
--

CREATE TABLE `layanan_lain` (
  `id_layanan` int(20) NOT NULL,
  `nama_layanan` varchar(200) NOT NULL,
  `harga_layanan` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `layanan_lain`
--

INSERT INTO `layanan_lain` (`id_layanan`, `nama_layanan`, `harga_layanan`) VALUES
(1, 'Bersihkan kamar', 100000),
(2, 'Laundry', 20000),
(3, 'Taxi', 25000),
(4, 'Tambah Kasur', 100000),
(5, 'Spa paket 1', 200000),
(6, 'Spa paket 2', 250000),
(7, 'Spa paket 3', 300000),
(8, 'Kopi (Restoran)', 50000),
(9, 'Teh (Restoran)', 15000),
(10, 'Nasi Goreng (Restoran)', 50000),
(11, 'Burger (Restoran)', 45000),
(12, 'Soda (Makanan Ringan)', 20000),
(13, 'Coklat (Makanan Ringan)', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `No_Identitas` int(15) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `No_Telepon` varchar(13) NOT NULL,
  `Alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`No_Identitas`, `Nama`, `No_Telepon`, `Alamat`) VALUES
(123, 'Serly Setyani', '0812345697654', 'Jl. Terserah No 10 Kota Bandung'),
(124, 'Kevin Adrian', '0812435697654', 'Jl. Jakarta No 11 Kota Bandung'),
(125, 'Alifya Aisyah', '09812789', 'Jl. Bandung Kota Bandung'),
(126, 'Maria Db', '08976578', 'Jl Marga Kota Jakarta'),
(127, 'May Esqi', '0987434728', 'Jl. Data Kota Bekasi'),
(55555, 'bagas', '9281398712', 'Jl. Menuju surga'),
(123456, 'xxx', '08111111', 'Jl. Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `id_sewa` int(20) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date DEFAULT NULL,
  `id_pelanggan` int(15) NOT NULL,
  `id_kamar` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`id_sewa`, `check_in`, `check_out`, `id_pelanggan`, `id_kamar`) VALUES
(1, '2021-01-01', NULL, 123, 101),
(2, '2021-01-03', NULL, 124, 201),
(3, '2021-01-04', NULL, 124, 302),
(4, '2021-01-03', NULL, 125, 301),
(5, '2021-12-31', NULL, 123456, 401),
(6, '2021-01-01', NULL, 55555, 402);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`nomor_kamar`);

--
-- Indexes for table `layanan_dipesan`
--
ALTER TABLE `layanan_dipesan`
  ADD PRIMARY KEY (`id_layanan_dipesan`),
  ADD KEY `fk_id_kamar` (`id_kamar`),
  ADD KEY `fk_id_layanan` (`id_layanan`);

--
-- Indexes for table `layanan_lain`
--
ALTER TABLE `layanan_lain`
  ADD PRIMARY KEY (`id_layanan`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`No_Identitas`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`id_sewa`),
  ADD KEY `id_pelanggan` (`id_pelanggan`,`id_kamar`),
  ADD KEY `id_kamar` (`id_kamar`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `layanan_dipesan`
--
ALTER TABLE `layanan_dipesan`
  MODIFY `id_layanan_dipesan` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `layanan_lain`
--
ALTER TABLE `layanan_lain`
  MODIFY `id_layanan` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `sewa`
--
ALTER TABLE `sewa`
  MODIFY `id_sewa` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `layanan_dipesan`
--
ALTER TABLE `layanan_dipesan`
  ADD CONSTRAINT `layanan_dipesan_ibfk_1` FOREIGN KEY (`id_layanan`) REFERENCES `layanan_lain` (`id_layanan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `layanan_dipesan_ibfk_2` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`nomor_kamar`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sewa`
--
ALTER TABLE `sewa`
  ADD CONSTRAINT `sewa_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`No_Identitas`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sewa_ibfk_2` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`nomor_kamar`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

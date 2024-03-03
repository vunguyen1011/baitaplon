-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.32-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for qltv
CREATE DATABASE IF NOT EXISTS `qltv` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `qltv`;

-- Dumping structure for table qltv.book
CREATE TABLE IF NOT EXISTS `book` (
  `bookId` varchar(10) NOT NULL,
  `nameB` varchar(50) NOT NULL,
  `category` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `producer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `price` float DEFAULT NULL,
  `COUNT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table qltv.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `tk` varchar(50) DEFAULT NULL,
  `passwd` varchar(50) DEFAULT NULL,
  `name` longtext DEFAULT NULL,
  `gender` char(5) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table qltv.registerbook
CREATE TABLE IF NOT EXISTS `registerbook` (
  `studentId` varchar(50) NOT NULL,
  `bookId` varchar(50) NOT NULL,
  `amount` int(11) NOT NULL,
  `borrowDate` date NOT NULL DEFAULT curdate(),
  `appointDate` date DEFAULT NULL,
  `payDate` date DEFAULT NULL,
  `giveBook` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table qltv.student
CREATE TABLE IF NOT EXISTS `student` (
  `studenId` varchar(50) DEFAULT NULL,
  `nameS` varchar(50) DEFAULT NULL,
  `gender` char(5) DEFAULT NULL,
  `birthdayS` date DEFAULT NULL,
  `class` varchar(50) DEFAULT NULL,
  `address` longtext DEFAULT NULL,
  `major` longtext DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `passwd` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

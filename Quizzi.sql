-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 29, 2022 at 11:43 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Quizzi`
--

-- --------------------------------------------------------

--
-- Table structure for table `PLAYER`
--

CREATE TABLE `PLAYER` (
  `PID` int(4) NOT NULL,
  `PNAME` varchar(50) DEFAULT NULL,
  `P_PASSWORD` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `PLAYER`
--

INSERT INTO `PLAYER` (`PID`, `PNAME`, `P_PASSWORD`) VALUES
(1001, 'VADIRAJ G INAMDAR', 'vadi@2002');

-- --------------------------------------------------------

--
-- Table structure for table `PLAYS`
--

CREATE TABLE `PLAYS` (
  `HIGH_SCORE` int(11) DEFAULT NULL,
  `Q_ID` int(11) DEFAULT NULL,
  `PID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `PLAYS`
--

INSERT INTO `PLAYS` (`HIGH_SCORE`, `Q_ID`, `PID`) VALUES
(NULL, 111, 1001);

-- --------------------------------------------------------

--
-- Table structure for table `QUESTIONS`
--

CREATE TABLE `QUESTIONS` (
  `Q_NO` int(11) NOT NULL,
  `QUESTION` varchar(1024) DEFAULT NULL,
  `OP_1` varchar(100) DEFAULT NULL,
  `OP_2` varchar(100) DEFAULT NULL,
  `OP_3` varchar(100) DEFAULT NULL,
  `OP_4` varchar(100) DEFAULT NULL,
  `ANSWER` int(11) DEFAULT NULL,
  `POINTS` int(11) DEFAULT NULL,
  `Q_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `QUESTIONS`
--

INSERT INTO `QUESTIONS` (`Q_NO`, `QUESTION`, `OP_1`, `OP_2`, `OP_3`, `OP_4`, `ANSWER`, `POINTS`, `Q_ID`) VALUES
(1, 'What is the capital of India ?', 'Delhi', 'Panaji', 'Bombay', 'Surat', 1, 5, 111);

-- --------------------------------------------------------

--
-- Table structure for table `QUIZ`
--

CREATE TABLE `QUIZ` (
  `Q_ID` int(11) NOT NULL,
  `Q_NAME` varchar(50) DEFAULT NULL,
  `NO_OF_QUESTIONS` int(11) NOT NULL,
  `CATEGORY` varchar(50) DEFAULT NULL,
  `Q_SCORE` int(11) DEFAULT NULL,
  `QM_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `QUIZ`
--

INSERT INTO `QUIZ` (`Q_ID`, `Q_NAME`, `NO_OF_QUESTIONS`, `CATEGORY`, `Q_SCORE`, `QM_ID`) VALUES
(111, 'GK', 5, 'General Knowlegde', 50, 102);

-- --------------------------------------------------------

--
-- Table structure for table `QUIZ_MASTER`
--

CREATE TABLE `QUIZ_MASTER` (
  `QM_ID` int(8) NOT NULL,
  `QM_NAME` varchar(50) DEFAULT NULL,
  `QM_PASSWORD` varchar(255) DEFAULT NULL,
  `QM_SCORE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `QUIZ_MASTER`
--

INSERT INTO `QUIZ_MASTER` (`QM_ID`, `QM_NAME`, `QM_PASSWORD`, `QM_SCORE`) VALUES
(102, 'Chinmay Joshi', 'Hello', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `PLAYER`
--
ALTER TABLE `PLAYER`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `PLAYS`
--
ALTER TABLE `PLAYS`
  ADD UNIQUE KEY `UC_DETAIL` (`Q_ID`,`PID`),
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `QUESTIONS`
--
ALTER TABLE `QUESTIONS`
  ADD PRIMARY KEY (`Q_NO`),
  ADD KEY `Q_ID` (`Q_ID`);

--
-- Indexes for table `QUIZ`
--
ALTER TABLE `QUIZ`
  ADD PRIMARY KEY (`Q_ID`),
  ADD KEY `QM_ID` (`QM_ID`);

--
-- Indexes for table `QUIZ_MASTER`
--
ALTER TABLE `QUIZ_MASTER`
  ADD PRIMARY KEY (`QM_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `QUESTIONS`
--
ALTER TABLE `QUESTIONS`
  MODIFY `Q_NO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `PLAYS`
--
ALTER TABLE `PLAYS`
  ADD CONSTRAINT `plays_ibfk_1` FOREIGN KEY (`Q_ID`) REFERENCES `QUIZ` (`Q_ID`),
  ADD CONSTRAINT `plays_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `PLAYER` (`PID`);

--
-- Constraints for table `QUESTIONS`
--
ALTER TABLE `QUESTIONS`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`Q_ID`) REFERENCES `QUIZ` (`Q_ID`);

--
-- Constraints for table `QUIZ`
--
ALTER TABLE `QUIZ`
  ADD CONSTRAINT `quiz_ibfk_1` FOREIGN KEY (`QM_ID`) REFERENCES `QUIZ_MASTER` (`QM_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

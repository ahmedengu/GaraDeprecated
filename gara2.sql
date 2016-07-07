-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 07, 2016 at 12:42 AM
-- Server version: 5.5.50
-- PHP Version: 5.2.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gara`
--

-- --------------------------------------------------------

--
-- Table structure for table `AccessToken`
--

CREATE TABLE IF NOT EXISTS `AccessToken` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `memberID` int(11) NOT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `value` text NOT NULL,
  `lastUsed` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ip` text NOT NULL,
  `browser` text NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAccessToke162691` (`memberID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `AccessToken`
--

INSERT INTO `AccessToken` (`ID`, `memberID`, `TIMESTAMP`, `value`, `lastUsed`, `ip`, `browser`) VALUES
(3, 1, '2016-07-06 01:48:39', 'c39bff156be74981977d3e42cf18feb2', '2016-07-06 01:48:39', '209.148.94.217', '[Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.10240]'),
(4, 1, '2016-07-06 03:10:51', 'f000a0c57cc8430388dc9a7dbbfffb4a', '2016-07-06 03:10:51', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(5, 1, '2016-07-06 03:12:09', '00bb1f17ab6f4558bfb6db21100c9864', '2016-07-06 03:12:09', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(6, 1, '2016-07-06 03:14:21', 'd8736f30c8f646d6a707a5ffc936f8db', '2016-07-06 03:14:21', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(7, 1, '2016-07-06 03:14:40', '776d7db3b17b4508ac48efb1780c4599', '2016-07-06 03:14:40', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(8, 1, '2016-07-06 03:14:44', '23d12de504df49999af253d34368364a', '2016-07-06 03:14:44', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(9, 1, '2016-07-06 03:43:44', '46ecf52236b2418ca5aacfa8dfed7fa0', '2016-07-06 03:43:44', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(10, 1, '2016-07-06 06:29:30', 'bfa0e1fc2f7f4ffca580e418e9360bad', '2016-07-06 06:29:30', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(11, 1, '2016-07-06 07:16:25', '5fa2548133a54e7ba0ab5aec68c5bbf9', '2016-07-06 07:16:25', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(12, 5, '2016-07-06 07:43:52', 'da61639f26ca44e9892493f5c49e0d6d', '2016-07-06 07:43:52', '209.148.94.217', '[Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36]'),
(13, 1, '2016-07-06 09:18:36', 'c7c22b3129f54cb58b9fe9efff28d416', '2016-07-06 09:18:36', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(14, 1, '2016-07-06 10:21:11', '8f1b97400b6c454591443450e797ad89', '2016-07-06 10:21:11', '209.148.94.217', '[Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5]'),
(15, 1, '2016-07-06 13:30:25', '1d6ce07a5f554b20856913e4ddc4cb4b', '2016-07-06 13:30:25', '209.148.94.217', '[Dalvik/2.1.0 (Linux; U; Android 5.0.2; SM-A500H Build/LRX22G)]'),
(16, 1, '2016-07-06 13:30:26', '8e39b1d09df54e7a829925861702e437', '2016-07-06 13:30:26', '209.148.94.217', '[Dalvik/2.1.0 (Linux; U; Android 5.0.2; SM-A500H Build/LRX22G)]'),
(17, 1, '2016-07-06 13:30:28', '372af705a3a149878cdc45b93d49f13a', '2016-07-06 13:30:28', '209.148.94.217', '[Dalvik/2.1.0 (Linux; U; Android 5.0.2; SM-A500H Build/LRX22G)]'),
(18, 1, '2016-07-06 13:30:29', '8f2150044c4a40c986f7f1cb2e9a5a70', '2016-07-06 13:30:29', '209.148.94.217', '[Dalvik/2.1.0 (Linux; U; Android 5.0.2; SM-A500H Build/LRX22G)]'),
(19, 1, '2016-07-06 14:25:10', '88dd7fcdfb4f427e80d19f2a2849cbef', '2016-07-06 14:25:10', '209.148.94.217', '[Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36]'),
(20, 1, '2016-07-06 14:54:05', 'f73343e8202d400c908f9f5949ff8f08', '2016-07-06 14:54:05', '209.148.94.217', '[Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.10240]'),
(21, 1, '2016-07-07 01:20:32', 'f833bcf8e9724a6787eed478a34f43df', '2016-07-07 01:20:32', '209.148.94.217', '[Mozilla/5.0 (Linux; Android 5.0.2; SM-A500H Build/LRX22G) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.81 Mobile Safari/537.36]');

-- --------------------------------------------------------

--
-- Table structure for table `Car`
--

CREATE TABLE IF NOT EXISTS `Car` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `driverID` int(11) NOT NULL,
  `plateNumber` text NOT NULL,
  `platePic` text,
  `carModelID` int(11) NOT NULL,
  `frontPic` text,
  `backPic` text,
  `sidePic` text,
  `insidePic` text,
  `licenseNumber` text NOT NULL,
  `licensePic` text,
  `licenseExpireDate` date DEFAULT NULL,
  `DistLongitude` double DEFAULT NULL,
  `DistLatitude` double DEFAULT NULL,
  `availableSeats` int(11) DEFAULT NULL,
  `state` int(1) DEFAULT '0',
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKCar115659` (`driverID`),
  KEY `FKCar838891` (`carModelID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `Car`
--

INSERT INTO `Car` (`ID`, `driverID`, `plateNumber`, `platePic`, `carModelID`, `frontPic`, `backPic`, `sidePic`, `insidePic`, `licenseNumber`, `licensePic`, `licenseExpireDate`, `DistLongitude`, `DistLatitude`, `availableSeats`, `state`, `TIMESTAMP`) VALUES
(1, 1, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, NULL, NULL, NULL, NULL, '2016-07-06 01:47:44'),
(2, 1, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44'),
(3, 2, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44'),
(4, 3, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44'),
(5, 4, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44'),
(6, 5, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44'),
(7, 6, '123', NULL, 1, NULL, NULL, NULL, NULL, '123', NULL, NULL, -125.80839838452145, 66.4919099111008, 4, 1, '2016-07-06 01:47:44');

-- --------------------------------------------------------

--
-- Table structure for table `CarManufacture`
--

CREATE TABLE IF NOT EXISTS `CarManufacture` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `countryID` int(11) DEFAULT NULL,
  `pic` text,
  PRIMARY KEY (`ID`),
  KEY `FKCarManufac421407` (`countryID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `CarManufacture`
--

INSERT INTO `CarManufacture` (`ID`, `name`, `countryID`, `pic`) VALUES
(1, 'BMW', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `CarModel`
--

CREATE TABLE IF NOT EXISTS `CarModel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `numberOfSeats` int(11) DEFAULT NULL,
  `carManufactureID` int(11) NOT NULL,
  `pic` text,
  `gasConsumption` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCarModel191241` (`carManufactureID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `CarModel`
--

INSERT INTO `CarModel` (`ID`, `name`, `numberOfSeats`, `carManufactureID`, `pic`, `gasConsumption`) VALUES
(1, 'x5', 4, 1, NULL, 10);

-- --------------------------------------------------------

--
-- Table structure for table `City`
--

CREATE TABLE IF NOT EXISTS `City` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `countryID` int(11) NOT NULL,
  `pic` text,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCity728752` (`countryID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `City`
--

INSERT INTO `City` (`ID`, `name`, `countryID`, `pic`, `longitude`, `latitude`) VALUES
(1, 'Alexandria', 1, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `College`
--

CREATE TABLE IF NOT EXISTS `College` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `universityID` int(11) NOT NULL,
  `name` text NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCollege525618` (`universityID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Country`
--

CREATE TABLE IF NOT EXISTS `Country` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `pic` text,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `gasPrice` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `Country`
--

INSERT INTO `Country` (`ID`, `name`, `pic`, `longitude`, `latitude`, `gasPrice`) VALUES
(1, 'Egypt', 'http://www.eurosur.org/guiadelmundo.bak/paises/egipto/bandera.gif', 30.8025, 26.8206, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `DATABASECHANGELOG`
--

CREATE TABLE IF NOT EXISTS `DATABASECHANGELOG` (
  `ID` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int(11) NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `DATABASECHANGELOGLOCK`
--

CREATE TABLE IF NOT EXISTS `DATABASECHANGELOGLOCK` (
  `ID` int(11) NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DATABASECHANGELOGLOCK`
--

INSERT INTO `DATABASECHANGELOGLOCK` (`ID`, `LOCKED`, `LOCKGRANTED`, `LOCKEDBY`) VALUES
(1, '\0', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Driver`
--

CREATE TABLE IF NOT EXISTS `Driver` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `memberID` int(11) NOT NULL,
  `licenseNumber` text NOT NULL,
  `licensePic` text NOT NULL,
  `identyCardPic` text NOT NULL,
  `licenseExpireDate` date DEFAULT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKDriver32250` (`memberID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `Driver`
--

INSERT INTO `Driver` (`ID`, `memberID`, `licenseNumber`, `licensePic`, `identyCardPic`, `licenseExpireDate`, `TIMESTAMP`) VALUES
(1, 1, '123', '123', '123', NULL, '2016-07-06 01:47:21'),
(2, 2, '123', '123', '123', NULL, '2016-07-06 01:47:21'),
(3, 3, '123', '123', '123', NULL, '2016-07-06 01:47:21'),
(4, 4, '123', '123', '123', NULL, '2016-07-06 01:47:21'),
(5, 5, '123', '123', '123', NULL, '2016-07-06 01:47:21'),
(6, 6, '123', '123', '123', NULL, '2016-07-06 01:47:21');

-- --------------------------------------------------------

--
-- Table structure for table `Member`
--

CREATE TABLE IF NOT EXISTS `Member` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` text NOT NULL,
  `username` text NOT NULL,
  `studentEmail` text NOT NULL,
  `phoneNumber` varchar(15) DEFAULT NULL,
  `birthDate` datetime DEFAULT NULL,
  `activited` int(1) DEFAULT '0',
  `gender` char(255) DEFAULT 'M',
  `password` text NOT NULL,
  `collegeID` int(11) DEFAULT NULL,
  `pic` text,
  `bloodType` varchar(2) DEFAULT NULL,
  `emergencyNumber` text,
  `balance` int(11) DEFAULT '0',
  `studentEmailActivationCode` varchar(10) DEFAULT NULL,
  `memberGroupID` int(11) DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `pin` text,
  `universityID` int(11) DEFAULT NULL,
  `preferences` text,
  PRIMARY KEY (`ID`),
  KEY `FKMember175873` (`collegeID`),
  KEY `FKMember861549` (`memberGroupID`),
  KEY `FKMember491900` (`universityID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `Member`
--

INSERT INTO `Member` (`ID`, `TIMESTAMP`, `name`, `username`, `studentEmail`, `phoneNumber`, `birthDate`, `activited`, `gender`, `password`, `collegeID`, `pic`, `bloodType`, `emergencyNumber`, `balance`, `studentEmailActivationCode`, `memberGroupID`, `longitude`, `latitude`, `pin`, `universityID`, `preferences`) VALUES
(1, '2016-07-03 05:06:53', 'Ahmed Kamel Taha', 'a', 'a@student.aast.edu', NULL, NULL, NULL, NULL, '$2a$10$8VPsjGEuZ7F4IARGMYOc5uX486kmfZWl8rgPKy83VbcfqbCmfUuEi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, -125.76307978100583, 66.0520476490152, NULL, NULL, NULL),
(2, '2016-07-03 05:11:35', 'Ahmed Kamel Taha', 'ahmedengu', 'ahmedengu@student.aast.edu', '01275188455', NULL, NULL, NULL, '$2a$10$rz1edosWgvWl4pa1HEdLG.KLhhDmRHKHAcAZxyhCsZMGVxn.7JyLW', NULL, NULL, NULL, NULL, NULL, '5d3ee1f0f', NULL, -125.80839838452145, 66.4919099111008, NULL, NULL, NULL),
(3, '2016-07-06 05:02:35', 'Ahmed Kamel Taha', 'ahmedahmed', 'ahmedahmedahmed@student.aast.edu', '01275488755', NULL, NULL, NULL, '$2a$10$JG26pcJzROf8oVTwulDGQeKF97uZZnn.P1kpdwcFDX6XYO/max5qK', NULL, NULL, NULL, NULL, NULL, '4ed3a217d', NULL, -125.80839838452145, 66.4919099111008, NULL, NULL, NULL),
(4, '2016-07-06 05:14:02', 'Ahmed Kamel Taha', 'ahmedeee', 'oubeotnueotu@student.aast.edu', '01274899756', NULL, NULL, NULL, '$2a$10$pHiJANwDF1hyEd3YDuynkeIOGPZMTiUI4T53Twrb9ITvSI51m1yFu', NULL, NULL, NULL, NULL, NULL, '624b22db1', NULL, -125.80839838452145, 66.4919099111008, NULL, NULL, NULL),
(5, '2016-07-06 06:25:13', 'idhidh iuhidh idh ', 'idhidhidh', 'adhidhi@student.aast.edu', '01235977488', NULL, NULL, NULL, '$2a$10$xb6g8wQeN7XgDwla/0Qzcec8oKsydI3wk0JECnYCo1qFCMCaYMMOW', NULL, NULL, NULL, NULL, NULL, 'ab592c8a5', NULL, -125.80839838452145, 66.4919099111008, NULL, NULL, NULL),
(6, '2016-07-06 07:40:35', 'Ahmed kamel taha', 'Ahmedeeeiii', 'hidddoho@student.aast.edu', '01221177854', NULL, NULL, NULL, '$2a$10$6sj4CZIIyXiPj6h7PK0qQui3ZYepCF5nQFPnQpInLok6mIQHG2Go6', NULL, NULL, NULL, NULL, NULL, 'd529ff24b', NULL, -125.80839838452145, 66.4919099111008, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `MemberCard`
--

CREATE TABLE IF NOT EXISTS `MemberCard` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `memberID` int(11) NOT NULL,
  `type` text NOT NULL,
  `number` text NOT NULL,
  `expireDate` text NOT NULL,
  `secrit` text NOT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKMemberCard555539` (`memberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `MemberGroup`
--

CREATE TABLE IF NOT EXISTS `MemberGroup` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `description` text,
  `permissions` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `MemberMessage`
--

CREATE TABLE IF NOT EXISTS `MemberMessage` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `from` int(11) NOT NULL,
  `to` int(11) NOT NULL,
  `message` text,
  PRIMARY KEY (`ID`),
  KEY `FKMemberMess110700` (`to`),
  KEY `FKMemberMess962617` (`from`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `MemberSavedAddress`
--

CREATE TABLE IF NOT EXISTS `MemberSavedAddress` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `memberID` int(11) NOT NULL,
  `name` text NOT NULL,
  `address` text,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKMemberSave41459` (`memberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Review`
--

CREATE TABLE IF NOT EXISTS `Review` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `reviewerMemberID` int(11) NOT NULL,
  `reviewedMemberID` int(11) NOT NULL,
  `rating` int(1) NOT NULL,
  `comment` text,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKReview627031` (`reviewerMemberID`),
  KEY `FKReview185272` (`reviewedMemberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Ride`
--

CREATE TABLE IF NOT EXISTS `Ride` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sourceLongitude` double NOT NULL,
  `sourceLatitude` double NOT NULL,
  `destinationLongitude` double NOT NULL,
  `destinationLatitude` double NOT NULL,
  `fare` int(11) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `carID` int(11) NOT NULL,
  `accepted` int(1) DEFAULT '0',
  `driverCheck` int(1) DEFAULT NULL,
  `passangerCheck` int(1) DEFAULT NULL,
  `memberID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKRide47095` (`carID`),
  KEY `FKRide175896` (`memberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `SiteContent`
--

CREATE TABLE IF NOT EXISTS `SiteContent` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` text,
  `body` text,
  `link` text,
  `description` text,
  `keywords` text,
  `pic` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `SiteContent`
--

INSERT INTO `SiteContent` (`ID`, `TIMESTAMP`, `title`, `body`, `link`, `description`, `keywords`, `pic`) VALUES
(1, '2016-07-03 05:04:32', 'Terms of use', '<div class="well">\r\n    <h4><span style="color: rgb(51, 51, 51); font-family: ''Open Sans'', sans-serif;">PLEASE READ THIS TERMS OF USE AGREEMENT CAREFULLY BEFORE USING THIS SERVICE.&nbsp;</span></h4>\r\n    <h6 style="margin-right: 0px; margin-left: 40px; font-family: ''Open Sans'', sans-serif; line-height: normal; color: rgb(51, 51, 51); font-size: 1rem; text-transform: uppercase; letter-spacing: 0.2px; padding-right: 40px;">WE RESERVE THE RIGHT AT ANY TIME TO:</h6>\r\n    <ul style="margin-right: 0px; margin-left: 40px; padding-right: 40px; padding-left: 0px; color: rgb(51, 51, 51); font-family: &quot;Open Sans&quot;, sans-serif;">\r\n        <li style="margin: 0px 0px 20px; list-style: none; padding: 0px 0px 0px 15px; line-height: 21.6px; display: block;">\r\n            <p style="margin-bottom: 20px; line-height: 1.5; font-size: 1rem;">Change the terms and conditions of this Agreement;</p>\r\n        </li>\r\n        <li style="margin: 0px 0px 20px; list-style: none; padding: 0px 0px 0px 15px; line-height: 21.6px; display: block;">\r\n            <p style="margin-bottom: 20px; line-height: 1.5; font-size: 1rem;">Change the Site, including eliminating or discontinuing any content on or feature of the Site; or</p>\r\n        </li>\r\n        <li style="margin: 0px 0px 20px; list-style: none; padding: 0px 0px 0px 15px; line-height: 21.6px; display: block;">\r\n            <p style="margin-bottom: 20px; line-height: 1.5; font-size: 1rem;">Change any fees or charges for use of the Site.</p>\r\n        </li>\r\n    </ul>\r\n    <p style="margin-bottom: 20px; margin-left: 40px; line-height: 1.5; padding-right: 40px; color: rgb(51, 51, 51); font-family: &quot;Open Sans&quot;, sans-serif;">Any changes we make will be effective immediately upon notice, which we may provide by means including, without limitation, posting on the Site or electronic mail. Your continued use of the Site following such changes will be deemed acceptance of such changes. Be sure to return to this page periodically to ensure familiarity with the most current version of this Agreement.</p>\r\n    <h4><br></h4>\r\n    <h4>Terms and Conditions</h4>\r\n    <h4>1. Contractual Relationship</h4>These Terms of Use ("\r\n    <em>Terms</em>") govern the access or use by you, an individual, from within Egypt and its territories and possessions of applications, websites, content, products, and services (the "\r\n    <em>Services</em>") made available in Egypt and its territories and possessions by Gara Egypt, and its subsidiaries and affiliates (collectively,&nbsp;“\r\n    <i>Gara</i>"). PLEASE READ THESE TERMS CAREFULLY BEFORE ACCESSING OR USING THE SERVICES. In these Terms, the words "including" and "include" mean "including, but not limited to.”\r\n    <br>\r\n    <font face="ff-clan-web-pro, Helvetica Neue, Helvetica, sans-serif"><span style="font-size: 14px;">Your access and use of the Services constitutes your agreement to be bound by these Terms, which establishes a contractual relationship between you and Gara. If you do not agree to these Terms, you may not access or use the Services. These Terms expressly supersede prior agreements or arrangements with you. Gara&nbsp;may immediately terminate these Terms or any Services with respect to you, or generally cease offering or deny access to the Services or any portion thereof, at any time for any reason.</span></font>\r\n    <font face="ff-clan-web-pro, Helvetica Neue, Helvetica, sans-serif"><span style="font-size: 14px;"><br></span></font>\r\n    <h4 style="margin: 0px 0px 16px; padding: 0px; font-size: 1.42857rem; line-height: 1.6; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif !important;">2. The Services</h4>You may not: (i) remove any copyright, trademark or other proprietary notices from any portion of the Services; (ii) reproduce, modify, prepare derivative works based upon, distribute, license, lease, sell, resell, transfer, publicly display, publicly perform, transmit, stream, broadcast or otherwise exploit the Services except as expressly permitted by Egypt; (iii) decompile, reverse engineer or disassemble the Services except as may be permitted by applicable law; (iv) link to, mirror or frame any portion of the Services; (v) cause or launch any programs or scripts for the purpose of scraping, indexing, surveying, or otherwise data mining any portion of the Services or unduly burdening or hindering the operation and/or functionality of any aspect of the Services; or (vi) attempt to gain unauthorized access to or impair any aspect of the Services or its related systems or networks.\r\n    <br>The Services and all rights therein are and shall remain Gara''s property or the property of Gara''s licensors. Neither these Terms nor your use of the Services convey or grant to you any rights: (i) in or related to the Services except for the limited license granted above; or (ii) to use or reference in any manner Gara''s company names, logos, product and service names, trademarks or services marks or those of Gara''s licensors.\r\n    <br>\r\n    <h4 style="font-family: HelveticaNeue; font-size: 12px;">3. Your Use of the Services</h4>\r\n    <h5 style="font-family: HelveticaNeue;">User Accounts.</h5>\r\n    <p style="font-family: HelveticaNeue; font-size: 12px;">In order to use most aspects of the Services, you must register for and maintain an active personal user Services account ("<em>Account</em>"). You must be at least 18 years of age, or the age of legal majority in your jurisdiction (if different than 18), to obtain an Account. Account registration requires you to submit to Uber certain personal information, such as your name, address, mobile phone number and age, as well as at least one valid payment method (either a credit card or accepted payment partner). You agree to maintain accurate, complete, and up-to-date information in your Account. Your failure to maintain accurate, complete, and up-to-date Account information, including having an invalid or expired payment method on file, may result in your inability to access and use the Services or Gara''s termination of this Agreement with you. You are responsible for all activity that occurs under your Account, and you agree to maintain the security and secrecy of your Account username and password at all times. Unless otherwise permitted by Uber in writing, you may only possess one Account.</p>\r\n    <p style="font-family: HelveticaNeue; font-size: 12px;"><br></p>\r\n    <h5 style="margin: 0px 0px 16px; padding: 0px; font-size: 0.92857rem; line-height: 1.30769; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif !important;">Text Messaging.</h5>\r\n    <p style="margin-bottom: 16px; line-height: 1.71429; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif;">By creating an Account, you agree that the Services may send you informational text (SMS) messages as part of the normal business operation of your use of the Services. You may opt-out of receiving text (SMS) messages from Gara at any time. You acknowledge that opting out of receiving text (SMS) messages may impact your use of the Services.</p>\r\n    <h5 style="margin: 0px 0px 16px; padding: 0px; font-size: 0.92857rem; line-height: 1.30769; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif !important;">User Provided Content.</h5>\r\n    <p style="font-family: HelveticaNeue; font-size: 12px;">Gara may, in Gara''s sole discretion, permit you from time to time to submit, upload, publish or otherwise make available to Gara through the Services textual, audio, and/or visual content and information, including commentary and feedback related to the Services, initiation of support requests, and submission of entries for competitions and promotions ("<em>User Content</em>"). Any User Content provided by you remains your property. However, by providing User Content to Gara, you grant Gara a worldwide, perpetual, irrevocable, transferrable, royalty-free license, with the right to sublicense, to use, copy, modify, create derivative works of, distribute, publicly display, publicly perform, and otherwise exploit in any manner such User Content in all formats and distribution channels now known or hereafter devised (including in connection with the Services and Gara''s business and on third-party sites and services), without further notice to or consent from you, and without the requirement of payment to you or any other person or entity.</p>\r\n    <p style="font-family: HelveticaNeue; font-size: 12px;"><font face="ff-clan-web-pro, Helvetica Neue, Helvetica, sans-serif"><span style="font-size: 14px;">You agree to not provide Gara Content that is defamatory, libelous, hateful, violent, obscene, pornographic, unlawful, or otherwise offensive, as determined by Gara in its sole discretion, whether or not such material may be protected by law. Gara&nbsp;may, but shall not be obligated to, review, monitor, or remove User Content, at Gara''s sole discretion and at any time and for any reason, without notice to you.</span></font></p>\r\n    <h4 style="margin: 0px 0px 16px; padding: 0px; font-size: 1.42857rem; line-height: 1.6; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif !important;">4. Payment</h4>\r\n    <p style="margin-bottom: 16px; line-height: 1.71429; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif;">You understand that use of the Services may result in charges to you for the services or goods you receive from a Third Party Provider ("<em>Charges</em>"). After you have received services or goods obtained through your use of the Service, Gara will facilitate your payment of the applicable Charges on behalf of the Third Party Provider, as such Third Party Provider''s limited payment collection agent. Payment of the Charges in such manner shall be considered the same as payment made directly by you to the Third Party Provider. Charges will be inclusive of applicable taxes where required by law. Charges paid by you are final and non-refundable, unless otherwise determined by Gara. You retain the right to request lower Charges from a Third Party Provider for services or goods received by you from such Third Party Provider at the time you receive such services or goods. Gara will respond accordingly to any request from a Third Party Provider to modify the Charges for a particular service or good.</p>\r\n    <p style="margin-bottom: 16px; line-height: 1.71429; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif;">All Charges are due immediately and payment will be facilitated by Gara using the preferred payment method designated in your Account, after which Gara will send you a receipt by email. If your primary Account payment method is determined to be expired, invalid or otherwise not able to be charged, you agree that Gara may, as the Third Party Provider''s limited payment collection agent, use a secondary payment method in your Account, if available.</p>\r\n    <h5 style="margin: 0px 0px 16px; padding: 0px; font-size: 0.92857rem; line-height: 1.30769; font-family: ff-clan-web-pro, ''Helvetica Neue'', Helvetica, sans-serif !important;">Repair or Cleaning Fees.</h5>\r\n    <p style="font-family: HelveticaNeue; font-size: 12px;">You shall be responsible for the cost of repair for damage to, or necessary cleaning of, Third Party Provider vehicles and property resulting from use of the Services under your Account in excess of normal "wear and tear" damages and necessary cleaning ("<em>Repair or Cleaning</em>"). In the event that a Third Party Provider reports the need for Repair or Cleaning, and such Repair or Cleaning request is verified by Gara in Gara''s reasonable discretion, Gara reserves the right to facilitate payment for the reasonable cost of such Repair or Cleaning on behalf of the Third Party Provider using your payment method designated in your Account. Such amounts will be transferred by Gara to the applicable Third Party Provider and are non-refundable.</p>\r\n</div>', 'tos', 'Terms of use', 'Terms of use', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `SiteContentGroup`
--

CREATE TABLE IF NOT EXISTS `SiteContentGroup` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `SiteOption`
--

CREATE TABLE IF NOT EXISTS `SiteOption` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `value` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `University`
--

CREATE TABLE IF NOT EXISTS `University` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `cityID` int(11) DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `pic` text,
  `url` text NOT NULL,
  `emailFormat` text NOT NULL,
  `pageName` text,
  `pageContent` text,
  `pageDescription` text,
  `pageKeywords` text,
  `pageSubdomain` text,
  `contactPersonEmail` text,
  `contactPersonPassword` text,
  `parkingCost` int(11) DEFAULT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FKUniversity759378` (`cityID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `University`
--

INSERT INTO `University` (`ID`, `name`, `cityID`, `longitude`, `latitude`, `pic`, `url`, `emailFormat`, `pageName`, `pageContent`, `pageDescription`, `pageKeywords`, `pageSubdomain`, `contactPersonEmail`, `contactPersonPassword`, `parkingCost`, `TIMESTAMP`) VALUES
(1, 'AAST', 1, NULL, NULL, 'https://upload.wikimedia.org/wikipedia/commons/b/b5/AASTMT.png', 'aast.edu', 'student.aast.edu', 'AAST', '<section id="promo-1" class="content-block promo-1 min-height-600px bg-offwhite" style="" align>\r\n    <div class="container">\r\n        <div class="row" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="bounce" data-animation-2>\r\n            <div class="col-md-5" data-animation-1 data-animation-2 data-animation-trigger-1="hover" data-animation-type-1="bounce" align>\r\n                <h2 class="white">Gara</h2>\r\n                <p class="offwhite">Carpooling platform for universties.</p>\r\n                <form action="http://www.g-ara.com/register" method="get">\r\n                    <div class="row">\r\n                        <div class="col-md-6">\r\n                            <div class="form-group">\r\n                                <input type="text" name="name" placeholder="Name" class="form-control">\r\n                            </div>\r\n                        </div>\r\n                        <div class="col-md-6">\r\n                            <div class="form-group">\r\n                                <input type="text" name="username" placeholder="Username" class="form-control">\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <div class="form-group">\r\n                        <input type="email" name="studentEmail" placeholder="Student email address" class="form-control">\r\n                    </div>\r\n                    <div class="form-group">\r\n                        <input type="submit" value="register now!" placeholder="Student email address" class="btn btn-primary btn-block bg-marina">\r\n                    </div>\r\n                                    </form>\r\n            </div>\r\n            <div class="col-md-6 col-md-offset-1" data-animation-1>\r\n                <img src="https://upload.wikimedia.org/wikipedia/commons/b/b5/AASTMT.png" width="60%" class="img-rounded" style="background:white" />\r\n            </div>\r\n        </div>\r\n    </div>\r\n</section>', 'aast', 'aast', 'aast', NULL, NULL, NULL, '2016-07-01 18:31:22'),
(2, 'euoeu', NULL, NULL, NULL, NULL, 'oeuoeu.edu', 'oeuoeu.edu', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2016-07-06 09:55:21');

-- --------------------------------------------------------

--
-- Table structure for table `UniversityPageContent`
--

CREATE TABLE IF NOT EXISTS `UniversityPageContent` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIMESTAMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` text,
  `body` text,
  `link` text,
  `description` text,
  `keywords` text,
  `pic` text,
  `universityID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUniversity451983` (`universityID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `UniversityPageContent`
--

INSERT INTO `UniversityPageContent` (`ID`, `TIMESTAMP`, `title`, `body`, `link`, `description`, `keywords`, `pic`, `universityID`) VALUES
(1, '2016-07-03 05:03:44', 'About', '<section id="promo-1" class="content-block promo-1 min-height-600px bg-offwhite" style="" align>\r\n    <div class="container">\r\n        <div class="row" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="bounce" data-animation-2>\r\n            <div class="well">\r\n                <h1>About AAST</h1>\r\n                <p style="margin-top: 0.5em; margin-bottom: 0.5em; line-height: 22.4px; color: rgb(37, 37, 37); font-family: sans-serif; background-color: rgb(255, 255, 255);">Over five years (from 1991 to 1996), the educational and maritime training services were funded by the Egyptian Ministry of Transport. Consequently, in 1992, the AASTMT was granted the most modern training ship, "Aida 4", as a donation\r\n                    from the Japanese government.</p>\r\n                <p style="margin-top: 0.5em; margin-bottom: 0.5em; line-height: 22.4px; color: rgb(37, 37, 37); font-family: sans-serif; background-color: rgb(255, 255, 255);">In 1994 the AASTMT was awarded the most modern simulator in the world (completed in two phases) from the USA administration. Cooperation with the American counterpart continued to found an advanced technology center. Scholarships have\r\n                    exceeded 120,000 for students from 58 countries.</p>\r\n                <p style="margin-top: 0.5em; margin-bottom: 0.5em; line-height: 22.4px; color: rgb(37, 37, 37); font-family: sans-serif; background-color: rgb(255, 255, 255);">The World Bank has chosen the AASTMT from four international organizations representing the Norwegian Swedish Group, the Hungarian Group and the Danish Group to develop maritime education in Bangladesh by a limited tender. The AASTMT proposal\r\n                    was chosen as the best both technically and financially to carry out the project.</p>\r\n                <p style="margin-top: 0.5em; margin-bottom: 0.5em; line-height: 22.4px; color: rgb(37, 37, 37); font-family: sans-serif; background-color: rgb(255, 255, 255);">In October 1996 modified its title from: "The Arab Academy for Science and Technology: A university specialized in maritime transport." to "The Arab Academy for Science, Technology and Maritime Transport" (AASTMT).</p>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</section>', 'about', 'About', 'About', NULL, 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `AccessToken`
--
ALTER TABLE `AccessToken`
  ADD CONSTRAINT `FKAccessToke162691` FOREIGN KEY (`memberID`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `Car`
--
ALTER TABLE `Car`
  ADD CONSTRAINT `FKCar115659` FOREIGN KEY (`driverID`) REFERENCES `Driver` (`ID`),
  ADD CONSTRAINT `FKCar838891` FOREIGN KEY (`carModelID`) REFERENCES `CarModel` (`ID`);

--
-- Constraints for table `CarManufacture`
--
ALTER TABLE `CarManufacture`
  ADD CONSTRAINT `FKCarManufac421407` FOREIGN KEY (`countryID`) REFERENCES `Country` (`ID`);

--
-- Constraints for table `CarModel`
--
ALTER TABLE `CarModel`
  ADD CONSTRAINT `FKCarModel191241` FOREIGN KEY (`carManufactureID`) REFERENCES `CarManufacture` (`ID`);

--
-- Constraints for table `City`
--
ALTER TABLE `City`
  ADD CONSTRAINT `FKCity728752` FOREIGN KEY (`countryID`) REFERENCES `Country` (`ID`);

--
-- Constraints for table `College`
--
ALTER TABLE `College`
  ADD CONSTRAINT `FKCollege525618` FOREIGN KEY (`universityID`) REFERENCES `University` (`ID`);

--
-- Constraints for table `Driver`
--
ALTER TABLE `Driver`
  ADD CONSTRAINT `FKDriver32250` FOREIGN KEY (`memberID`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `Member`
--
ALTER TABLE `Member`
  ADD CONSTRAINT `FKMember175873` FOREIGN KEY (`collegeID`) REFERENCES `College` (`ID`),
  ADD CONSTRAINT `FKMember491900` FOREIGN KEY (`universityID`) REFERENCES `University` (`ID`),
  ADD CONSTRAINT `FKMember861549` FOREIGN KEY (`memberGroupID`) REFERENCES `MemberGroup` (`ID`);

--
-- Constraints for table `MemberCard`
--
ALTER TABLE `MemberCard`
  ADD CONSTRAINT `FKMemberCard555539` FOREIGN KEY (`memberID`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `MemberMessage`
--
ALTER TABLE `MemberMessage`
  ADD CONSTRAINT `FKMemberMess110700` FOREIGN KEY (`to`) REFERENCES `Member` (`ID`),
  ADD CONSTRAINT `FKMemberMess962617` FOREIGN KEY (`from`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `MemberSavedAddress`
--
ALTER TABLE `MemberSavedAddress`
  ADD CONSTRAINT `FKMemberSave41459` FOREIGN KEY (`memberID`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `Review`
--
ALTER TABLE `Review`
  ADD CONSTRAINT `FKReview185272` FOREIGN KEY (`reviewedMemberID`) REFERENCES `Member` (`ID`),
  ADD CONSTRAINT `FKReview627031` FOREIGN KEY (`reviewerMemberID`) REFERENCES `Member` (`ID`);

--
-- Constraints for table `Ride`
--
ALTER TABLE `Ride`
  ADD CONSTRAINT `FKRide175896` FOREIGN KEY (`memberID`) REFERENCES `Member` (`ID`),
  ADD CONSTRAINT `FKRide47095` FOREIGN KEY (`carID`) REFERENCES `Car` (`ID`);

--
-- Constraints for table `University`
--
ALTER TABLE `University`
  ADD CONSTRAINT `FKUniversity759378` FOREIGN KEY (`cityID`) REFERENCES `City` (`ID`);

--
-- Constraints for table `UniversityPageContent`
--
ALTER TABLE `UniversityPageContent`
  ADD CONSTRAINT `FKUniversity451983` FOREIGN KEY (`universityID`) REFERENCES `University` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

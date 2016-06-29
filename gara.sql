-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 29, 2016 at 04:37 PM
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
  ADD CONSTRAINT `FKCar838891` FOREIGN KEY (`carModelID`) REFERENCES `CarModel` (`ID`),
  ADD CONSTRAINT `FKCar115659` FOREIGN KEY (`driverID`) REFERENCES `Driver` (`ID`);

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
  ADD CONSTRAINT `FKMember491900` FOREIGN KEY (`universityID`) REFERENCES `University` (`ID`),
  ADD CONSTRAINT `FKMember175873` FOREIGN KEY (`collegeID`) REFERENCES `College` (`ID`),
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
  ADD CONSTRAINT `FKMemberMess962617` FOREIGN KEY (`from`) REFERENCES `Member` (`ID`),
  ADD CONSTRAINT `FKMemberMess110700` FOREIGN KEY (`to`) REFERENCES `Member` (`ID`);

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

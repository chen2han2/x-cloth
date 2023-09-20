/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.28-log : Database - xdb
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE DATABASE /*!32312 IF NOT EXISTS*/`cloth_sql` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `cloth_sql`;

DROP TABLE IF EXISTS `account_inf`;

CREATE TABLE account_inf (
                             accountId INT PRIMARY KEY,
                             account VARCHAR(255),
                             password VARCHAR(255),
                             logoPath VARCHAR(255),
                             personType INT,
                             remainPublishTimes INT,
                             lastPublishTime VARCHAR(255),
                             isVip INT,
                             vipTime VARCHAR(255),
                             vipType INT
);

CREATE TABLE publish_inf (
                             publishId INT PRIMARY KEY AUTO_INCREMENT,
                             accountId INT,
                             publishTime VARCHAR(255),
                             workType INT,
                             workInfo VARCHAR(255),
                             smallClothType VARCHAR(255),
                             salaryType INT,
                             salary INT,
                             clothPicPath VARCHAR(255),
                             clothDescription VARCHAR(255),
                             clothTechnology VARCHAR(255),
                             recruitNum INT,
                             province VARCHAR(255),
                             city VARCHAR(255),
                             area VARCHAR(255),
                             detailAddress VARCHAR(255),
                             urgentRecruit INT,
                             phoneNum VARCHAR(255),
                             factoryName VARCHAR(255),
                             FOREIGN KEY (accountId) REFERENCES account_inf(accountId)
);


CREATE TABLE cloth_type (
                            clothTypeId INT PRIMARY KEY AUTO_INCREMENT,
                            smallClothType VARCHAR(255),
                            largeClothType VARCHAR(255)
);

CREATE TABLE feed_information (
                                  feedId INT PRIMARY KEY AUTO_INCREMENT,
                                  feedType INT,
                                  feedDescription VARCHAR(255)
);
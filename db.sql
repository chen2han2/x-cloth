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
                             account_id INT PRIMARY KEY,
                             account VARCHAR(255),
                             password VARCHAR(255),
                             logo_path VARCHAR(255),
                             person_type INT,
                             remain_publish_times INT,
                             last_publish_time VARCHAR(255),
                             is_vip INT,
                             vip_time VARCHAR(255),
                             vip_type INT
);

CREATE TABLE publish_inf (
                             publish_id INT PRIMARY KEY AUTO_INCREMENT,
                             account_id INT,
                             publish_time VARCHAR(255),
                             work_type INT,
                             work_info VARCHAR(255),
                             small_cloth_type VARCHAR(255),
                             salary_type INT,
                             salary INT,
                             cloth_pic_path VARCHAR(255),
                             cloth_description VARCHAR(255),
                             cloth_technology VARCHAR(255),
                             recruit_num INT,
                             province VARCHAR(255),
                             city VARCHAR(255),
                             area VARCHAR(255),
                             detail_address VARCHAR(255),
                             urgent_recruit INT,
                             phone_num VARCHAR(255),
                             factory_ame VARCHAR(255),
                             FOREIGN KEY (account_id) REFERENCES account_inf(account_id)
);


CREATE TABLE cloth_type (
                            cloth_type_id INT PRIMARY KEY AUTO_INCREMENT,
                            small_cloth_type VARCHAR(255),
                            large_cloth_type VARCHAR(255)
);

CREATE TABLE feed_information (
                                  feed_id INT PRIMARY KEY AUTO_INCREMENT,
                                  feed_type INT,
                                  feed_description VARCHAR(255)
);
CREATE DATABASE  IF NOT EXISTS `spring_crud`;
USE `spring_crud`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `madein` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `continent` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `country` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 NOT NULL,
  `continent_id` int(11) DEFAULT NULL,
  `alpha_2_code` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `currency_code` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `continent_id` (`continent_id`),
  KEY `FKcountry50845` (`continent_id`),
  CONSTRAINT `FKcountry50845` FOREIGN KEY (`continent_id`) REFERENCES `continent` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
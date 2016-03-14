CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` int(11) DEFAULT '0',
  `product_id` varchar(255) DEFAULT NULL,
  `description` text,
  `image_url` varchar(255) NOT NULL DEFAULT '',
  `price` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


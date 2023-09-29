-- mysql create table items

CREATE TABLE IF NOT EXISTS `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- mysql create table orders
CREATE TABLE orders (
    id INT NOT NULL AUTO_INCREMENT,
    item_id INT NOT NULL,
    total_due DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (item_id) REFERENCES items(id)
);


-- mysql insert into items
INSERT INTO `items` (`code`, `name`, `price`) VALUES
(? , ? , ? );

-- create table users
CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT,
    password VARCHAR(255) NOT NULL DEFAULT 'Admin123',
    PRIMARY KEY (id)
);

-- retrieve user with password, Admin123
SELECT * FROM users WHERE password = ?;
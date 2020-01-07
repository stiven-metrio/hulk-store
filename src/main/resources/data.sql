DROP TABLE IF EXISTS products;
CREATE TABLE products(
    ID INT PRIMARY KEY,
    CATEGORY VARCHAR(255),
    NAME VARCHAR(255),
    DESCRIPTION VARCHAR(255)
    );
INSERT INTO products VALUES
(1, 'T-SHIRT', 'T-Shirt', 'Blue t-shirt, spiderman'),
(2, 'COMIC', 'Hulk', 'Hulk toy');
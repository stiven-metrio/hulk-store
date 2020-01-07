DROP TABLE IF EXISTS products;
CREATE TABLE products(
    ID INT PRIMARY KEY,
    NAME VARCHAR(255),
    PRICE VARCHAR(255)
    );
INSERT INTO products VALUES
(1, 'Glass', '55.28'),
(2, 'Toy', '23.53');
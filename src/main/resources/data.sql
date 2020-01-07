DROP TABLE IF EXISTS products;
CREATE TABLE products(
    ID INT PRIMARY KEY,
    PRODUCT_TYPE VARCHAR(1),
    CATEGORY VARCHAR(50),
    NAME VARCHAR(255),
    DESCRIPTION VARCHAR(255),
    DATE VARCHAR(10),
    AMOUNT INT,
    COST VARCHAR(255)    
    );
INSERT INTO products VALUES
(1, 'E', 'OTHERS', 'Sticker - Aquaman', 'Small Aquaman sticker', '01/01/2020', 1, '20.00'),
(2, 'S', 'CUP', 'Spiderman - cup', 'Blue Spiderman cup', '02/02/2020', 1, '10.00');
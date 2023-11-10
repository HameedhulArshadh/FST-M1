-- drop the table
DROP TABLE orders;

-- Create a table named orders
CREATE TABLE orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;


-- Activity6
-- Select salesman ids without repeated values
SELECT DISTINCT salesman_id FROM orders;

-- Display the  order number order by date in ascending order
SELECT order_no FROM orders ORDER BY order_date ASC;

-- Display the order number order by purchase amount in descending order
SELECT order_no FROM orders ORDER BY purchase_amount DESC;

-- Display full data of orders that have purchase amount less than 500
SELECT * FROM orders where purchase_amount < 500 ORDER BY purchase_amount DESC;

-- Display full data of orders that have purchase amount between 1000 and 2000
SELECT * FROM orders where purchase_amount BETWEEN 1000 AND 2000;

-- Display entire table
SELECT * FROM orders;





-- Activity7
-- find the total purchase amount of all orders
SELECT SUM(purchase_amount) FROM orders;

-- find the average purchase amount of all orders
SELECT AVG(purchase_amount) FROM orders;

-- find the maximum purchase amount of all orders
SELECT MAX(purchase_amount) FROM orders;

-- find the minimum purchase amount of all orders
SELECT MIN(purchase_amount) FROM orders;

-- find the number of salesman listed in the table
SELECT COUNT(DISTINCT salesman_id) FROM orders;





-- Activity 8
-- find the highest purchase amount ordered by each customer with their ID and highest purchase amount
SELECT customer_id, MAX(purchase_amount) FROM orders GROUP BY customer_id;

-- find the highest purchase amount on '2012-08-17' for each salesman with their id
SELECT salesman_id, order_date, MAX(purchase_amount) FROM orders WHERE order_date=TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;
 
-- find the highest amount with their id and order date who have higher purchase amount withtin the list 2030, 3450, 5760, 6000
SELECT customer_id, order_date, max(purchase_amount) FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN (2030, 3450, 5760, 6000);








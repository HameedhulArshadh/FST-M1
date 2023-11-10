-- dropping the existing table
drop table salesman;


-- Activity1
-- creating the table: 
CREATE TABLE salesman( 
	salesman_id int PRIMARY KEY, 
	salesman_name varchar2(20), 
	salesman_city varchar2(20), 
	commission int 
);




-- Activity2
-- inserting rows: 
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5002, 'Nail Knite', 'Paris', 13);
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5005, 'Pit Alex', 'London', 11);
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5006, 'MyLyon', 'Paris', 14);
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5007, 'Paul Adam', 'Rome', 13);
INSERT INTO salesman(salesman_id, salesman_name, salesman_city, commission) VALUES(5003, 'Lauson Hen', 'San Jose', 12);

-- selection and filtering
select * from salesman;

select * from salesman where commission > 13;

SELECT * FROM salesman WHERE commission BETWEEN 11 AND 13 OR salesman_city = 'New York';




-- Activity3
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';




-- Activity4
-- altering table to add a new column
ALTER TABLE salesman ADD(grade int);

-- updating all the rows in the tables for grade to 100
UPDATE salesman SET grade=100;

-- displaying the table
SELECT * FROM salesman;





-- Activity5
-- update the grade score of salesman from rome to 200
UPDATE salesman SET grade=200 where salesman_city='Rome';

-- update the grade score of James Hoog to 300
UPDATE salesman SET grade=300 where salesman_name='James Hoog';

-- update the name McLyon to Pierre
UPDATE salesman SET salesman_name='Pierre' where salesman_name='MyLyon';

-- displaying the table
SELECT * FROM salesman;


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





-- Drop table 
DROP table customers;

-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;



-- Activity 9
-- Write an SQL statement to know which salesman are working for which customer.
select customers.customer_name, salesman.salesman_name from customers inner join salesman on customers.salesman_id = salesman.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.
select customers.customer_name, customers.grade, salesman.salesman_name from customers inner join salesman on customers.salesman_id = salesman.salesman_id where customers.grade < 300 order by customers.customer_name asc;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
select customers.customer_name, salesman.salesman_name, salesman.commission from customers inner join salesman on customers.salesman_id = salesman.salesman_id where salesman.commission > 12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
select o.order_no, o.order_date, o.purchase_amount,
    c.customer_name, c.grade, s.salesman_name, s.commission
    from orders o 
    inner join customers c on o.customer_id = c.customer_id 
    inner join salesman s on o.salesman_id = s.salesman_id;




-- Activity10


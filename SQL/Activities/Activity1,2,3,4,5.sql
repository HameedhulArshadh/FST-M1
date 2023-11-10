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








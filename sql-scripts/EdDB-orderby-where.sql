/*
Select all columns in the order they are defined in the table
*/

SELECT * from student;

/*
Select all students and display them in order of SAT ascending
*/

SELECT * 
	from student
    order by sat;
    
-- Note: you can use "order by sat asc;" but ascending is usually default

/*
Select all students and display them in order of SAT descending
*/

SELECT *
	from student
    order by sat desc;

/*
Select all students and display them in order of SAT and GPA
*/

SELECT *
	from student
    order by sat, gpa;
 
 /*
Select all students and display them in order of SAT ascending
*/

SELECT * 
	from student
    order by sat;
    
-- Note: you can use "order by sat asc;" but ascending is usually default

/*
Select all students and display them in order of SAT descending
*/

SELECT *
	from student
    order by sat desc;

/*
Select all students and display them in order of SAT and GPA
*/

SELECT *
	from student
    order by sat, gpa;

/*
- List all students with 3.0 or better GPA
- Sort by the highest GPA first
*/

SELECT *
	from student
    where GPA >= 3.0
    order by gpa desc;

/*
- List all students with rang of 3.0 to 3.25 GPA
- Sort by the highest GPA first
*/

SELECT *
	from student
    where GPA >= 3.0 and GPA <=3.25
    order by gpa desc;
    
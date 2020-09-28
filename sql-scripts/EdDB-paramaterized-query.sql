/*
A school gives a $1,250 scholarship to the brightest students but
only $5,000 is available (so 4 students). What is the SAT score 
above which all qualified students can recieve a scholarship?
*/

set @maxsat = 1100; -- set value of the parameter

select * 
	from student
    where sat > @maxsat
    order by SAT desc;

/* Using parameters, show SAT >= 1000 and SAT <= 1200 > */

set @lowsat = 1000;
set @highsat = 1200;

select *
	from student
    where sat >= @lowsat and sat <= @highsat;
    
 /* 
 Create a list of students that have GPA sxcores at or above 
 a minimum value and at or below a maximum value (inclusive) 
 and order themby the GPA score in ascending order 
 */   

set @minVal = 2.0;
set @maxVal = 3.5;

select *
	from student
    where GPA >= @minVal and GPA <= @maxVal
    order by GPA asc;

/* 
Show all majors a student is allowed to sign up for 
depending on thier SAT scores
*/
set @studentSAT = 1000;

select *
	from major
    where MinSAT <= @studentSAT;

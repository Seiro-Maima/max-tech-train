/* Show only name and email */
SELECT name, email 
from student;

/* Show name, email, and sat */
SELECT name, email, sat 
from student;

/* Show name, email, and sat in order of SAT */
SELECT name, email, sat
from student
order by sat;

/* Show name, email, and sat in order of SAT descending */
SELECT name, email, sat
from student
order by sat desc;

/* 
- Show name, email, and sat 
- Order SAT in descending order
- Show only SAT results greater than 1000
*/
SELECT name, email, sat
from student
where sat > 1000
order by sat desc;

/* 
- Show name, email, and sat 
- Order SAT in descending order
- Show only SAT results greater than 1000 or less than 1300
*/
SELECT name, email, sat
from student
where (sat > 1000 and sat < 1300)
order by sat desc;
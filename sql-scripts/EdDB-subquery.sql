/* Display all students with GPA scores greater than average of all student GPA */

-- this will show the average of all GPA using the avg() function
-- SELECT avg(gpa) 
-- from student;

SELECT *
	from student
    where gpa > (select avg(GPA) from student);

/* Create a list of students that have SAT scores below the average of all student */

SELECT *
	from student
    where SAT < (select avg(SAT) from student);

/* Display the number of classes required for each major */

select m.description as 'Major', count(*) 
	from major m
	join majorclassrel mc
		on m.Id = mc.MajorId
	join class c
		on c.id = mc.ClassId
	group by m.Description;

/* Display majors that require > 10 classes */

select m.description as 'Major', count(*) as 'Num of Classes'
	from major m
	join majorclassrel mc
		on m.Id = mc.MajorId
	join class c
		on c.id = mc.ClassId
	group by m.Description
		having count(*) > 10;
/* Show students that have a major */

SELECT *
	from student s
    join major m
		on m.Id = s.MajorId;

/* Show instructors and classes */

SELECT *
	from instructor i
    join class c
		on c.InstructorId = i.Id;
        
/* Show all students and what classes they are enrolled in */

SELECT * 
	from student s
    join studentclassrel scl
		on s.Id = scl.StudentId
	join class c
		on c.Id = scl.ClassId;
    
/* Create a list of students where SAT is less than 1000 */

SELECT * from student
	where sat < 1000;

/* 
- Create a list of instructors
- Show only Firstname, Lastname, and Years of Experience
- Order by Lastname in ascending order 
*/

SELECT Firstname, Lastname, YearsExperience 
	from instructor
    order by Lastname ;

/*
- Create a list of major description, class code, and class subject
- Display required classes for major "General Business"
*/

SELECT m.Description, c.Section, c.Subject 
	from major m
    join  majorclassrel mc
		on mc.majorId = m.Id
	join class c
		on c.id = mc.ClassId
	where Description = "General Business";
        
/* Display all students including thier major if declared */

SELECT * 
	from student s
    left join major m
    on m.Id = s.MajorId;
		
/* Create a list of all classes and include instructor name if one exists */

SELECT * 
	from class c
    left join instructor i
		on c.InstructorId = i.Id;

/*
- Example of UNION
- Create a list of students categorized according to thier SAT scores
- A if > 1200, B if between 1200 and 1000, and C if < 1000
 */
 
SELECT Lastname, 'A' as 'Score'
	from student
    where SAT > 1200
UNION
SELECT Lastname, 'B' as 'Score'
	from student
    where SAT <= 1200 and SAT > 1000
UNION	
SELECT Lastname, 'C' as 'Score'
	from student
    where SAT < 1000;
    
/* 
- Display all the students and the class they are enrolled in  
- The StudentClassRel table is needed
- Order by class ID
*/

select * from student s
	join studentclassrel sc
		on s.Id = sc.StudentId
	join class c
		on sc.ClassId = c.Id;

/* 
- Display all majors and classes required for them  
- The MajorClassRel table is needed
*/

select * from major m
	join majorclassrel mc
		on m.Id = mc.MajorId
	join class c
		on c.id = mc.ClassId
	order by ClassId;
    
    

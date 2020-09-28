/* Example of INSERT */

INSERT student 
	(Id, Firstname, Lastname, SAT, GPA, MajorId)
VALUES
	(0, 'Jill', 'Smith', 1450, 3.75, 4);

-- Double check data was inserted correctly
SELECT * from student;

/* Example of UPDATE */

UPDATE student set 
	Firstname = "Jillian"
    where Id = 192;

-- Double check data was updated correctly
select * from student;

/* 
- Update student's GPA by 0.1 
- Applies to students that have SAT between 1000 and 1300
*/

-- Check which one will be updated
SELECT * from student
	where SAT between 1000 and 1300;

UPDATE student set 
	GPA = GPA + 0.1
    where SAT between 1000 and 1300;

/* Display a virtual column showing the new GPA of +0.1 */

SELECT s.*, (s.gpa + 0.1) as "New GPA" -- this does not affect the database
	from student s;

/*
- Update Greg Gould who changed his major to Accounting
- Update GPA to 3.51
*/

-- Find the Id for Accounting so you don't have to hard code it
SELECT Id from major m 
	where m.Description = "Accounting";
    
-- Substitute the select statement in MajorId    
UPDATE student s set 
	MajorId = (SELECT Id from major m where m.Description = "Accounting")
    where s.Id = 110;
    
-- Double check data was updated correctly 
select * from student;

/* Example of DELETE */

DELETE from student
	where FirstName = "Jill" and LastName = "Smith";

-- Double check data was deleted correctly
select * from student; 

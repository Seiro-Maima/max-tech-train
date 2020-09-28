/*
Join student table to major table
*/

SELECT *
	from student
    join major 
		on major.Id = student.MajorId;

/*
- Join student table to major table
- Show only student ID, first name, last name, GPA, and Major
- Use Alias names for tables
*/

SELECT s.Id, s.Firstname, s.Lastname, s.GPA, m.Description
	from student s -- s is an Alias name
    join major m -- m is an Alias name
		on m.Id = s.MajorId;
        
/*
- Join student table to major table
- Show only student ID, first name, last name, GPA, and Major
- Use Alias names for tables
- Add an Alias name for column "Description" 
- Show first name and last name on a single column (using concat function)
*/

SELECT s.Id, concat(s.Firstname, ' ', s.Lastname) as 'Name', s.GPA, m.Description as 'Major'
	from student s -- s is an Alias name
    join major m -- m is an Alias name
		on m.Id = s.MajorId;

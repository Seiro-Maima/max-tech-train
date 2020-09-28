/* Create your own database */
create database Bootcamp;

/* Create a table named Student */
create table Students (
	Id int not null primary key auto_increment,
    Name varchar (30) not null,
    Email varchar (100) not null,
    Phone varchar (12),
    Course varchar (10)    
);

/* Create values to insert in the table */
INSERT students
	(Id, Name, Email, Phone, Course)
	VALUES
	(0, 'Ginger Garrison', 'ginger@email.com', '5036859248', 'Java'),
    (0, 'Cinnamon Charles', 'cinnamon@email.com', '5035216952', 'C#'),
    (0, 'Paprika Pace', 'paprika@email.com', '5038547826', 'HTML/CSS'),
    (0, 'Basil Bell', 'basil@email.com', '5035678524', 'Angular');

/* Display the table to verify results */
select * from students;

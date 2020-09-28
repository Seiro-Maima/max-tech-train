/* Swap to SYS before dropping the database */
use sys;

/* If exists, drop the database */
drop database if exists BcDb;

/* Create a new database named BcDb*/
create database BcDb;

/* Switch and use this database (make it your default) */
use BcDb;

/* Create a table named Customers */
create table Customers (
	ID int not null primary key auto_increment,
    Code varchar(10) not null UNIQUE,
    Name varchar(30) not null,
    Sales decimal(9,2) not null DEFAULT 0 check (Sales >=0),
    Active bit not null DEFAULT 1,
    Created datetime not null DEFAULT CURRENT_TIMESTAMP
);

/* Insert 3 records in Customer table */
INSERT Customers
	(ID, Code, Name, Sales, Active)
	VALUES
	(0, 'NK-SH', 'Nickel Shoes', 3500.00, 1),
    (0, 'AD-SH', 'Ababa Shoes', 2500.95, 0),
    (0, 'CG-SH', 'Couger Shoes', 1000.50, 1 );
    
/* Display table to verify results */    
SELECT * from Customers;

/* Create a table named Orders */
create table Orders (
	ID int not null primary key auto_increment,
    Description varchar(30) not null,
    Total decimal(9,2) not null DEFAULT 0,
    CustomerID int not null, 
		foreign key (CustomerID) references Customers(ID)
);

/* Add 2 orders pointing to 2 different customers */
INSERT Orders
	(Description, Total, CustomerID)
	VALUES
	('Shoe Laces', 2000, 1),
    ('Shoe Soles', 3000, 2);

/* Display table to verify results */    
SELECT * from Orders;

/* Join the Customers and Orders to view both tables */
SELECT * from Customers c
	join Orders o
    where c.ID = o.CustomerID;

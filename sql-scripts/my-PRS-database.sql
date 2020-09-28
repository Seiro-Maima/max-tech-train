/* 
- Capstone Backend Database
- Database: PRS - Purchase Request Service 
*/

/* Swap to sys before dropping the database */
use sys;

/* If database already exists, drop the database */
drop database if exists PRS;

/* Create a new database named BcDb*/
create database PRS;

/* Switch and use this database (make it your default) */
use PRS;

/* Create a table named User */
create table User (
	ID int not null primary key auto_increment,
    UserName varchar(20) not null UNIQUE,
    Password varchar(10) not null,
    FirstName varchar(20) not null,
    LastName varchar(20) not null,
    PhoneNumber varchar(12) not null,
    Email varchar(75) not null,
    IsReviewer bit not null DEFAULT 0,
    IsAdmin bit not null DEFAULT 0
);

/* Insert some data in the User table */
INSERT User
	(ID, UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin)
	VALUES
	(0, 'GingerG', '123','Ginger', 'Garrison', '5036859248', 'ginger@email.com', 0, 1),
    (0, 'CinnamonC', '456', 'Cinnamon', 'Charles', '5035216952', 'cinnamon@email.com', 1, 0),
    (0, 'PaprikaP', '789', 'Paprika', 'Pace', '5038547826', 'paprika@email.com', 1, 1),
    (0, 'BasilB', '012', 'Basil', 'Bell', '5035678524', 'basil@email.com', 0, 0);

/* Display table to verify results */    
SELECT * from User;

/* -- Insert a row with an already used username - this should fail
INSERT User
	(ID, UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin)
	VALUES
	(0, 'GingerG', '123','Ginger', 'Graham', '5039576241', 'graham@email.com', 0, 1);
*/

/* Create a table named Vendor */
create table Vendor (
	ID int not null primary key auto_increment,
    Code varchar(10) not null UNIQUE,
    Name varchar(255) not null,
    Address varchar(255) not null,
    City varchar(255) not null,
    State varchar(2) not null,
    Zip varchar(5) not null,
    PhoneNumber varchar(12)  not null,
    Email varchar(100) not null
);

/* Insert some data in the Vendor table */
INSERT Vendor
	(ID, Code, Name, Address, City, State, Zip, PhoneNumber, Email)
	VALUES
    (0, 'NCK', 'Nickel Shoes', '123 Coin St', 'Beaverton', 'OR', '97005', '9715846255', 'Nickels@company.com'),
	(0, 'ABB', 'Ababa Shoes', '123 Ali St', 'Aloha', 'OR', '97005', '9719586985', 'Ababa@company.com'),
    (0, 'TRL', 'Trailers Shoes', '123 Road St', 'Hillsboro', 'OR', '97123', '9713201458', 'Trailers@company.com'),
    (0, 'RVS', 'Reverse Shoes', '123 Random St', 'Hillsboro', 'OR', '97129', '9719632587', 'Reverse@company.com');
    
/* Display table to verify results */    
SELECT * from Vendor;  

/* Create a table named Product */
create table Product (
	ID int not null primary key auto_increment,
    VendorID int not null,
		foreign key (VendorID) references Vendor(ID),
    PartNumber varchar(50) not null,
	Name varchar(150) not null,
    Price decimal(10,2) not null,
    Unit varchar(255),
    PhotoPath varchar(255),
    constraint vendor_part UNIQUE (VendorID, PartNumber) 
    -- constraint will make sure that the combo of a specific VendorID and PartNumber is unique
);

/* Insert some data in the Product table */
INSERT Product
	(VendorID, PartNumber, Name, Price, Unit, PhotoPath)
	VALUES
    (2, 'PN-154635', 'Shoe Laces', 5, '10', 'C:\images'),
	(2, 'PN-652165', 'Soles', 10, '20', 'C:\photo'),
    (3, 'PN-987456', 'Inserts', 20, '30', 'C:\pix'),
    (1, 'PN-524874', 'Chains', 30, '40', 'C:\images');
    
/* Display table to verify results */    
SELECT * from Product; 

/* -- Insert a row that has same VendorID and PartNumber - this should fail
INSERT Product
	(ID, VendorID, PartNumber, Name, Price, Unit, PhotoPath)
	VALUES
    (0, 2, 'PN-154635', 'Shoe Laces', 5, '10', 'C:\images');
*/

/* Create a table named Request */
create table Request (
	ID int not null primary key auto_increment,
    UserID int not null,
		foreign key (UserID) references User(ID),
    Description varchar(100) not null,
    Justification varchar(255) not null,
    -- DateNeeded date not null,						*DOUBLE CHECK THIS!
    DateNeeded DateTime not null DEFAULT CURRENT_TIMESTAMP,
    DeliveryMode varchar(25) not null DEFAULT "Pickup",
    Status varchar(20) not null DEFAULT 'New',
    Total decimal(10,2) not null,
    -- SubmittedDate date not null,  						*DOUBLE CHECK THIS!
    SubmittedDate DateTime not null DEFAULT CURRENT_TIMESTAMP,
    ReasonForRejection varchar(100)
);

/* Insert some data in the Request table */
INSERT Request
	(UserID, Description, Justification, DateNeeded, DeliveryMode, Total, SubmittedDate)
	VALUES
    (1, 'Need a new chair', 'Chair broke', '2010-06-10', 'UPS', 300.00, '2010-06-10'),
    (2, 'Need a new desk', 'Desk broke', '2010-06-10', 'UPS', 300.00, '2010-06-10'),
    (4, 'Need a new laptop', 'Laptop broke', '2010-06-10', 'UPS', 300.00, '2010-06-10'),
    (3, 'Need a new mouse', 'Cat broke', '2010-06-10', 'UPS', 300.00, '2010-06-10');

/* Display table to verify results */    
SELECT * from Request; 

/* Create a table named LineItem */
create table LineItem (
	ID int not null primary key auto_increment,
    RequestID int not null,
		foreign key (RequestID) references Request(ID),
    ProductID int not null,
		foreign key (ProductID) references Product(ID),        
    Quantity int not null default 1,
    Constraint req_pdt UNIQUE (RequestID, ProductID)
);

/* Insert some data in the LineItem table */
INSERT LineItem
	(RequestID, ProductID, Quantity)
	VALUES
    (2, 1, 25),
    (1, 2, 1),
    (1, 3, 1);

/* Display table to verify results */    
SELECT * from LineItem; 

/* If user exists, drop it */
DROP USER IF EXISTS prs_user@localhost;

/* Create new user */
CREATE USER prs_user@localhost IDENTIFIED BY 'sesame';

/* User will not be able to create, alter or drop */
GRANT SELECT, INSERT, DELETE, UPDATE ON PRS.* TO prs_user@localhost;

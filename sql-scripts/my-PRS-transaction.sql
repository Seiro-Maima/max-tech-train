/* Example of Transaction */

-- Display User table
select * from user;

-- Start the transaction. Rolling back will remove anything after this line
START Transaction;

-- Insert values in the User table
INSERT User(UserName, Password, FirstName, LastName, PhoneNumber, Email)
	VALUES ('XX', 'XX', 'XX', 'XX', 'XX', 'XX');

-- Display User table to see the newly inserted value    
select * from user;

-- Erase all recently added values after Transaction start    
ROLLBACK;

-- Display User table to see that Rollback erased the recently added values
select * from user;

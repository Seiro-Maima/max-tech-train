/* Join and display all tables from the PRS database */
SELECT r.Description, r.DeliveryMode, r.Status, r.Total,
		p.Name, p.Price, l.quantity, 
        (p.price * l.quantity) as 'Subtotal',
        concat(u.FirstName, ' ', u.LastName) as 'Name', u.Email, u.PhoneNumber
	from request r
	join lineItem l on l.RequestID = r.ID
    join product p on p.ID = l.ProductID
    join vendor v on v.ID = p.VendorID
    join user u on u.ID = r.UserID;
    
/* Display the order description and total amount */
SELECT r.description, sum(p.price * l.quantity) as 'Total'
	from request r
	join lineItem l on l.RequestID = r.ID
    join product p on p.ID = l.ProductID
    join vendor v on v.ID = p.VendorID
    join user u on u.ID = r.UserID
	group by r.Description; -- group data by description    
    

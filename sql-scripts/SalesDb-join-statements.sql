/*
Show all customers that have sales < 10000
*/

SELECT *
	from customers
    where sales < 10000;

/*
- Show all customers that have sales >= 30000 and sales < 40,000
- Customers only in Cincinnati
*/

SELECT *
	from customers
    where (sales >= 30000 and sales < 40000 and City = 'Cincinnati');

/*
- Join view between order and customer
- List all columns and rows in both tables
*/

SELECT * 
	from customers c
    join orders o
		on c.Id = o.CustomerId;

/*
- Join the order and order line tables
- PK (primary key) on orders and FK (foreign key) on orderlines
- Show all columns and rows
*/

SELECT * 
	from orders o
    join orderlines ol
		on o.Id = ol.OrdersId;

/*
Show all orders and customers and order lines
*/

SELECT * 
	from orders o
    join orderlines ol
		on o.Id = ol.OrdersId
	join customers c
		on c.Id = o.CustomerId;

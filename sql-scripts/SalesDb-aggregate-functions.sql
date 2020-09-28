/*
Show how many rows are in the table
*/

SELECT count(id) from customers;
-- count where id has a value that isn't null

/*
Show total of sales from all customers
*/

SELECT sum(sales) from customers;

/*
Show total of sales grouped by each city
*/

SELECT city, sum(sales) 
	from customers
    group by city;
-- city can be used next to SELECT with "group by" since it's grouped by city

/*
Show total of sales grouped by each city in specified state of Ohio
*/

SELECT city, sum(sales) 
	from customers
    group by city, state
    having state = 'OH';
    
/*
Show total of sales grouped by two cities (Cincinnati and Columbus)
*/    

SELECT city, sum(sales) 
	from customers
    group by city, state
    having city = 'Cincinnati' or city = 'Columbus';
-- having city in ('Cincinnati', 'Columbus') this can also be used instead

/*
Show cities where sales > 600,000
*/

SELECT *
	FROM customers
    where sales > 600000;
-- value will be 0. This isn't correct since its looking at each row

SELECT city, sum(sales) 
	from customers
    group by city, state
    having sum(sales) > 600000;


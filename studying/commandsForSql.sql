SELECT company_name
FROM suppliers
WHERE country IN ('Argentina', 'Spain', '')

SELECT DISTINCT country
FROM customers

SELECT DISTINCT suppliers.company_name
FROM suppliers
JOIN customers USING(country)

SELECT category_name, SUM (units_in_stock)
FROM products
INNER JOIN categories USIGN (category_id)
GROUP BY category_name
ORDER BY SUM(units_in_stock) DESC
LIMIT (SELECT MIN(product_id) + 4 FROM products)

SELECT AVG(units_in_stock)
FROM products

SELECT product_name, units_in_stock
FROM products
WHERE units_in_stock > (SELECT AVG (units_in_stock)
					                FROM products)

SELECT company_name, contact_name
FROM customers
WHERE EXISTS (SELECT customer_id FROM orders
			  WHERE customer_id = customers.customer_id
			  AND freight BETWEEN 50 AND 100)

SELECT company_name, contact_name
FROM customers
WHERE EXISTS (SELECT customer_id FROM orders
			  WHERE customer_id = customers.customer_id)
			  AND order_date BETWEEN '1995-02-01' AND '1995-02-15'

SELECT product_name
FROM products
WHERE NOT EXISTS (SELECT orders.order_id FROM orders
				  JOIN order_details USING(order_id)
				  WHERE order_details.product_id = product_id
				  AND order_date BETWEEN '1995-02-01' AND '1995-02-15')

SELECT DISTINCT company_name
FROM customers
JOIN orders USING(customer_id)
JOIN order_details USING(order_id)
WHERE quantity > 40

SELECT customer_id
FROM orders
JOIN order_details USING (order_id)
WHERE quantity > 40

SELECT DISTINCT company_name
FROM customers
WHERE customer_id = ANY(
	SELECT customer_id
	FROM orders
	JOIN order_details USING (order_id)
	WHERE quantity > 40
)

SELECT AVG(quantity)
FROM order_details

SELECT DISTINCT product_name, quantity
FROM products
JOIN order_details USING(product_id)
WHERE quantity > (
	SELECT AVG(quantity)
	FROM order_details
)
ORDER BY quantity

SELECT AVG(quantity)
FROM order_details
GROUP BY product_id

SELECT DISTINCT product_name, quantity
FROM products
JOIN order_details USING (product_id)
WHERE quantity > ALL (SELECT AVG(quantity)
					  FROM order_details
					  GROUP BY product_id)

SELECT AVG(quantity)
FROM order_details
GROUP BY product_id

SELECT product_name, units_in_stock
FROM products
WHERE units_in_stock < ALL (
	SELECT AVG(quantity)
	FROM order_details
	GROUP BY product_id
)
ORDER BY units_in_stock DESC;

SELECT customer_id, SUM(freight) AS freight_sum
FROM orders AS o
INNER JOIN (SELECT customer_id, AVG(freight) AS freight_avg
			FROM orders
			GROUP BY customer_id) oa
USING (customer_id)
WHERE freight > freight_avg AND shipped_date BETWEEN '1996-07-16' AND '1996-07-31'
GROUP BY customer_id
ORDER BY freight_sum;

SHOW TABLES

SELECT customer_id, ship_country, order_price
FROM orders
JOIN (SELECT order_id, SUM(unit_price * quantity - unit_price * quantity * discount) AS order_price
					 FROM order_details
					 GROUP BY order_id) AS od
USING(order_id)
WHERE ship_country IN('Argentina', 'Bolivia', 'Chile', 'Colombia', 'Ecuador', 'Guyana', 'Paraguay',
					 'Peru', 'Suriname', 'Uruguay', 'Venezuela')
AND order_date >= '1997-09-01'
ORDER BY order_price DESC
LIMIT 3;


SELECT DISTINCT product_name, quantity
FROM products
JOIN order_details USING(product_id)
WHERE quantity = 10;


SELECT *
FROM categories

SELECT *
FROM customers
ORDER BY postal_code ASC, phone DESC

INSERT INTO customers(customer_id, company_name, contact_name, contact_title, address, city, region, postal_code, country, phone, fax)
VALUES ('1', '2', '3' , '4', '5', '6', '7', '8', '9', '10', '11' )

SELECT *
FROM customers
WHERE region IS NOT NULL and fax IS NOT NULL AND postal_code IS NOT NULL

UPDATE customers
SET company_name = 'geig', contact_name = 'mrtomr'
WHERE customer_id = 'ALFKI'

UPDATE customers
SET company_name = 'tor'
WHERE country = 'Mexico'

SELECT MIN(customer_id)
FROM customers

SELECT MAX(customer_id)
FROM customers

SELECT COUNT(region)
FROM customers

SELECT AVG(postal_code)
FROM customers

SELECT *
FROM customers
WHERE company_name LIKE 'A%'

SELECT *
FROM customers
WHERE country IN ('Mexico')

SELECT *
FROM orders
WHERE employee_id BETWEEN 3 AND 6
ORDER BY employee_id ASC

























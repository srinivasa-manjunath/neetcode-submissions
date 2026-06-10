-- Write your query below

select name from customers as C
left join orders on C.id = orders.customer_id
where customer_id is null;
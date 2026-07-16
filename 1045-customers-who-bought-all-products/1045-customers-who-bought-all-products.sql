select customer_id
from Customer
group by customer_id
having count(distinct product_key ) =
(
    select COUNT(DISTINCT product_key)
    from Product
);

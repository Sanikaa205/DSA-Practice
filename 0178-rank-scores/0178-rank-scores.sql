# Write your MySQL query statement below

SELECT score ,
dense_rank() OVER (order by score desc) as 'rank' 
FROM SCORES

#RANK() → Same rank for ties, skips the next rank.
#DENSE_RANK() → Same rank for ties, does not skip ranks.
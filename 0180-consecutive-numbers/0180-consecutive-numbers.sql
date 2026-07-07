# Write your MySQL query statement below
SELECT DISTINCT num as ConsecutiveNums
FROM(
    SELECT num,
           LAG(num)OVER(ORDER BY id)as prev_num,
           LEAD(num)OVER(ORDER BY id)as next_num
    FROM Logs
)t   #temporary name of table (for alias)
WHERE num = prev_num
AND num = next_num;
select d.name as Department ,
       e.name Employee,
       e.salary as Salary
from Employee e
join Department d
on e.departmentId = d.id
join(
    select departmentId,
           max(salary) as maxsalary
    from Employee
    group by departmentId 
)t
where e.departmentId = t.departmentId
and salary = maxsalary;

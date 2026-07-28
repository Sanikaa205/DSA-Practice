select i.unique_id,
       e.name
from Employees e
left join EmployeeUNI i
on i.id = e.id


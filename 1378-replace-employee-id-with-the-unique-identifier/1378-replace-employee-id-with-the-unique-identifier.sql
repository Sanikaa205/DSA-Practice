select unique_id,
       name
from Employees e
left join EmployeeUNI i
on i.id = e.id


select i.unique_id,
       e.name
from EmployeeUNI i
right join Employees e
on i.id = e.id


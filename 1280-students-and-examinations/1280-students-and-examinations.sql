select s.student_id,s.student_name,u.subject_name,count(e.student_id) as attended_exams
from Students s
cross join Subjects u
left join Examinations e
on e.student_id = s.student_id
and u.subject_name = e.subject_name
group by 
    s.student_id,
    s.student_name,
    u.subject_name
order by 
    student_id,
    subject_name;
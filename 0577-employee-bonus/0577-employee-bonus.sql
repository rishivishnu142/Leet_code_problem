# Write your MySQL query statement below
select employee.name,Bonus.bonus from employee left join Bonus on Employee.empid=Bonus.empid where Bonus.bonus < 1000 or Bonus.bonus is Null;
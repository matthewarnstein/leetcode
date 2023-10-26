-- Write your PostgreSQL query statement below
select employee_id,(substring(name, 1, 1)<>'M' and employee_id%2=1)::integer*salary as bonus from Employees order by employee_id asc;

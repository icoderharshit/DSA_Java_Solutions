# Write your MySQL query statement below
# Select MAX(Salary) as SecondHighestSalary from Employee where Salary<(Select MAX(Salary) from Employee);
# Let's try another approach using LIMIT clause :-p

Select (Select DISTINCT Salary from Employee Order By Salary DESC LIMIT 1 OFFSET 1) AS SecondHighestSalary;
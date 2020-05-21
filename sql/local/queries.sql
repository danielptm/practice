-- Select #1
select FIRST_NAME as "First name", LAST_NAME as "Last name" from employees;

-- Select #2
select COUNT(DISTINCT DEPARTMENT_ID) from employees;

-- select #3
SELECT * FROM employees ORDER BY FIRST_NAME DESC;

-- select #4
SELECT FIRST_NAME, LAST_NAME, SALARY * .15 from employees ORDER BY FIRST_NAME ASC; 

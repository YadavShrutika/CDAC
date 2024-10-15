use company_db;

select * from s order by City desc;

select * from p order by City ASC,Pname ASC;

select * from s where status between 10 and 20;

select Pname,weight from P where weight not between 10 and 15;

SELECT Pname FROM P
WHERE Pname LIKE 'S%';

select * from S where City like 'L%';

select * from J where Jname like '_n%';

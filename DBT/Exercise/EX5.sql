SELECT S.Sname, SPJ.Qty
FROM S
JOIN SPJ ON S.`S#` = SPJ.`S#`;

SELECT P.Pname, SPJ.Qty
FROM P
JOIN SPJ ON P.`P#` = SPJ.`P#`;

SELECT J.Jname, SPJ.Qty
FROM J
JOIN SPJ ON J.`J#` = SPJ.`J#`;


SELECT S.Sname, P.Pname, J.Jname, SPJ.Qty
FROM S
JOIN SPJ ON S.`S#` = SPJ.`S#`
JOIN P ON P.`P#` = SPJ.`P#`
JOIN J ON J.`J#` = SPJ.`J#`;

SELECT S.Sname, J.Jname, P.Pname
FROM S
JOIN SPJ ON S.`S#` = SPJ.`S#`
JOIN P ON P.`P#` = SPJ.`P#`
JOIN J ON J.`J#` = SPJ.`J#`
WHERE S.City = J.City;


SELECT P.Pname, SPJ.Qty
FROM P
JOIN SPJ ON P.`P#` = SPJ.`P#`
WHERE P.Color = 'Red';


SELECT S.Sname, SPJ.Qty
FROM S
JOIN SPJ ON S.`S#` = SPJ.`S#`
WHERE S.Status = 20;


SELECT P.Pname, SPJ.Qty
FROM P
JOIN SPJ ON P.`P#` = SPJ.`P#`
WHERE P.Weight > 14;


SELECT J.Jname, J.City, SUM(SPJ.Qty) AS TotalParts
FROM J
JOIN SPJ ON J.`J#` = SPJ.`J#`
GROUP BY J.Jname, J.City
HAVING SUM(SPJ.Qty) > 500;

SELECT P.Pname, SPJ.Qty
FROM P
JOIN SPJ ON P.`P#` = SPJ.`P#`
WHERE P.Weight < 15;

SELECT E1.EMPNAME AS Employee, E2.EMPNAME AS Manager
FROM SEMP E1
LEFT JOIN SEMP E2 ON E1.DEPTHEAD = E2.EMPNO;

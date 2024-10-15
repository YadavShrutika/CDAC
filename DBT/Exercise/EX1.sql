CREATE DATABASE company_db;
USE company_db;

CREATE TABLE SEMP (
    EMPNO CHAR(4),
    EMPNAME CHAR(20),
    BASIC FLOAT,
    DEPTNO CHAR(2),
    DEPTHEAD CHAR(4)
);

CREATE TABLE SDEPT (
    DEPTNO CHAR(2),
    DEPTNAME CHAR(15)
);

INSERT INTO SDEPT (DEPTNO, DEPTNAME)
VALUES ('10', 'Development'),
       ('20', 'Training');
       
SELECT * FROM SDEPT;
       


INSERT INTO SEMP (EMPNO, EMPNAME, BASIC, DEPTNO, DEPTHEAD)
VALUES ('0001', 'SUNIL', 6000, '10', NULL),
       ('0002', 'HIREN', 8000, '20', NULL),
       ('0003', 'ALI', 4000, '10', '0001'),
       ('0004', 'GEORGE', 6000, NULL, '0002');


CREATE TABLE S (
    `S#` CHAR(2),
    Sname CHAR(20),
    Status INT,
    City CHAR(15)
);

CREATE TABLE P (
    `P#` CHAR(2),
    Pname CHAR(20),
    Color CHAR(10),
    Weight FLOAT,
    City CHAR(15)
);

CREATE TABLE J (
    `J#` CHAR(2),
    Jname CHAR(20),
    City CHAR(15)
);


CREATE TABLE SPJ (
    `S#` CHAR(2),
    `P#` CHAR(2),
    `J#` CHAR(2),
    Qty INT
);

INSERT INTO S (`S#`, Sname, Status, City)
VALUES ('S1', 'Supplier1', 10, 'London'),
       ('S2', 'Supplier2', 20, 'Paris'),
       ('S3', 'Supplier3', 30, 'Athens');

INSERT INTO P (`P#`, Pname, Color, Weight, City)
VALUES ('P1', 'Part1', 'Red', 13.5, 'London'),
       ('P2', 'Part2', 'Blue', 14.2, 'Paris'),
       ('P3', 'Part3', 'Green', 12.0, 'Athens');

INSERT INTO J (`J#`, Jname, City)
VALUES ('J1', 'Project1', 'London'),
       ('J2', 'Project2', 'Paris'),
       ('J3', 'Project3', 'Athens');


INSERT INTO SPJ (`S#`, `P#`, `J#`, Qty)
VALUES ('S1', 'P1', 'J1', 100),
       ('S2', 'P2', 'J2', 200),
       ('S3', 'P3', 'J3', 150);

SELECT * FROM S;

SELECT `S#`, Sname FROM S;

SELECT `S#`, Sname FROM S;

SELECT Pname, Color FROM P WHERE City = 'London';

SELECT * FROM S WHERE City = 'London';

SELECT * FROM S WHERE City = 'Paris' OR City = 'Athens';

SELECT * FROM J WHERE City = 'Athens';

SELECT Pname FROM P WHERE Weight BETWEEN 12 AND 14;

SELECT * FROM S WHERE Status >= 20;

SELECT * FROM S WHERE City != 'London';

SELECT DISTINCT City FROM S;

SELECT Pname, 
       Weight AS Grams, 
       Weight * 1000 AS Milligrams, 
       Weight / 1000 AS Kilograms 
FROM P;

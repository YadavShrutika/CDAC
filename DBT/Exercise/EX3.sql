use  company_db;

select concat(upper(left(Sname,1)), lower(substring(Sname,2))) as CapitalizedName from s;

select upper(Sname) as UpperCaseName from s;

select lower(Sname) as LowerCaseName from s;

select lpad(Sname,25,' ') as PaddedName from s;

select replace(Sname,'li','ro') as ReplacedName from s;

select replace(replace(Sname,'l','r'),'a','o') as ReplacedLetters from s;

select Sname,length(Sname) as Namelength from s;

SELECT * FROM S
WHERE SOUNDEX(Sname) = SOUNDEX('BLOKE');

select Sname,
case
when Status = 10 then 'Ten'
when Status = 20 then 'Twenty'
when Status = 30 then 'Thirty'
else 'other'
end as 'StatusName'
from s;

select dayname(curdate()) as CurrentDay;
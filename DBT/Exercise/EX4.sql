use company_db;

select min(Status) as MinStatus from s;

select max(weight) as MaxWeight from p;

select avg(weight) as AvgWeight from p;

select sum(qty) as TotalQuantitySold from SPJ where 'P#' = 'P1';

select 'P#',sum(qty) as TotalQuantitySold from SPJ group by 'P#';
 
 select 'P#',avg(qty) as AvgQuantitySold from SPJ group by 'P#';
 
 select 'P#',max(qty) as MaxQuantitySold from SPJ group by 'P#' having max(qty)>800;
 
 select Status,count(*) as SupplierCount from s group by Status;
 
 select City,count(*)  as ProjectCount from j group by City;
 
 select 
 case
 when Status = 10 then 'Ten'
 when Status = 20 then 'Twenty'
 when Status = 30 then 'Thirty'
 else 'other'
 end as StatusName,
count(*) as Count
 from s
 group by Status;
 
 
 
 
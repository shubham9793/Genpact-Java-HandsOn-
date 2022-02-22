CREATE database Bank;
use Bank;

Create Table Bank (
Cust_Id int,
Cust_Name varchar(25),
Cust_Accountno int,
Avl_Balance int,
phoneNo int 
);

Desc Bank;


Insert Into Bank(cust_Id,Cust_Name,Cust_Accountno,Avl_Balance,phoneNo)
value(2010,"Shubham",7204,10000,7896),
(2011,"Akash",5236,15000,9660),
(2012,"Rahul",5263,25000,9874);

Select * from Bank;



create table Employee (
employeeId integer,
name varchar(255),
age integer,
bdate timestamp,
primary key(employeeId )
);
INSERT INTO Employee VALUES(1, 'Shivam',23,sysdate());
INSERT INTO Employee VALUES(2, 'Anuj',22,sysdate());
INSERT INTO Employee VALUES(3, 'Ujjwal',24,sysdate());
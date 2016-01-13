

ALTER TABLE Employee
ADD 
	religionId  INT ;
	
EXEC sp_RENAME 'Employee.religious' , 'religionName', 'COLUMN';
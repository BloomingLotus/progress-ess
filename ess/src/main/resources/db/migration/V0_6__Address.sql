-- start with employee 

create table address (
	id				BIGINT IDENTITY(1, 1) not null,
	addressNo		nvarchar(50),
	moo				nvarchar(50),
	villageName				nvarchar(50),
	buildingName		nvarchar(50),
	roomNo			nvarchar(50),
	floor			nvarchar(50),
	soiName				nvarchar(50),
	roadName		nvarchar(50),
	tambon		nvarchar(50),
	amphur		nvarchar(50),
	province 		nvarchar(50),
	postCode		nvarchar(30),
	country			nvarchar(50),	
	PRIMARY KEY (id),
);

alter table Employee ADD 
	registered_address_id BIGINT NULL,
	current_address_id BIGINT NULL ;
	
ALTER TABLE Employee
ADD CONSTRAINT FK_Employee_RegAddress FOREIGN KEY (registered_address_id) 
    REFERENCES Address (id); 

ALTER TABLE Employee
ADD CONSTRAINT FK_Employee_CurAddress FOREIGN KEY (current_address_id) 
    REFERENCES Address (id);
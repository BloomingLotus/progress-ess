

create table changeRequest (
	id						BIGINT IDENTITY(1, 1) not null,
	oldChangeSet				ntext,
	newChangeSet				ntext,
	domain					nvarchar(255),
	currentState			nvarchar(255),
	CreatedBy_Employee_ID 	BIGINT,
	createdTime				DATETIME,
	LastUpdateddBy_Employee_ID 	BIGINT,
	lastUpdatedTime				DATETIME,
	PRIMARY KEY (id)
);

ALTER TABLE changeRequest
ADD CONSTRAINT FK_req_employee FOREIGN KEY (CreatedBy_Employee_ID) 
    REFERENCES Employee (id); 

create table changeRequestLog (
	id					BIGINT IDENTITY(1, 1) not null,
	ChangeRequest_ID	BIGINT,
	EMPLOYEE_ID			BIGINT,
	timestamp			DATETIME,
	Remark				nvarchar(255),
	toState				nvarchar(255),
	PRIMARY KEY (id)
);

	
ALTER TABLE changeRequestLog
ADD CONSTRAINT FK_reqLog_employee FOREIGN KEY (EMPLOYEE_ID) 
    REFERENCES Employee (id); 

ALTER TABLE changeRequestLog
ADD CONSTRAINT FK_reqLog_req FOREIGN KEY (ChangeRequest_ID) 
    REFERENCES changeRequest (id);
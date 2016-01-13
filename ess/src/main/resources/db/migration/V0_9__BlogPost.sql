create table WEB_BLOGPOST (
	id						BIGINT IDENTITY(1, 1) not null,
	text				ntext,
	title				nvarchar(1024),
	tag					nvarchar(1024),
	CreatedBy_Emp_ID 	BIGINT,
	createdTime				DATETIME,
	LastUpdatedBy_Emp_ID 	BIGINT,
	lastUpdatedTime				DATETIME,
	PRIMARY KEY (id)
);

ALTER TABLE WEB_BLOGPOST
ADD CONSTRAINT FK_BLOGPOST_CREATED_employee FOREIGN KEY (CreatedBy_Emp_ID) 
    REFERENCES Employee (id); 
    
ALTER TABLE WEB_BLOGPOST
ADD CONSTRAINT FK_BLOGPOST_LASTUPDATED_employee FOREIGN KEY (LastUpdatedBy_Emp_ID) 
    REFERENCES Employee (id); 
-- start with employee 

create table employee (
	id				BIGINT not null,
	thFirstName 	nvarchar(100),
	thLastName 		nvarchar(100),
	enFirstName 	nvarchar(100),
	enLastName 		nvarchar(100),
	PRIMARY KEY (id)
);
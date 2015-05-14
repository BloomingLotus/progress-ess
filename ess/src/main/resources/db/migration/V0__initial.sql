-- start with employee 

create table employee (
	id				BIGINT IDENTITY(1, 1) not null,
	thFirstName 	varchar(100),
	thLastName 		varchar(100),
	enFirstName 	varchar(100),
	enLastName 		varchar(100),
	PRIMARY KEY (id)
);
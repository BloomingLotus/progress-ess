-- start with employee 

create table sec_user (
	id				BIGINT IDENTITY(1, 1) not null,
	login 			varchar(100) not null,
	password 		varchar(100) not null,
	emp_id			BIGINT not null,
	PRIMARY KEY (id),
	FOREIGN KEY (emp_id) REFERENCES employee(id));
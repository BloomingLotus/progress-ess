-- start with employee 

create table sec_user (
	id				BIGINT not null,
	login 			varchar(100) not null,
	password 		varchar(100) not null,
	emp_id			BIGINT not null,
	PRIMARY KEY (id),
	FOREIGN KEY (emp_id) REFERENCES employee(id));

create sequence sec_user_seq;
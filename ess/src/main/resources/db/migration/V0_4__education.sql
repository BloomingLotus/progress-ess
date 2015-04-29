-- start with employee 

create table education (
	id				BIGINT not null,
	index			INT,
	yearBegin		INT,
	yearEnd			INT,
	instituteName	varchar(200),
	degree 		varchar(100),
	faculty 	varchar(100),
	major 		varchar(100),
	gpa			NUMBER(4, 3),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT EDU_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create sequence education_seq;
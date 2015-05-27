-- start with employee 

create table education (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	yearBegin		INT,
	yearEnd			INT,
	instituteName	nvarchar(200),
	degree 		nvarchar(100),
	faculty 	nvarchar(100),
	major 		nvarchar(100),
	gpa			decimal(4, 3),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT EDU_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);
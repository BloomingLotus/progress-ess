-- start with employee 

 
alter table WorkExp MODIFY endDate timestamp;
alter table WorkExp MODIFY beginDate timestamp;

alter table certified MODIFY certifiedDate timestamp;
alter table certified MODIFY certifiedExpired timestamp;


drop table emergencycontact;

create table emergencycontact (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	FirstName		varchar(200),
	LastName		varchar(200),
	relation		varchar(2000),
	phone			varchar(2000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT EMERCONTACT_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);
-- start with employee 

create table computerexp (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	programlang		nvarchar(200),
	certificate		nvarchar(200),
	certificateName	nvarchar(200),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT COMEXP_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table training (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	beginDate		datetime,
	endDate			datetime,
	instituteName	nvarchar(200),
	courseName nvarchar(200),
	detail			nvarchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT TRAINING_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table workexp (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	beginDate		datetime,
	endDate			datetime,
	workplaceName	nvarchar(200),
	length			nvarchar(100),
	title			nvarchar(200),
	detail			nvarchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT WORKEXP_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table certified (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	certifiedDate		datetime,
	certifiedExpired	datetime,
	instituteName		nvarchar(200),
	certificateName		nvarchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT CERTIFIED_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);


create table family (
	id				BIGINT IDENTITY(1, 1) not null,
	spouseFirstName		nvarchar(200),
	spouseLastName		nvarchar(200),
	totalChildren		INT,
	totalChildrenInEdu	INT,
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT FAMILY_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table emergencycontact (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	FirstName		nvarchar(200),
	LastName		nvarchar(200),
	relation		nvarchar(2000),
	phone			nvarchar(2000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT EMERCONTACT_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table projectOnHand (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	projectName		nvarchar(1000),
	projectDetail	nvarchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT PROJONHAND_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);


-- start with employee 

create table computerexp (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	programlang		varchar(200),
	certificate		varchar(200),
	certificateName	varchar(200),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT COMEXP_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table training (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	beginDate		date,
	endDate			date,
	instituteName	varchar(200),
	detail			varchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT TRAINING_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table workexp (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	beginDate		date,
	endDate			date,
	workplaceName	varchar(200),
	length			varchar(100),
	title			varchar(200),
	detail			varchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT WORKEXP_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table certified (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	certifiedDate		date,
	certifiedExpired	date,
	instituteName		varchar(200),
	certifiedName			varchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT CERTIFIED_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);


create table family (
	id				BIGINT IDENTITY(1, 1) not null,
	spouseFirstName		date,
	spouseLastName		date,
	totalChildren		INT,
	totalChildrenInEdu	INT,
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT FAMILY_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table emergencycontact (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	FirstName		date,
	LastName		date,
	relation		varchar(2000),
	phone			varchar(2000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT EMERCONTACT_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);

create table projectOnHand (
	id				BIGINT IDENTITY(1, 1) not null,
	"index"			INT,
	projectName		varchar(1000),
	projectDetail	varchar(1000),
	emp_id		BIGINT not null,
	PRIMARY KEY (id),
	CONSTRAINT PROJONHAND_EMP_FK FOREIGN KEY(emp_id) REFERENCES Employee(id)
);


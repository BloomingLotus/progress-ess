-- start with employee 

 
alter table TRAINING MODIFY endDate timestamp;
alter table TRAINING MODIFY beginDate timestamp;

alter table TRAINING add (
	courseName varchar(200)
);
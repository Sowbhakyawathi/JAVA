/*DDL	- Data Definition Language*/

create database employeemgmt;

create table emploee (id int, name varchar(100), phone varchar(10), email varchar(100),
address1 varchar(100), address2 varchar(100), city varchar(100), state varchar(100));

alter table emploee modify phone numeric(10);

alter table emploee modify pin numeric(6);

alter table emploee rename column phone to phone_no;

alter table emploee add (country varchar(100), pin int);

alter table emploee add (DOB date);

alter table emploee add (pin int);

alter table emploee drop column pin;

drop table emploee;

Insert into emploee (id, name, phone_no, email, address1, address2, city, state, country, pin, dept_id) 
values (1, 'Thiru', 9758593823, 'thiru@gmail.com', '17/7', 'dsdfsd', 'Chennai', 'TamilNadu', 'India', '600064', 101); 

Insert into emploee (id, name, phone_no, email, address1, address2, city, state, country, pin, dept_id) 
values (3, 'Raj', 9876512430, 'Raj@gmail.com', '323', 'sdffgdf', 'Tuticorin', 'TamilNadu', 'India', '628008', 102),
 (4, 'Rajan', 9754245903, 'rajan@gmail.com', '12/1A', ';fdlkgdf;gdf', 'Madurai', 'TamilNadu', 'India', '651002', 101);


select * from emploee;

update emploee set dob = '1985-06-01'
where id = 4;

delete from emploee where id=4;

truncate table emploee;

select * from emploee
where id <> 1;


select * from emploee
where name like '%j%';

select * from emploee
where id between 1 and 3;

select * from emploee
where dob between '1987-04-28' and '1990-06-28';

select * from emploee
where id in (1,2,3);

select * from emploee
order by id asc;

select * from emploee
order by name desc;

select * from emploee
where id in (2,3,4) and phone_no = '9876512430';


select * from emploee
where id in (2,4) or phone_no = '9876512430';

select * from emploee
where id not in (2,3) and phone_no = '9876512430';



select * from emploee
 order by id desc
limit 2;

select Min(id) from emploee;
select MAX(id) from emploee;
select count(*) from emploee
where id in (1,2);
select sum(id) from emploee;
select AVG(id) average from emploee;

select * from emploee;

create table department(id int, name varchar(100));
select * from department;

insert into department (id,name) values (101, 'CSE');
insert into department (id,name) values (102, 'Mech');
insert into department (id,name) values (103, 'ECE');


select e.id, e.name, e.dept_id, d.name  from emploee e
inner join department d
on e.dept_id = d.id;
/*and e.dept_id = d.id;*/

select * from department d
left join emploee e
on d.id = e.dept_id;

select * from emploee e
right join department d
on d.id = e.dept_id;

select * from emploee e
full outer join department d 
on d.id = e.dept_id;


select e1.city from emploee e1, emploee e2
where
 /*e1.id <> e2.id and*/
 e1.address1 = e2.address1;

 select * from emploee
 union
 select * from emploee;
 
 select * from emploee
 union ALL
 select * from emploee;

update emploee set dept_id = 102 where id = 3;

select dept_id, city, count(dept_id) from emploee
group by dept_id, city;

select * from emploee; 

select dept_id, count(dept_id) from emploee
group by dept_id
having count(dept_id) > 1;

select id from department
	where exists (select dept_id from emploee
    where dept_id=101);

select * into employee
 from emploee;
 
 Insert into employee 
	select * from emploee;
    
create table person (id int PRIMARY KEY, Lastname varchar(100) not null, firstname varchar(100) not null, age int);

create table person (id int PRIMARY KEY, Lastname varchar(100), firstname varchar(100) not null, age int);

Alter table emploee add constraint pk_employee primary key (id);

Alter table emploee drop primary key;

alter table department add constraint pk_dept primary key (id);

Alter table emploee add foreign key (dept_id) references department(id);



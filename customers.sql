-- drop the databsae if exists
drop database if exists acme;

-- create the database
-- create data base if not exists
create database acme;

-- print statement
select "Created database acme" as message;

-- select the database
use acme;

-- create the tables
create table employees(
    emp_id char(8) not null,
    name varchar(128) not null,
    salary decimal(10,2) default 3500,
    dob date not null,
    dept_id int,

    constraint pk_emp_id primary key(emp_id),
    constraint chk_salary check(salary >= 1500)
);

-- create department
create table department(
    dept_id int auto_increment,
    dept_name varchar(64) not null,
    constraint pk_dept_id primary key (dept_id)
);
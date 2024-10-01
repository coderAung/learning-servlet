drop database if exists course_db;

create database course_db;

use course_db;

create table courses (
course_id varchar(50) primary key,
course_name varchar(50) not null,
period int,
time_start date,
time_end date,
teacher_name varchar(50) not null
);
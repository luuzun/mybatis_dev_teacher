CREATE DATABASE mybatis_dev;

GRANT ALL PRIVILEGES
ON mybatis_dev.*
TO user_mybatis_dev
IDENTIFIED by 'rootroot';

drop table COURSE_ENROLLMENT;
drop table COURSES;
drop table TUTORS;
drop table STUDENTS;
drop table ADDRESSES;
CREATE DATABASE mybatis_dev;

GRANT ALL PRIVILEGES
ON mybatis_dev.*
TO user_mybatis_dev
IDENTIFIED by 'rootroot';

GRANT Alter routine ON mybatis_dev.* TO 'user_mybatis_dev'@'%' ;
GRANT Create routine ON mybatis_dev.* TO 'user_mybatis_dev'@'%' ;
GRANT execute ON mybatis_dev.* TO 'user_mybatis_dev'@'%' ;
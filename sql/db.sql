drop database if exists db;
create database db;

drop table if exists db.user;
create table db.user (
  id       int auto_increment primary key
  comment 'id PK',
  username varchar(255) not null
  comment 'username NN',
  password varchar(255) not null
  comment 'password NN'
)
  comment 'user table';

drop table if exists db.book;
create table db.book (
  id      int auto_increment primary key
  comment 'id PK',
  title   varchar(255)  not null
  comment 'title NN',
  price   decimal(6, 2) not null
  comment 'price NN',
  amount  int           not null
  comment 'amount NN',
  pubTime date          not null
  comment 'publish time NN'
)
  comment 'book table';

select *
from db.user;

select *
from db.book;
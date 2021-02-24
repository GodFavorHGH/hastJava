create table user(
     id int not null auto_increment,
     name varchar(32) not null,
     password varchar(256) not null,
     email varchar(32) not null,
     phone varchar(16) not null,
     status char(1) not null,
     role varchar(16) not null,
     level int not null,
     contribution int not null ,
     createtime timestamp default current_timestamp,
     updatetime timestamp default null on update current_timestamp,
     primary key pk_id(id),
     unique index idx_nm(name),
     unique index idx_ph(phone)
);
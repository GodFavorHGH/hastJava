create table article(
    id int not null auto_increment,
    subject varchar(64) not null,
    sequence int not null,
    title varchar(256) not null,
    content text not null,
    createtime timestamp default current_timestamp,
    updatetime timestamp default null on update current_timestamp,
    primary key pk_id(id),
    unique index idx_ss(subject,sequence),
    index idx_ct(createtime)
);

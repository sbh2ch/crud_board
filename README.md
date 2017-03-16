# crud_board
I built this proj in JDK8, tomcat8, oracle11.

before you compile this project,
you should build the basic board table below:
create table mvc_board (
	bId number(4) primary key,
	bName varchar2(50),
	bTitle varchar2(100),
	bContent varchar2(2000),
	bDate date default sysdate,
	bHit number(4) default 0,
	bGroup number(4),
	bStep number(4),
	bIndent number(4) 
);

and create sequence too,

create sequence mvc_board_seq;

thx
# crud_board<br>
I built this proj in JDK8, tomcat8, oracle11.<br>
<br>
before you compile this project,<br>
you should build the basic board table below:<br>
<h3>
create table mvc_board (<br>
	bId number(4) primary key,<br>
	bName varchar2(50),<br>
	bTitle varchar2(100),<br>
	bContent varchar2(2000),<br>
	bDate date default sysdate,<br>
	bHit number(4) default 0,<br>
	bGroup number(4),<br>
	bStep number(4),<br>
	bIndent number(4) <br>
);<br>
</h3>
<br>
and create a sequence too,<br>
<br>
<h3>create sequence mvc_board_seq;</h3><br>
<br>

create table roles
(
	id int identity,
	name varchar(20) not null
)
go

create unique index roles_id_uindex
	on roles (id)
go

alter table roles
	add constraint roles_pk
		primary key nonclustered (id)
go
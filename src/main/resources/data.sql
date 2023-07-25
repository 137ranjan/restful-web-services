insert into user_details(id,birth_date,name)
values(1001, current_date(),'Ranga');

insert into user_details(id,birth_date,name)
values(1002, current_date(),'Ravi');

insert into user_details(id,birth_date,name)
values(1003, current_date(),'Satish');

insert into post(id,description,user_id)
values(20001, 'I want to learn AWS',1001);

insert into post(id,description,user_id)
values(20002, 'I want to learn DevOps',1001);

insert into post(id,description,user_id)
values(20003, 'I want to get AWS certified',1002);

insert into post(id,description,user_id)
values(20004, 'I want to learn Multi Cloud',1002);
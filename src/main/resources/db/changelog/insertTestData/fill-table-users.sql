--liquibase formatted sql
--changeset sergei:c273c1a8-496a-4f24-aa87-4eedb7a7d652

INSERT INTO users (id, name, surname, email) 
VALUES ('048cfd32-7e59-4fac-a36b-4b59a5e8a409',
'Winnie', 'Pooh', 'winpo@yandex.ru');

INSERT INTO users (id, name, surname, email) 
VALUES ('378474fd-31d7-4753-9a22-c20965a5b9db',
'Piglet', 'None', 'piglet@mail.ru');

--rollback DELETE FROM users;

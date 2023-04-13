--liquibase formatted sql
--changeset sergei:3570541e-1cef-4c8c-9671-feea00f354e9

INSERT INTO table_user (given_name, family_name, email, password) VALUES
('Sergei', 'Aidinov', 'incoming34@yandex.ru', '12345');

--rollback
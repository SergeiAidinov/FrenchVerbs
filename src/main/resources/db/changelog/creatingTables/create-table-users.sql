--liquibase formatted sql
--changeset sergei:1

CREATE TABLE IF NOT EXISTS users(
id UUID PRIMARY KEY,
name VARCHAR(20) NOT NULL,
surname VARCHAR(20) NOT NULL,
email VARCHAR(50) NOT NULL
);

--rollback DROP TABLE users;
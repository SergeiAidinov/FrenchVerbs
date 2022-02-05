--liquibase formatted sql
--changeset sergei:b761d58a-9095-4450-b3e5-71634ca48f5a

CREATE TABLE IF NOT EXISTS users(
id UUID PRIMARY KEY,
name VARCHAR(20) NOT NULL,
surname VARCHAR(20) NOT NULL,
email VARCHAR(50) NOT NULL
);

--rollback DROP TABLE users;
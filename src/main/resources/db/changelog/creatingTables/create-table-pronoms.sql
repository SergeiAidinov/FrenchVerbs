--liquibase formatted sql
--changeset sergei:2

CREATE TABLE IF NOT EXISTS pronoms(
id SMALLINT PRIMARY KEY,
pronom VARCHAR(5) NOT NULL
);

--rollback DROP TABLE pronoms;
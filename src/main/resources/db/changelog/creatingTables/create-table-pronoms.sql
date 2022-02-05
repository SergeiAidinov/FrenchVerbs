--liquibase formatted sql
--changeset sergei:988135b3-1c1c-4fae-beca-7273aaa74ff6

CREATE TABLE IF NOT EXISTS pronoms(
id SMALLINT PRIMARY KEY,
pronom VARCHAR(5) NOT NULL
);

--rollback DROP TABLE pronoms;
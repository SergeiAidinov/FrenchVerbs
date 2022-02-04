--liquibase formatted sql
--changeset sergei:5

CREATE INDEX userId_index ON cross_table_user_verb (userId);

--rollback DROP INDEX IF EXISTS uderId_index;
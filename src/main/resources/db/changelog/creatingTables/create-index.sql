--liquibase formatted sql
--changeset sergei:c37e19be-f4a6-4069-9d1e-3332bd4ed090

CREATE INDEX userId_index ON cross_table_user_verb (userId);

--rollback DROP INDEX IF EXISTS uderId_index;
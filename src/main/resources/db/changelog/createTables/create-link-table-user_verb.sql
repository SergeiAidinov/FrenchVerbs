--liquibase formatted sql
--changeset sergei:aa15008f-b464-468d-aec1-29a4c1788cf0

CREATE TABLE IF NOT EXISTS user_verb (
    id    UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
    user_id    UUID NOT NULL,
    verb_id    UUID NOT NULL,
CONSTRAINT fk_user FOREIGN KEY(user_id) REFERENCES table_user(id) ON DELETE cascade ON UPDATE cascade,
CONSTRAINT fk_verb FOREIGN KEY(verb_id) REFERENCES verb(verb_id)  ON DELETE cascade ON UPDATE cascade,
CONSTRAINT user_verb_unique UNIQUE (user_id, verb_id)
);

--rollback DROP TABLE user_verb;
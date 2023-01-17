--liquibase formatted sql
--changeset sergei:aa15008f-b464-468d-aec1-29a4c1788cf0

CREATE TABLE IF NOT EXISTS user_verb (
    id    UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
    user_id    UUID NOT NULL,
    verb    VARCHAR(15) NOT NULL,
	CONSTRAINT fk_user
   FOREIGN KEY(user_id) 
   REFERENCES users_table(id)
   ON DELETE cascade
   ON UPDATE cascade,
   CONSTRAINT fk_verb
   FOREIGN KEY(verb) 
   REFERENCES verb(infinitive)
   ON DELETE cascade
   ON UPDATE cascade
);

--rollback DROP TABLE user_verb;
--liquibase formatted sql
--changeset sergei:8a7bac51-3090-4e79-acb1-cf7a8795537a

CREATE TABLE IF NOT EXISTS cross_table_user_verb (
id UUID PRIMARY KEY,
userId UUID,
verbId UUID,
CONSTRAINT fk_users
      FOREIGN KEY(userId) 
	  REFERENCES users(id) ON DELETE CASCADE,
CONSTRAINT fk_verbs
      FOREIGN KEY(verbId) 
	  REFERENCES verbs(id) ON DELETE CASCADE
);

--rollback DROP TABLE cross_table_user_verb;
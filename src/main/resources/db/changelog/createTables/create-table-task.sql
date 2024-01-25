--liquibase formatted sql
--changeset sergei:c67c38d6-a0c1-4996-ad16-1a0776e3443a

CREATE TABLE IF NOT EXISTS table_task (
    user_id UUID references table_user (id),
    infinitive varchar (20),
	grammatical_person varchar (20),
	correct_answer varchar (20)
);

--rollback DROP TABLE table_task;
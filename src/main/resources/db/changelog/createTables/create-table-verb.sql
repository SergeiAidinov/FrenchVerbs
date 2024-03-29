--liquibase formatted sql
--changeset sergei:3fa68a7a-87a0-4010-a8f3-5320c5e03c54

--CREATE IF NOT EXISTS EXTENSION "uuid-ossp";
CREATE TABLE IF NOT EXISTS verb(

                        infinitive VARCHAR(15) UNIQUE NOT NULL  PRIMARY KEY,
                        je VARCHAR(15) NOT NULL,
                        tu VARCHAR(15) NOT NULL,
                        il VARCHAR(15) NOT NULL,
                        elle VARCHAR(15) NOT NULL,
                        nous VARCHAR(15) NOT NULL,
                        vous VARCHAR(15) NOT NULL,
                        ils VARCHAR(15) NOT NULL,
                        elles VARCHAR(15) NOT NULL

);

--rollback DROP TABLE verb;
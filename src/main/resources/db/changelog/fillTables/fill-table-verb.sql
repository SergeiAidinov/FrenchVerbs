--liquibase formatted sql
--changeset sergei:708fe988-35c1-41fc-bc34-21768f359bf9

INSERT INTO verb (infinitive, je, tu, il, elle, nous, vous, ils, elles) VALUES
('aller', 'vais', 'vas', 'va', 'va', 'allons', 'allez', 'vont', 'vont'),
('avoir', 'ai', 'as', 'a', 'a', 'avons', 'avez', 'ont', 'ont')

;

--rollback DROP TABLE products;




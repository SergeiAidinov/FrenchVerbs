--liquibase formatted sql
--changeset sergei:b559008a-15cd-406e-9809-097ccfaf82c1

INSERT INTO pronoms (id, pronom) VALUES
('1', 'je'),
('2', 'tu'),
('3', 'il'),
('4', 'elle'),
('5', 'nous'),
('6', 'vous'),
('7', 'ils'),
('8', 'elles');

--rollback DELETE FROM pronoms;

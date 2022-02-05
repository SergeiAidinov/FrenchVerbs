--liquibase formatted sql
--changeset sergei:c622df78-d2ab-46b2-b9ac-573b8aed4898

INSERT INTO verbs (id, 
infinitive, je, tu, il, elle, nous, vous, ils, elles) 
VALUES ('89467dc1-a3fa-4988-9df2-0172576442bb',
'avoir', 'ai', 'as', 'a', 'a', 'avons', 'avez', 'ont', 'ont');

INSERT INTO verbs (id, 
infinitive, je, tu, il, elle, nous, vous, ils, elles) 
VALUES ('ff30c520-b3e1-41ce-8819-060429828830',
'apprendre', 'apprends', 'apprends', 'apprend', 'apprend', 'apprenons', 'apprenez', 'apprennent', 'apprennent');

INSERT INTO verbs (id, 
infinitive, je, tu, il, elle, nous, vous, ils, elles) 
VALUES ('5b661f82-17bb-457a-a575-24954228d98d',
'écrire', 'écris', 'écris', 'écrit', 'écrit', 'écrivons', 'écrivez', 'écrivent', 'écrivent');

--rollback DELETE FROM verbs;

--liquibase formatted sql
--changeset sergei:e2110ce0-9986-4e3b-9778-99b1751f6c76

INSERT INTO cross_table_user_verb (id, userid, verbid) 
VALUES ('1f44f9c3-0f49-4637-b42b-a4672851f2fa',
'048cfd32-7e59-4fac-a36b-4b59a5e8a409',
'89467dc1-a3fa-4988-9df2-0172576442bb'
);

INSERT INTO cross_table_user_verb (id, userid, verbid) 
VALUES ('d9108d19-ce90-4989-9e4e-0b97ed8a4765',
'048cfd32-7e59-4fac-a36b-4b59a5e8a409',
'ff30c520-b3e1-41ce-8819-060429828830'
);

INSERT INTO cross_table_user_verb (id, userid, verbid) 
VALUES ('d0939852-2150-4ccf-bb4e-a605da8db050',
'378474fd-31d7-4753-9a22-c20965a5b9db',
'89467dc1-a3fa-4988-9df2-0172576442bb'
);

INSERT INTO cross_table_user_verb (id, userid, verbid) 
VALUES ('83388705-b4ef-4a8d-9264-60f9398f2ad6',
'378474fd-31d7-4753-9a22-c20965a5b9db',
'5b661f82-17bb-457a-a575-24954228d98d'
);

--rollback DELETE FROM cross_table_user_verb;
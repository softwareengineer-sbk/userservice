--Inserting into USER_EO table
INSERT INTO USER_EO (id, username, password) VALUES (0, 'mosque_1', '$2a$12$8tSlYMwfrp8fmQ64JkTy9ekcRx3cl0RJDJosNA/aA37J/a26yRpJG');

--Inserting into ROLE_EO table
INSERT INTO ROLE_EO (id, title) VALUES (1, 'OWNER_ROLE');
INSERT INTO ROLE_EO (id, title) VALUES (2, 'ADMIN_ROLE');
INSERT INTO ROLE_EO (id, title) VALUES (3, 'USER_ROLE');

--Inserting into USER_ROLE_EO table
INSERT INTO USER_ROLE_EO (user_id, role_id) VALUES (0, 3);
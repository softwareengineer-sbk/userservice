--Creating USER_EO table
CREATE TABLE IF NOT EXISTS USER_EO (id SERIAL PRIMARY KEY, username VARCHAR(100) NOT NULL, password VARCHAR(100) NOT NULL);

--Creating ROLE_EO table
CREATE TABLE IF NOT EXISTS ROLE_EO(id SERIAL PRIMARY KEY, title VARCHAR(100) NOT NULL);

--Creating USER_ROLE_EO table
CREATE TABLE IF NOT EXISTS USER_ROLE_EO(role_id INT, user_id INT, PRIMARY KEY(user_id,role_id), FOREIGN KEY(role_id) REFERENCES ROLE_EO (id), FOREIGN KEY(user_id) REFERENCES USER_EO (id));

DROP TABLE IF EXISTS PHONES;
DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
	ID UUID NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	EMAIL VARCHAR(100) NOT NULL,
	PASSWORD VARCHAR(250) NOT NULL,
	TOKEN VARCHAR(250),
	IS_ACTIVE BOOLEAN DEFAULT FALSE NOT NULL,
	LAST_LOGIN DATE,
	CREATED DATE DEFAULT CURRENT_DATE,
	MODIFIED DATE DEFAULT CURRENT_DATE,
	CONSTRAINT USERS_PK PRIMARY KEY (ID),
	CONSTRAINT USERS_UN UNIQUE (EMAIL)
);

CREATE TABLE PHONES (
    ID IDENTITY
	ID_USER UUID NOT NULL,
	PHONE_NUMBER INTEGER NOT NULL,
	CITY_CODE SMALLINT NOT NULL,
	COUNTRY_CODE SMALLINT NOT NULL,
	CONSTRAINT FK_PHONE_USER FOREIGN KEY (ID_USER) REFERENCES USERS (ID),
	CONSTRAINT PHONES_UN UNIQUE (ID_USER, PHONE_NUMBER, CITYCODE, CONTRYCODE)
);

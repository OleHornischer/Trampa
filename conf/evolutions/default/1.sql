# Database schema

# --- !Ups

CREATE SEQUENCE item_id_seq;
CREATE TABLE item (
    id integer NOT NULL DEFAULT nextval('item_id_seq'),
    title varchar(255),
    description varchar,
    price integer
);

CREATE SEQUENCE user_id_seq;
CREATE TABLE user (
    id integer NOT NULL DEFAULT nextval('user_id_seq'),
    firstName varchar(255),
    lastName varchar(255),
    userName varchar(255),
    email varchar(255),
    password varchar(255),
    street varchar(255),
    houseNumber varchar(255),
    postcode varchar(255),
    countryCode varchar(255),
    balance integer
);

INSERT INTO user(firstName, lastName, userName, email, password, street, houseNumber, postcode, countryCode, balance)
VALUES ('Ole', 'Hornischer', 'ole', 'ole@hornischer.net', '',  'Hasselbrookstr.', '90', '22089', 'DE', 100 );

# --- !Downs

DROP TABLE item;
DROP SEQUENCE item_id_seq;
DROP TABLE user;
DROP SEQUENCE user_id_seq;
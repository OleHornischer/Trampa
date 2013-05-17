# Database schema

# --- !Ups

CREATE TABLE item (
    id integer NOT NULL AUTO_INCREMENT,
    title varchar(255),
    description text,
    price integer,
    PRIMARY KEY (id)
);

CREATE TABLE user (
    id integer NOT NULL AUTO_INCREMENT,
    firstName varchar(255),
    lastName varchar(255),
    userName varchar(255),
    email varchar(255),
    password varchar(255),
    street varchar(255),
    houseNumber varchar(255),
    postcode varchar(255),
    countryCode varchar(255),
    balance integer,
    PRIMARY KEY (id)
);

INSERT INTO user(firstName, lastName, userName, email, password, street, houseNumber, postcode, countryCode, balance)
VALUES ('Ole', 'Hornischer', 'ole', 'ole@hornischer.net', '',  'Hasselbrookstr.', '90', '22089', 'DE', 100 );

# --- !Downs

DROP TABLE item;
DROP TABLE user;
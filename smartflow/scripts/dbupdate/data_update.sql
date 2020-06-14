ALTER TABLE role ADD label varchar(45);

ALTER TABLE client ADD email varchar(255);

ALTER TABLE client ADD client_password varchar(255);

ALTER TABLE client ADD reset_token varchar(255);

ALTER TABLE user ADD reset_token varchar(255);

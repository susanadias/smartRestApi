
/* INSERT ROLES TABLE */
INSERT INTO role (name) VALUES('ADMINISTRADOR');
INSERT INTO role (name) VALUES('PADRÃO');

/* INSERT PLAN TABLE*/
INSERT INTO plan (name) VALUES('GOLD');
INSERT INTO plan (name) VALUES('SILVER');
INSERT INTO plan (name) VALUES('BRASS');


/*INSERT CLIENT TABLE*/
INSERT INTO client (name, plan_id, disabled, show_gateway_logo) 
VALUES('worten',1,false,true);

INSERT INTO client (name, plan_id, disabled, show_gateway_logo) 
VALUES('primark',1,false,true);

/*INSERT USER TABLE*/
INSERT INTO user (email, role_id, disabled, name, client_id, user_password) 
VALUES('susana@gmail.com',1,false,"susana",2, "teste");

INSERT INTO user (email, role_id, disabled, name, client_id, user_password) 
VALUES('um@gmail.com',1,false,"ana maria",2, "teste");

INSERT INTO user (email, role_id, disabled, name, client_id, user_password) 
VALUES('dois@gmail.com',1,false,"Isabel",2, "teste");

/*INSERT STORE TABLE*/
INSERT INTO store (name, client_id, email, address, max_allowed, panel_language, logo_path, url_path) 
VALUES('worten-almada', 1,"worten-almada@gmail.com","almada", 4,NULL, NULL, '');

INSERT INTO user_has_store (user_id, store_id) VALUES(1, 1);

/*INSERT DEVICE TABLE*/

INSERT INTO device (store_id, name, is_panel, description, device_ip, mac_address, disabled, task_id, entry_device, interval_time_notification) 
VALUES(1, 'camera1',true,"camera da frente", '192.168.1.20', 'BE:DT:FT', true, NULL, NULL, NULL);

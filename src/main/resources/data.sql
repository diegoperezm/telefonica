INSERT INTO address (city, street_name)
VALUES ('New York', '5th Avenue');
INSERT INTO address (city, street_name)
VALUES ('Los Angeles', 'Sunset Boulevard');
INSERT INTO address (city, street_name)
VALUES ('Chicago', 'Michigan Avenue');
INSERT INTO address (city, street_name)
VALUES ('Houston', 'Main Street');
INSERT INTO address (city, street_name)
VALUES ('Miami', 'Ocean Drive');

 insert into CLIENT (address_id, first_name, last_name, run)
 values (1,'Anetta', 'Yggo', '60-3977316');
 insert into CLIENT (address_id, first_name, last_name, run)
 values (2,'Kaylyn', 'Dicte', '78-2174921');
 insert into CLIENT (address_id, first_name, last_name, run)
 values (3,'Hedi', 'Darlaston', '15-6660506');
 insert into CLIENT (address_id, first_name, last_name, run)
 values (4,'Sunny', 'Seine', '91-3016908');
 insert into CLIENT (address_id, first_name, last_name, run)
 values (5,'Flint', 'Beresfore', '34-7092326');


 INSERT INTO plan (plan_name, price, service_type)
 VALUES ('Basic Plan', 29.99, 'BASIC');
 INSERT INTO plan (plan_name, price, service_type)
 VALUES ('Standard Plan', 49.99, 'STANDARD');
 INSERT INTO plan (plan_name, price, service_type)
 VALUES ('Premium Plan', 79.99, 'PREMIUM');
 INSERT INTO plan (plan_name, price, service_type)
 VALUES ('Family Plan', 99.99, 'FAMILY');
 INSERT INTO plan (plan_name, price, service_type)
 VALUES ('Business Plan', 149.99, 'BUSINESS');


  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (1, 1, '2023-01-01', '2024-01-01', true);
  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (2, 2, '2023-02-01', '2024-02-01', true);
  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (3, 3, '2023-03-01', '2024-03-01', false);
  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (4, 4, '2023-04-01', '2024-04-01', true);
  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (5, 5, '2023-05-01', '2024-05-01', false);
  INSERT INTO contract (client_id, plan_id, start_date, termination_date, active)
  VALUES (1, 2, '2023-01-01', '2024-01-01', true);



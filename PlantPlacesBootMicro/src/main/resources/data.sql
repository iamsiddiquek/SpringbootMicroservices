DROP TABLE IF EXISTS person;
 
CREATE TABLE person (
  id INT AUTO_INCREMENT NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL,
  location VARCHAR(255),
  birth_date timestamp,
  PRIMARY KEY(id)  
);
 
INSERT INTO person (first_name, last_name, career, location, birth_date) 
VALUES
  ('Muhammad ', 'Siddique', 'Billionaire Industrialist', 'Moro', sysdate()),
  ('Asad ', 'Karee', 'Billionaire Tech Entrepreneur', 'NYC', sysdate()),
  ('Usama', 'Kareem', 'Billionaire Oil Magnate', 'London', sysdate());
DROP TABLE IF EXISTS hibernate_sequence;  
CREATE TABLE hibernate_sequence (  
         sequence_name VARCHAR(50) NOT NULL,  
         next_val INT NOT NULL,  
         increment INT NOT NULL DEFAULT 1,
         PRIMARY KEY (sequence_name)  
) ENGINE=InnoDB;  

DROP FUNCTION IF EXISTS currval;  
CREATE  FUNCTION `currval`(sequence_string VARCHAR(50)) RETURNS varchar(50) CHARSET utf8
BEGIN  
         DECLARE value_string VARCHAR(50);  
         SET value_string = '';  
         SELECT next_val INTO value_string  
                   FROM hibernate_sequence  
                   WHERE sequence_name = sequence_string;  
         RETURN value_string;  
END;

DROP FUNCTION IF EXISTS nextval;  
CREATE FUNCTION `nextval`(sequence_string VARCHAR(50)) RETURNS int(11)
BEGIN  
         UPDATE hibernate_sequence  
                   SET next_val = next_val + increment  
                   WHERE sequence_name = sequence_string;  
         RETURN currval(sequence_string);  
END; 

DROP FUNCTION IF EXISTS setval;  
CREATE FUNCTION `setval`(sequence_string VARCHAR(50), value_int INTEGER) RETURNS int(11)
BEGIN  
         UPDATE hibernate_sequence  
                   SET next_val = value_int  
                   WHERE sequence_name = sequence_string;  
         RETURN currval(sequence_string);  
END;
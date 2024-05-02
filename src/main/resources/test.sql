
<<<<<<< HEAD
CREATE TABLE USERS(
    ID int(100) AUTO_INCREMENT,
    PRIMARY KEY (ID),
    USER_ID int(100),
    BODY VARCHAR(100)
)
=======
CREATE TABLE TEST(
    ID int(100) AUTO_INCREMENT,
    PRIMARY KEY (ID),
    SEX ENUM ('MALE', 'FEMALE'),
    FIRSTNAME CHAR charset utf8,
    DATE_BIRTH DATE,
    USER_ID int(100),
    BODY VARCHAR(100),
    TOTAL_PRICE DECIMAL(9,2)
);
CREATE TABLE TEST(
                     ID SERIAL PRIMARY KEY,
                     SEX ENUM ('MALE', 'FEMALE'),
                     FIRSTNAME CHAR charset utf8,
                     DATE_BIRTH DATE,
                     USER_ID int(100),
                     BODY VARCHAR(100),
                     TOTAL_PRICE DECIMAL(9,2)
);

CREATE TABLE TABLE_FOR_TEST(
    ID SERIAL PRIMARY KEY,
    USER_ID int,
    foreign key (USER_ID) references TEST(ID)
);

INSERT INTO TABLE_FOR_TEST(USER_ID)
VALUES (6);

SELECT * FROM POSTS;




CREATE TABLE ISSUELISTS(
                           ID SERIAL PRIMARY KEY,
                           NAME VARCHAR(200)
);

CREATE TABLE ISSUES(
                       ID SERIAL PRIMARY KEY,
                       USER_ID bigint unsigned not null,
                       ISSUES_ID bigint unsigned not null,
                       FOREIGN KEY (ISSUES_ID) REFERENCES ISSUELISTS(ID),
                       SUMMARY VARCHAR(100),
                       DESCRIPTION VARCHAR(100),
                       FOREIGN KEY (USER_ID) REFERENCES USERS(ID)

);
SELECT COUNT(*) AS COUNTER FROM TABLE_FOR_TEST;
SELECT MAX(ID) FROM TABLE_FOR_TEST;
SELECT SUM(ID) FROM TABLE_FOR_TEST;
SELECT AVG(ID) FROM TABLE_FOR_TEST;

SELECT U.FIRSTNAME, U.LASTNAME, P.BODY
FROM USERS U
JOIN POSTS P
ON U.ID = P.USER_ID;



SELECT USER_ID, COUNT(* )AS COUNTER
FROM posts
GROUP BY USER_ID
HAVING COUNT(*) > 1;

SELECT USER_ID, COUNT(* )AS COUNTER
FROM posts
GROUP BY USER_ID;

SELECT U.ID, COUNT(*) AS POST_NUMBER
FROM users U
         JOIN POSTS P
              ON U.ID = P.USER_ID
GROUP BY  USER_ID;


SELECT U.ID, COUNT(*) AS POST_NUMBER
FROM users U
JOIN POSTS P
ON U.ID = P.USER_ID
GROUP BY USER_ID
HAVING COUNT(*) > 1;




SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POST_NUMBER
FROM users U
         JOIN POSTS P
              ON U.ID = P.USER_ID
GROUP BY USER_ID
HAVING COUNT(*) > 1
ORDER BY U.FIRSTNAME, U.LASTNAME;





Listę zadań z tabeli ISSUESS z dołączonymi do nich nazwami list zadań z tabeli ISSUESLISTS
Listę zadań z tabeli ISSUESS z przypisanymi do nich użytkownikami z tabeli USERS
Imiona i nazwiska użytkowników posiadających zadania, wraz z informacją o ilości zadań, które są do nich przypisane

SELECT TASK.USER_ID, TASK.DESCRIPTION, TASK.SUMMARY, LIST.NAME
FROM ISSUES TASK
JOIN ISSUELISTS LIST
ON TASK.ISSUES_ID = LIST.ID;

SELECT TASK.DESCRIPTION, TASK.SUMMARY, USER.LASTNAME, USER.FIRSTNAME
FROM ISSUES TASK
JOIN users USER
ON TASK.ID = USER.ID;

SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS COUUNTER_TASK
FROM users U
JOIN ISSUES T
ON U.ID = T.USER_ID
group by T.USER_ID;

UPDATE POSTS
SET USER_ID = 1
WHERE ID = 2;

INSERT INTO posts( USER_ID, BODY)
VALUE (2, 'ADD BODY');
SELECT * FROM  posts;

SELECT * FROM USERS;


CREATE TABLE BOOKS (
                       BOOK_ID int(11) NOT NULL AUTO_INCREMENT,
                       TITLE varchar(255) NOT NULL,
                       PUBYEAR int(4) NOT NULL,
                       PRIMARY KEY (BOOK_ID)
);

CREATE TABLE READERS (
                         READER_ID int(11) NOT NULL AUTO_INCREMENT,
                         FIRSTNAME varchar(255) NOT NULL,
                         LASTNAME varchar(255) NOT NULL,
                         PESELID varchar(11) NOT NULL,
                         PRIMARY KEY (READER_ID));


CREATE TABLE RENTS (
                       RENT_ID int(11) NOT NULL AUTO_INCREMENT,
                       BOOK_ID int(11) NOT NULL,
                       READER_ID int(11) NOT NULL,
                       RENT_DATE datetime NOT NULL,
                       RETURN_DATE datetime,
                       PRIMARY KEY (RENT_ID),
                       FOREIGN KEY (BOOK_ID) REFERENCES BOOKS(BOOK_ID),
                       FOREIGN KEY (READER_ID) REFERENCES READERS(READER_ID));



INSERT INTO READERS(FIRSTNAME, LASTNAME, PESELID)
VALUES ("John", "Smith", "83012217938");

INSERT INTO READERS(FIRSTNAME, LASTNAME, PESELID)
VALUES ("Curtis", "Wilson", "75121002790");

INSERT INTO READERS(FIRSTNAME, LASTNAME, PESELID)
VALUES ("Cathy", "Booker", "90112801727");

INSERT INTO READERS(FIRSTNAME, LASTNAME, PESELID)
VALUES ("Marissa", "Cain", "84061908044");

INSERT INTO READERS(FIRSTNAME, LASTNAME, PESELID)
VALUES ("Muriel", "Fulton", "76081409269");

COMMIT;

INSERT INTO BOOKS(TITLE, PUBYEAR)
VALUES ("The Stranger", 1942);

INSERT INTO BOOKS(TITLE, PUBYEAR)
VALUES ("In Search of Lost Time", 1927);

INSERT INTO BOOKS(TITLE, PUBYEAR)
VALUES ("The Trial", 1925);

INSERT INTO BOOKS(TITLE, PUBYEAR)
VALUES ("The Little Prince", 1943);

INSERT INTO BOOKS(TITLE, PUBYEAR)
VALUES ("Man's Fate", 1933);

COMMIT;
INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (1, 1, DATE_SUB(CURDATE(), INTERVAL 10 DAY), null);

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (2, 1, DATE_SUB(CURDATE(), INTERVAL 10 DAY), null);

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (4, 1, DATE_SUB(CURDATE(), INTERVAL 10 DAY), DATE_SUB(CURDATE(), INTERVAL 5 DAY));

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (1, 3, DATE_SUB(CURDATE(), INTERVAL 8 DAY), null);

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (5, 3, DATE_SUB(CURDATE(), INTERVAL 4 DAY), DATE_SUB(CURDATE(), INTERVAL 2 DAY));

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (5, 4, DATE_SUB(CURDATE(), INTERVAL 10 DAY), DATE_SUB(CURDATE(), INTERVAL 8 DAY));

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES (5, 5, DATE_SUB(CURDATE(), INTERVAL 8 DAY), null);

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)
VALUES(1,1, DATE_SUB(CURDATE(),INTERVAL 5 DAY ), NULL)

SELECT CURDATE();



# PROCEDURY

DELIMITER $$
CREATE PROCEDURE LISTBOOKS()
BEGIN
SELECT * FROM BOOKS;
END$$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE GETUSER(USER_ID INT)
BEGIN
    DECLARE STATUS VARCHAR(32);
    IF USER_ID < 0 OR USER_ID = 0 THEN
        SET STATUS = 'ID < 0 OR ID = 0 , WRITE ID  > 0';
        SELECT STATUS;
        ELSE
    SELECT FIRSTNAME, LASTNAME FROM kodilla_course.users WHERE ID LIKE USER_ID;
END IF ;
end $$ ;
DELIMITER ;
CALL GETUSER(-1);





DROP PROCEDURE  IF EXISTS ListBooks;
DELIMITER $$
CREATE PROCEDURE LISTBOOKS()
BEGIN
    SELECT BOOK_ID, TITLE, PUBYEAR FROM BOOKS;
END$$
DELIMITER ;
CALL LISTBOOKS();



#FUNKCJE

DROP FUNCTION IF EXISTS VIPLEVEL;
DELIMITER $$
CREATE FUNCTION VIPLEVEL() RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
    RETURN 'STANDARD CUSTOMER';
end $$
DELIMITER ;

SELECT VIPLEVEL() AS LEVEL;

DROP PROCEDURE IF EXISTS VIPLEVEL;
DELIMITER $$
CREATE FUNCTION VIPLEVEL() RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(20) DEFAULT 'STANDARD CUSTOMER';
    RETURN result;
end $$
DELIMITER ;

SELECT VIPLEVEL() AS LEVEL;


DROP PROCEDURE IF EXISTS VIPLEVEL;
DELIMITER $$
CREATE FUNCTION VIPLEVEL(BOOKSRENTED INT ) RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
    DECLARE result  VARCHAR(20) DEFAULT 'STANDARD CUSTOMER';
    IF BOOKSRENTED >= 10 THEN
        SET result = 'GOLD CUSTOMER';
    ELSEIF booksrented >= 5 AND booksrented < 10 THEN			            -- [6]
        SET result = 'Silver customer';				                        -- [7]
    ELSEIF booksrented >= 2 AND booksrented < 5 THEN			            -- [8]
        SET result = 'Bronze customer';
    end if;
    RETURN result;

     end $$ ;
    DELIMITER ;

SELECT VIPLEVEL(1) AS LEVEL;


ALTER TABLE READERS ADD COLUMN VIP_LEVEL VARCHAR(20);


SELECT COUNT(*) FROM RENTS WHERE READER_ID = 3;


DELIMITER $$
CREATE PROCEDURE UPDATE_VIP_LEVEL()
BEGIN
   DECLARE BOOKS_READ INT;
   DECLARE DAYS INT;
   DECLARE RRD_ID INT;
   DECLARE BOOKS_PER_MONTHS DECIMAL (5,2);
   DECLARE FINISHED INT DEFAULT 0;
   DECLARE ALL_READERS CURSOR FOR SELECT READER_ID FROM READERS;
   DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
   OPEN ALL_READERS;
   WHILE (FINISHED = 0) DO
       FETCH ALL_READERS INTO RRD_ID;
       IF (FINISHED = 0) THEN
           SELECT COUNT(*) FROM RENTS WHERE READER_ID = RRD_ID INTO BOOKS_READ;
           SELECT DATEDIFF(MAX(RENT_DATE), MIN(RENT_DATE)) FROM RENTS WHERE READER_ID = RRD_ID INTO DAYS;
           SET BOOKS_PER_MONTHS = BOOKS_READ / DAYS * 30;
           UPDATE READERS SET kodilla_course.readers.VIP_LEVEL = VIPLEVEL(BOOKS_PER_MONTHS)
           WHERE READER_ID = RRD_ID;
           COMMIT;
       end if ;
       end while ;
   CLOSE ALL_READERS;
   END $$
   DELIMITER ;

CALL UPDATE_VIP_LEVEL();


# Celem zadania jest napisanie procedury identyfikującej bestsellery, czyli
# takiego typu książki, których egzemplarze zostały wypożyczone więcej niż dwa razy w miesiącu.
#
# W tym celu:
#
# Napisz skrypt, który do tabeli BOOKS doda kolumnę BESTSELLER typu BOOLEAN. Kolumna ta
# powinna przyjmować wartość true, jeżeli liczba wypożyczeń książki przekroczy 2.
# Pamiętaj o tym, że początkowa wartość dla kolumny BESTSELLER powinna wynosić 0.
# Do skryptu dodaj procedurę UpdateBestsellers(), która zaktualizuje kolumnę
# BESTSELLER przy każdej książce w tabeli BOOKS na podstawie danych zawartych w tabeli RENTS. Użyj w tym celu kursora.
# Link do skryptu SQL wklej poniżej i prześlij do Mentora.



ALTER TABLE BOOKS ADD COLUMN BEST_SELLER BOOLEAN;



DELIMITER $$
CREATE FUNCTION IS_BEST_SELLER(COUNTER INT) RETURNS BOOLEAN DETERMINISTIC
BEGIN
DECLARE BEST_SELLER_IS BOOLEAN;

   IF COUNTER > 2 THEN
       SET BEST_SELLER_IS = TRUE;

   ELSE
       SET BEST_SELLER_IS = FALSE;

       END IF;
RETURN BEST_SELLER_IS;
end $$
DELIMITER ;
SELECT IS_BEST_SELLER(3);

SELECT COUNT(*) FROM RENTS WHERE BOOK_ID = 1 ;




DELIMITER $$
CREATE PROCEDURE UPDATE_BESTSELLER()
BEGIN
    DECLARE BOOKS_COUNTER INT;

    DECLARE TEMP_ID INT;

    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS CURSOR FOR SELECT BOOK_ID FROM RENTS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
    OPEN ALL_BOOKS;
    WHILE (FINISHED = 0) DO
            FETCH ALL_BOOKS INTO TEMP_ID;
            IF (FINISHED = 0) THEN
                SELECT COUNT(*) FROM RENTS WHERE BOOK_ID = TEMP_ID INTO BOOKS_COUNTER;


                UPDATE BOOKS SET BEST_SELLER = IS_BEST_SELLER(BOOKS_COUNTER)
                WHERE BOOK_ID = TEMP_ID;
                COMMIT;
            end if ;
        end while ;
    CLOSE ALL_BOOKS;
END $$
DELIMITER ;

CALL UPDATE_BESTSELLER();

#WYZWALACZE

DELIMITER $$
SET @RENTQTY = 0;
CREATE TRIGGER RENTCOUNTER BEFORE INSERT ON RENTS
       FOR EACH ROW
    BEGIN
        SET @RENTQTY = @RENTQTY + 1;
    end $$
DELIMITER ;

INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE) VALUES
(1,1,CURDATE(),CURDATE());

SELECT @RENTQTY;


CREATE TABLE RENTS_AUD (
                           EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
                           EVENT_DATE DATETIME NOT NULL,
                           EVENT_TYPE VARCHAR(10) DEFAULT NULL,
                           RENT_ID INT(11) NOT NULL,
                           OLD_BOOK_ID INT(11),
                           NEW_BOOK_ID INT(11),
                           OLD_READER_ID INT(11),
                           NEW_READER_ID INT(11),
                           OLD_RENT_DATE DATETIME,
                           NEW_RENT_DATE DATETIME,
                           OLD_RETURN_DATE DATETIME,
                           NEW_RETURN_DATE DATETIME,
                           PRIMARY KEY (EVENT_ID)
);

DELIMITER $$

CREATE TRIGGER RENTS_UPDATE AFTER UPDATE ON rents
    FOR EACH ROW
BEGIN
    INSERT INTO rents_aud (EVENT_DATE, EVENT_TYPE, RENT_ID, NEW_BOOK_ID, NEW_READER_ID,
                           NEW_RENT_DATE, NEW_RETURN_DATE, OLD_BOOK_ID, OLD_READER_ID,
                           OLD_RENT_DATE, OLD_RETURN_DATE)
        VALUE(CURTIME(), 'UPDATE', OLD.RENT_ID, NEW.BOOK_ID, NEW.READER_ID,
              NEW.RENT_DATE, NEW.RETURN_DATE, OLD.BOOK_ID, OLD.READER_ID,
              OLD.RENT_DATE, OLD.RETURN_DATE);
END $$

DELIMITER ;


UPDATE rents SET RETURN_DATE = CURDATE()
WHERE RENT_ID = 3;

COMMIT;




#WIDOKI

CREATE VIEW BOOK_AND_READER AS
SELECT RD.READER_ID, RD.FIRSTNAME, RD.LASTNAME, BK.TITLE
FROM READERS RD, BOOKS BK, RENTS RT
WHERE RT.READER_ID = RD.READER_ID
  AND RT.BOOK_ID = BK.BOOK_ID
ORDER BY RT.RENT_DATE;




SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POST_NUMBER
FROM users U
         JOIN POSTS P
              ON U.ID = P.USER_ID
GROUP BY USER_ID
HAVING COUNT(*) > 1
ORDER BY U.FIRSTNAME, U.LASTNAME;

SHOW PROCESSLIST;



USE KODILLA_COURSE;           -- [1]

CREATE EVENT UPDATE_VIPS      -- [2]
    ON SCHEDULE EVERY 1 MINUTE -- [3]
    DO CALL UpdateVipLevels(); -- [4]


USE task_crud;
CREATE EVENT  UPDATE_VIP_LEVEL
ON SCHEDULE EVERY 5 SECOND
DO CALL UpdateVipLevels();


#W submodule o procedurach i funkcjach wbudowanych w ramach zadania przygotowano procedurę
# składowaną UpdateBestsellers(). Wykorzystamy efekty jej działania do monitorowania ilości k
# siążek posiadających status bestsellera w danym momencie czasu. W tym celu stwórz skrypt SQL, który:

#stworzy tabelę STATS posiadającą kolumny:
#STAT_ID INT(11) AUTO INCREMENT PRIMARY KEY
#STAT_DATE DATETIME NOT NULL
#STAT VARCHAR(20) NOT NULL
#VALUE INT(11) NOT NULL
#Stworzy widok BESTSELLERS_COUNT zwracający informację o ilości bestsellerów w
# zbiorze książek (jeden rekord i jedna kolumna z ilością – po prostu pojedyncza liczba)
#stworzy zdarzenie wywołujące procedurę UpdateBestSellers(), a także zapisujące
# wyniki pobrane z widoku BESTSELLERS_COUNT do tabeli STATS. W polu STAT
# umieszczona będzie nazwa statystyki "BESTSELLERS", natomiast w polu VALUE
# znajdzie się informacja o ilości bestsellerów odczytana z widoku BESTSELLERS_COUNT


CREATE VIEW BEST_SELLER_VIEW AS
    SELECT COUNT(*) FROM BOOKS BK
WHERE BK.BESTSELLER = TRUE;

CREATE TABLE STATS (
    STAT_ID INT(11) AUTO_INCREMENT,
STAT_DATE DATETIME NOT NULL,
STAT VARCHAR(20) NOT NULL,
VALUE INT(11) NOT NULL,
PRIMARY KEY(STAT_ID)

);


USE task_crud;
CREATE EVENT  UPDATE_BESTSELLER_EVENT
    ON SCHEDULE EVERY 5 SECOND
    DO CALL UpdateVipLevels();
INSERT INTO STATS(STAT_DATE, STAT, VALUE) VALUES
(CURDATE(), 'BESTSELLER', (SELECT * FROM  BEST_SELLER_VIEW));
























































































>>>>>>> f5bcdf8 (firstCommit)

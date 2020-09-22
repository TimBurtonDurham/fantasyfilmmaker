/*=============================
=Conusmer Access
===============================*/
INSERT INTO user (firstname, lastname) VALUES ('Dave', 'Hampton');

INSERT INTO company (name, owner) VALUES ('Dave Company', 1);

INSERT INTO film (title, owner) VALUES ('Daves First Film', 1);

INSERT INTO script (title, owner, writtenby, tagline, maindescription, status) VALUES ('Daves First Film', 1, 1, 'The Script to end all scripts', 'This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. ', 1);

INSERT INTO genre (genrename) VALUES ('Action');
INSERT INTO genre (genrename) VALUES ('Adventure');
INSERT INTO genre (genrename) VALUES ('Comedy');
INSERT INTO genre (genrename) VALUES ('Crime / Gangster');
INSERT INTO genre (genrename) VALUES ('Drama');
INSERT INTO genre (genrename) VALUES ('Epics / Historical');
INSERT INTO genre (genrename) VALUES ('Horror');
INSERT INTO genre (genrename) VALUES ('Musical / Dance');
INSERT INTO genre (genrename) VALUES ('Science Fiction');
INSERT INTO genre (genrename) VALUES ('War');
INSERT INTO genre (genrename) VALUES ('Westerns');

INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Tom', 'Crooze', '1000000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Bill', 'Pixton', '1500000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Gary', 'Youngman', '1200000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Bill', 'Merry', '1100000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Johnny', 'Dipp', '1600000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Ben', 'Staller', '2000000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Harvey', 'Hangglider', '10000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Kevin', 'Costnothing', '100000');
INSERT INTO actor (firstname, lastname, current_wage) VALUES ('Jackie', 'Chin', '250000');

INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 1, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 2, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 3, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 4, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 5, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (1, 5, -5);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (2, 1, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (3, 2, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (4, 3, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (2, 4, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (2, 5, 10);
INSERT INTO actor_rating (actor_id, genre_id, rating_value) VALUES (2, 5, 15);

INSERT INTO director (firstname, lastname, current_wage) VALUES ('Alfred', 'Bitchcock', '250000');
INSERT INTO director (firstname, lastname, current_wage) VALUES ('Steven', 'Speilberk', '350000');
INSERT INTO director (firstname, lastname, current_wage) VALUES ('Christopher', 'Yeslan', '450000');
INSERT INTO director (firstname, lastname, current_wage) VALUES ('Kathryn', 'Smallandlow', '550000');
INSERT INTO director (firstname, lastname, current_wage) VALUES ('Stanley', 'Kubrock', '650000');
INSERT INTO director (firstname, lastname, current_wage) VALUES ('Percy', 'Pigster', '750000');

COMMIT;

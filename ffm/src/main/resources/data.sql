/*=============================
=Conusmer Access
===============================*/

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

INSERT INTO film_status (statusname) VALUES ('New');
INSERT INTO film_status (statusname) VALUES ('InCasting');
INSERT INTO film_status (statusname) VALUES ('InProduction');
INSERT INTO film_status (statusname) VALUES ('FilmingComplete');
INSERT INTO film_status (statusname) VALUES ('WaitingForRelease');
INSERT INTO film_status (statusname) VALUES ('InCinema');
INSERT INTO film_status (statusname) VALUES ('CinemaRunComplete');
INSERT INTO film_status (statusname) VALUES ('StreamOfferAccepted');
INSERT INTO film_status (statusname) VALUES ('Streaming');
INSERT INTO film_status (statusname) VALUES ('Archived');

INSERT INTO script_status (statusname) VALUES ('New');
INSERT INTO script_status (statusname) VALUES ('For Sale');
INSERT INTO script_status (statusname) VALUES ('AttachedToFilm');

INSERT INTO user (firstname, lastname) VALUES ('Dave', 'Hampton');
INSERT INTO user (firstname, lastname) VALUES ('Tim', 'Burton-Durham');

INSERT INTO company (name, owner) VALUES ('Dave Company', 1);
INSERT INTO company (name, owner) VALUES ('Tim Company', 2);

INSERT INTO script (title, owner, writtenby, tagline, maindescription, status) VALUES ('Daves First Film', 1, 1, 'The Script to end all scripts', 'This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. ', 1);
INSERT INTO script (title, owner, writtenby, tagline, maindescription, status) VALUES ('Tims First Film', 2, 2, 'The Script to end all scripts', 'This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. This is the description of the film it will be very long. ', 1);

INSERT INTO film (title, script_id, genre_id, owner) VALUES ('Daves First Film', 1, 1, 1);
INSERT INTO film (title, script_id, genre_id, owner) VALUES ('Tims First Film', 2, 2, 2);


INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Tom', 'Crooze', '1000000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Bill', 'Pixton', '1500000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Gary', 'Youngman', '1200000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Bill', 'Merry', '1100000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Johnny', 'Dipp', '1600000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Ben', 'Staller', '2000000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Harvey', 'Hangglider', '10000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Kevin', 'Costnothing', '100000');
INSERT INTO actor (firstname, lastname, currentwage) VALUES ('Jackie', 'Chin', '250000');

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


INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 5, 10);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 4, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 3, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 2, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 6, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (2, 5, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 5, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 5, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 5, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 3, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 3, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 7, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 7, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 7, 15);
INSERT INTO director_rating (director_id, genre_id, rating_value) VALUES (1, 7, 15);

INSERT INTO film_actor (film_id, actor_id) VALUES (1, 1);
INSERT INTO film_actor (film_id, actor_id) VALUES (1, 2);
INSERT INTO film_actor (film_id, actor_id) VALUES (1, 3);
INSERT INTO film_actor (film_id, actor_id) VALUES (1, 4);
INSERT INTO film_actor (film_id, actor_id) VALUES (2, 1);
INSERT INTO film_actor (film_id, actor_id) VALUES (2, 2);
INSERT INTO film_actor (film_id, actor_id) VALUES (2, 4);

INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('Metro Cinema', 100, 500, 5, 7);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('Randy Cinema', 50, 400, 5, 7);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('Worldwide Cinema', 5000000, 10000000, 10, 15);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('UK Cinema', 1000000, 3000000, 10, 15);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('USA Cinema', 3500000, 7000000, 10, 15);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('Indepedent Cinema', 2000000, 6000000, 7, 15);
INSERT INTO cinema (cinemaname, minaudience, maxaudience, mindays, maxdays) VALUES ('Losers Cinema', 50, 250, 1, 7);


INSERT INTO studio (studioname, studiocost) VALUES ('Dreamworks', 50000);
INSERT INTO studio (studioname, studiocost) VALUES ('Marbella Studios', 5000000);
INSERT INTO studio (studioname, studiocost) VALUES ('Hansel Productions', 5500000);
INSERT INTO studio (studioname, studiocost) VALUES ('MGN Studios', 3500000);
INSERT INTO studio (studioname, studiocost) VALUES ('Harvey House', 1700000);

INSERT INTO studio_rating (studio_id, rating_value) VALUES (1, 7);
INSERT INTO studio_rating (studio_id, rating_value) VALUES (2, 70);
INSERT INTO studio_rating (studio_id, rating_value) VALUES (3, 75);
INSERT INTO studio_rating (studio_id, rating_value) VALUES (4, 57);
INSERT INTO studio_rating (studio_id, rating_value) VALUES (5, 37);

COMMIT;

CREATE TABLE user
(
  id INT(9) AUTO_INCREMENT,
  firstname  VARCHAR2(30 CHAR)                           NOT NULL,
  lastname  VARCHAR2(30 CHAR)                           NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE company
(
  id INT(9) AUTO_INCREMENT,
  name  VARCHAR2(30 CHAR)                           NOT NULL,
  twitter  VARCHAR2(60 CHAR)                           NULL,
  instagram  VARCHAR2(60 CHAR)                           NULL,
  owner  INT(9)                                     NULL,
  deleted smallint(1)                               DEFAULT 0,
  PRIMARY KEY (id),
  FOREIGN KEY (owner) REFERENCES user(id)
);
CREATE TABLE script_status
  (
    id     INT(9) AUTO_INCREMENT,
    statusname  VARCHAR2(30 CHAR)                                        NOT NULL,
    deleted smallint(1)                                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE script
  (
    id     INT(9) AUTO_INCREMENT,
    title  VARCHAR2(30 CHAR)                                        NOT NULL,
    owner  INT(9)                                                   NOT NULL,
    writtenby  INT(9)                                               NOT NULL,
    tagline  VARCHAR2(MAX)                                          NOT NULL,
    maindescription  VARCHAR2(MAX)                                  NOT NULL,
    status  SMALLINT(3)                                             DEFAULT 1,
    deleted smallint(1)                                             DEFAULT 0,
    PRIMARY KEY (id),
    FOREIGN KEY (owner) REFERENCES company(id),
    FOREIGN KEY (status) REFERENCES script_status(id),
    FOREIGN KEY (writtenby) REFERENCES user(id)
  );
CREATE TABLE script_contract
  (
    script_id   INT(9)                                                  NOT NULL,
    buyer_id    INT(9)                                                  NOT NULL,
    seller_id    INT(9)                                                  NOT NULL,
    minbudget    INT(9)                                                  NOT NULL,
    percentagerevenue    INT(9)                                                  NOT NULL,
    expectedinproductiondate DATETIME                                         NOT NULL,
    created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (script_id) REFERENCES script(id),
    FOREIGN KEY (buyer_id) REFERENCES company(id),
    FOREIGN KEY (seller_id) REFERENCES company(id)
  );
CREATE TABLE genre
  (
    id     INT(9) AUTO_INCREMENT,
    genrename  VARCHAR2(30 CHAR)                                        NOT NULL,
    deleted smallint(1)                                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE film_status
  (
    id     INT(9) AUTO_INCREMENT,
    statusname  VARCHAR2(30 CHAR)                                        NOT NULL,
    deleted smallint(1)                                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE studio
  (
    id     INT(9) AUTO_INCREMENT,
    studioname  VARCHAR2(30 CHAR)                                        NOT NULL,
    studiocost  INT(9)                                                  DEFAULT 0,
    deleted smallint(1)                                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE studio_rating
(
   studio_id INT(9)                                     NOT NULL,
   rating_value SMALLINT(3)                             NOT NULL,
   created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY(studio_id) REFERENCES studio(id)
);

CREATE TABLE film
  (
    id     INT(9) AUTO_INCREMENT,
    title  VARCHAR2(30 CHAR)                            NOT NULL,
    tagline  VARCHAR2(30 CHAR)                            NOT NULL,
    budget  INT(9)                                      NULL,
    script_id  INT(9)                                   NOT NULL,
    genre_id  INT(9)                                    NULL,
    studio_id  INT(9)                                   NULL,
    status  INT(3)                                       DEFAULT 1,
    poster_url  VARCHAR2(MAX)                            DEFAULT 'filmposter_default.gif',
    owner  INT(9)                                       NOT NULL,
    deleted smallint(1)                                 DEFAULT 0,
    PRIMARY KEY (id),
    FOREIGN KEY (owner) REFERENCES company(id),
    FOREIGN KEY (script_id) REFERENCES script(id),
    FOREIGN KEY (genre_id) REFERENCES genre(id),
    FOREIGN KEY (studio_id) REFERENCES studio(id),
    FOREIGN KEY (status) REFERENCES film_status(id)
  );
CREATE TABLE actor
  (
    id     INT(9) AUTO_INCREMENT,
    firstname  VARCHAR2(30 CHAR)                        NOT NULL,
    lastname  VARCHAR2(30 CHAR)                         NOT NULL,
    currentwage  INT(9)                                DEFAULT 0,
    imageurl   VARCHAR2(MAX)                           DEFAULT 'actor_default.gif',
    owner  INT(9)                                       DEFAULT 0,
    deleted smallint(1)                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE actor_rating
(
   actor_id INT(9)                                      NOT NULL,
   genre_id  INT(9)                                     NOT NULL,
   rating_value SMALLINT(3)                             NOT NULL,
   created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY(actor_id) REFERENCES actor(id),
   FOREIGN KEY(genre_id) REFERENCES genre(id)
);
CREATE TABLE director
  (
    id     INT(9) AUTO_INCREMENT,
    firstname  VARCHAR2(30 CHAR)                        NOT NULL,
    lastname  VARCHAR2(30 CHAR)                         NOT NULL,
    current_wage  INT(9)                                DEFAULT 0,
    image_url   VARCHAR2(MAX)                           DEFAULT 'director_default.gif',
    owner  INT(9)                                       DEFAULT 0,
    deleted smallint(1)                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE director_rating
(
   director_id INT(9)                                      NOT NULL,
   genre_id  INT(9)                                     NOT NULL,
   rating_value SMALLINT(3)                             NOT NULL,
   created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY(director_id) REFERENCES director(id),
   FOREIGN KEY(genre_id) REFERENCES genre(id)
);
CREATE TABLE film_actor
  (
    film_id     INT(9)                              NOT NULL,
    actor_id    INT(9)                              NOT NULL,
    deleted smallint(1)                             DEFAULT 0,
    FOREIGN KEY(film_id) REFERENCES film(id),
    FOREIGN KEY(actor_id)   REFERENCES actor(id)
  );

CREATE TABLE film_actor_offer
  (
    film_id     INT(9)                                  NOT NULL,
    actor_id    INT(9)                                  NOT NULL,
    deleted smallint(1)                                 DEFAULT 0,
    created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(film_id) REFERENCES film(id),
    FOREIGN KEY(actor_id)   REFERENCES actor(id)
  );
CREATE TABLE film_director_offer
  (
    film_id     INT(9)                                  NOT NULL,
    director_id    INT(9)                                  NOT NULL,
    deleted smallint(1)                                 DEFAULT 0,
    created_at DATETIME NOT NULL                         DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(film_id) REFERENCES film(id),
    FOREIGN KEY(director_id)   REFERENCES director(id)
  );
CREATE TABLE cinema
  (
    id     INT(9) AUTO_INCREMENT,
    cinemaname  VARCHAR2(30 CHAR)                                        NOT NULL,
    maxaudience     INT(9)                                              NOT NULL,
    minaudience     INT(9)                                              NOT NULL,
    mindays     INT(9)                                                  NOT NULL,
    maxdays     INT(9)                                                  NOT NULL,
    deleted smallint(1)                                                 DEFAULT 0,
    PRIMARY KEY (id)
  );
CREATE TABLE cinema_offer
  (
    film_id     INT(9)                              NOT NULL,
    noofdays     INT(3)                              DEFAULT 1,
    deleted smallint(1)                                                 DEFAULT 0,
    FOREIGN KEY(film_id) REFERENCES film(id)
  );
CREATE TABLE cinema_release
  (
    id     INT(9) AUTO_INCREMENT,
    film_id     INT(9)                              NOT NULL,
    cinema_id     INT(3)                              NOT NULL,
    releasedate     DATETIME                              NOT NULL,
    enddate     DATETIME                              NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY(film_id) REFERENCES film(id),
    FOREIGN KEY(cinema_id)   REFERENCES cinema(id)
  );
CREATE TABLE cinema_result
  (
    release_id     INT(9)                              NOT NULL,
    resulttime     DATETIME                              NOT NULL,
    FOREIGN KEY(release_id) REFERENCES cinema_release(id)
  );

COMMIT;


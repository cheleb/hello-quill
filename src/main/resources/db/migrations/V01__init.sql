CREATE TABLE person(
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    firstname text NOT NULL,
    lastname text NOT NULL,
    age int NOT NULL
);

CREATE TABLE course(
    id serial PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE person_x_course(
    person_id uuid NOT NULL,
    course_id int NOT NULL,
    PRIMARY KEY (person_id, course_id)
);


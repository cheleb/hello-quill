CREATE TABLE IF NOT EXISTS companies(
    id bigserial PRIMARY KEY,
    slug text NOT NULL UNIQUE,
    name text NOT NULL UNIQUE,
    url text NOT NULL,
    location text,
    country text,
    industry text,
    image text,
    tags text[]
);

INSERT INTO companies(slug, name, url, location, country, industry, image, tags)
    VALUES ('acme', 'Acme Corp', 'https://www.acme.com', 'New York', 'USA', 'Software', 'acme.jpg', ARRAY['software', 'new-york']);


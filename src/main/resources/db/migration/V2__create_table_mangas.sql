CREATE TABLE IF NOT EXISTS manga (
    id VARCHAR(50) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    year VARCHAR(4),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    author_id VARCHAR(50) NOT NULL,
    CONSTRAINT FK_author_id FOREIGN KEY (author_id) REFERENCES author (id)
);
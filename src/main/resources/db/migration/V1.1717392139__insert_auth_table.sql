insert into roles(title)
values
    ('ROLE_ADMIN'),
    ('ROLE_MANAGER'),
    ('ROLE_USER'),
    ('ROLE_GUEST');

insert into users(username, password)
values
       ('admin', '$2a$08$t4/kR7MHkBJp47Qs82nf/u4xZd5OwOus5Xgq71PZ3LxN7HEOKCWZa'),
       ('manager', '$2a$08$t4/kR7MHkBJp47Qs82nf/u4xZd5OwOus5Xgq71PZ3LxN7HEOKCWZa'),
       ('user', '$2a$08$t4/kR7MHkBJp47Qs82nf/u4xZd5OwOus5Xgq71PZ3LxN7HEOKCWZa'),
       ('guest', '$2a$08$t4/kR7MHkBJp47Qs82nf/u4xZd5OwOus5Xgq71PZ3LxN7HEOKCWZa');
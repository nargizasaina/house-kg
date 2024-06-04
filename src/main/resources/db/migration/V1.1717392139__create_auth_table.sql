create table if not exists users (
    id bigserial primary key,
    username varchar (30) unique not null,
    password varchar not null,
    date_create timestamp with time zone not null default now()
);

create table if not exists roles (
    id bigserial primary key,
    title varchar unique not null
);

create table if not exists m2m_users_roles (
     user_id bigint references users(id),
     role_id bigint references roles(id),
    constraint some_user_role unique (user_id, role_id)
);
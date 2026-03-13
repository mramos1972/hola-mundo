create table if not exists messages (
  id bigserial primary key,
  msg_key varchar(100) not null unique,
  msg_text text not null,
  updated_at timestamp not null default now()
);

insert into messages (msg_key, msg_text)
values ('hello', 'Hola mundo desde PostgreSQL (con Flyway)')
on conflict (msg_key) do update
set msg_text = excluded.msg_text,
    updated_at = now();

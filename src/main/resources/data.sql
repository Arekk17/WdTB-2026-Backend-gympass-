-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- LAB 01: konta zespołu GymPass
insert into user_account (email, display_name, role, created_at) values
    ('arkadiusz.daszkowski@student.merito.pl', 'Arkadiusz', 'USER', current_timestamp),
    ('jakub.bujnicki@student.merito.pl',       'Jakub',     'USER', current_timestamp),
    ('michal.jurecki@student.merito.pl',       'Michał',    'USER', current_timestamp);

-- ===== LAB 02 · pass_type =====
insert into pass_type (name, kind, price, duration_days, entry_limit) values
    ('Open miesięczny', 'TIME',     149.00, 30,   null),
    ('Open roczny',     'TIME',    1299.00, 365,  null),
    ('Karnet 10 wejść', 'ENTRIES',  120.00, null, 10);

-- ===== LAB 02 · gym_class =====
insert into gym_class (name, instructor, starts_at, duration_minutes, capacity) values
    ('Crossfit',     'Tomasz Lis',     '2026-11-03 18:00:00', 60, 12),
    ('Joga poranna', 'Anna Zielińska', '2026-11-04 07:30:00', 45, 15),
    ('Spinning',     'Piotr Mazur',    '2026-11-05 19:00:00', 50, 20);

-- ===== LAB 02 · gym_member =====
insert into gym_member (full_name, email, phone, joined_on, street, city, postal_code) values
    ('Katarzyna Nowak', 'k.nowak@example.com',    '600111222', '2026-09-15', 'Legnicka 10',    'Wrocław', '54-203'),
    ('Paweł Wójcik',    'p.wojcik@example.com',   null,        '2026-10-01', null,             null,      null),
    ('Magda Kamińska',  'm.kaminska@example.com', '601333444', '2026-10-20', 'Grabiszyńska 5', 'Wrocław', '53-501');

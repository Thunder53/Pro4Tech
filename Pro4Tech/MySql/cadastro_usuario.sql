create database pro4tech;

use pro4tech;

CREATE TABLE cadastro_usuario(
	email varchar(50) not null unique,
    senha varchar(50) not null,
    nome varchar(50) not null,
    cpf int(50) not null primary key,
    data_nasc date not null,
    formaçao_acad varchar(200) not null,
    pretensao_salarial dec(50) null,
    cargo_interesse varchar(50) null,
    experiencia_profissional varchar(50) null, 
    telefone varchar(50) not null);


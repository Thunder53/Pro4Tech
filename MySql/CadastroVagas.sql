-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Candidato (
nome VARCHAR(10),
cpf VARCHAR(10) PRIMARY KEY,
telefone VARCHAR(10),
data_nasc VARCHAR(10),
email VARCHAR(10),
senha VARCHAR(10),
formacao_acad VARCHAR(10),
pretensao_salarial VARCHAR(10),
cargo_interesse VARCHAR(10),
experiencia_profissional VARCHAR(10)
)

CREATE TABLE RH (
email VARCHAR(10) PRIMARY KEY,
nome_func VARCHAR(10),
nome_vaga VARCHAR(10)
)

CREATE TABLE Vagas (
nome_vaga VARCHAR(10) PRIMARY KEY,
carga_horaria VARCHAR(10),
modelo VARCHAR(10),
salario VARCHAR(10),
requisitos VARCHAR(10),
escolaridade VARCHAR(10),
soft_skills VARCHAR(10),
hard_skills VARCHAR(10),
responsavel VARCHAR(10)
)

CREATE TABLE  (
cpf VARCHAR(10),
nome_vaga VARCHAR(10),
FOREIGN KEY(cpf) REFERENCES Candidato (cpf),
FOREIGN KEY(nome_vaga) REFERENCES Vagas (nome_vaga)
)

ALTER TABLE RH ADD FOREIGN KEY(nome_vaga) REFERENCES Vagas (nome_vaga)

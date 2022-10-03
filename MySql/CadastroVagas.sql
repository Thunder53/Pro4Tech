-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Vagas (
desc_vaga VARCHAR(10),
nome_vaga VARCHAR(10),
id_vaga VARCHAR(10) PRIMARY KEY,
salario VARCHAR(10)
)

CREATE TABLE Candidato (
cpf VARCHAR(10) PRIMARY KEY,
telefone VARCHAR(10),
nome VARCHAR(10),
data_nasc VARCHAR(10),
email VARCHAR(10),
pretensao_salarial VARCHAR(10),
formacao_acad VARCHAR(10),
experiencia_profissional VARCHAR(10),
cargo_interesse VARCHAR(10),
senha VARCHAR(10)
)

CREATE TABLE RH (
email VARCHAR(10) PRIMARY KEY,
nome_func VARCHAR(10),
id_vaga VARCHAR(10),
FOREIGN KEY(id_vaga) REFERENCES Vagas (id_vaga)
)

CREATE TABLE  (
cpf VARCHAR(10),
id_vaga VARCHAR(10),
FOREIGN KEY(cpf) REFERENCES Candidato (cpf),
FOREIGN KEY(id_vaga) REFERENCES Vagas (id_vaga)
)


## Banco de dados

CREATE SCHEMA IF NOT EXISTS cadastro; //evitar erro caso o banco de dados já exista

USE cadastro;

CREATE TABLE Paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    telefone VARCHAR(15),
    relatorio VARCHAR(140)
);

CREATE TABLE Medico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100),
    crm VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE Consulta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT,
    id_medico INT,
    data DATE NOT NULL,
    hora TIME NOT NULL,
    observacao TEXT,
    FOREIGN KEY (id_paciente) REFERENCES Paciente(id),
    FOREIGN KEY (id_medico) REFERENCES Medico(id)
);


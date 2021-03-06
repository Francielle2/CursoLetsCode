CREATE DATABASE SISTEMA_ESCOLA;

USE SISTEMA_ESCOLA;

CREATE TABLE ALUNO(
ID_ALUNO INT PRIMARY KEY AUTO_INCREMENT,
NOME_ALUNO VARCHAR(100) NOT NULL,
EMAIL VARCHAR(255) NOT NULL,
ENDERECO VARCHAR(255) NOT NULL,
MENSALIDADE NUMERIC(9,2) NOT NULL,
MAIOR_IDADE INT NOT NULL
);

CREATE TABLE PROFESSOR(
ID_PROFESSOR INT PRIMARY KEY AUTO_INCREMENT,
NOME_PROFESSOR VARCHAR(100) NOT NULL,
SALARIO NUMERIC(9,2) NOT NULL,
IDADE_PROFESSOR INT NOT NULL
);   
   
INSERT INTO PROFESSOR(NOME_PROFESSOR,SALARIO,IDADE_PROFESSOR)
VALUES 
  ('Vinicius Tadeu',104.67,22),
  ('Tad Cohen',897,28),
  ('Rudyard Mcdowell',1780,30),
  ('Octavius Browning',3904.21,43),
  ('Fleur Holmes',904.67,20),
  ('Craig Downs',1234,30),
  ('Keaton Grant',207,19),
  ('Knox Dyer',800,23);

INSERT INTO ALUNO(NOME_ALUNO, EMAIL,ENDERECO,MENSALIDADE,MAIOR_IDADE)
VALUES 
  ('Vance Rocha','vancerocha@gmail.com','P.O. Box 220, 4793 Sociis St.',904.67,30),
  ('Fredericka Moses','frederickamoses@gmail.com','Ap #118-6150 Dui. Av.',615.07,20),
  ('Ivor Hicks','ivorhicks@gmail.com','568-2499 Euismod Avenue',345.33,19),
  ('Zephania Wilson','zaphaniawilsom@outlook.com.br','7622 Phasellus Rd.',341.24,23),
  ('Linus Mcknight','linusmcknight@outlook.com.br','223 Sapien, Street',252.66,27),
  ('Alika Gaines','alikagaines@outlook.com.br','Ap #319-4850 Penatibus Rd.',342.89,12),
  ('Matthew Carrillo','mattehewcarrilo@outlook.com.br','582-7444 Libero Road',582.89,10),
  ('Kyla Dominguez','kyladominguez@outlook.com.br','P.O. Box 175, 2021 Morbi Road',418.49,22),
  ('Philip Hines','philiphines@outlook.com.br','Ap #347-8214 Elit Road',928.40,12),
  ('Virginia Cook','virginiacook@outlook.com.br','Ap #147-2057 Scelerisque St.',283.11,15),
  ('Wyoming Henson','wyominghenson@gmail.com','Ap #206-3483 Duis St.',1039,29),
  ('Ross Maynard','rossmaynard@gmail.com','5998 Sem, Rd.',851.22,27),
  ('Paul Butler','paulbutler@gmail.com','5784 Egestas Rd.',2552,16),
  ('Keefe Wagner','keefewagner@gmail.com','Ap #504-524 Euismod St.',304,13),
  ('Nathy Oliveira','nathyoliveira@gmail.com','Rua fulano de tal.',552.32,18),
  ('Naiara Azevedo','naiaraazevedo@outlook.com.br','Ap #504-524 Euismod St.',333.22,18);

#Alunos maior de idade;
SELECT NOME_ALUNO, MAIOR_IDADE 
FROM ALUNO
WHERE MAIOR_IDADE >= 18
ORDER BY NOME_ALUNO;

#Alunos menor de idade;
SELECT NOME_ALUNO, MAIOR_IDADE 
FROM ALUNO
WHERE MAIOR_IDADE < 18
ORDER BY NOME_ALUNO;

#Alunos com mensalidade maior que 300 reais;
SELECT NOME_ALUNO, MENSALIDADE
FROM ALUNO
WHERE MENSALIDADE >= 300
ORDER BY NOME_ALUNO;

#Alunos com mensalidade menor que 300 reais;
SELECT NOME_ALUNO, MENSALIDADE
FROM ALUNO
WHERE MENSALIDADE < 300
ORDER BY NOME_ALUNO;

#Alunos com limite de listagem em 5;
SELECT NOME_ALUNO
FROM ALUNO
LIMIT 5;

#Alunos com alias para cada coluna, trazendo com os nomes em ingl??s.
SELECT ID_ALUNO AS CODIGO_ALUNO, NOME_ALUNO AS NOME_EM_INGLES, EMAIL AS EMAIL, ENDERECO AS ENDERECO, MENSALIDADE AS MENSALIDADE, MAIOR_IDADE AS IDADE
FROM ALUNO;

#Alunos maior de idade em ordem crescente de nome;
SELECT NOME_ALUNO, MAIOR_IDADE 
FROM ALUNO
WHERE MAIOR_IDADE >= 18
ORDER BY NOME_ALUNO ASC;

#Alunos menor de idade em ordem decrescente de nome;
SELECT NOME_ALUNO, MAIOR_IDADE 
FROM ALUNO
WHERE MAIOR_IDADE >= 18
ORDER BY NOME_ALUNO DESC;

#Alunos que o nome come??am com N;
SELECT NOME_ALUNO
FROM ALUNO
WHERE NOME_ALUNO LIKE 'N%';

#Alunos que tem a letra T no nome;
SELECT NOME_ALUNO
FROM ALUNO
WHERE NOME_ALUNO LIKE '%T%';

#Alunos que moram na Av Paulista;
SELECT NOME_ALUNO, ENDERECO
FROM ALUNO
WHERE ENDERECO = 'Av Paulista';

#Professores que tem sal??rio entre 1000 e 3000 em ordem crescente de nome;
SELECT NOME_PROFESSOR, SALARIO, IDADE_PROFESSOR
FROM PROFESSOR
WHERE SALARIO >=1000 AND SALARIO <= 3000
ORDER BY NOME_PROFESSOR ASC;

#Professores que tem sal??rio entre 100 e 1000 em ordem decrescente de idade;
SELECT NOME_PROFESSOR, SALARIO, IDADE_PROFESSOR
FROM PROFESSOR
WHERE SALARIO >=100 AND SALARIO <=1000
ORDER BY IDADE_PROFESSOR DESC;

#Professores que tem sal??rio entre 500 e 3000 e tamb??m tenham idade entre 20 e 30 anos.   
SELECT NOME_PROFESSOR, SALARIO, IDADE_PROFESSOR
FROM PROFESSOR
WHERE SALARIO >=500 AND SALARIO <= 3000 AND IDADE_PROFESSOR >=20 AND IDADE_PROFESSOR <=30;
   
   

   
   
   
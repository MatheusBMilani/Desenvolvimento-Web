var sqlite3 = require('sqlite3').verbose();
var db = new sqlite3.Database('Empresa.db');


//Roda um script SQL para criar uma table de Funcionario
db.run(
"CREATE TABLE IF NOT EXISTS Funcionario (" +
"id INT NOT NULL PRIMARY KEY, " +
"nome VARCHAR(20) NOT NULL, " +
"idade INT NOT NULL, " +
"endereco VARCHAR(25)) ;"
);

console.log('Tabela criada');
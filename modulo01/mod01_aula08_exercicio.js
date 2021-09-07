//1
for (let cores of [
  "azul", 
  "vermelho", 
  "amarelo", 
  "verde", 
  "rosa"
]) {
  console.log(cores);
};

//2
function media() {
    let total = 0;
    for (let elemento of array) {
      total += elemento;
    }
    return total/array.length;
};
  
var array = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55];
console.log(media(array));
  
//3
let nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"];
let meuNome = "Caroline";

if (nomesComuns.includes(meuNome)) {
console.log("É, nome comum :P");
} else {
console.log("Diferentão, hein? XD");
};
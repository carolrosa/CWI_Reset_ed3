let peso, altura;
let imc = peso / (altura ** 2);
let classificacao = "";

if (imc<18.50) {
  classificacao = "magreza";
} else if (imc<25.00) {
  classificacao = "normal";
} else if (imc<30.00) {
  classificacao = "sobrepeso";
} else if (imc<40.00) {
  classificacao = "obesidade";
} else {
  classificacao = "obesidade grave"
}

switch(classificacao) {
  case "magreza":
    console.log("IMC= " + imc + ". Classificação Magreza.");
    break;
  
  case "normal":
    console.log("IMC= " + imc + ". Classificação Normal.");
    break;

  case "sobrepeso":
    console.log("IMC= " + imc + ". Classificação Sobrepeso.");
    console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
    break;
  
  case "obesidade":
    console.log("IMC= " + imc + ". Classificação Obesidade.");
    console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
    break;
  
  case "obesidade grave":
    console.log("IMC= " + imc + ". Classificação Obesidade Grave.");
    console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
    console.log("É importante procurar um médico para avaliar sua saúde.");
    break;
}
//1
function imprimir(i) {
    console.log(i);
}

//2 - criar funções para os exercícios da aula 05:

//01 - verificar se dois nomes são iguais
function compararNomes (nomeDoFulano, nomeDoBeltrano) {
    return nomeDoFulano == nomeDoBeltrano;
}

//02 - verificar a maioridade
function verificarIdade(idade) {
    return idade >= 18;
}

//03 - calcular o valor do pagamento atrasado; juros a 10%.
function calcularJuros(valorBoleto) {
    let valorComJuros = valorBoleto + (0.10 * valorBoleto);
    return valorComJuros.toFixed(2);
}

//04 - calcular a média dos números de um array
function calcularMedia() {
    let total = 0;
    for (let elemento of array) {
        total += elemento;
    }
    return total/array.length;
}

var array = [1, 2, 3, 4, 5];
calcularMedia(array);

//05 - calcular a margem bruta da empresa e retornar o valor em percentual (*100)
function calcularMargemBruta(receitaLiqVendas, custoProdVendidos) {
    let margemBruta = ((receitaLiqVendas - custoProdVendidos) / receitaLiqVendas) * 100;
    return margemBruta;
}

calcularMargemBruta(1000,500);
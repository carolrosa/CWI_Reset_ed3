//variáveis
colaboradores= ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison'];
idades= [69, 66, 58, 61, 60, 64, 59, 55];
temposDeTrabalho= [31, 29, 30, 26, 25, 24, 26, 29];

/*Função para verificar se o colaborador pode se aposentar.
Regras:
- Ter pelo menos 65 anos de idade;
- Ter trabalhado no mínimo 30 anos;
- Ter pelo menos 60 anos de idade e 25 anos de trabalho*/

function verificarAposentadoria(nome) {
    colaborador = false;
    idade = 0;
    tempoDeTrabalho = 0;
  
    for (i=0; i<colaboradores.length; i++) {
      if (nome == colaboradores[i]) {
        colaborador = true;
        idade = idades[i];
        tempoDeTrabalho = temposDeTrabalho[i];
      }
    }
  
    if (colaborador) {
      if ((idade >= 65) || (tempoDeTrabalho >= 30) || (idade >= 60 && tempoDeTrabalho >= 25)) {
          console.log("Parabéns, já pode sair de férias eternas :)")
      } else {
          console.log("Infelizmente, ainda falta um tempo :(")
      }
    } else {
      console.log("Colaborador inválido :|")
    }
}
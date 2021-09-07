package cwiReset_aula10;

import java.util.Random;

public class Exercicio01 {

    public static void main (String[] args) {

        int[] primeiroVetor = new int[5];
        Random random = new Random();

        for (int i=0; i<5; i++) {
            primeiroVetor[i] = random.nextInt(5);
        }

        int[] segundoVetor = new int[primeiroVetor.length];
        for (int i=0; i< primeiroVetor.length; i++) {
            segundoVetor[i] = primeiroVetor[i]*2;
        }

        System.out.println("Primeiro vetor");
        for (int valor : primeiroVetor)
            System.out.println(valor);

        System.out.println("Segundo vetor");
        for (int valor : segundoVetor)
            System.out.println(valor);

    }
}

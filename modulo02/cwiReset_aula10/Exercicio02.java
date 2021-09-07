package cwiReset_aula10;

import java.util.Random;

public class Exercicio02 {

    public static void main (String[] args) {

        int[] idades = new int[10];
        Random random = new Random();

        for (int i=0; i<10; i++) {
            idades[i] = random.nextInt(40);
        }

        int count = 0;
        for (int maiorIdade : idades) {
            if (maiorIdade >= 18) {
                count++;
            }
        }

        System.out.println("Vetor:");
        for (int idade : idades)
            System.out.println(idade);

        System.out.println("Pessoas maiores de idade:" + count);
    }
}

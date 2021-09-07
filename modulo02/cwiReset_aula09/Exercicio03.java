package cwiReset_aula09;

import java.util.Scanner;

public class Exercicio03 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;

        for (int i=0; i<5; i++) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}

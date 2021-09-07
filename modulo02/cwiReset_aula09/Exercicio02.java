package cwiReset_aula09;

import java.util.Scanner;

public class Exercicio02 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scan.nextInt();

        boolean valorFinalMaior = false;
        int segundoNumero = 0;

        do {
            System.out.println("Digite o segundo número:");
            segundoNumero = scan.nextInt();
            if (segundoNumero > primeiroNumero) {
                valorFinalMaior = true;
            } else {
                System.out.println("Segundo número precisa ser maior que o primeiro");
            }
        } while (!valorFinalMaior);

        for (int i=primeiroNumero; i<=segundoNumero; i++) {
            System.out.println(i);
        }
    }
}

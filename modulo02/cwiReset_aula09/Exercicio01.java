package cwiReset_aula09;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Informe uma nota, de zero a dez");
            nota = scan.nextDouble();
        } while (nota<0 || nota>10);

        System.out.println("Valor da nota: " + nota);
    }
}

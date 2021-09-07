package cwiReset_aula09;

import java.util.Scanner;

public class Exercicio04 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da tabuada:");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);
        for (int i=1; i<=10; i++) {
            System.out.println(tabuada + " x " + i + " = " + tabuada * i );
        }
    }
}

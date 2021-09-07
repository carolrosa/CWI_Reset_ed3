package cwiReset_aula07;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite outro número inteiro:");
        int segundoNumero = scan.nextInt();
        int resultado = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números digitados é: " + resultado);

    }
}

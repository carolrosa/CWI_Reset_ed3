package cwiReset_aula08;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double segundaNota = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        double terceiraNota = scan.nextDouble();

        System.out.println("Digite a quarta nota:");
        double quartaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media < 7.0) {
            System.out.println("Aluno reprovado");
        } else if (media >= 7.0 && media < 10.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno aprovado com louvores");
        }

    }






}

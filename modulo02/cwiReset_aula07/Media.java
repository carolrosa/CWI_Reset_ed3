package cwiReset_aula07;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as quatro notas do aluno:");
        double notaUm = scan.nextDouble();
        double notaDois = scan.nextDouble();
        double notaTres = scan.nextDouble();
        double notaQuatro = scan.nextDouble();
        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        System.out.printf("A média do aluno é: " + "%.2f", media);
    }
}

package cwiReset_aula07;

import java.util.Scanner;

public class SalarioMes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho:");
        double valorHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês:");
        int horasMes = scan.nextInt();
        double salario = valorHora * horasMes;
        System.out.printf("O salário do mês é: R$ " + "%.2f", salario);
    }
}

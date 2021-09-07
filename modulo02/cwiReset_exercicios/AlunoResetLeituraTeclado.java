package cwiReset_exercicios;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main (String[] args) {
        System.out.println("Digite seu nome:");
        Scanner scan = new Scanner(System.in);
        String nomeAluno = scan.nextLine();
        System.out.println("Sou aluna do Level 1 do CWI Reset! Me chamo " + nomeAluno);
    }
}

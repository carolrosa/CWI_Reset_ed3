package com.company;

public class Arrays {

    public static void main (String[] args) {

        //declaração de array logo após o tipo, e dentro dos colchetes, indicar as posições necessárias
        double[] temperaturas = new double[5];
        temperaturas[0] = 36.5;
        temperaturas[1] = 37.0;
        temperaturas[2] = 35.3;
        temperaturas[3] = 35.9;
        temperaturas[4] = 36.2;

        for (int i=0; i < temperaturas.length; i++) {
            System.out.println("Temperatura " + (i+1) + ": " + temperaturas[i]);
        }
    }
}

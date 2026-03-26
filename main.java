package main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        int quantidadeNotas;

        System.out.print("Digite a quantidade de notas: ");
        quantidadeNotas = ler.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = (int) ler.nextDouble();
        }

        System.out.println("Notas digitadas:");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println(notas[i]);
        }

    }
}
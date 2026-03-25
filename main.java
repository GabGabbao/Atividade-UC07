package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantidadeNotas = 0;
        
        while (true) {
            System.out.print("Digite a quantidade de notas: ");
            if (ler.hasNextInt()) {
                quantidadeNotas = ler.nextInt();
                if (quantidadeNotas > 0) {
                    break;
                } else {
                    System.out.println("Deve haver >0 notas.");
                }
            } else {
                System.out.println("Digite um número válido.");
                ler.next();
            }
        }

        double[] notas = new double[quantidadeNotas];
        
        for (int i = 0; i < quantidadeNotas; i++) {
            while (true) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                if (ler.hasNextDouble()) {
                    double nota = ler.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    } else {
                        System.out.println("Notas devem estar entre 0 e 10");
                    }
                } else {
                    System.out.println("Digite um valor numérico válido.");
                    ler.next();
                }
            }
        }

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println(notas[i]);
        }

        ler.close();
    }
}
package Matrizes;

import java.util.Scanner;

public class Lista01 {

    /*
     * 1. Elabore um programa que declare uma matriz de valores inteiros,
     * cujas dimensões são 5 linhas e 5 colunas (matriz[5x5]). Este programa
     * deverá encontrar o maior e o menor valores contidos na matriz e escrever
     */

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int maior = 0;
        int menor = Integer.MAX_VALUE;

        int[][] vetores = new int[2][2];

        for (int linha = 0; linha < vetores.length; linha++) {
            for (int coluna = 0; coluna < vetores.length; coluna++) {
                System.out.println("informe um valor inteiro: ");
                vetores[linha][coluna] = d.nextInt();

            }
        }

        for (int i = 0; i < vetores.length; i++) {
            for (int j = 0; j < vetores.length; j++) {
                //                 
                if (vetores[i][j] > maior) {
                    maior = vetores[i][j];
                } 

                if (vetores[i][j] < menor) {
                    menor = vetores[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }
}

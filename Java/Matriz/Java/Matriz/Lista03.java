/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrizes;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Lista03 {

    /**
     * @param args the command line arguments
     */
    /*
    3.	Elabore um programa que declare uma matriz de valores inteiros, 
    cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. Este programa 
    deverá realizar o somatório dos elementos da diagonal principal, denominado SP. 
    Também deverá realizar o somatório dos elementos da diagonal secundária, 
    denominado SS Ao final, subtrair SS de SP e mostrar o resultado.
     */
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int[][] vetores = {{2, 1, 1, 1, 4},
                           {1, 2, 1, 4, 1},
                           {1, 1, 2, 1, 1},
                           {1, 4, 1, 2, 1},
                           {4, 1, 1, 1, 2},};
        int sp = 0;
        int ss = 0;
        int memoria = 0;

        /* for (int linha = 0; linha < vetores.length; linha++) {
            for (int coluna = 0; coluna < vetores.length; coluna++) {
                System.out.println("Informe um valor para veotr: ");
                vetores[linha][coluna] = d.nextInt();
            }  
        }*/
        for (int i = 0; i < vetores.length; i++) {
            for (int j = 0; j < vetores.length; j++) {
                System.out.print(vetores[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < vetores.length; i++) {
            sp += vetores[i][i];
        }
        System.out.println("Sp = " + sp);

        int indiceColunaSecundaria = (vetores.length - 1);
        for (int i = 0; i < vetores.length; i++) {
            ss += vetores[i][indiceColunaSecundaria];
            indiceColunaSecundaria--;
        }
        System.out.println("Ss = " + ss);

        System.out.println("Sp -  Ss = " + sp + ss);
    }
}

/*

\ 0 0 0 0 0  
0 \ 0 0 0 0  
0 0 \ 0 0 0 
0 0 0 \ 0 0 
0 0 0 0 \ 0 
0 0 0 0 0 \

 */

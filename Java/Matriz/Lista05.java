/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrizes;

/**
 *
 * @author carla
 */
public class Lista05 {

    /**
     * @param args the command line arguments
     */
    /*
    5.	Elabore um programa que declare uma matriz de valores inteiros,
    cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
    Este programa deverá fazer a troca dos elementos, 
    onde linhas são transferidas para colunas e vice-versa.  
    Exemplo:
     */
    public static void main(String[] args) {
        int[][] vetor = {{1, 1, 1, 1, 1},
                         {2, 2, 2, 2, 2},
                         {3, 3, 3, 3, 3},
                         {4, 4, 4, 4, 4},
                         {5, 5, 5, 5, 5},};

        int aux = 0;
        int valor = 0;

        for (int linha = 0; linha < vetor.length; linha++) {
            /*System.out.println(linha);
            System.out.println(" ");*/
            for (int coluna = 0; coluna < vetor.length; coluna++) {
               aux = vetor[coluna][linha];     
                System.out.print(aux + " ");
            }
            System.out.println(" ");
        }
    }

}

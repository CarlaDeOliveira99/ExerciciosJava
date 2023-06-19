/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrizes02;

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
    cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. Este programa
    deverá fazer a troca dos elementos, onde linhas são transferidas para 
    colunas e vice-versa.  Exemplo:
    Deverá apresentar também ao final:
    a)  Quantos valores trocados de posição são iguais entre si
    b) Quantas trocas foram feitas no total

    */
    public static void main(String[] args) {
        int[][] vetor = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9},
                         };

        int aux = 0;
        int valor = 0;
        int cotIguais = 0;
        int cotTrocas = 0;

        for (int linha = 0; linha < vetor.length; linha++) {
            /*System.out.println(linha);
            System.out.println(" ");*/
            for (int coluna = 0; coluna < vetor.length; coluna++) {
                valor = vetor[linha][coluna];
                aux = vetor[coluna][linha];
                System.out.print(aux + " ");
                
                  if (aux == vetor[linha][coluna]) {
                        cotIguais++;
                }
                    if (aux != vetor[linha][coluna]) {
                    cotTrocas++;
                }
            }
            System.out.println(" ");
            
        }
        System.out.println("total de valores trocado que sao iguais: " + cotIguais);
        System.out.println("foi feitas " + cotTrocas + " trocas");
    }

}

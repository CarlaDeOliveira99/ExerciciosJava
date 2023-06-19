/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Lista01 {

    /**
     * @param args the command line arguments
     */
    /*
    1.	Leia um vetor de inteiros de 12 posições e em seguida ler também 
    dois valores X e Y quaisquer correspondentes a duas posições no vetor. 
    Ao final seu programa deverá escrever a soma dos valores encontrados nas
    respectivas posições X e Y.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10]; // criado vetor

        // preenchimento do vetor
        for (int x = 0; x < lista.length; x++) {   // aqui vai preencher cada pocisao do vetor
            System.out.println("Informe o valor da posicao " + x);
            lista[x] = s.nextInt();

        }

        // leitura dos valores e soma
        System.out.println("Informe o valor da posicao (indice) do vetor ");  // idx = indice
        int idx = s.nextInt();

        while ((idx < 0) && (idx < lista.length)) {
            System.out.println("Incorreto!! Informe o valor da posicao (indice) do vetor ");  // idx = indice
            idx = s.nextInt();
        }
        int vl1 = lista[idx];

        System.out.println("Informe mais um valor da posicao (indice) do vetor ");  // idx = indice
        idx = s.nextInt();
        while ((idx < 0) && (idx < lista.length)) {
            System.out.println("Incorreto!! Informe o valor da posicao (indice) do vetor ");  // idx = indice
            idx = s.nextInt();
        }
        int vl2 = lista[idx];

        System.out.println("A soma é: " + (vl1 + vl2));
    }

}

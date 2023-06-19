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
public class Lista03 {

    /**
     * @param args the command line arguments
     */
    /*
    3.a um vetor de inteiros de 16 posições e troque os 8 primeiros
    valores pelos 8 últimos e vice-e-versa. Não pode criar vetor auxiliar.
    Escreva ao final o vetor obtido.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[16];
        int valor = 0;
        int aux = 0;
        int meio = (lista.length / 2 )- 1;

      //preencher o vetor;
        for (int x = 0; x < lista.length; x++) {
            System.out.println("informe um valor: ");
            lista[x] = s.nextInt();
        }

        // reorganizar o vetor 
        // imprimir o vetor
        for (int x = 0; x <= meio; x++) {
            aux = lista[x];
            lista[x] = lista[x + meio + 1];
            lista[x + meio + 1] = aux;

            
        }

        for (int x =0; x < lista.length; x++) {
            System.out.println(lista[x]); 
        }
        
    }

}

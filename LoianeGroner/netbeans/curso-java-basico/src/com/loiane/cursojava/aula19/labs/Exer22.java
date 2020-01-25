/* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
 * 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
 * para implementar um programa que determine o percentual de
 * números 0's e 1's existentes no vetor A.
 */
package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.round;

/**
 *
 * @author loiane
 */
public class Exer22 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;
        
        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) round(random() * 1);
            
            if (vetorA[i] == 0){
                qtd0++;
            } else {
                qtd1++;
            }
        }
        
        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;
        
        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porc 0 = " + porc0);
        System.out.println("Porc 1 = " + porc1);
    }    
}

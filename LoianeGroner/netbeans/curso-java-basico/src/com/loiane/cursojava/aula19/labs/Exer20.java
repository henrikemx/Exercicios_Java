/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer20 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[20];
        double cotacao;
        DecimalFormat df = new DecimalFormat();
        
        System.out.print("Entre com a cotação do dólar: R$ ");
        cotacao = scan.nextDouble();
        
        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = cotacao * (i+1);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(df.format(vetorA[i]) + " | ");
        }
        System.out.println();
    }    
}

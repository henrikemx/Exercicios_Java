/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer18 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Este numero não é primo pois é divisível por " + i);
                primo = false;
                //break;
            }
        }
        
        if (primo){
            System.out.println("É número primo");
        }
    }
}
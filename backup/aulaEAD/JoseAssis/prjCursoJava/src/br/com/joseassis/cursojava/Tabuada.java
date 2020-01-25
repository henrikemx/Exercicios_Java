/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

import java.util.Scanner;

/**
 * Aula 9 - Tabuada (estrutura de repetição)
 * @author Henrique
 */
public class Tabuada {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
    
}
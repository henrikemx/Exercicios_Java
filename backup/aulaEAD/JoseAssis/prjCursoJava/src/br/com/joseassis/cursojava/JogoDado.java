/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

import java.util.Scanner;

/**
 * Aula 10 - Jogo do Dado
 *
 * @author Henrique
 */
public class JogoDado {

    public static void main(String[] args) {
        char opcao = 's';
        Scanner teclado = new Scanner(System.in);
        while (opcao == 's') {
            System.out.println("Lançamento do dado...");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face sorteado do dado foi: " + dado);
            System.out.print("Deseja lançar o dado novamente (S/N) ? ");
            opcao = teclado.next().charAt(0);
        }
    }
}

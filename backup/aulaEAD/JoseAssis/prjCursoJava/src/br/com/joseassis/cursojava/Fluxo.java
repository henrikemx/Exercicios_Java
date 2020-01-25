package br.com.joseassis.cursojava;

import java.util.Scanner;

/**
 * Aula 7 - Estrutura de decisão
 *
 * @author Henrique
 */
public class Fluxo {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Seu nome é " + nome + " e voce tem " + idade + " anos !!");
        if (idade >= 18) {
            System.out.println("É maior de idade !!");
        } else {
            System.out.println("É menor de idade !!");
        }
    }
}

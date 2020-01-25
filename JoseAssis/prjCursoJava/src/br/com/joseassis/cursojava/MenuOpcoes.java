/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

import java.util.Scanner;

/**
 * Aula 11 - Estrutura Switch Case e funções (Menu de opções)
 *
 * @author Henrique
 */
public class MenuOpcoes {

    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistemas");
        System.out.println("1) Windows");
        System.out.println("2) Linux");
        System.out.print("Digite a opção desejada: ");
        opcao = teclado.nextInt();
        // a estrutura abaixo permite a escolha de uma opção da lista e é
        // semelhante ao if - else
        switch (opcao) {
            case 1:
                windows();
                break;
            case 2:
                linux();
                break;
            default:
                System.out.println("Opção inválida !");
                break;
        }
    }

    public static void windows() {
        System.out.println("Carregando o Windows...");
        System.out.println(".......................");
    }

    public static void linux() {
        System.out.println("Carregando o Linux...");
        System.out.println(".......................");
    }
}

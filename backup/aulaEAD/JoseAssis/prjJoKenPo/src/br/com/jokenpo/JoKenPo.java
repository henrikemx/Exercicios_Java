/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jokenpo;

import java.util.Scanner;

/**
 * Aula 12 - JoKenPo ou Jogo pedra/papel/tesoura
 *
 * @author Henrique
 */
public class JoKenPo {

    public static void main(String[] args) {
        // abaixo eaminaremos a lógica do jogo
        int jogador;
        Scanner mao = new Scanner(System.in);
        System.out.println("____JoKenPo____");
        System.out.println("_______________");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite a opçao desejada: ");
        jogador = mao.nextInt();
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA");
                break;
            default:
                System.out.println("Opção Inválida !!");
                break;
        }
        // montando a lógica do computador
        int computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA");
                break;
        }
        // a seguir será defnido a lógica do jogo
        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("Jogador VENCEU !!");
            } else {
                System.out.println("Computador VENCEU !!");
            }
        } else {
            System.out.println("Empate entre os jogadores");
        }
    }
}

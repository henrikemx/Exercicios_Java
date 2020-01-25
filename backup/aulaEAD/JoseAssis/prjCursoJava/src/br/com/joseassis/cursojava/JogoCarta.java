/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

/**
 * Aula 15 - Jogo de Cartas (Baralho)
 *
 * @author Henrique
 */
public class JogoCarta {

    public static void main(String[] args) {
        String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
        String[] faces = {"As", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        // as linhas abaxo recuperam, de forma aleatória, o conteudo dos arrays
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        // a linha abaixo exibe a carta sorteada
        System.out.println(face + " de " + nipe);
    }
}

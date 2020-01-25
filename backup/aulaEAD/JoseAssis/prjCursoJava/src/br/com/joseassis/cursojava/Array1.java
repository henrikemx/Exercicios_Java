/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

/**
 * Aula 14 - Arrays
 *
 * @author Henrique
 */
public class Array1 {

    public static void main(String[] args) {
        // a linha abaixo cria um Array simples
        String[] times = {"Corintians", "Palmeiras", "São Paulo", "Santos"};
        // a linh abaixo recupera o conteudo de uma array
        // a recuperação é feita pelo indice [0][1][2][3]
        System.out.println(times[0]);
        // a linha abaio exibe o tamanho total do array
        System.out.println(times.length);
        // a linha abaixo modifica o conteudo de uma posição de uma array
        times[0] = "Flamengo";
        System.out.println(times[0]);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Aula 8 - Calculo da média
 *
 * @author Henrique
 */
public class CalculoMedia {

    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        // a linha abaixo cria um objeto para formatar a saída do resultado
        DecimalFormat formatador = new DecimalFormat("#0.0");
        System.out.println("Digite a primeira nota");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é de: " + formatador.format(media));
        if (media <= 2) {
            System.out.println("Reprovado !!");
        } else if ((media > 2) && (media < 6)) {
            System.out.println("Em recuperação !!");
        } else {
            System.out.println("Aprovado !!");
                }
    }
    
}

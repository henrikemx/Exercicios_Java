/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joseassis.cursojava;

/**
 * Aula 16 - Arrays Multidimensionais
 *
 * @author Henrique
 */
public class Array2 {

    public static void main(String[] args) {
        String[][] agenda = {{"José de Assis", "91234-1234", "professorjoseassis@gmail.com"},
        {"Bill Gates", "2222-2222", "bill@outlook.com"}, {"Linus Torvalds", "99999-9999", "tux@linux.com"}};
        // a linha abaixo recupera o telefone de José
        // System.out.println(agenda[0][1]);
        // as estruturas abaixo percorrem os indices dos arrays
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("______________________________");
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
            
        }
    }
}

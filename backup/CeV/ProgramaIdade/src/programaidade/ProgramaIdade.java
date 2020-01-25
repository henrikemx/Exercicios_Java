/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author henrique
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // O trecho abaixo forma uma estrutura condicional composta...
        Scanner t = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        if (i >= 18){
            System.out.println("Voce tem " + i + " anos e é Maior de idade");
        } else {
            System.out.println("Voce tem " + i + " anos e é Menor de idade");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author henrique
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.printf("O valor informado é: %s\n\n", valor);
        */
        
        /* 
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.printf("O valor informado é: %s\n\n", idade);
        */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("O valor informado é: %.2f\n\n", idade);
        }
    
}
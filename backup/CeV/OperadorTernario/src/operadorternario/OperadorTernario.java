/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author henrique
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r1, r2, r3;
        n1 = 14;
        n2 = 8;
        // Exemplos de saida dependendo da comparação
        r1 = (n1 > n2) ? 0:1;
        System.out.println("O valor de 'r' foi de: " + r1);
        r2 = (n1 > n2) ? n1:n2;
        System.out.println("O maior valor é de: " + r2);
        r3 = (n1 > n2) ? (n1 + n2):(n1 - n2);
        System.out.println("O valor de saída será de: " + r3);

        // Operadores relacionais
        // > maior que
        // < menor que
        // <= maior ou igual a 
        // >= menor ou igual a
        // ==  igual
        // != diferente
        // para qualquer condição, o resultado será sempre 'true' ou 'false'
        
    }   
    
}

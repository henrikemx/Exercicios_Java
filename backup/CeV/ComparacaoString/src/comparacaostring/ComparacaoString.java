/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author henrique
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Operadores relacionais
        // > maior que
        // < menor que
        // <= maior ou igual a 
        // >= menor ou igual a
        // ==  igual
        // != diferente
        // para qualquer condição, o resultado será sempre 'true' ou 'false'
        
        // Nos exemplos abaixo, não confundir String (Classe) com string (variável)
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res1, res2;
        res1 = (nome1 == nome3)?"Sim":"Não";
        System.out.println("Os conteúdos são iguais ? " + res1);
        // No exemplo abaixo, usaremos um método da classe String para comparar o conteudo da sclasses
        res2 = (nome1.equals(nome3))?"Sim":"Não";
        System.out.println("Os conteúdos são iguais ? " + res2);
    }
}

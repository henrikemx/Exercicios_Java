/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author henrique
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        * este trecho pertence a aula 07 de Java
        *
        int n1 = 10;
        int n2 = 3;
        float m = (n1 + n2)/2;
        System.out.printf("A média entre %d e %d é %.2f \n\n", n1, n2, m);
        */
        
        /*
        // o código abaixo pertence a 2ª parte da aula 7
        
        // o exemplo abaixo vẽ-se o processo de pré-incremento
        
        System.out.println("\nO exemplo abaixo vẽ-se o processo de pré-incremento\n");
        int numero1 = 10;
        int valor1 = 4 + --numero1;
        System.out.println("O conteudo da variável com pré decremento é " + numero1);
        System.out.println("A soma de 4 + 10 com pré decremento " + valor1);
        
        // o exemplo abaixo vê-se o processo de pós incremento
        
        System.out.println("\nO exemplo abaixo vê-se o processo de pós incremento\n");
        int numero2 = 10;
        int valor2 = 4 + numero2--;        
        System.out.println("O conteudo da variável com pós decremento é " + numero2);
        System.out.println("A soma de 4 + 10 com pós decremento " + valor2);
        */
        
        /*
        // o exemplo abaixo é sobre opradores de atribuição
        
        // a += b <=> a = a + b
        // a -= b <=> a = a - b
        // a *= b <=> a = a * b
        // a /= b <=> a = a / b
        // a %= b <=> a = a % b
        
        int x = 4;
        x += 2; // equivale a x = x + 2
        System.out.println("\nO resultado de x += 2 para x = 4 será " + x);
        x -= 2; // equivale a x = x - 2
        System.out.println("\nO resultado de x -= 2 para x = 4 será " + x);
        x *= 2;
        System.out.println("\nO resultado de x *= 2 para x = 4 será " + x);
        x /= 2;
        System.out.println("\nO resultado de x /= 2 para x = 4 será " + x);
        x %= 2;
        System.out.println("\nO resultado de x %= 2 para x = 4 será " + x);
        */
        
        // Classe Math
        
        // Exemplos de métodos da classe Math
        // Math.PI sendo Math => nome da classe e PI o nome do método
        // Math.pow (exponenciação)
        // Exemplo: Math.pow(5, 2) => 5 elevado a 2
        // Math.sqrt (raiz quadrada)
        // Exemplo: Mat.sqrt(25) => raiz quadrada de 25 será 5
        // Math.cbrt (raiz cúbica)
        // Exemplo: Math.cbrt(27) => raiz cubica de 27 será 3
        
        // Arredondamentos, exemplos...
        // Valor absoluto => Math.abs(-10) => 10
        // Arredonda para baixo => Math.floor(3.9) => 3
        // Arredonda para cima => Math.ceil(4.2) => 5
        // Arredonda aritméticamente => Math.round(5.6) => 6
        
        /*
        float v = 8.4f;
        System.out.println("O valor de 'v' é: " + v);
        int arfloor = (int) Math.floor(v);
        System.out.println("\nO valor de ar arredondado para baixo será: " + arfloor);
        int arceil = (int) Math.ceil(v);
        System.out.println("\nO valor de ar arredondado para cima será: " + arceil);
        int arround = (int) Math.round(v);
        System.out.println("\nO valor de ar arredondado para aritméticamente será: " + arround);
        */
        
        // trabalhando com numeros randomicos
        // No exemplo abaixo iremos gerar um numero entre 5 e 10 ...
        
        double ale = Math.random();
        int n = (int) (5 + ale * (10-5));
        System.out.println("O valor de 'n' é : " + ale + " e para 'ale' será: " + n);
    }
    
}

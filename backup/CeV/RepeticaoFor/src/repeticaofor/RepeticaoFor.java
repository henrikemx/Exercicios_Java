
package repeticaofor;

/**
 *
 * @author henrique
 */
public class RepeticaoFor {

    
    public static void main(String[] args) {
         System.out.println("=== Abaixo um exemplo de contagem crescente ====\n");
         for (int cc = 0; cc <= 3; cc++) {
            System.out.println("Cambalhota nº " + (cc + 1));
        }
         System.out.println("\n=== Abaixo um exemplo de contagem decrescente ====\n");
         for (int cc = 15; cc >= 0; cc -= 2) {
             System.out.println("Cambalhota nº " + cc);
        }
    }
    
}

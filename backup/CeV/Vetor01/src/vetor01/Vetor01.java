
package vetor01;

/**
 *
 * @author henrique
 */
public class Vetor01 {

    
    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        System.out.println("O total de índices em N é de: " + n.length + "\n");
        /* for (int c = 0; c <= 5; c++) {*/
        for (int c = 0; c < n.length - 1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}

package vetor04;

import java.util.Arrays;

/**
 *
 * @author henrique
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3,7,6,1,9,4,2};
        for (int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int pos = Arrays.binarySearch(vet, 3);
        System.out.println("Encontrei o valor na posição " + pos);
    }
    
}

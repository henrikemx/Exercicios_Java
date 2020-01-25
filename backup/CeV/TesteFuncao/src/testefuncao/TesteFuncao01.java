package testefuncao;
/**
 * @author henrique
 */
public class TesteFuncao01 {
    
    static int soma(int a, int b){
        int s = a + b;
        /* System.out.println("A soma de " + a + " + " + b + " = " + s);*/
        return s;
    }

    public static void main(String[] args) {
        System.out.println("=== Inicio da aplicação ===\n");
        /* soma(5,2); */
        int sm = soma(5, 2);
        System.out.println("A soma é " + sm);
        System.out.print("\n");
    }
    
}

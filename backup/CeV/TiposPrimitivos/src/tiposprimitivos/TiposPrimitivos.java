package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author henrique
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Informe a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.println("=== Exemplos de formatação de saída ===\n");
        System.out.println("01. A sua nota é " + nota + " com '.println'\n");
        System.out.printf("02. A sua nota é %.2f com '.printf'\n\n", nota);
        System.out.printf("03. A nota de %s é %.2f com '.printf' e declarando uma String\n\n", nome, nota);
        System.out.format("04. A nota de %s é %.2f com '.format'\n\n", nome, nota);
    }
    
}

package start;

import java.text.DecimalFormat;

public class somaNumeros {

    public static void main(String[] args) {
        int n = 0;
        somaNumeros(5);
    }

    public static void somaNumeros(int n) {

        int soma = 0;

        DecimalFormat df = new DecimalFormat("##");

        for (int i = 0; i < n; i++) {
            int numeroRandomico = (int) (10 + Math.random() * (100 - 10));
            System.out.println("Numero sem formatação: " + numeroRandomico);
            System.out.println("Número randomico: " + df.format(numeroRandomico));
            soma += numeroRandomico;
            System.out.println("soma: " + soma);
        }

        System.out.println("A soma dos números é: " + soma);

    }
}

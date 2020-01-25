package algaworks.java.comunidade;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        int numTurmas;
        int alunosTotal = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de turmas: ");
        numTurmas = sc.nextInt();

        for (int i = 0; i < numTurmas; i++) {
            System.out.print("Informe a quantidade de alunos da turma " + i + " : ");
            int alunos = sc.nextInt();
            if (alunos < 0 || alunos > 40) {
                System.out.println("Quantidade de alunos inválida!");
                i--;
            } else {
                alunosTotal += alunos;
            }
        }

        if (alunosTotal > 0) {
            System.out.println("Media: " + alunosTotal / numTurmas + " alunos/turma !");
        } else {
            System.out.println("Alunos zero!");
        }
    }

}

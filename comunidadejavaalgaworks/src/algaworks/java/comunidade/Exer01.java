package algaworks.java.comunidade;

import java.io.Console;

public class Exer01 {

    public static void main (String[] args) {

	int totalAluno = 0;
        
	Console.Write("Quantidade de Turmas: ");
	int numTurmas = int.Parse(Console.ReadLine());

	for (int i = 1; i <= numTurmas; i++) {
		Console.Write("Quantidade de Alunos por Turma: ");
		int numAluno = int.Parse(Console.ReadLine());
		totalAluno += numAluno; 
	}

	double media = totalAluno / numTurmas;

	Console.WriteLine("Media de Aluno por Turma: " + media); 

    }
}

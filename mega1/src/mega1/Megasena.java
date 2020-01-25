package mega1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Megasena {

    public static void main(String[] args) {
        
        // Recurso usado para gerar e armazenar todos os numeros entre 1 e 60
        // Em lugar de se usar Math.random, foi usado uma Interface List, do tipo inteiro.
        // Será definido um objeto de nome 'num' que instanciará a Classe ArrayList.
        
        List<Integer> num = new ArrayList<>();
        
        // O List é uma interface e o ArrayList é a classe que a implementa.
        // fonte: http://www.devmedia.com.br/java-collections-set-list-e-iterator/29637
        // o loop 'for' abaixo irá ser executado 60x, fazendo com que o método 'add' 
        // do objeto 'num', incremente o conteúdo da lista em 1.

        for (int i = 1; i <= 60; i++) {
            num.add(i);
        }

        int cont = 0; // será usado para contar a quantidade de jogos solicitados
        String flag = "";

        System.out.println("==== Numeros Sorteados ====\n");

        do {

            cont++; // conta o numero de jogos gerados
            // o método 'shuffle' irá embaralhar os numeros dentro do objeto 'num'
            Collections.shuffle(num);
            
            // o método subList irá selecionar os numeros armazenados nas posições de 0 a 6 no Array
            List<Integer> sorteados = num.subList(0, 6); //
            
            // à seguir, os numeros serão ordenados
            Collections.sort(sorteados);

            for (Integer sorteado : sorteados) {

                if (sorteado < 10) {
                    // verifica se o numero sorteado está entre 1 e 9
                    // e adiciona o caracter zero inicialmente ao numero
                    System.out.print("0" + sorteado + " ");
                } else {
                    System.out.print(sorteado + " ");
                }
            }
            System.out.println("");
            
            // nesse ponto, será exibido uma janela perguntado ao usuário se deseja, ou não, continuar
            // solicitando mais palpites.
            flag = JOptionPane.showInputDialog("Deseja continuar ? S/N");
            
        // a clausula 'while' irá testar se o usuário teclou a letra 's', ou não
        } while (flag.equalsIgnoreCase("S"));

        JOptionPane.showMessageDialog(null, "Voce gerou " + cont + " Jogo(s)");
    }
}

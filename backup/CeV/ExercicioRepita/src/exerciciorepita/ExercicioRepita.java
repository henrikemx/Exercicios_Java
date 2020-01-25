/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá, Mundo !", "Boas Vindas !", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe o numero: <br><em>(Valor 0 interrompe !)</em></html>"));
            s += n;
        } while (n != 0);
        // JOptionPane.showMessageDialog(null, "Voce digitou o valor " + n);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>"
                + "Somatório vale " + s + "</html>");
    }

}

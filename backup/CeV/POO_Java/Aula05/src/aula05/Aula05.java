package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(25690);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(25692);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        System.out.println();
        p1.depositar(300);
        p1.estadoAtual();
        p2.depositar(500);
        p2.estadoAtual();
        
        System.out.println();
        p1.sacar(250);
        p1.estadoAtual();
        p2.sacar(350);
        p2.estadoAtual();
    }
}

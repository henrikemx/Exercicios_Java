package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.7f);
        Caneta c2 = new Caneta("Johnson", "Verde", 0.5f);
        // c1.setModelo("Bic Cristal");
        // c1.setPonta(0.5f);
        c1.status();
        System.out.println();
        c2.status();
        // System.out.println("Tenho uma caneta modelo " + c1.getModelo() + " com ponta " + c1.getPonta() + " mm");
        System.out.println();
    }
}

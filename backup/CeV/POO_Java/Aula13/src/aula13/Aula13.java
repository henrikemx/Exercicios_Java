package aula13;

public class Aula13 {

    public static void main(String[] args) {
        // instanciando classes
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();

        m.emitirSom();
        System.out.println("");
        l.emitirSom();
        System.out.println("");
        c.emitirSom();
        System.out.println("");

        System.out.print("Quando digo Olá, ele... ");
        c.reagir("Olá");
        System.out.print("Quando digo Vai apanhar, ele... ");
        c.reagir("Vai apanhar");
        System.out.print("Quando o chamo às 11:45 hs, ele... ");
        c.reagir(11, 45);
        System.out.print("Quando o chamo às 21:00 hs, ele... ");
        c.reagir(21, 00);
        System.out.print("Quando eu chego, ele... ");
        c.reagir(true);
        System.out.print("Quando chega um desconhecido, ele... ");
        c.reagir(false);
        System.out.print("Quando ele tem 2 anos e pesa 4,5 kg, ele... ");
        c.reagir(2, 4.5f);
        System.out.print("Quando ele tem 17 anos e pesa 12,5 kg, ele... ");
        c.reagir(17, 12.5f);
        System.out.println("");

    }

}

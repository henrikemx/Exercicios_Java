package aula12;

public class Aula12 {

    public static void main(String[] args) {
        // instanciando classes 
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("");

        a.alimentar();
        a.locomover();
        a.emitirSom();

        System.out.println("");

        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolha();

        System.out.println("");

        j.locomover();
        j.alimentar();
        j.emitirSom();

        System.out.println("");

        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        System.out.println("");
        
        k.locomover();
        k.alimentar();
        k.emitirSom();

        System.out.println("");
    }

}

package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase == "Toma Comida" || frase == "Olá" || frase == "Cheguei") {
            System.out.println("Abana rabo e late !!");
        } else {
            System.out.println("Rosna !!");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abana rabo !!");

        } else if (hora >= 18) {
            System.out.println("Me Ignora !!");
        } else {
            System.out.println("Abana rabo e late !!");
        }

    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abana rabo !!");
        } else {
            System.out.println("Rosna e late !!");
        }

    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abana rabo !!");

            } else {
                System.out.println("Late !!");
            }

        } else {
            if (peso < 10) {
                System.out.println("Rosna !!");

            } else {
                System.out.println("Ignora !!");
            }
        }

    }

}

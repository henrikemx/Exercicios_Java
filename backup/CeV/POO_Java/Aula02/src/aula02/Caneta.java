package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A cor da carga é: " + this.carga);
        System.out.println("A caneta encontra-se tampada ? " + this.tampada);
    }
            
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO !!! Não é possível rabiscar...");
        } else {
            System.out.println("Já pode rabiscar...");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}

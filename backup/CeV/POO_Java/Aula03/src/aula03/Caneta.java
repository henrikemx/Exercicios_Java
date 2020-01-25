package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A cor da carga é: " + this.carga);
        System.out.println("A caneta encontra-se tampada ? " + this.tampada);
    }
            
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO !!! Não é possível rabiscar...");
        } else {
            System.out.println("Já pode rabiscar...");
        }
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
}

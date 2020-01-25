package aula11;

public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando a Bolsa de: " + this.nome);
    }

    @Override
    public void pagarMensal() {
        System.out.println(this.nome + " é Bolsista.\nPagamento é facilitado.\n");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}

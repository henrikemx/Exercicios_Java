package ultraemojicombat;

public class Lutador {

    // Atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    // Metodos Publicos
    public void apresentar() {
        System.out.println("======================================");
        System.out.println("CHEGOU A HORA !!!\nApresentamos o lutador " + getNome() + " !!");
        System.out.println("Diretamente de(a) " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos e " + getAltura() + "m !!");
        System.out.println("E pesando " + getPeso() + " Kg !!");
        System.out.println("Com " + getVitorias() + " vitória(s) !!");
        System.out.println("Com " + getDerrotas() + " derrota(s) !!");
        System.out.println("E com " + getEmpates() + " empate(s) !!");
        System.out.println("======================================");
    }

    public void status() {
        System.out.println(getNome() + " é peso " + this.getCategoria() + " !!");
        System.out.println("Com " + getVitorias() + " vitória(s), " + getDerrotas() + " derrota(s) e " + getEmpates() + " empate(s) !!");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos Especiais
    public Lutador(String no, String na, int id, float al, float pe,  int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Metodos Especiais Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}

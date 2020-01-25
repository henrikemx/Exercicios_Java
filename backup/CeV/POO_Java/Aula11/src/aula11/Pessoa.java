package aula11;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniver() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "====== Dados da(s) pessoa(s) ======" + "\nNome= " + nome + "\nIdade= " + idade + " anos" + "\nSexo= " + sexo + "\n";
    }
    
    

}

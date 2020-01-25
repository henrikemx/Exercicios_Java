package projetopessoas;
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Metodos especiais
    public void fazerAniver(){
        this.idade++;
    }
    
    // Metodos getter e setters
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
    
    // Metodo toString

    @Override
    public String toString() {
        return "Pessoa:" + "\nNome= " + nome + "\nIdade= " + idade + " anos" + "\nSexo= " + sexo;
    }
    
}

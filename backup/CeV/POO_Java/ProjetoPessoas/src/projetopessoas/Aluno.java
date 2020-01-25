package projetopessoas;

public class Aluno extends Pessoa {

    // Atributos da classe filha
    private int matric;
    private String curso;

    // Metodo especial
    public void cancelarMatr() {
        System.out.println("Matricula será cancelada !!");
    }

    // Metodos getters e setters
    public int getMatric() {
        return matric;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

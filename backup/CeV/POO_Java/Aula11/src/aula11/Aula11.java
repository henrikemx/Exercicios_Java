package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        /*
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString() + "\n");
         */


        Aluno a1 = new Aluno();
        
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1000);
        a1.setCurso("Informática");
        
        System.out.println(a1.toString());
        a1.pagarMensal();
        
        Bolsista b1 = new Bolsista();

        b1.setMatricula(1100);
        b1.setNome("Jubileu");
        b1.setIdade(18);
        b1.setSexo("M");
        b1.setBolsa(12.5f);

        System.out.println(b1.toString());
        b1.pagarMensal();

    }

}

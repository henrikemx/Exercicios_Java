package br.com.iniciando.dao;

import br.com.iniciando.dominio.Cadastro;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        cadastro.setNome("Rafael Monteiro");
        cadastro.setEndereco("Rua Pio X");
        cadastro.setTelefone(981668771);
        cadastro.setEmail("rafaell.elias@hotmail.com");
        
        try {
            dao.adiciona(cadastro);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

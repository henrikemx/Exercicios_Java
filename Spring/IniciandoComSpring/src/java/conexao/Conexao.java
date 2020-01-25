package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Conexao {

    private Connection conn;

    private void conectar() {
        System.out.println("Conectando ao banco....");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/iniciandospring?useSSL=false", "root", "");
            System.out.println("Conectado com sucesso.");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada. Favor adicionar o driver nas bibliotecas !");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConexao() {
        conectar();
        return conn;
    }
}

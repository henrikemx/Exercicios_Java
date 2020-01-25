package br.com.iniciando.controller;

import br.com.iniciando.dao.CadastroDAO;
import br.com.iniciando.dominio.Cadastro;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IniciandoController {

    @RequestMapping("/olaMundo")
    public String iniciando(Model model, Cadastro cadastro) {
        
        CadastroDAO dao = new CadastroDAO();
        
        try {
            dao.adiciona(cadastro);
            model.addAttribute("nome", cadastro.getNome());
        } catch (SQLException e) {
            System.out.println(e);
        }
        return "index";

    }
    
    @RequestMapping("/cadastro")
    public String cadastro() {

        return "cadastro";

    }
    
    @RequestMapping("/lista")
    public String lista(Model model) {
        
        CadastroDAO dao = new CadastroDAO();
        
        try {
            model.addAttribute("lista", dao.busca());
        } catch (SQLException e) {
            System.out.println(e);
        }
        return "exibir";
        
    }
}

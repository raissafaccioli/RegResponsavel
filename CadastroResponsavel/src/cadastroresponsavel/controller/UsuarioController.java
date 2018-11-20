package cadastroresponsavel.controller;

import cadastroresponsavel.bd.UsuarioDAO;
import cadastroresponsavel.model.Usuario;

public class UsuarioController {

    UsuarioDAO dao = new UsuarioDAO();
    
    public String realizarLogin(Usuario u) {
        return dao.realizarLogin(u);
    }

    public void cadastrar(Usuario u) {
        dao.cadastrar(u);
    }

    public boolean alterarsenha(Usuario u, String novasenha) {
        return dao.alterarsenha(u, novasenha);
    }
    
}

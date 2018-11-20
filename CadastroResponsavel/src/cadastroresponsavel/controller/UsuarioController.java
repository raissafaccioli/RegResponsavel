/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.UsuarioDAO;
import cadastroresponsavel.model.Usuario;

/**
 *
 * @author Giovani
 */
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

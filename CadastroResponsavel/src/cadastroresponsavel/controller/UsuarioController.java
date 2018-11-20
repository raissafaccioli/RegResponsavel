/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.UsuarioDAO;

/**
 *
 * @author Giovani
 */
public class UsuarioController {

    UsuarioDAO dao = new UsuarioDAO();
    
    public String realizarLogin(String prontuario, char[] senha) {
        return dao.realizarLogin(prontuario, senha);
    }

    public void cadastrar(String nome, String prontuario, String senha) {
        dao.cadastrar(nome, prontuario, senha);
    }
    
}

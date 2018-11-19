/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.AlunoDAO;

/**
 *
 * @author Giovani
 */
public class AlunoController {
    
    private AlunoDAO dao = new AlunoDAO();

    public AlunoController() {
        
    }
    
    public boolean realizarLogin(String prontuario, char[] senha){
        return dao.realizarLogin(prontuario, senha);
    }    
    
}

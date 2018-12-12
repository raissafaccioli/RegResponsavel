/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.model.Responsavel;

/**
 *
 * @author Giovani
 */
public class ResponsavelController {
    
    private ResponsavelDAO rdao = new ResponsavelDAO();
    
    public void registrar(Responsavel resp) {
        rdao.inserir(resp);
    }

    public void removerResponsaveisAluno(String prontuario) {
        rdao.removerResponsaveisAluno(prontuario);
    }
    
}

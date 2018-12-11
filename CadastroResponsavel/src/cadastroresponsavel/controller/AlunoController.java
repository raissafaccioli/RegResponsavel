/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.AlunoDAO;
import cadastroresponsavel.model.Aluno;
import java.util.List;

/**
 *
 * @author Giovani
 */
public class AlunoController {
    
    private AlunoDAO dao = new AlunoDAO();

    public AlunoController() {   
    }

    public void cadastrarAluno(Aluno a) {
        dao.inserir(a);
    }

    public List<Aluno> visualizarAlunos() {
        return dao.recuperar();
    }
    
}

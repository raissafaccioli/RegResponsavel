/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Giovani
 */
public class ComparadorAlunosResponsavel implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        
        List<Responsavel> r1, r2;
        r1 = o1.getResponsaveis();
        r2 = o2.getResponsaveis();
        
        return r1.get(0).getNome().compareTo(r2.get(0).getNome());
    }
    
}

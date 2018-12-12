/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import java.util.Comparator;

/**
 *
 * @author Giovani
 */
public class ComparadorAlunosNome implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
}

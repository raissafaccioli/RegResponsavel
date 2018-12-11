/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Aluno;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Giovani
 */
public class AlunosTabelaModelo extends AbstractTableModel implements Observer{
    
    private List<Aluno> listaAlunos;
    private String[] colunas = {"Prontuário", "Nome", "Responsável"};

    public AlunosTabelaModelo(List<Aluno> a){
        listaAlunos = a;
        Iterator<Aluno> i = listaAlunos.iterator();
        while(i.hasNext()){
            Aluno aluno = i.next();
            aluno.addObserver(this);
        }
    }
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = listaAlunos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return aluno.getProntuario();
            case 1:
                return aluno.getNome();
            case 2:
                return aluno.getResponsaveis();
            default:
                return "Dado inválido";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
    
}

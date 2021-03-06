/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Giovani
 */
public class ResponsaveisTabelaModelo 
        extends AbstractTableModel 
        implements Observer{
    
    private List<Responsavel> responsaveis;
    private String[] colunas = {"Nome", "Telefone"};

    public ResponsaveisTabelaModelo(Aluno a) {
        this.responsaveis = a.getResponsaveis();
        a.addObserver(this);
    }
    
    @Override
    public int getRowCount() {
        return responsaveis.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Responsavel resp = responsaveis.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return resp.getNome();
            case 1:
                return resp.getTelefone();
            default:
                return "dado inválido";
        }
    }

    public void removeRow(int row) {
        responsaveis.remove(row);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
    
}

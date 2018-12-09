/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Responsavel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Giovani
 */
public class ResponsaveisTabelaModelo extends AbstractTableModel{
    
    private List<Responsavel> responsaveis;
    private String[] colunas = {"Nome", "Telefone"};

    public ResponsaveisTabelaModelo(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
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
    
}

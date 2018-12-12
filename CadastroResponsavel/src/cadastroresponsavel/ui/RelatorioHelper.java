/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.controller.AlunoController;
import cadastroresponsavel.model.Aluno;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Giovani
 */
public class RelatorioHelper {
    public void gerarRelatorio(int tipo){
       InputStream in = null;         
        try{
            AlunoController ac = new AlunoController();
            List<Aluno> alunos = ac.visualizarAlunos();
            HashMap<String, Object> params = new HashMap<>();

            JRBeanCollectionDataSource dt = 
                    new JRBeanCollectionDataSource(alunos);
            switch(tipo){
                case 1: //Relatorio de alunos
                    in = this.getClass().getClassLoader().getResourceAsStream("relatorioAlunos.jrxml");
                break;
                case 2:
                    in = this.getClass().getClassLoader().getResourceAsStream("relatorioAlunosResponsaveis.jrxml");
                    break;
            }

            JasperReport jasperReport = JasperCompileManager.compileReport(in);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dt);
            JasperViewer.viewReport(jasperPrint, false);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

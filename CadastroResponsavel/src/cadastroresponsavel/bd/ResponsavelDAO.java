package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResponsavelDAO {

    ConnectionFactory cf;
    Connection con;
    String sql;
    PreparedStatement stm;
    
    public void inserir(Responsavel resp) {
        
        try{
            
            cf = new ConnectionFactory();
            con = cf.obterConexao();
            
            sql = "INSERT INTO responsavel(nome, dataNascimento, telefone, prontuarioaluno) VALUES (?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, resp.getNome());
            stm.setString(2, resp.getDataNascimento());
            stm.setString(3, resp.getTelefone());
            stm.setString(4, resp.getAluno().getProntuario());
            
            stm.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public List<Responsavel> obterResponsaveisAluno(Aluno a){
        
        List<Responsavel> responsaveis = new ArrayList();
        
        try{
            cf = new ConnectionFactory();
            con = cf.obterConexao();
            
            sql = "SELECT * FROM responsavel WHERE prontuarioaluno = ?";
            stm = con.prepareStatement(sql);
            
            stm.setString(1, a.getProntuario());
            
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Responsavel r = new Responsavel();
                
                r.setAluno(a);
                r.setNome(rs.getString("nome"));
                r.setTelefone(rs.getString("telefone"));
                r.setDataNascimento(rs.getString("datanascimento"));
                
                responsaveis.add(r);
            }
            
        }catch(Exception e){
            System.out.println("Exceção de conexão ao banco.");
            e.printStackTrace();
        }
        return responsaveis;
    }

    public void removerResponsaveisAluno(String prontuario) {
        try{    
            cf = new ConnectionFactory();
            con = cf.obterConexao();
            
            sql = "DELETE FROM responsavel WHERE prontuarioaluno = ?";
            stm = con.prepareStatement(sql);
            
            stm.setString(1, prontuario);
            stm.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exceção: " + sqle);
        }
    }
    
    public void removerResponsavel(Responsavel r){
        try{    
            cf = new ConnectionFactory();
            con = cf.obterConexao();
            
            sql = "DELETE FROM responsavel WHERE nome = ? AND prontuarioaluno = ?";
            stm = con.prepareStatement(sql);
            
            stm.setString(1, r.getNome());
            stm.setString(2, r.getAluno().getProntuario());
            stm.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exceção: " + sqle);
        }        
    }
    
}

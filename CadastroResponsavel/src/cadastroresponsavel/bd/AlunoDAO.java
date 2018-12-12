package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AlunoDAO {

    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null;
    private ResponsavelDAO rsdao = new ResponsavelDAO();

    public void inserir(Aluno a){
        try{
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO aluno (prontuario, nome, datanascimento, telefone) VALUES (?, ?, ?, ?)");
            
            stm.setString(1, a.getProntuario());
            stm.setString(2, a.getNome());
            stm.setString(3, a.getDataNascimento());
            stm.setString(4, a.getTelefone());
            
            stm.executeUpdate();
        }catch(SQLException sqle){
            throw new RuntimeException("Exceção: " + sqle);
        }
    }

    public List<Aluno> recuperar() {
        try{
        
            List a = new LinkedList();
            
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM aluno");
            rs = stm.executeQuery();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                
                aluno.setProntuario(rs.getString("prontuario"));
                aluno.setNome(rs.getString("nome"));
                aluno.setDataNascimento(rs.getString("datanascimento"));
                aluno.setTelefone(rs.getString("telefone"));
                
                List responsaveis = rsdao.obterResponsaveisAluno(aluno);
                aluno.setResponsaveis(responsaveis);
                a.add(aluno);
            }
            
            return a;
        }catch(SQLException sqle){
            throw new RuntimeException("Exceção: " + sqle);
        }
    }

    public void remover(String prontuario) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("DELETE FROM aluno WHERE prontuario = ?");
            stm.setString(1, prontuario);
            stm.executeUpdate();                     
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }        
    }

    public void alterar(Aluno a) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("UPDATE aluno SET nome = ?, datanascimento = ?, telefone = ? WHERE prontuario = ?");
            stm.setString(1, a.getNome());
            stm.setString(2, a.getDataNascimento());
            stm.setString(3, a.getTelefone());
            stm.setString(4, a.getProntuario());
            
            stm.executeUpdate();                     
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
}

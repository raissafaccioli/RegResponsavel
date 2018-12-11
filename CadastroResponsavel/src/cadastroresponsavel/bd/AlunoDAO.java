package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class AlunoDAO {

    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null;

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
}

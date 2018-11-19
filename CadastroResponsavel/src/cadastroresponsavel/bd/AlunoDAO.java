package cadastroresponsavel.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {

    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    public boolean realizarLogin(String prontuario, char[] senha) {
         
        try {
           con = cf.obterConexao();
           stm = con.prepareStatement("SELECT prontuario FROM aluno WHERE prontuario = ? AND senha = ?;");
           stm.setString(1, prontuario);
           stm.setString(2, String.valueOf(senha));
            
           ResultSet rs = stm.executeQuery();
           
            if(!rs.next()){    
                return false;
            }else{
                return true;
            }
        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
    
}

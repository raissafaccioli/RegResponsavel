/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

/**
 *
 * @author Giovani
 */
public class UsuarioDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    public String realizarLogin(Usuario u) {
         
        try {
           con = cf.obterConexao();
           stm = con.prepareStatement("SELECT nome FROM usuario WHERE prontuario = ? AND senha = ?;");
           stm.setString(1, u.getProntuario());
           stm.setString(2, u.getSenha());
            
           ResultSet rs = stm.executeQuery();
            if(!rs.next()){   
                return null;
            }else{
                u.setNome(rs.getString("nome"));
                return rs.getString("nome");
            }
        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }

    public void cadastrar(Usuario u) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO usuario(nome, prontuario, senha) VALUES (?, ?, ?)");
            
            stm.setString(1, u.getNome());
            stm.setString(2, u.getProntuario());
            stm.setString(3, u.getSenha());
            
            stm.executeUpdate();
                        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } 
    }

    public boolean alterarsenha(Usuario u, String novasenha) {
        try {
           con = cf.obterConexao();
           stm = con.prepareStatement("SELECT nome FROM usuario WHERE prontuario = ? AND senha = ?;");
           stm.setString(1, u.getProntuario());
           stm.setString(2, u.getSenha());
            
           ResultSet rs = stm.executeQuery();
            if(!rs.next()){   
                return false;
            }else{
                    stm = con.prepareStatement("UPDATE usuario SET senha = ? WHERE prontuario = ? AND senha = ?");

                    stm.setString(1, novasenha);
                    stm.setString(2, u.getProntuario());
                    stm.setString(3, u.getSenha());

                    stm.executeUpdate();
                    return true;
            }
        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }        
    }
}

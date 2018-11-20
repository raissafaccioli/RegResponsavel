/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Giovani
 */
public class UsuarioDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    public String realizarLogin(String prontuario, char[] senha) {
         
        try {
           con = cf.obterConexao();
           stm = con.prepareStatement("SELECT nome FROM usuario WHERE prontuario = ? AND senha = ?;");
           stm.setString(1, prontuario);
           stm.setString(2, String.valueOf(senha));
            
           ResultSet rs = stm.executeQuery();
            if(!rs.next()){   
                return null;
            }else{
                return rs.getString("nome");
            }
        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }

    public void cadastrar(String nome, String prontuario, String senha) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO usuario(nome, prontuario, senha) VALUES (?, ?, ?)");
            
            stm.setString(1, nome);
            stm.setString(2, prontuario);
            stm.setString(3, senha);
            
            stm.executeUpdate();
                        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } 
    }
}

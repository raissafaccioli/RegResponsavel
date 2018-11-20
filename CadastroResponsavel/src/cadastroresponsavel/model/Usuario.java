/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

/**
 *
 * @author Giovani
 */
public class Usuario {
    private String prontuario;
    private String nome;
    private String senha;

    public Usuario(String prontuario, String nome, String senha) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}

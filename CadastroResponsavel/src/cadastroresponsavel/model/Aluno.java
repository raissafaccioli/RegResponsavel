package cadastroresponsavel.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    private String prontuario;
    private String nome;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private List<Responsavel> responsaveis = new ArrayList();;

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Responsavel> getResponsaveis() {
        return responsaveis;
    }
    public void setResponsaveis(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public void adicionarResponsavel(Responsavel resp) {
        getResponsaveis().add(resp);
        resp.setAluno(this);
    }
    
}

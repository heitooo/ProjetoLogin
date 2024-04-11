package br.ulbra.entity;

public class Usuario {

private int pkIdUso;
private String nomeUso;
private String emailUso;
private String senhaUso;

public Usuario(){
    this.pkIdUso = 1;
    this.nomeUso = "Homer Simpson";
    this.emailUso = "adm@gmail.com";
    this.senhaUso = "123";
    
}

    public int getPkIdUso() {
        return pkIdUso;
    }

    public void setPkIdUso(int pkIdUso) {
        this.pkIdUso = pkIdUso;
    }

    public String getNomeUso() {
        return nomeUso;
    }

    public void setNomeUso(String nomeUso) {
        this.nomeUso = nomeUso;
    }

    public String getEmailUso() {
        return emailUso;
    }

    public void setEmailUso(String emailUso) {
        this.emailUso = emailUso;
    }

    public String getSenhaUso() {
        return senhaUso;
    }

    public void setSenhaUso(String senhaUso) {
        this.senhaUso = senhaUso;
    }


    
}

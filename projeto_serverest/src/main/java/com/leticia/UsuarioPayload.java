package com.leticia;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UsuarioPayload {
    private String nome;
    private String email;
    private String password;
    private boolean administrador;

   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
        @JsonProperty("administrador")  //retorna o valor do atributo convertido em uma string
    public String getAdministradorAsString() {
        return administrador ? "true" : "false"; // operador ternário: condição ? valor_se_verdadeiro : valor_se_falso
    }

    @JsonProperty("administrador") // converte uma String em um valor booleano e define o atributo "administrador".
    public void setAdministradorFromString(String administrador) {
        this.administrador = Boolean.parseBoolean(administrador);
    }
    
}


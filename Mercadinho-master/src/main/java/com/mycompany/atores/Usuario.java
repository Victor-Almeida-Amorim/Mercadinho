/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atores;

/**
 * Classe criada para representar um Usuário (colaborador) no sistema
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class Usuario extends Pessoa {
    //Atributos
    private int codigo;
    private String email;
    private String senha;
    
    /**
     * construtor padrão para Usuario
     */
    public Usuario()
    {
        super();
    }
    
    /**
     * construtor com parâmetros para Usuario
     * @param codigo tipo int
     * @param nome tipo string
     * @param sobrenome tipo string
     * @param email tipo string
     * @param senha tipo string
     */
    public Usuario(int codigo, String nome, String sobrenome, String email, String senha)
    {
        super(nome, sobrenome);
        this.codigo = codigo;
        this.email = email;
        this.senha = senha;
    }

    /**
     * set para o atributo Email
     * @param email tipo string
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * set para o atributo Senha
     * @param senha tipo string
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
     * set para o atributo Codigo
     * @param codigo tipo string
     */
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    /**
     * get para o atributo codigo, retorna uma string
     * @return tipo string
     */
    public int getCodigo()
    {
        return this.codigo;
    }

    /**
     * get para o atributo Email, retorna uma string
     * @return tipo string
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * get para o atributo Senha, retorna uma string
     * @return 
     */
    public String getSenha() {
        return senha;
    }
    
    /**
     * método que forma o objeto para string, retorna uma string
     * @return tipo string
     */
    @Override
    public String toString()
    {
        return String.format("%s\nCodigo: %d\nEmai: $s\nSenha: $s\n", super.toString(), getCodigo(), getEmail(), getSenha());
    }
}

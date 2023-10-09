/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atores;

/**
 * Classe criada para representar a o cliente no ambiente do mercadinho
 * @author Mariana Morais
 * @author Victor Amorim
 * @version 1.0
 */
public class Cliente extends Pessoa{
    private String apelido;
    private String telefone;
    private String cpf;
    private String rua;
    private String numero;
    private String cidade;
    
    /**
     * Construtor que inicializa o objeto Cliente
     * @param nome tipo String
     * @param sobrenome tipo String
     * @param apelido tipo String
     * @param telefone tipo String
     * @param cpf tipo string
     * @param rua tipo String
     * @param numero tipo String
     * @param cidade tipo String
     */
    public Cliente (String nome, String sobrenome,String apelido, String telefone, String cpf, String rua, String numero, String cidade)
    {
        super(nome,sobrenome);
        this.apelido = apelido;
        this.cpf = cpf;
        this.telefone= telefone;     
        this.rua = rua;
        this.cidade = cidade; 
        this.numero = numero;
    }
    
    /**
     * set para o atributo Apelido
     * @param apelido tipo String
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    /**
     * set para o atributo Telefone
     * @param telefone tipo String
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /**
     * set para o astributo Cpf
     * @param cpf tipo String
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     * set para o atributo Rua
     * @param rua tipo String
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * set para o atributo Numero
     * @param numero tipo String
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * set para o atributo Cidade
     * @param cidade tipo String
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /**
     * get para o atributo Apelido, retorna uma String
     * @return tipo String
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * get para o atributo Telefone, retorna uma string
     * @return tipo String
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * get para o atributo Cpf, retorna uma string
     * @return tipo String
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * get para o atributo Rua, retorna uma string
     * @return tipo String
     */
    public String getRua() {
        return rua;
    }

    /**
     * get para o atributo Numero, retorna uma string
     * @return tipo String
     */
    public String getNumero() {
        return numero;
    }

    /**
     * get para o atributo Cidade, retorna uma string
     * @return tipo String
     */
    public String getCidade() {
        return cidade;
    } 
    
    /**
     * Método para transformar os objetos em string
    */
    @Override
    public String toString(){
        return String.format("%s\ncpf: %s\ntelefone: %s\napelido: %s\nrua: %s\ncidade: %s\nnumero : %s", 
                super.toString(), getCpf(), getTelefone(), getApelido(), getRua(), getCidade(), getNumero());
    }
    
}

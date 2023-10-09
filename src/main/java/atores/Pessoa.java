/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 * Modelo de Classe que serve para os Atores do Sistema - Usuario, Cliente e Superior
 * @author Mariana Morais
 * @author Victor Amorim
 */
abstract public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    
    /**
     * Construtor padrão para a Classe Pessoa
     */
    public Pessoa()
    {
        
    }
    
    /**
     * Construtor com os parametros nome e sobrenome
     * @param nome tipo String
     * @param sobrenome tipo String
     */
    public Pessoa(String nome, String sobrenome)
    {
        this.nome = nome; this.sobrenome = sobrenome;
    }
    
    
    /**
     * set para o atributo Nome
     * @param nome tipo String
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    /**
     * set para o atributo Sobrenome
     * @param sobrenome tipo String
     */
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    /**
     * get para o atributo Nome, retorna uma string
     * @return tipo String
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * get para o atributo Sobrenome, retorna uma string
     * @return tipo String
     */
    public String getSobrenome()
    {
        return this.sobrenome;
    }
    
    /**
     * toString, sobrescrita do método em Object, formata a classe em string, retorna uma string
     * @return tipo String
     */
    @Override
    public String toString() {
        return String.format(
            "Nome: %s \nSobrenomme: %s\n",
            nome, sobrenome);
    }
}

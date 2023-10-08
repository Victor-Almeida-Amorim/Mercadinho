/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 *
 * @author mesmo
 */
abstract public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    
    //Construtores
    public Pessoa()
    {
        
    }
    
    public Pessoa(String nome, String sobrenome)
    {
        this.nome = nome; this.sobrenome = sobrenome;
    }
    
    
    //Setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    //Getters
    public String getNome()
    {
        return this.nome;
    }
    public String getSobrenome()
    {
        return this.sobrenome;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Nome: %s \nSobrenomme: %s\n",
            nome, sobrenome);
    }
}

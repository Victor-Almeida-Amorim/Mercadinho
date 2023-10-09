/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 * Classe que representa o Superior (Administrador) no sistema do mercadinho
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class Superior extends Usuario{
    /**
     * Construtor com parâmetros de Superior
     * @param codigo tipo Inteiro
     * @param nome tipo String
     * @param sobrenome tipo String
     * @param email tipo String
     * @param senha tipo String
     */
    public Superior(int codigo, String nome, String sobrenome, String email, String senha)
    {
        super();
        setCodigo(codigo);
        setNome(nome);
        setSobrenome(sobrenome);
        setEmail(email);
        setSenha(senha);
        
    }
    
    /**
     * Construtor diferente para a classe Superior
     * @param nome tipo String
     * @param sobrenome tipo String
     * @param email tipo String
     * @param senha tipo String
     */
    public Superior(String nome, String sobrenome, String email, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * método que formata o objeto em string, retorna uma string
     * @return tipo String
     */
    @Override
    public String toString()
    {
        return String.format("%s\n", super.toString());
    }
}

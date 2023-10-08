/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 * Classe que representa o Superior (Administrador) no sistema do mercadinho
 * @author mesmo
 */
public class Superior extends Usuario{
    //Construtor
    public Superior(int codigo, String nome, String sobrenome, String email, String senha)
    {
        super();
        setCodigo(codigo);
        setNome(nome);
        setSobrenome(sobrenome);
        setEmail(email);
        setSenha(senha);
        
    }
    

    public Superior(String nome, String sobrenome, String email, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString()
    {
        return String.format("%s\n", super.toString());
    }
}

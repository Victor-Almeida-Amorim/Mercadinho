/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 *
 * @author mesmo
 */
public class Usuario extends Pessoa {
    //Atributos
    private int codigo;
    private String email;
    private String senha;
    //Construtor
    public Usuario()
    {
        super();
    }
    
    public Usuario(int codigo, String nome, String sobrenome, String email, String senha)
    {
        super(nome, sobrenome);
        this.codigo = codigo;
        this.email = email;
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }

    public String getEmail()
    {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s\nCodigo: %d\nEmai: $s\nSenha: $s\n", super.toString(), getCodigo(), getEmail(), getSenha());
    }
}

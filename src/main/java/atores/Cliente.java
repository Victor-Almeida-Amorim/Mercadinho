/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atores;

/**
 * Classe criada para representar a o cliente no ambiente do mercadinho
 * @author mesmo
 */
public class Cliente extends Pessoa{
    private String apelido;
    private String telefone;
    private String cpf;
    private String rua;
    private String numero;
    private String cidade;
    
    /**
     * Construtor para criar o objeto do Cliente
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
     * Criação de Getters e Setters
    */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getApelido() {
        return apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

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

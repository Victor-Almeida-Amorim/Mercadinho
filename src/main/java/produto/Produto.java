/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que representa os Produtos no ambiente do mercadinho
 * @author mesmo
 */
public class Produto {
    private String codigo;
    private String nomeProduto;
    private int quantidade;
    private String categoria;
    private Date dataValidade;
    private Date dataFabricacao;
    private double precoCompra;
    private double precoVenda;

    /**
     *
     * @param codigo
     * @param nomeProduto
     * @param quantidade
     * @param categoria
     * @param dataValidade
     * @param dataFabricacao
     * @param precoCompra
     * @param precoVenda
     */
    public Produto(String codigo, String nomeProduto, int quantidade, String categoria, String dataValidade, String dataFabricacao, double precoCompra, double precoVenda) throws ParseException
    {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.dataValidade = data.parse(dataValidade);
        this.dataFabricacao = data.parse(dataFabricacao);
        
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("codigo: %s\nnomeProduto: %s\nquantidade: %d\ncategoria: %s\ndataValidade: %s\n dataFabricacao: %s\nprecoCompra: %.2f\nprecoVenda: %.2f",
                getCodigo(), getNomeProduto(), getQuantidade(), getCategoria(),sdf.format(dataValidade), sdf.format(dataFabricacao), getPrecoCompra(), getPrecoVenda());
    }
}

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
 * @author Mariana Morais
 * @author Victor Amorim
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
     * Construtor com atributos para Produto
     * @param codigo tipo string
     * @param nomeProduto
     * @param quantidade tipo int
     * @param categoria tipo string
     * @param dataValidade tipo date
     * @param dataFabricacao tipo date
     * @param precoCompra tipo double
     * @param precoVenda tipo double
     * @throws ParseException excessão
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
    
    /**
     * set para o atributo Codigo
     * @param codigo tipo String
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * set para o atributo Nome do Produto
     * @param nomeProduto tipo String
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * set para o atributo Quantidade em estoque/comprada
     * @param quantidade tipo Inteiro
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * set para o atributo Categoria
     * @param categoria tipo String
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * set para o atributo Data de Validade
     * @param dataValidade tipo date
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * set para o atributo Data de Fabricação
     * @param dataFabricacao tipo date
     */
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * set para o atributo Preço de Compra
     * @param precoCompra tipo double
     */
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * set para o atributo Preço de Venda
     * @param precoVenda tipo double
     */
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * get para o atributo Codigo, retorna uma string
     * @return tipo String
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * get para o atributo Nome do Produto, retorna uma String
     * @return tipo String
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * get para o atributo Quantidade, retorna um inteiro
     * @return tipo inteiro
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * get para o atributo Categoria, retorna uma string
     * @return tipo date
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * get para o atributo Data de Validade, retorna um Date
     * @return tipo String
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * get para o atributo Data de Fabricação, retorna um Date
     * @return tipo date
     */
    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * get para o atributo Preço de Compra, retorna um double
     * @return tipo double
     */
    public double getPrecoCompra() {
        return precoCompra;
    }
    
    /**
     * ger para o atributo Preço de Venda, retorna um double
     * @return tipo double
     */
    public double getPrecoVenda() {
        return precoVenda;
    }
    
    /**
     * método que formata a classe em string, retorna uma string
     * @return tipo String
     */
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("codigo: %s\nnomeProduto: %s\nquantidade: %d\ncategoria: %s\ndataValidade: %s\n dataFabricacao: %s\nprecoCompra: %.2f\nprecoVenda: %.2f",
                getCodigo(), getNomeProduto(), getQuantidade(), getCategoria(),sdf.format(dataValidade), sdf.format(dataFabricacao), getPrecoCompra(), getPrecoVenda());
    }
}

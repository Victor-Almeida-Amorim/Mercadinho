/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uso;
import produto.Produto;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Classe criada para cadastar a compra de um produto no sistema
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class CadastrarProduto {
    private static Scanner input = new Scanner(System.in);
    private static String codigo;
    private static String nomeProduto;
    private static int quantidade;
    private static String categoria;
    private static double precoCompra;
    private static double precoVenda;
    private static String dataValidade;
    private static String dataFabricacao;
    private static double auxfloat;
    private static boolean pare = false;
    
    /**
     * Construtor Padrão
     */
    public CadastrarProduto()
    {
        
    }
    
    /**
     * Método que vai instanciar um objeto do tipo Produto e o guardar no sistema.
     * @param listaProduto lista do tipo Produto
     * @return lista de Produto
     * @throws ParseException - excessão
     */
    public static List<Produto> Cadastrar(List<Produto> listaProduto) throws ParseException
    {
        pare = false;
        while(pare != true)
        {
            System.out.println("Insira o código do produto: ");
            codigo = input.next();

            System.out.println("Insira o nome do produto: ");
            nomeProduto = input.next();

            System.out.println("Insira a quantidade comprada: ");
            quantidade = input.nextInt();

            System.out.println("Insira a categoria do prooduto: ");
            categoria = input.next();

            System.out.println("Insira a data de validade(dd/mm/aaaa): ");
            dataValidade = input.next();

            System.out.println("Insira a data de fabricação(dd/mm/aaaa): ");
            dataFabricacao = input.next();

            System.out.println("Insira o valor no qual o produto foi comprado (preço total da compra): ");
            auxfloat = input.nextDouble();
            precoCompra = auxfloat/(double)quantidade;

            System.out.println("Insira o valor de venda do produto: ");
            precoVenda = input.nextDouble();

            Produto p = new Produto(codigo, nomeProduto, quantidade,
            categoria, dataValidade, dataFabricacao, precoCompra, precoVenda);
            listaProduto.add(p);
            
            System.out.println("Deseja cadastrar um novo produto(S/N)? ");
            String continua = input.next();
            continua.toUpperCase();
            if (continua.equals("N"))
            {
                pare = true;
            }
        }
        return listaProduto;
    }
}

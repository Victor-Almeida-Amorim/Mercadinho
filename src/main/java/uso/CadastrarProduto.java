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
 * @author Mariana Morais e Victor Amorim
 */
public class CadastrarProduto {
    private static Scanner input = new Scanner(System.in);
    private static String codigo;
    private static String nomeProduto;
    private static int quantidade;
    private static String categoria;
    private static Date dataValidade;
    private static Date dataFabricacao;
    private static float precoCompra;
    private static float precoVenda;
    private static String aux;
    private static float auxfloat;
    private static boolean pare = false;
    
    /**
     * Método que vai instanciar um objeto do tipo Produto e o guardar no sistema.
     */
    public static List<Produto> Cadastrar(List<Produto> listaProduto) throws ParseException
    {
        pare = false;
        while(pare != true)
            
            System.out.println("Insira o código do produto: ");
            codigo = input.nextLine();

            System.out.println("Insira o nome do produto: ");
            nomeProduto = input.nextLine();

            System.out.println("Insira a quantidade comprada: ");
            quantidade = input.nextInt();

            System.out.println("Insira a categoria do prooduto: ");
            categoria = input.nextLine();

            System.out.println("Insira a data de validade(dd/mm/aaaa): ");
            aux = input.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataValidade = sdf.parse(aux);

            System.out.println("Insira a data de fabricação(dd/mm/aaaa): ");
            aux = input.nextLine(); 
            dataFabricacao = sdf.parse(aux); 

            System.out.println("Insira o valor no qual o produto foi comprado (preço total da compra): ");
            auxfloat = input.nextFloat();
            precoCompra = auxfloat/quantidade;

            System.out.println("Insira o valor de venda do produto: ");
            precoVenda = input.nextFloat();

            Produto p = new Produto(codigo, nomeProduto, quantidade,
            categoria, dataValidade, dataFabricacao, precoCompra, precoVenda);
            listaProduto.add(p);
            
            System.out.println("Deseja cadastrar um novo produto(S/N)? ");
            String continua = input.nextLine();
            continua.toUpperCase();
            if (continua.equals("N"))
            {
                pare = true;
            }
        
        return listaProduto;
    }
}

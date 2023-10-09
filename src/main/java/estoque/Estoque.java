/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;
import produto.Produto;
import java.util.List;
import java.util.Scanner;

/**
 * Classe usada para representar o funcionamento de um Estoque em um Mercadinho
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class Estoque {
    
    /**
     * Construtor Padrão
     */
    public Estoque()
    {
        
    }
    
    /**
     * Método que irá retornar a lista dos produtos por categoria
     * @param listaProduto lista tipo Produto
     */
    public static void buscarCategoria(List<Produto> listaProduto)
    {
        Scanner input = new Scanner(System.in);
        boolean pare = false;
        String categoria;
        String continua;
        
        while(pare!=true)
        {
            System.out.println("Insira a Categoria que deseja pesquisar:");
            categoria = input.next();
            for(Produto p : listaProduto)
            {
                if(categoria.equals(p.getCategoria()))
                {
                    System.out.printf("%s\n",p.toString());
                }
            }
            System.out.println("Deseja realizar outra consulta(S/N)?");
            continua = input.next();
            continua.toUpperCase();
            
            if(continua.equals("N"));
            {
                pare = true;
            }
        }
    }
    
    /**
     * Método que buscará os produtos pelo código
     * @param listaProduto lista tipo Produto
     */
    public static void buscarCodigo(List<Produto> listaProduto)
    {
        Scanner input = new Scanner(System.in);
        boolean pare = false;
        String codigo;
        String continua;
        
        while(pare!=true)
        {
            System.out.println("Insira o Código que deseja pesquisar:");
            codigo = input.next();
            for(Produto p : listaProduto)
            {
                if(codigo.equals(p.getCodigo()))
                {
                    System.out.printf("%s\n",p.toString());
                }
            }
            System.out.println("Deseja realizar outra consulta(S/N)?");
            continua = input.next();
            continua.toUpperCase();
            
            if(continua.equals("N"));
            {
                pare = true;
            }
        }
    }
    
    /**
     * Método que buscará os produtos pelo seu nome
     * @param listaProduto lista tipo Produto
     */
    public static void buscarNome(List<Produto> listaProduto)
    {
        Scanner input = new Scanner(System.in);
        boolean pare = false;
        String nome;
        String continua;
        
        while(pare!=true)
        {
            System.out.println("Insira o Nome do Produto que deseja pesquisar:");
            nome = input.next();
            for(Produto p : listaProduto)
            {
                if(nome.equals(p.getNomeProduto()))
                {
                    System.out.printf("%s\n",p.toString());
                }
            }
            System.out.println("Deseja realizar outra consulta(S/N)?");
            continua = input.next();
            continua.toUpperCase();
            
            if(continua.equals("N"));
            {
                pare = true;
            }
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;
import produto.Produto;
import java.util.Date;
import java.util.Scanner;

/**
 * Classe usada para representar o funcionamento de um Estoque em um Mercadinho
 * @author mesmo
 */
public class Estoque {
    private static Scanner input = new Scanner(System.in);
    private static Date data = new Date(2023, 10, 5);
    private static Date data2 = new Date(2024, 10, 5);
    private static int opcao;
    
    private static Produto p = new Produto("101", "Carne", 43, "Gelado", data, data2, 1345.0 ,13.0);
    
    public static void exibirEstoque()
    {
        System.out.println("ESTOQUE\n======================================");
        System.out.println("Insira 1 para ver os gelados\n ");
        System.out.println("Insira 2 para ver as hortaliças\n ");
        System.out.println("Insira 3 para ver as bebidas\n ");
        System.out.println("Insira 1 para ver os não perecíveis\n ");
        opcao = input.nextInt();
        System.out.println("======================================\n");
        
        if(opcao==1)
        {
            if(p.getCategoria()!="Gelado")
            {
                System.out.println("Não há cadastro de gelados no sistema!");             
            }else
            {
                System.out.println(p.toString());
            }
        }else if(opcao==2)
        {
            if(p.getCategoria()!="Hortaliça")
            {
                System.out.println("Não há cadastro de hortaliças no sistema!");             
            }else
            {
                System.out.println(p.toString());
            }
        } else if(opcao==3)
        {
            if(p.getCategoria()!="Bebida")
            {
                System.out.println("Não há cadastro de bebidas no sistema!");             
            }else
            {
                System.out.println(p.toString());
            }
        } else if(opcao==4)
        {
            if(p.getCategoria()!="Não Perecível")
            {
                System.out.println("Não há cadastro de não perecíveis no sistema!");             
            }else
            {
                System.out.println(p.toString());
            }
        } else
        {
            System.out.println("Código inválido!");
        }
    }
}

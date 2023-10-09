/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mercadinho;
import estoque.Estoque;
import uso.CadastrarProduto;
import atores.Cliente;
import atores.Superior;
import atores.Pessoa;
import estoque.Estoque;
import atores.Usuario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import produto.Produto;
import uso.GerenciarSuperior;
/**
 * Classe que representa a interface do Sistema do Mercadinho, onde os usuarios 
 * do sistema vão executar suas tarefas.
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class Mercadinho {
    /**
     * Construtor Padrão
     */
    public Mercadinho()
    {
        
    }
    /**
     * Onde os Usuarios interagem com o sistema
     * @param args método main
     * @throws ParseException excessão
     */
    public static void main(String[] args) throws ParseException {
        //Instanciação de objetos e listas de objetos par alimentar o sistema, pelo menos a princípio
        Scanner input = new Scanner(System.in);
        List<Usuario> listaUsuario = new ArrayList<>();
        List<Superior> listaSuperior = new ArrayList<>();
        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(new Produto("101","Coca Cola", 10, "Bebida", "20/03/2003", "20/03/2000", 4.5, 7.0));
        listaUsuario.add(new Usuario(101,"nome2", "sobrenome2", "email2", "senha2"));
        listaUsuario.add(new Usuario(102,"nome1", "sobrenome1", "email1", "senha1"));
        listaSuperior.add(new Superior(123, "nome", "sobrenome", "email", "senha"));
        
        //Instanciamento do usuario atual
        Usuario usuarioAtual = new Usuario();
        //Efetuação do logiun
        usuarioAtual = Mercadinho.loginSistema(listaSuperior,listaUsuario);
        
        //Interface do sistemaa
        //Interface do Superior
        if (usuarioAtual instanceof Superior) 
        {
            //Funções do Superior
            System.out.println("Menu de Superior\n============================");
            System.out.println("1. Gerenciar Superiores e Usuarios");
            System.out.println("2. Cadastrar Compras");
            System.out.println("3. Gerenciar Estoque");
            String escolha = input.nextLine();
            System.out.println("============================");
            switch (escolha)
            {
                //Gerenciamento da conta do Superior
                case "1":
                    System.out.println("============================");
                    System.out.println("1. Cadastrar Superior");
                    System.out.println("2. Cadastrar Usuário");
                    System.out.println("3. Mudar Senha do Superior");
                    System.out.println("4. Editar Superior");
                    System.out.println("5. Excluir Superior");
                    escolha = input.nextLine();
                    System.out.println("============================");
                    switch (escolha)
                    {
                        case "1":
                            System.out.println("Selecionado: 1. Cadastratar Superior\n============================");
                            listaSuperior.add(GerenciarSuperior.cadastrarSuperior((Superior) usuarioAtual));
                        case "2":
                            System.out.println("Selecionado: 2. Cadastrar Usuario\n============================");
                            listaUsuario.add(GerenciarSuperior.cadastrarUsuario((Superior) usuarioAtual));
                        case "3":
                            System.out.println("Selecionado: 3. Mudar Senha do Superior\n============================");
                            GerenciarSuperior.mudarSenha((Superior)usuarioAtual);
                        case "4":
                            System.out.println("Selecionado: 4. Editar Superior\n============================");
                            GerenciarSuperior.editarSuperior(listaSuperior);
                        case "5":
                            System.out.println("Selecionado: 5. Excluir Superior\n============================");
                            GerenciarSuperior.eliminarSuperior(listaSuperior);
                    }
                case "2":
                    //Cadastro de compra de produtos
                    System.out.println("============================");
                    System.out.println("Selecionado: 2. Cadastrar Compras");
                    listaProduto.addAll(CadastrarProduto.Cadastrar(listaProduto));
                case "3": 
                    //Conbtrole de estoque
                    System.out.println("============================");
                    System.out.println("Selecionado: 3. Gerenciar Estoque");
                    System.out.println("============================");
                    System.out.println("1. Busca por Categoria");
                    System.out.println("2. Busca por Código");
                    System.out.println("3. Busca por Nome");
                    escolha = input.next();
                    System.out.println("============================");
                    switch(escolha)
                    {
                        case "1":
                            System.out.println("Selecionado: 1. Busca por Categoria\n============================");
                            Estoque.buscarCategoria(listaProduto);
                        case "2":
                            System.out.println("Selecionado: 2. Busca poe Código\n============================");
                            Estoque.buscarCodigo(listaProduto);
                        case "3":
                            System.out.println("Selecionado: 3. Busca por Nome\n============================");
                            Estoque.buscarNome(listaProduto);
                    }
            }
        }else if(usuarioAtual instanceof Usuario)
        {
            //Interface do Usuario
            System.out.println("Menu de Usuario\n============================\n");
        }
    }
    
    /**
     * método que recebe uma lista de Superiores e Usuarios, recebe credenciais 
     * de login (Email e Senha) e se confirmar o login, retorna para o sistema
     * o objeto verificado (usuarioAtual), possibilitando assim o acesso ao sistema
     * @param listaSuperior lista tipo Superior
     * @param listaUsuario lista tipo Usuario
     * @return retorna um tipo Usuario
     */
    public static Usuario loginSistema(List<Superior> listaSuperior, List<Usuario> listaUsuario)
    {
        Usuario userAtual = null;
        Scanner input = new Scanner(System.in);
        String email;
        String senha;
        boolean pare = false;
        
        {
            while(pare!=true){
                System.out.println("Insira o Email: ");
                email = input.nextLine();
                System.out.println("Insira a Senha: ");
                senha = input.nextLine();

                for (Superior s: listaSuperior)
                {
                    if((email.equals(s.getEmail())) && (senha.equals(s.getSenha())))
                    {
                        userAtual=s;
                        pare = true;
                    }
                }  

                for (Usuario u: listaUsuario)
                {
                    if((email.equals(u.getEmail())) && (senha.equals(u.getSenha())))
                    {
                        userAtual=u;
                        pare = true;
                    }
                }
                if(userAtual==null){
                    System.out.println("Usuario Inválido!!\n=====================");
                }
            }
            
        }
        
        return userAtual;
    }
    

    
    
}

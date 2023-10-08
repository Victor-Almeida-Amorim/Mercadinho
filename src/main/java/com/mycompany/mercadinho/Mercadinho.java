/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mercadinho;
import atores.Cliente;
import atores.Superior;
import atores.Pessoa;
import estoque.Estoque;
import atores.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import uso.GerenciarSuperior;
/**
 * Classe que representa a interface do Sistema do Mercadinho, onde os usuarios 
 * do sistema vão executar suas tarefas.
 * @author Mariana Morais e Victor Amorim
 */
public class Mercadinho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario(101,"nome2", "sobrenome2", "email2", "senha2"));
        listaUsuarios.add(new Usuario(102,"nome1", "sobrenome1", "email1", "senha1"));
        Superior s = new Superior(123, "nome", "sobrenome", "email", "senha");
        
        Usuario usuarioAtual = new Usuario();
        usuarioAtual = Mercadinho.loginSistema(s,listaUsuarios);
        
        if (usuarioAtual instanceof Superior) 
        {
            System.out.println("Menu de Superior\n============================\n");
            System.out.println("1. Gerenciar Superiores e Usuarios");
                        String escolha = input.nextLine();
            switch (escolha)
            {
                case "1":
                    System.out.println("========================================");
                    System.out.println("1. Cadastrar Superior");
                    System.out.println("2. Cadastrar Usuário");
                    System.out.println("3. Mudar Senha do Superior");
                    System.out.println("4. Excluir Superior");
                    escolha = input.nextLine();
                    switch (escolha)
                    {
                        case "1":
                            
                    }
            }
        }else if(usuarioAtual instanceof Usuario)
        {
            System.out.println("Menu de Usuario\n============================\n");
        }
    }
    
    public static Usuario loginSistema(Superior s, List<Usuario> listaUsuarios)
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
            
            if ((email.equals(s.getEmail())) && (senha.equals(s.getSenha())))
            {
                userAtual = s;
                pare = true;  
            }
            else
            {
                for (Usuario u: listaUsuarios)
                {
                    if((email.equals(u.getEmail())) && (senha.equals(u.getSenha())))
                    {
                        userAtual=u;
                        pare = true;
                    }
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uso;
import atores.Usuario;
import atores.Superior;
import java.util.List;
import java.util.Scanner;

/**
 * Classe criada para implementar o Gerenciamento dos Usuários
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class GerenciarUsuario {
    private static Scanner input = new Scanner(System.in);
    private static String email;
    private static String senha;
    private static String novaSenha;
    private static boolean pare = false;
    private static String continua;
    private static boolean mudou = false;
    
    /**
     * Método criado para mudar a senha de um Usuario, o método irá receber um objeto
     * tipo Usuário e validará as informações (email e senha) do Usuario, 
     * se forem válidas, o sistema vai receber a nova senha e irá alterar a 
     * senha e encerrará a opereação. Caso não forem válidas, o sistema 
     * vai acusar a falha e perguntar se o usuario deseja tentar novamente, caso S, 
     * pedirá as credenciais novamente, caso N, irá encerrar a operação.
     * @param u tipo Uusario
     */
    public static void mudarSenha(Usuario u)
    {
        while(pare!=true)
        {
            //inserção de credenciais
            System.out.println("Insira o email do Usuario: ");
            email = input.nextLine();
            System.out.println("Insira a senha do Usuario: ");
            senha = input.nextLine();
            //validação das credenciais
            if((email.equals(u.getSenha())) && (senha.equals(u.getSenha())))
            {
                //caso as credenciais sejam válidas, irá efetuar a troca de senha
                System.out.println("Login Confirmado!\n=========================");
                System.out.println("Insira a nova senha: ");
                novaSenha = input.nextLine();
                u.setSenha(novaSenha);
                System.out.println("Senha cadastrada com sucesso!");
                pare = true;
            }
            else
            {
                //caso não, o programa irá perguntar se deseja tentar novamente
                System.out.println("Login Invalido!!\nDeseja continuar?(S/N)");
                continua = input.nextLine();
                continua.toUpperCase();
                
                //caso S, o sistema pedriá a inserção dos dados novamente
                if(continua=="S")
                {
                    System.out.println("Reensira as credenciais\n=====================");
                } else
                {
                    //Caso não, irá encerrar o programa.
                    pare = true;
                }
            }
        }
    }
    
    /**
     * Método criado para eliminar um Usuario, irá definir o ponteiro u como null,
     * deixando o objeto sem referência. Ele será eventualmente coletado pelo garbage.
     * @param u tipo Usuario
     * @return tipo Usuaio
     */
    public static Usuario eliminarUsuario(Usuario u)
    {
        u = null;
        return u;
    }
    
    /**
     * Método criado para editar as informações de um Superior
     * @param listaUsuario lista de Usuario
     */
    public static void editarUsuario(List<Usuario> listaUsuario)
    {
        pare = false;
        System.out.println("Insira o email: ");
        email = input.nextLine();
        System.out.println("Insira a senha: ");
        senha = input.nextLine();
        while(pare!=true)
        {
            mudou = false;
            for (Usuario u : listaUsuario)
            {
                if ((senha.equals(u.getSenha())) && (email.equals(u.getEmail())))
                {

                    //Ler as novas informações do Superior
                    System.out.println("Insira um novo nome: ");
                    String nome = input.nextLine();
                    System.out.println("=========================================");

                    System.out.println("Insira um novo sobrenome: ");
                    String sobrenome = input.nextLine();
                    System.out.println("=========================================");

                    System.out.println("Insira um novo: ");
                    nome = input.nextLine();
                    System.out.println("=========================================");

                    System.out.println("Insira um novo email: ");
                    email = input.nextLine();
                    System.out.println("=========================================");

                    System.out.println("Insira uma nova senha: ");
                    senha = input.nextLine();
                    System.out.println("=========================================");

                    u.setNome(nome);
                    u.setSobrenome(sobrenome);
                    u.setEmail(email);
                    u.setSenha(senha);
                    mudou = true;
                }
            }
            if (mudou!=true)
            {
                System.out.println("Credenciais inválidas!! Deseja tentar novamente(S/N): ");
                continua = input.nextLine();
                continua.toUpperCase();
                if(continua.equals("N"))
                {
                    break;
                }
            else
            {
                System.out.println("Mudança efeituada com sucesso!");
                pare = true;
            }
            }
        }
    }
}

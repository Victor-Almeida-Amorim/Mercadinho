/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uso;
import atores.Superior;
import atores.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 * Classe criada para implementar o Gerenciamento dos Superiores
 * @author Mariana Morais e Victor Amorim 
 */
public class GerenciarSuperior {
    private static Scanner input = new Scanner(System.in);
    private static int codigo;
    private static String email;
    private static String senha;
    private static String novaSenha;
    private static String emailSup;
    private static String senhaSup;
    private static String nome;
    private static String sobrenome;
    private static boolean pare = false;
    private static boolean mudou = false;
    private static String continua;
    
    /**
     * Método usado para cadastrar Usuario, o sistema requesitará credenciais (email e senha)
     * do superior responsavel pelo cadastro, caso a validação seja efetuada,
     * seguirá para o cadastro(nome, sobrenome, email e senha) e o sistema encerrará
     * a operação. Caso a validação falhe, o sistema perguntará se o superior 
     * deseja continuar com a operação se S, voltará à validação, caso N, a operação será encerrada.
     * @param s recebe um objeto do tipo Suoperior para validar as credenciais de cadastro
     * @return novoU - ponteiro da posição em que um objeto tipo Usuario foi instanciado
     */
    public static Usuario cadastrarUsuario(Superior s){
        pare = false;
        Usuario novoU = null;
        while(pare!=true)
        {
            //inserção das credenciais
            System.out.println("Insira o email do superior: ");
            emailSup = input.nextLine();
            System.out.println("Insira a senha do superior: ");
            senhaSup = input.nextLine();
            
            //verifacação se as credenciais pertecem ao Superior inserido
            if((email.equals(s.getSenha())) && (senha.equals(s.getSenha())))
            {
                //mudança caso as credenciais sejam válidas
                System.out.printf("Insira o codigo: ");
                codigo = input.nextInt();
                System.out.printf("Insira o nome: ");
                nome = input.nextLine();
                System.out.printf("Insira o sobrenome: ");
                sobrenome = input.nextLine();
                System.out.printf("Insira o email: ");
                email = input.nextLine();
                System.out.printf("Insira a senha: ");
                senha = input.nextLine();
                novoU = new Usuario(codigo, nome, sobrenome, email, senha);
                pare = true;
            }
            else
            {
                //Caso as credenciais não sejam válidas, o programa irá verificar se o Superior desja tentar novamente, caso negativo, irá interromper o laço.
                System.out.println("Credenciais incorretas. Deseja conitnuar(S/N)?");
                continua = input.nextLine();
                if("N".equals(continua))
                {
                   pare = true;
                }
            }
        }
        if (novoU==null)
        {
            System.out.println("Erro ao cadastrar Usuário!");
        }
        else
        {
            System.out.println("Usuário cadastrado com sucesso!");
        }
        return novoU;
    }
    
    /**
     * Método usado para cadastrar Superior, o sistema requesitará credenciais(email e senha)
     * do superior responsavel pelo cadastro, caso a validação seja efetuada,
     * seguirá para o cadastro(nome, sobrenome, email e senha) e o sistema encerrará
     * a operação. Caso a validação falhe, o sistema perguntará se o superior 
     * deseja continuar com a operação se S, voltará à validação, caso N, a operação será
     * @param s recebe um objeto do tipo Suoperior para validar as credenciais de cadastro
     * @return novoS - ponteiro da posição em que um novo objeto tipo Superior foi instanciado
     */
    public static Superior cadastrarSuperior(Superior s){
        pare = false;
        Superior novoS = null;
        System.out.println("Insira o email do superior: ");
        emailSup = input.nextLine();
        System.out.println("Insira a senha do superior: ");
        senhaSup = input.nextLine();
        while(pare!=true)
        {
            if((email.equals(s.getSenha())) && (senha.equals(s.getSenha())) && (s instanceof Superior))
            {
                System.out.printf("Insira o codigo: ");
                codigo = input.nextInt();
                System.out.printf("Insira o nome: ");
                nome = input.nextLine();
                System.out.printf("Insira o sobrenome: ");
                sobrenome = input.nextLine();
                System.out.printf("Insira o email: ");
                email = input.nextLine();
                System.out.printf("Insira a senha: ");
                senha = input.nextLine();
                novoS = new Superior(codigo, nome, sobrenome, email, senha);
            }
            else
            {
                System.out.println("Credenciais incorretas. Deseja conitnuar(S/N)?");
                continua = input.nextLine();
                if(continua=="N")
                {
                   pare = true;
                }
            }
        }
        if (novoS==null)
        {
            System.out.println("Erro ao cadastrar Usuário!");
        }
        else
        {
            System.out.println("Usuário cadastrado com sucesso!");
        }
        return novoS;
    }
    
    /**
     * Método criado para mudar a senha de um Superior, o método irá receber um objeto
     * tipo Superior e validará as informações (email e senha) do Superior, 
     * se forem válidas, o sistema vai receber a nova senha e irá alterar a senha 
     * e encerrará a opereação. Caso não forem válidas, o sistema 
     * vai acusar a falha e perguntar se o usuario deseja tentar novamente, caso S, 
     * pedirá as credenciais novamente, caso N, irá encerrar a operação.
     * @param s objeto tipo Superior, representa o objeto em que será efetuado a troca da senha
     */
    public static void mudarSenha(Superior s)
    {
        pare = false;
        System.out.println("Insira o email do Superior: ");
        email = input.nextLine();
        System.out.println("Insira a senha do Superior: ");
        senha = input.nextLine();
        
        //Vai varrer o email e senha procurando um funcionario para autorizar a mudança
        while(pare!=true)
        {
            //se encontrar, vai prosseguir com a mudança
            if((email.equals(s.getSenha())) && (senha.equals(s.getSenha())))
            {
                System.out.println("Login Confirmado!\n=========================");
                System.out.println("Insira a nova senha: ");
                novaSenha = input.nextLine();
                s.setSenha(novaSenha);
                System.out.println("Senha cadastrada com sucesso!");
                pare = true;
            }
            else
            {
                /*senão, vai informar erro ao validar as credenciais e vai perguntar
                se o usuario deseja iniciar uma nova varredura*/
                System.out.println("Login Invalido!!\nDeseja continuar?(S/N)");
                continua = input.nextLine();
                continua.toUpperCase();
                if(continua=="S")
                {
                    System.out.println("Reensira as credenciais\n=====================");
                } else
                {
                    break;
                }
            }
        }
    }

    /**
     * Método criado para eliminar um Superior, irá definir o ponteiro s como null,
     * deixando o objeto sem referência. Ele será eventualmente coletado pelo garbage.
     * @param s Superior que será excluido
     * @return retorna o ponteiro com a posição null
     */
    public static void eliminarSuperior(List<Superior> listaSuperior)
    {
        pare = false;
        while(pare != true)
        {
            System.out.println("Insira o email: ");
            email = input.nextLine();
            System.out.println("Insira a senha: ");
            senha = input.nextLine();
            for(Superior s : listaSuperior)
            {
                if ((senha.equals(s.getSenha())) && (email.equals(s.getEmail())))
                {
                    s = null;
                    System.out.println("Excluído com Sucesso!");
                }
            }
        }
    }
    
    /**
     * Método criado para editar as informações de um Superior
     * @param listaSuperiores  - lista em que será efetuada uma varredura para verificar as credenciasi inseridas
     */
    public static void editarSuperior(List<Superior> listaSuperiores)
    {
        pare = false;
        mudou = false;
        while(pare!=true)
        {
            System.out.println("Insira o email: ");
            email = input.nextLine();
            System.out.println("Insira a senha: ");
            senha = input.nextLine();
            for (Superior s : listaSuperiores)
            {
                //vai verificar se as credenciais de uma conta válidada de superior foi inserida
                if ((senha.equals(s.getSenha())) && (email.equals(s.getEmail())))
                {

                    //se sim, lerá as novas informações do Superior e mudará ua var de controle "mudou" para true
                    System.out.println("Insira um novo nome: ");
                    nome = input.nextLine();
                    System.out.println("=========================================");

                    System.out.println("Insira um novo sobrenome: ");
                    sobrenome = input.nextLine();
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
                    
                    //Atualização nas informações
                    s.setNome(nome);
                    s.setSobrenome(sobrenome);
                    s.setEmail(email);
                    s.setSenha(senha);
                    mudou = true;
                }
            }
            //caso não ocorra a mudança, o sistema informará o erro nas credenciais
            if (mudou!=true)
            {
                System.out.println("Credenciais inválidas!! Deseja tentar novamente(S/N): ");
                continua = input.nextLine();
                continua.toUpperCase();
                //se o Superior não quiser mudar suas credenciais, o programa encerrará
                if(continua.equals("N"))
                {
                    break;
                }
            //caso mudou seja true, informará que ouve a mudança e ira encerraar o programa
            else
            {
                System.out.println("Mudança efeituada com sucesso!");
                pare = true;
            }
            }
        }
    }

}

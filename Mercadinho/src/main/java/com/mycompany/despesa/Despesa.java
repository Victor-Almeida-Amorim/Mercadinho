package com.mycompany.despesa;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mariana Morais
 * @author Victor Amorim
 */
public class Despesa {
    private static Scanner input = new Scanner(System.in);
    private String nome;
    private double valor;
    private int codigo = 1;
    private static int codigoDespesa;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public Despesa(String nome, double valor) {
        codigoDespesa = codigoDespesa+1;
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigoDespesa;
    }
    
    @Override
    public String toString(){
        return String.format("Despesa: %s \t Valor: %.2f \t Cod: %d\n", getNome(), getValor(), getCodigo());
    }
    
    public Despesa cadastrarDespesa(){
        System.out.println("Insira o nome da despesa: ");
        String nome1 = input.nextLine();
        
        System.out.println("Insira o valor da despesa: ");
        double valor1 = input.nextDouble();
        
        Despesa d = new Despesa(nome1, valor1);
        return d;
    }
    
    public void listarDespesa(List<Despesa>listDespesa){
        for (Despesa d : listDespesa){
            System.out.println(d.toString());
        }
    }
    
}

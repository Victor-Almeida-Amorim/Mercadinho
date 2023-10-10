package com.mycompany.caixa;

/**
 *
 * @author Mariana Morais
 * @author Victor Amorim
 */

public class Caixa {
    private static double caixa1;
    private static double caixa2;
    private static double caixa3;
    private static double caixaRapido;
    private static double caixaPrefer;
    
    public void rendimentoTotal(){
        System.out.printf("Rendimento total dos caixas: %.2f\n", (caixa1 + caixa2 + caixa3 + caixaRapido + caixaPrefer));
    }
    
    public void rendimentoIndividual(){
        System.out.printf("Rendimento do caixa 1: %.2f\n", caixa1);
        System.out.printf("Rendimento do caixa 2: %.2f\n", caixa2);
        System.out.printf("Rendimento do caixa 3: %.2f\n", caixa3);
        System.out.printf("Rendimento do caixa rápido: %.2f\n", caixaRapido);
        System.out.printf("Rendimento do caixa preferencial: %.2f\n", caixaPrefer);
    }
    
    public void adcRendimento(){
        
    }
}

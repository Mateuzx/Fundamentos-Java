/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br.lista01;

import java.util.Scanner;

/**
 * @author M.Araujo
 */
public class CalculadoraSalario {
    public static void main(String[] args) {
        Double salario,porcentagem,slLiquido,imposto;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe seu salário: ");
        salario = in.nextDouble();
        
        System.out.println("Informe qual a porcentagem do imposto: ");
        porcentagem = in.nextDouble();
        
        porcentagem = porcentagem/100.0;
        
        imposto = salario*porcentagem;
        
        System.out.println(String.format("O seu salário liquido será R$: %.2f", salario-imposto));
        
        
        
    }
}

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
public class CalculaTroco {
    public static void main(String[] args) {
        Double valorProduto,qntdVendas,valorPago,troco;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe o valor unitário do produto:");
        valorProduto = in.nextDouble();
        
        System.out.println("Informe a quantidade vendida:");
        qntdVendas = in.nextDouble();
        
        System.out.println("Informe o valor pago pelo cliente:");
        valorPago = in.nextDouble();
        
        troco = valorPago - (valorProduto*qntdVendas);
        
        System.out.println(String.format("Seu troco será de R$: %.2f", troco));
        
        
    }
}

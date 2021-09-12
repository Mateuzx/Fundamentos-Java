/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br.lista01;

import java.util.Scanner;

/**
 *
 * @author M.Araujo
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Double n1,n2,media;
        String nome;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe seu nome:");
        nome = in.next();
        
        System.out.println("Informe a 1ª nota: ");
        n1 = in.nextDouble();
        
        System.out.println("Informe a 2ª nota: ");
        n2 = in.nextDouble();
        
        media = (n1+n2)/2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", nome,media));
        
    }
}

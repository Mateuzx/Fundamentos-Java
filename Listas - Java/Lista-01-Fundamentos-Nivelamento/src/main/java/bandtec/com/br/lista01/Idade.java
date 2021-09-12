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
public class Idade {
    public static void main(String[] args) {
        String nome;
        Integer dataFinal,data,dataAtual=2030;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Qual o seu nome: ");
        nome = in.next();
        
        System.out.println("Olá, "+nome+"! Qual o ano de nascimento?");
        data = in.nextInt();
        
        dataFinal = dataAtual-data;
        
        System.out.println(String.format("Em %d você terá %d anos", dataAtual,dataFinal));
        
        
        
    }
}

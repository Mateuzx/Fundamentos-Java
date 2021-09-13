package bandtec.com.br.lista02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mateus.nascimento
 */
public class Potencia {
    public static void main(String[] args) {
        Integer base=0,expoente,calculo=1,i;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe a base:");
        base = in.nextInt();
        
        System.out.println("Informe o expoente:");
        expoente = in.nextInt();
        
        i=expoente;
        
        while(i>0) {
            calculo *= base;
            i--;
        }
        
        System.out.println(String.format("%d elevado a %d = %d", base,expoente,calculo));
                
        
        
                
    }
}

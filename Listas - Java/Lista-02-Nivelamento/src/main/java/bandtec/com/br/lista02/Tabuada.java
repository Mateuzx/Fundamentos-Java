/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br.lista02;

import java.util.Scanner;

/**
 *
 * @author mateus.nascimento
 */
public class Tabuada {
    public static void main(String[] args) {
        
        Integer num=0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe um número para consulta de tabuada:");
        num = in.nextInt();
        
        System.out.println("Tabuada do " + num + ":");
        
        for(int i=0; i<=10; i++){
            System.out.println(String.format("%d X %d = %d", num,i,(num*i)));
        }
        
        
                
        
    }
 
}

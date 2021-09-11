/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br;

import java.util.Scanner;

/**
 *
 * @author M.Araujo
 */
public class Exercicio03 {
    
    public static Double calculaMedia(Double n1, Double n2){
        Double media;
        
        // Calculo de média da faculdade BandTec
        media = (n1*0.4+n2*0.6);
        
        return media;
    }
    
    public static void main(String[] args) {
        Double n1,n2;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe a 1º Nota:");
        n1 = in.nextDouble();
        
        System.out.println("Informe a 2º Nota:");
        n2 = in.nextDouble();
        
        System.out.println(String.format("A média final é %.1f", calculaMedia(n1,n2)));
        
    }
}

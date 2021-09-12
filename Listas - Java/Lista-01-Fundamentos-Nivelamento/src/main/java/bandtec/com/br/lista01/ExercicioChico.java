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
public class ExercicioChico {
    public static void main(String[] args) {
        Integer perdaAquec,perdaAero,perdaMusc,minTot,caloriaTot,minAque,minAero,minMusc;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe um tempo, em minutos, que se passou aquecendo: ");
        minAque = in.nextInt();
        
        System.out.println("Informe um tempo, em minutos, que se passou fazendo exercicios aerobicos: ");
        minAero = in.nextInt();
        
        System.out.println("Informe um tempo, em minutos, que se passou fazendo exercicios de musculação: ");
        minMusc = in.nextInt();
        
        perdaAquec = minAque*12;
        perdaAero = minAero*20;
        perdaMusc = minMusc*25;
        
        caloriaTot = perdaAquec+perdaAero+perdaMusc;
        minTot = minAque+minAero+minMusc;
        
        System.out.println(String.format("Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", minTot,caloriaTot));
                
        
    }
}

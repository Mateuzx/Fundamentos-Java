/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mateus.nascimento
 */
public class Sorteio {
    public static void main(String[] args) {
        Integer num=0,numRandom=0,numPar=0,numImpar=0;
        Boolean validaPrimeira = false;
        
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe um número de 1 a 100:");
        num = in.nextInt();
        
        
        
        for (Integer i=0;i<200;i++){
            numRandom = ThreadLocalRandom.current().nextInt(1,201);
            
            if(numRandom % 2 == 0){
                numPar++;
            }else{
                numImpar++;
            }
            
            if(numRandom.equals(num) && validaPrimeira==false){
                System.out.println(String.format("O seu número foi sorteado pela primeira vez na posição: %d",i));
                validaPrimeira=true;
            }
        }
        
        System.out.println(String.format("Foram sorteado %d números pares \n Foram sorteados %d numeros impares",numPar,numImpar));
        
        
    }
}

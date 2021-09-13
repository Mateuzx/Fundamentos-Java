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
public class Loteria {

    public static void main(String[] args) {
        Integer num, randomico, tentativas = 0;

        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe um número de 0 a 10");
        num = in.nextInt();

        do {
            randomico = ThreadLocalRandom.current().nextInt(1, 11);
            
            if (num == randomico) {
                tentativas++;
                System.out.println(String.format("O número sorteado foi: %d", randomico));
                if (tentativas <= 3) {
                    System.out.println(String.format("Você é MUITO sortudo venceu em %d tentativas",tentativas));
                } else if (tentativas > 4 && tentativas <= 10) {
                    System.out.println(String.format("Você é sortudo venceu em %d tentativas",tentativas));
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                }
                break;
                
                
            } else {
                System.out.println(String.format("O número sorteado foi: %d", randomico));
                tentativas++;
            }
        } while (true);

    }
}

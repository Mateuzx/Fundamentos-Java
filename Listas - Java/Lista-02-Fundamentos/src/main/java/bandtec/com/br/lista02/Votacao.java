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
public class Votacao {

    public static void main(String[] args) {

        Integer num = 0, votosMussarela = 0, votosCalabresa = 0, votosQueijos = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("PESQUISA SABORES PIZZA");
        System.out.println("==========================");

        for (Integer i = 0; i < 10; i++) {
            System.out.println("Segue abaixo (nome da pizza - número de votação)");
            System.out.println(" Mussarela - 5 \n Calabresa - 25 \n Quartro queijos - 50");
            num = in.nextInt();

            switch (num) {
                case 5:
                    votosMussarela++;
                    break;
                case 25:
                    votosCalabresa++;
                    break;
                case 50:
                    votosQueijos++;
                    break;

            }
            
        }
        
        System.out.println("==========================");
        System.out.println("O RESULTADO ESTÁ DISPONÌVEL, CONFIRA ABAIXO:");
        
        System.out.println(String.format("O sabor MUSSARELA recebeu: %d votos", votosMussarela));
        System.out.println(String.format("O sabor CALABRESA recebeu: %d votos", votosCalabresa));
        System.out.println(String.format("O sabor QUATRO QUEIJOS recebeu: %d votos", votosQueijos));
        

    }

}

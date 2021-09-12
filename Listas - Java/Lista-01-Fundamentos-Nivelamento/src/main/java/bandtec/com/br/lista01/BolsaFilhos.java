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
public class BolsaFilhos {

    public static void main(String[] args) {
        Integer crianca, adolescente, adulto,totFilhos;
        Double bolsaCrianca = 0.0, bolsaAdolescente = 0.0, bolsaAdulto = 0.0;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Informe quantos filhos você tem de 0 a 3");
        crianca = in.nextInt();

        System.out.println("Informe quantos filhos você tem de 4 a 16");
        adolescente = in.nextInt();

        System.out.println("Informe quantos filhos você tem de 17 a 18");
        adulto = in.nextInt();
        
        
        totFilhos = crianca + adolescente + adulto;

        bolsaCrianca += crianca * 25.12;
        bolsaAdolescente += adolescente * 15.88;
        bolsaAdulto += adulto * 12.44;

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$: %.2f de bolsa", totFilhos,(bolsaCrianca + bolsaAdolescente + bolsaAdulto)));
        
    }
}

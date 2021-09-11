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
public class Exercicio02 {

    public static void verificaPrimo(Integer num) {
        Integer divisores = 0;

        // Realizando a contagem dos divisores 
        //Contador começa com o número digitado e vai diminuindo a medida que ocorre as divisões
        for (Integer i = num; i > 0; i--) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("O número inserido é primo!");
        } else {
            System.out.println("O número inserido não é primo!");
        }

    }

    public static void main(String[] args) {
        Integer num;
        

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Informe um valor para verificação:");
            num = in.nextInt();

            // Validação de número positivo/negativo para continuidade do programa
            if (num < 0) {
                break;
            } else {
                verificaPrimo(num);
            }

        //While para inúmeras consultas 
        } while (true);

    }
}

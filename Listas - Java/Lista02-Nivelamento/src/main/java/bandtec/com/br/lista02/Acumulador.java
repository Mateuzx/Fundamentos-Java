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
public class Acumulador {

    public static void main(String[] args) {
        Integer num = 0,soma = 0;

        Scanner in = new Scanner(System.in);

        do {
            if (num == 10) {
                System.out.println(String.format("Você digitou o número 10! A soma do total é de: %d", soma));
                break;
            } else {
                System.out.println("Informe um número");
                num = in.nextInt();
                soma += num;

            }
        } while (true);

    }
}

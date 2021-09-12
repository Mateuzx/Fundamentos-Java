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
public class Calculadora {

    public static void main(String[] args) {
        Double num1, num2, soma, subtracao, divisao, multiplicacao;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        num1 = in.nextDouble();

        System.out.println("Informe um segundo número: ");
        num2 = in.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        divisao = num1 / num2;
        multiplicacao = num1 * num2;

        System.out.println(String.format(
                  "Resultado da soma: %.2f\n Resultado da subtração: %.2f\n "
                + "Resultado da divisão: %.2f\n "
                + "Resultado da multiplicação: %.2f\n", soma,subtracao,divisao,multiplicacao));
        
    }
}

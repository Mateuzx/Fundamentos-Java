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
public class SalarioChico {

    public static void main(String[] args) {
        Double salario, inss, ir, conducao, slLiquido;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe seu salário bruto:");
        salario = in.nextDouble();

        inss = salario * 0.10;
        ir = salario * 0.20;

        System.out.println("Informe o valor da sua IDA na condução diaria:");
        conducao = in.nextDouble();

        conducao = conducao * 2 * 22;

        slLiquido = salario - inss - ir - conducao;

        System.out.println(String.format("Seu salário bruto é R$: %.2f , tem um total de R$: %.2f em descontos"
                + " e receberá um líquido de R$: %.2f", salario, (inss + ir + conducao), slLiquido));

    }
}

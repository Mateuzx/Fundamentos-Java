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
public class Elevador {
    public static void main(String[] args) {
        Double limiteElevador,primeiraPessoa,segundaPessoa,terceiraPessoa;
        Integer limitePessoas;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe o limite de peso do elevador: ");
        limiteElevador = in.nextDouble();
        
        System.out.println("Informe o limite de pessoas no elevador:");
        limitePessoas = in.nextInt();
        
        System.out.println("Informe o peso da 1ª pessoa que entrou no elevador:");
        primeiraPessoa = in.nextDouble();
        
        System.out.println("Informe o peso da 2ª pessoa que entrou no elevador:");
        segundaPessoa = in.nextDouble();
        
        System.out.println("Informe o peso da 3ª pessoa que entrou no elevador:");
        terceiraPessoa = in.nextDouble();
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pesoas.\n"
                + "O peso total no elevador é de %.2f, sendo que ele suporta %.2f.", limitePessoas,(primeiraPessoa+segundaPessoa+terceiraPessoa),limiteElevador));





        
    }
}

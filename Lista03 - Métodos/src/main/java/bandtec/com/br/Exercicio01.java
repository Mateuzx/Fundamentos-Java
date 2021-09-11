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
public class Exercicio01 {

    // Método para classificação de idade
    public static void classificaIdade(Integer idade) {
        
        if (idade < 0) {
            System.out.println("Idade invalida!");
        } else if (idade > 0 && idade <=2) {
            System.out.println("Bebê");
        } else if (idade >= 3 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <=19) {
            System.out.println("Adolescente");
        } else if (idade >= 20 && idade <= 30) {
            System.out.println("Jovem");
        } else if (idade >= 31 && idade <= 60){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

    }

    public static void main(String[] args) {
        Integer idade;
        
        Scanner in = new Scanner (System.in);
        
        // Laço infinito para verificações contínuas
        do{
        System.out.println("\nInforme sua idade:");
        idade = in.nextInt();
        
        classificaIdade(idade);
        } while(true);
        
    }
}

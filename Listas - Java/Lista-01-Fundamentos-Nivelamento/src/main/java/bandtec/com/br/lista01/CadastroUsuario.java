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
public class CadastroUsuario {
    public static void main(String[] args) {
        String login="";
        Integer senha = 0,tentativas=0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe seu usuario:");
        login = in.next();
        
        System.out.println("Informe sua senha:");
        senha = in.nextInt();
        
        System.out.println("Infome a quantidade de erros possiveis:");
        tentativas = in.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %d. Você tem %d tentativas antes de ser bloqueado.", login,senha,tentativas));
        
    }
}

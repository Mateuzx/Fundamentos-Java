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
public class Login {

    public static void main(String[] args) {
        String nome, senha;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\nInforme um nome de usuário");
            nome = in.next();

            System.out.println("Informe uma senha");
            senha = in.next();
            if (nome.equals("admin") && senha.equals("#Bandtec")) {
                System.out.println("Login realizado com sucesso");
                break;
            } else {
                System.out.println("Login e/ou senha inválidos");

            }
        } while (true);

    }
}

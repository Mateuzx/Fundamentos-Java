/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author M.Araujo
 */
public class TesteElevador {

    public static void main(String[] args) {

        Elevador e1 = new Elevador();
        Elevador e2 = new Elevador();

        e1.entrarHomem(2);
        e1.entrarMulher(2);
        e1.entrarCrianca(2);
        
        e2.entrarHomem(5);
        e2.entrarMulher(4);
        e2.entrarCrianca(10);
        
        System.out.println(String.format("Total de passageiros do 1º Eleavdor: %d", e1.exibeTotalPassageiros()));
        System.out.println(String.format("Total de passageiros do 2º Eleavdor: %d", e2.exibeTotalPassageiros()));
        
        System.out.println(String.format("Peso total do 1º Elevador:  %d", e1.exibePesoAtual()));
        System.out.println(String.format("Peso total do 2º Elevador:  %d", e2.exibePesoAtual()));
        
        
        
        
        
        
        
    }

}

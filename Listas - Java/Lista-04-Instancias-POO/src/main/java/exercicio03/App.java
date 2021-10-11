/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author M.Araujo
 */
public class App {
    public static void main(String[] args) {
        
        //Criando 3 instâncias, criando assim 3 bolos no sistema
        Bolo b1 = new Bolo();
        Bolo b2 = new Bolo();
        Bolo b3 = new Bolo();

        //Definindo sabor do bolo
        b1.sabor = "Chocolate";
        //Definindo valor do bolo
        b1.valor = 100.0;
        
        b2.sabor = "Morango";
        b2.valor = 43.0;
        
        b3.sabor = "Cenoura";
        b3.valor = 231.0;
        
        //Comprando 3 bolos do primeiro bolo
        b1.comprarBolo(3);
        
        //Comprando 2 bolos do segundo bolo
        b2.comprarBolo(2);
        
        //Comprando 1 bolos do terceiro bolo
        b3.comprarBolo(1);
        
        //Exibindo relatórios
        b1.exibirRelatorio();
        b2.exibirRelatorio();
        b3.exibirRelatorio();
        
    }
 
}

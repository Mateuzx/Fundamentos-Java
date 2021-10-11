/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author mateus.nascimento
 */
public class TesteTermometro {
    public static void main(String[] args) {
        
        //Definindo instâncias do objeto
        Termometro t1 = new Termometro();
        Termometro t2 = new Termometro();
        
        //Definindo a temperatura dos objetos
        t1.definirTemperaturaAtual(24.0);        
        t2.definirTemperaturaAtual(40.0);
        
        //Aumentando a temperatura dos objetos
        t1.aumentaTemperatura(30.0);        
        t2.aumentaTemperatura(10.0);
        
        //Diminuindo a temperatura dos objetos
        t1.diminuiTemperatura(18.0);        
        t2.diminuiTemperatura(5.0);
        
        //Exibindo as temperaturas
        t1.exibeFahreinheit();
        t2.exibeFahreinheit();
        
        System.out.println("Temperatura Atual 1 em C°: "+t1.getTempAtual());
        System.out.println("Temperatura Atual 2 em C°: "+t2.getTempAtual());
        
        System.out.println("\nA temperatura maxima registrada do primeiro Termômetro foi: "+t1.getTempMax());
        System.out.println("A temperatura minima registrada do primeiro Termômetro foi: "+t1.getTempMin());
        
        System.out.println("A temperatura maxima registrada do segundo Termômetro foi: "+t2.getTempMax());
        System.out.println("A temperatura minima registrada do segundo Termômetro foi: "+t2.getTempMin());

        
        System.out.println("\nTemperatura Atual 1 em F°: "+t1.exibeFahreinheit());
        System.out.println("Temperatura Atual 2 em F°: "+t2.exibeFahreinheit());
    }
}

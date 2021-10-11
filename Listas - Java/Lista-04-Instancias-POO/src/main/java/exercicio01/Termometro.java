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
public class Termometro {

    //Atributos do meu objeto/classe
    Double temperaturaAtual, temperaturaMax=0.0, temperaturaMin=0.0,Fahreinheit;
    
    //Método para definir a temperatura atual
    public void definirTemperaturaAtual(Double n1){
        temperaturaAtual = n1;
    }

    //Método para aumentar a temperatura 
    public void aumentaTemperatura(Double temp) {
        temperaturaAtual+=temp;
        
        if(temperaturaAtual>temperaturaMax){
            temperaturaMax=temperaturaAtual;
        }
    }
    
    //Método para diminuir a temperatura 
    public void diminuiTemperatura(Double temp) {
        temperaturaAtual-=temp;
        
       if(temperaturaAtual>temperaturaMin){
            temperaturaMin=temperaturaAtual;
        }
        
    }
     
     
    public Double exibeFahreinheit() {
        Fahreinheit = (temperaturaAtual*1.8)+32;
        return Fahreinheit;
    }
    
    public Double getTempAtual(){
        return temperaturaAtual;
    }
    
   public Double getTempMin(){
        return temperaturaMin;
    }
   
    public Double getTempMax(){
        return temperaturaMax;
    }
}

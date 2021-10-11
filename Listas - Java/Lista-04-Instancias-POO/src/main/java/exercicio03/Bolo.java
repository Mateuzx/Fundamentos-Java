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
public class Bolo {
    
    String sabor;
    Double valor;
    Integer qntdVendida;
    
    public void comprarBolo(Integer qntdBolo){
        Integer qntdMax=100;

        
        
        if(qntdBolo<qntdMax){
            qntdVendida=qntdBolo*1;
        }else{
            System.out.println("Seu pedido ultrapassa nosso limite diário para esse bolo");
        }
    }
    
    public void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor,qntdVendida,qntdVendida*valor));
    }

    
    
}

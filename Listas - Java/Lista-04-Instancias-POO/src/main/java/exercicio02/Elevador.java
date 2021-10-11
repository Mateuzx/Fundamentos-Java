/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author mateus.nascimento
 */
public class Elevador {

    Integer pesoAtual = 0, pesoMax = 1000, totalPassageiros = 0;

    //Criação do método para entrar um homem no elevador
    public void entrarHomem(Integer qntdHomem) {
        //Atribuindo o pesoAtual baseado na quantidade de homens (calculando com o peso médio de um homem)
        pesoAtual += qntdHomem * 90;
        //Se o peso atual for menor que o peso maximo exigido, entrar no if
        if (pesoAtual < pesoMax) {
            totalPassageiros+=qntdHomem;
        } else {
            System.out.println("Limite máximo atingido!");
        }

    }

    public void entrarMulher(Integer qntdMulher) {
        pesoAtual += qntdMulher * 65;
        if (pesoAtual < pesoMax) {
            totalPassageiros += qntdMulher;
        } else {
            System.out.println("Limite máximo atingido!");
        }

    }

    public void entrarCrianca(Integer qntdCrianca) {
        pesoAtual += qntdCrianca * 40;
        if (pesoAtual < pesoMax) {
            totalPassageiros+=qntdCrianca;
        } else {
            System.out.println("Limite máximo atingido!");
        }

    }

    public Integer exibeTotalPassageiros() {
        return totalPassageiros;
    }

    public Integer exibePesoAtual() {
        return pesoAtual;
    }

}

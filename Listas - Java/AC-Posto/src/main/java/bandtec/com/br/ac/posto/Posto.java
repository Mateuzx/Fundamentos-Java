/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandtec.com.br.ac.posto;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo
 */
public class Posto {

    public static Double metaFaturamento(Double valor_litro, Double qntd_gasolina) {
        Double calculo = 0.0;

        calculo = qntd_gasolina * valor_litro;

        return calculo;

    }

    public static void main(String[] args) {
        Double qntd_gasolina, valor_gasolina, preco_imposto, gasolina_abastecer;
        Integer opcao = 0;
        Boolean validacao = false, continuacao = true;

        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo frentista. Comece cadastrando os dados do posto! \n Capacidade de gasolina (litros):");
        qntd_gasolina = in.nextDouble();

        System.out.println("Valor do litro de gasolina:");
        valor_gasolina = in.nextDouble();

        preco_imposto = (metaFaturamento(qntd_gasolina, valor_gasolina) * 0.15);

        System.out.println(String.format("A meta do posto é faturar R$: %.2f este mês!", metaFaturamento(qntd_gasolina, valor_gasolina)));
        System.out.println(String.format("Lembre-se que R$: %.2f será destinado aos impostos.", preco_imposto));

        //Laço abaixo, para que o usuário continue utilizando, até desejar sair do sistema
        do {
            System.out.println("\nEscolha os próximos passos: \n 1 - Abastecer veiculo \n 2 - Sair ");
            opcao = in.nextInt();

            //Switch de opções disponiveis do programa
            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de gasolina (litros)");
                    gasolina_abastecer = in.nextDouble();

                    validacao = (gasolina_abastecer > qntd_gasolina) ? false : true;

                    //Laço para repetir até que o usuário escreva uma quantidade de gasolina válida
                    do {
                        //Caso a quantidade desejada para o abastecimento estejam nos limites de gasolina disponível
                        if (validacao) {
                            for (Integer i = 1; i <= gasolina_abastecer; i++) {
                                System.out.println(String.format(i > 1 ? "Abastecendo %dº litros" : "Abastecendo %dº litro", i));
                                validacao = true;
                            }

                            System.out.println(String.format("Total abastecido: %.2f.\nFaltam %.2f R$ para meta!",
                                    gasolina_abastecer, metaFaturamento(qntd_gasolina, valor_gasolina) - (valor_gasolina * gasolina_abastecer)));
                            
                            //Limite de gasolina diminuindo a medida que os abastecimentos ocorrem
                            qntd_gasolina -= gasolina_abastecer;

                        } else {
                            //Caso todo o tanque de gasolina (Limite disponível) acabe.
                            if (qntd_gasolina <= 0) {
                                System.out.println("Infelizmente estamos sem gasolina, volte outro dia!");
                                continuacao = false;
                                break;
                            }
                            System.out.println(String.format("Infelizmente não temos a quantidade desejada para o"
                                    + "abastecimento. Litros disponíveis: %.2f\n Digite uma quantidade válida: ", qntd_gasolina));
                            gasolina_abastecer = in.nextDouble();
                        }
                    } while (!validacao);

                    break;

                case 2:
                    //Se o usuário desejar sair do programa.
                    System.out.println("Até logo!");
                    continuacao = false;
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }
        } while (continuacao);

    }
}

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int codigo;

        System.out.println("""
                |Codigo|    |Especificacao|    |preco|
                    1        Cachorro Quente    R$4.00
                    2        X-salada           R$4.50
                    3        X-bacon            R$5.00
                    4        Torrada simples    R$2.00
                    5        Refrigerante       R$1.50
                
                            Escolha uma opcao:
                """);
        codigo = scanf.nextInt();

        double quantidadeItens;

        System.out.println("Escola a quantidade do seu pedido: ");
        quantidadeItens = scanf.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Muito boa escolha, %.0f cachorro(s) quente(s), voce vai pagar: R$ %.2f%n", quantidadeItens, quantidadeItens * 4.00);
                break;
            case 2:
                System.out.printf("Excelente escolha, %.0f X-salada(s), voce vai pagar: R$ %.2f%n", quantidadeItens, quantidadeItens * 4.50);
                break;
            case 3:
                System.out.printf("Otima escolha, %.0f X-bacon(s), voce vai pagar: R$ %.2f%n", quantidadeItens, quantidadeItens * 5.00);
                break;
            case 4:
                System.out.printf("Escolha legal, %.0f Torrada(s) simples, voce vai pagar: R$ %.2f%n", quantidadeItens, quantidadeItens * 2.00);
                break;
            case 5:
                System.out.printf("Que escolha legal, %.0f Refrigerante(s), voce vai pagar: R$ %.2f%n", quantidadeItens, quantidadeItens * 1.50);
                break;
            default:
                System.out.println("Numero invalido!!!");
                break;
        }

    }
}

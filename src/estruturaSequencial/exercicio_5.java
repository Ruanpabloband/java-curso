//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int codigoPeca1, numpecas1;
        double valorUnitariopeca1;

        int codigoPeca2, numpecas2;
        double valorUnitariopeca2;

        System.out.println("Informe o codigo da peca 1: ");
        codigoPeca1 = scanf.nextInt();

        System.out.println("Informe a quantidade de pecas (peca 1): ");
        numpecas1 = scanf.nextInt();

        System.out.println("Informe o valor unitario da peca 1: ");
        valorUnitariopeca1 = scanf.nextDouble();

        System.out.println("Informe o codigo da peca 2: ");
        codigoPeca2 = scanf.nextInt();

        System.out.println("Informe a quantidade de pecas (peca 2): ");
        numpecas2 = scanf.nextInt();

        System.out.println("Informe o valor unitario da peca 2: ");
        valorUnitariopeca2 = scanf.nextDouble();

        double valoraPagar = (numpecas1 * valorUnitariopeca1) + (numpecas2 * valorUnitariopeca2);

        System.out.println("codigo da peca 1: " + codigoPeca1);
        System.out.println("codigo da peca 2: " + codigoPeca2);
        System.out.printf("Valor a pagar: %.2f\n", valoraPagar);

    }
}

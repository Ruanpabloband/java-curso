//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num1;

        System.out.println("Informe um numero inteiro: ");
        num1 = scanf.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}

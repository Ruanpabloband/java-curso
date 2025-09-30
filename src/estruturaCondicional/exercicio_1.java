//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num1;

        System.out.println("Informe um numero inteiro: ");
        num1 = scanf.nextInt();

        if (num1 > 0) {
            System.out.println("Nao negativo!");
        } else {
            System.out.println("Negativo!");
        }
    }
}

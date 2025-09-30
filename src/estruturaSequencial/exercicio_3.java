//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Informe os 4 valores inteiros: ");
        A = scanf.nextInt();
        B = scanf.nextInt();
        C = scanf.nextInt();
        D = scanf.nextInt();

        System.out.printf("Diferenca = %d\n", (A *B - C * D));

    }
}

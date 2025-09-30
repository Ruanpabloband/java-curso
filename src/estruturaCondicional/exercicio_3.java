//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int A, B;


        System.out.println("Informe o 1 numero inteiro: ");
        A = scanf.nextInt();
        System.out.println("Informe o 2 numero inteiro: ");
        B = scanf.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.print("Sao multiplos...");
        } else {
            System.out.println("Nao sao multiplos...");
        }
    }
}

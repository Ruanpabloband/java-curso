//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe 2 numeros inteiros: ");
        num1 = scanf.nextInt();

        num2 = scanf.nextInt();

        System.out.printf("Soma = %d\n", num1 + num2);
    }
}

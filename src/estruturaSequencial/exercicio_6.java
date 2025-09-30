//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        double A, B, C;

        System.out.println("Informe os valores de A, B e C: ");
        A = scanf.nextDouble();
        B = scanf.nextDouble();
        C = scanf.nextDouble();

        System.out.printf("Triangulo: %.3f\n", (A * C) / 2);
        System.out.printf("Circulo: %.3f\n", 3.14159 * (C * C));
        System.out.printf("Trapezio: %.3f\n", ((A + B) * C) / 2);
        System.out.printf("Quadrado: %.3f\n", (B * B));
        System.out.printf("Retangulo: %.3f\n", (A * B));
    }
}

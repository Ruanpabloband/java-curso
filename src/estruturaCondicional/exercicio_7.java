//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        double x, y;

        System.out.println("Informe as coordenadas de x e y: ");
        x = scanf.nextDouble();
        y = scanf.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Primeiro quandrante(Q1)");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Segundo quandrante(Q2)");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Terceiro quandrante(Q3)");
        } else {
            System.out.println("Quarto quadrante(Q4)");
        }
    }
}

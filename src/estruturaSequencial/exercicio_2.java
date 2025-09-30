//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        double raio;

        System.out.print("Informe o raio de um circulo: \n");
        raio = scanf.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.printf("A = %.4f\n", area);


    }
}

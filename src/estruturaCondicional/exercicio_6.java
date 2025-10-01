//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        double num;

        System.out.println("Informe um numero: ");
        num = scanf.nextDouble();

        if (num >= 0 && num <= 25) {
            System.out.println("Esse numero esta entre [0,25]");
        } else if (num > 25 && num <= 50) {
            System.out.println("Esse numero esta entre (25,50]");
        } else if (num > 50 && num <= 75) {
            System.out.println("Esse numero esta entre (50,75]");
        } else if (num > 75 && num <= 100){
            System.out.println("Esse numero esta entre (75,100]");
        }else {
            System.out.println("Fora do intervalo!");
        }
    }
}

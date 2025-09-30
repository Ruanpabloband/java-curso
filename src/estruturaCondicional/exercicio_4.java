//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        double horaInicial, horaFinal;

        System.out.println("Informe a hora inicial: ");
        horaInicial = scanf.nextDouble();

        System.out.println("Informe a hora final: ");
        horaFinal = scanf.nextDouble();

        double duracaoJogo;

        if (horaFinal > horaInicial) {
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo = 24 - horaInicial + horaFinal;
            System.out.println("Duracao fora do time");
        }

        System.out.println("O jogo teve duracao de " + duracaoJogo + " hora(s)");

    }
}
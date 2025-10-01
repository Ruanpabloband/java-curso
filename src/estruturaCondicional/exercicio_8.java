//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

package estruturaCondicional;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        double salario;

        System.out.println("Informe seu salario: ");
        salario = scanf.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Insento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            System.out.printf("Salario com aumento de 8%%, %.2f\n", (salario - 2000.00) * 0.08);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            System.out.printf("Salario com aumento de 18%%, %.2f\n", (1000.00 * 0.08) + ((salario - 3000.00) * 0.18));
        } else {
            System.out.printf("Salario com aumento de 28%%, %.2f\n", (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28));
        }
    }
}

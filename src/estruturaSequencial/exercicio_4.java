//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package estruturaSequencial;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int numFuncionario;
        double horasTrabalo, valorHora, salario;

        System.out.println("Informe o numero do funcionario: ");
        numFuncionario = scanf.nextInt();

        System.out.println("Informe as horas trabalhadas: ");
        horasTrabalo = scanf.nextDouble();

        System.out.println("Informe o valor por hora: ");
        valorHora = scanf.nextDouble();

        salario = valorHora * horasTrabalo;

        System.out.printf("Number = %d\n", numFuncionario);
        System.out.printf("Salary = U$ %.2f\n", salario);
    }
}
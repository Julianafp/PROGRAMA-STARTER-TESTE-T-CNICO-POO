package CalculoSalarioEReajuste;
import java.util.Scanner;

public class SalarioeReajuste {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            Scanner lersalario = new Scanner(System.in);

           int salario=0;
            System.out.println(" Qual seu salário? ");

            if(salario <= 280){
                System.out.println("O Salário é de 280");
                System.out.println("O percentual de aumento é de 20%");
                double valorAumento = salario * 0.2;
                System.out.println( "o Valor do Aumento é de: ");
                salario = (int) (salario * 1.2);
                System.out.println(" O valor do Salário com Aumento é: ");
            }
            else if(salario > 280 && salario <= 700){
                System.out.println("Valor do Salário é: ");
                System.out.println(" O valor do aumento é de 15%");
                double valorAumento = salario * 0.15;
                System.out.println(" O valor do aumento é de: ");
                salario = (int) (salario * 1.15);
                System.out.println("O valor do salário com aumento é: ");
            }
            else if(salario > 700 && salario <= 1500){
                System.out.println("O Valor do Salário é: ");
                System.out.println(" O valor do aumento é de 10%");
                double valorAumento = salario * 0.1;
                System.out.println(" O valor aumento e de:");
                salario = (int) (salario * 1.1);
                System.out.println("O valor do salario com aumento e de:");
            }
            else if(salario > 1500){
                System.out.println(" o valor do salario e de: ");
                System.out.println(" o valor do aumento é de 10%");
                double valorAumento = salario * 0.05;
                System.out.println(" O valor do aumento é de:");
                salario = (int) (salario * 1.05);
                System.out.println(" o valor do salário com aumento e de:");
            }

        }
}

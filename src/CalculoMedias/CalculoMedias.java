package CalculoMedias;

import java.util.Scanner;

public class CalculoMedias {

    public static void menu(){
        System.out.println("\tMenu de opções");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.println("Seleção:");
    }

    public static void aritmetica(){
        Scanner notas = new Scanner(System.in);
        System.out.println("Você selecionou Média Aritmética.");
        int nota1;
        int nota2;
        int media;
        System.out.println("digite a primeira nota");
        nota1 = Integer.parseInt(notas.nextLine());
        System.out.println("digite a segunda nota");
        nota2 = Integer.parseInt(notas.nextLine());
        media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética é: " + media);
    }

    public static void ponderada(){
        System.out.println("Você selecionou Média Ponderada.");
        Scanner notas = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int peso1;
        int peso2;
        int peso3;
        int media;
        System.out.println("digite a primeira nota");
        nota1 = notas.nextInt();
        System.out.println("digite o peso da primeira nota");
        peso1 = notas.nextInt();
        System.out.println("digite a segunda nota");
        nota2 = notas.nextInt();
        System.out.println("digite o peso da segunda nota");
        peso2 = notas.nextInt();
        System.out.println("digite a terceira nota");
        nota3 = notas.nextInt();
        System.out.println("digite o peso da terceira nota");
        peso3 = notas.nextInt();
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média ponderada é: " + media);
    }

    public static void main(String[] args) {
        int opt;
        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            opt = entrada.nextInt();

            switch(opt){
                case 1:
                    aritmetica();
                    break;

                case 2:
                    ponderada();
                    break;

                case 3:
                    sair();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(opt != 0);
    }

    private static void sair() {
    }
}
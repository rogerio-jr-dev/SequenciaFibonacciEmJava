package application;

import entities.Fibonacci;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
            int num = sc.nextInt();
            System.out.println("-------------------------------------------------------------------------");


            if (fibonacci.isFibonacci(num)) {
                System.out.printf("O número %d pertence à sequência de Fibonacci.", num);
            } else {
                System.out.printf("O número %d não pertence à sequência de Fibonacci.", num);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            System.out.println();// Pular linha
            System.out.println("Fim do programa!");
            System.out.println("Dev Rogério de Oliveira");
            sc.close();
        }
    }
}

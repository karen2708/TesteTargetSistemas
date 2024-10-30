
package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class Fibonacci {

    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1, temp;
        
        // Gera a sequência de Fibonacci até atingir ou ultrapassar o número informado
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}

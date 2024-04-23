/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author JoathanGuayllas
 */
public class Serie {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        while (n <= 0) {
            System.out.print("Ingresa el número de elementos de la serie Fibonacci: ");
            n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Error: Ingresa un número positivo mayor que cero.");
            }
        }
        
        System.out.println("La serie Fibonacci con " + n + " elementos es:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


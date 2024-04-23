/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        
        double resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
        
        scanner.close();
    }
    
    public static  double calcularPotencia(int base, int exponente) {
        if (exponente == 0)
            return 1;
        else if (exponente == 1)
            return base;
        else if (exponente < 0)
            return 1 / calcularPotencia(base, -exponente); // Manejar exponentes negativos
        else
            return base * calcularPotencia(base, exponente - 1);
    }
}

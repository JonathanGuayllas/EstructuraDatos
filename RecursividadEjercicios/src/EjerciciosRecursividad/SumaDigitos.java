/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecursividad;

import java.util.Scanner;
/**
 *
 * @author jdgua
 */
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("Ingrese una cadena de dígitos separados por guiones (-): ");
            entrada = scanner.nextLine();

            // Removemos los guiones y verificamos si la entrada consiste solo en dígitos
            entrada = entrada.replaceAll("-", "");
            if (!entrada.matches("\\d+")) {
                System.out.println("La entrada no es válida. Inténtelo de nuevo.");
            }
        } while (!entrada.matches("\\d+"));

        int suma = sumarDigitosConsecutivos(entrada);
        System.out.println("La suma de los dígitos de la cadena " + entrada + " es: " + suma);

        scanner.close();
    }

    public static int sumarDigitosConsecutivos(String cadena) {
        int suma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            suma += Character.getNumericValue(cadena.charAt(i));
        }
        return suma;
    }
}


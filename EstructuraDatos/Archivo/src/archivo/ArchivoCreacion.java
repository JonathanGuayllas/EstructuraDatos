/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoCreacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre a su archivo");
        String nombre = entrada.nextLine() + ".txt"; // Agregamos la extensión .txt al nombre del archivo
        System.out.println("Escribe un contenido para el archivo");
        String contenido = entrada.nextLine();
        hacerArchivo(nombre, contenido);
        String content = leerArchivo(nombre);
        System.out.println("Contenido del archivo:");
        System.out.println(content);
    }

    public static void hacerArchivo(String nombreArchivo, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(content);
            System.out.println("Archivo " + nombreArchivo + " ha sido creado correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static String leerArchivo(String nombreArchivo) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return content.toString();
    }
}

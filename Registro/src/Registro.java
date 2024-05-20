
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {

        ArrayList<Persona> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // for que define los estudiantes registrados
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el id del estudiante " + (i + 1) + ":");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del estudiante " + (i + 1) + ":");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante" + (i + 1) + ":");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el sexo del estudiante" + (i + 1) + ":");
            char sexo = scanner.nextLine().charAt(0);

            System.out.println("Ingrese la dirección del estudiante " + (i + 1) + ":");
            String direccion = scanner.nextLine();

            Persona persona = new Persona(id, nombre, apellido, edad, sexo, direccion);

            // Agregar el estudiante al ArrayList
            estudiantes.add(persona);
        }
        scanner.close();
        
        System.out.println("Estudiantes registrados:");
        for (Persona estudiante : estudiantes) {
            System.out.println("ID: " + estudiante.getId() + ", Nombre: " + 
                    estudiante.nombre + ", Apellido: " + estudiante.apellido + ", Edad: " + 
                    estudiante.edad + ", Sexo: " + estudiante.getSexo() + ", Dirección: " + 
                    estudiante.direccion);
        }

    }
}

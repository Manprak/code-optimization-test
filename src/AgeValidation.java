import java.util.Scanner;

public class AgeValidation {
    // Definir la constante para el límite de edad
    private static final int AGE_LIMIT = 18;

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();

        // Validar la edad y mostrar el mensaje correspondiente
        if (age >= AGE_LIMIT) {
            System.out.println("Acceso aceptado");
        } else {
            System.out.println("Acceso denegado");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

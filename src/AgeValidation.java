import java.util.Scanner;

public class AgeValidation {
    final int AGE_LIMIT = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();

        if (age >= AGE_LIMIT) {
            System.out.println("Acceso aceptado");
        } else {
            System.out.println("Acceso denegado");
        }
        scanner.close();
    }
}

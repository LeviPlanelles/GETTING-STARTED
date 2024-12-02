// Trapecio.java
//3package figuras;

import java.util.Scanner;

public class Trapecio {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ancho de la base menor: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Ingrese el ancho de la base mayor: ");
        double baseMayor = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        double area = (baseMenor + baseMayor) / 2 * altura;
        System.out.println("El área del trapecio es: " + area);
    }
}

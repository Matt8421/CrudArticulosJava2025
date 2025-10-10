package inicio;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);

        System.out.println("Ingresa tu edad : ");
        int edad = scanner.nextInt();
        
        System.out.println("Ingresa tu altura : ");
        double altura = scanner.nextDouble();
        System.out.println("Hola " + nombre + " Tenes " + edad + " años" + " medis " + altura + " metros ");

        scanner.close();

        
    }
}

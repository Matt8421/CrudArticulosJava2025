package ejercicios25255Agosto;

import java.util.Scanner;

public class condicionalesYBucles {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Ingresar cantidad de productos
        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Condicional: si compra más de 10, aplica descuento
        if (cantidad > 10) {
            System.out.println("¡Aplica un descuento especial por comprar más de 10 unidades!");
        } else {
            System.out.println("No aplica descuento especial.");
        }

        //  Bucle for: imprimir del 1 hasta la cantidad ingresada
        System.out.println("\nUsando un bucle FOR para imprimir del 1 al " + cantidad + ":");
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(i + " ");
        }

        //  Bucle while: hacer lo mismo con otro enfoque
        System.out.println("\n\nUsando un bucle WHILE para imprimir del 1 al " + cantidad + ":");
        int j = 1;
        while (j <= cantidad) {
            System.out.print(j + " ");
            j++;
        }

        scanner.close();
    }
}

package producto;

import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto : ");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingresa el precio del producto : ");
        double precioProducto = scanner.nextDouble();

        System.out.println("Ingresa la cantidad en Stock : ");
        int cantidadEnStock = scanner.nextInt();

        System.out.println("Ingresaste: " + nombreProducto + " , precio: " + " $ " + precioProducto +  " , stock: " + cantidadEnStock);
        /* String nombre;
        double precio;
        int cantidadEnStock;
 */
        scanner.close();
    }
}


package cliente;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        int edad;
        //Hacemos un bucle con el ciclo While para no siga hasta q la edad sea valida
        while (true) {
            System.out.println("Hola " + nombre + " ,ingresa tu edad por favor. ");
            if(scanner.hasNextInt()) {          //Verifica que sea numero
                edad = scanner.nextInt();
                scanner.nextLine(); //Limpio el buffer para que me tome el email y no lo salte.
                if(edad <= 0) {
                    System.out.println("La edad tiene que ser mayor que 0, intentalo de nuevo");
                } else {
                    break; // sale del bucle si es valido
                }
            } else {
                System.out.println("Tenés que ingresar una edad válida. ");
                scanner.nextLine();  //Limpio la entrada incorrecta
            }
        }

        if (edad < 18) {
            System.out.println("Lo sentimos " + nombre + " ,tenes que ser mayor de 18 para poder registrarte");
            scanner.close();
            return; //Corta el flujo
        }

        String email;
        while (true) {
            System.out.println("Perfecto " + nombre + " , por ultimo escribi tu email. ");
            email = scanner.nextLine();
            //Validacion simple de email: no vacio y contiene @
            if(!email.isEmpty() && email.contains("@")){
                break;  //Sale del bucle si es valido
            } else {
                System.out.println("El mail no es válido, Intentalo de nuevo.");
            }
        }
        System.out.println("Excelente " + nombre + " ,registramos que tenes " + edad + " años ,y tu email es " + email + " Muchas gracias!!!" );
        scanner.close();
    }
}

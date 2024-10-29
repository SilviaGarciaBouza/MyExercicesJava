/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en
dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla. Almacena las letras del NIF en una cadena.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e02 {

    public static void main(String[] args) {
        String letasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;
        Scanner teclado = new Scanner(System.in);
        char letra;

        try {
            System.out.println("Introduce el numero de tu dni: ");
            dni = Integer.parseInt(teclado.nextLine());

            letra = letasDni.charAt(dni % 23);
            System.out.printf("La letra para el dni %d es: %c", dni, letra);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

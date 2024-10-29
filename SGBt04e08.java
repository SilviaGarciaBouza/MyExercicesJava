/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio: Realizar un programa que solicite una cadena, un número que indica una posición de la
cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la
posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con
StringBuilder.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e08 {

    public static void main(String[] args) {

        //Version con string
        String cadena, cadenaNueva;
        String letra;
        int numero;
        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Introduce una cadena de caracteres: ");
            cadena = teclado.nextLine();
            System.out.println("Introduce una letra: ");
            letra = teclado.nextLine();
            System.out.println("Introduce un numero: ");
            numero = Integer.parseInt(teclado.nextLine());
            cadenaNueva = cadena.replace(cadena.charAt(numero), letra.charAt(0));

            System.out.println("La cadena con la letra intercambiada es: " + cadenaNueva);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

        //version con stringbuilder
        String cadena2, letra2;
        StringBuilder cadenaNueva2 = new StringBuilder();

        int numero2;

        try {
            System.out.println("");

            System.out.println("Introduce una cadena de caracteres: ");
            cadena2 = teclado.nextLine();
            cadenaNueva2.append(cadena2);
            System.out.println("Introduce una letra: ");
            letra2 = teclado.nextLine();
            System.out.println("Introduce un numero: ");
            numero2 = Integer.parseInt(teclado.nextLine());
            cadenaNueva2.deleteCharAt(numero2);
            cadenaNueva2.insert(numero2, letra2);

            System.out.println("La cadena con la letra intercambiada es: " + cadenaNueva2);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

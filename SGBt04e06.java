/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio
es decir, lo que está entre la arroba y el punto (Ejemplo: info@mundo-r.com mostraría mundo-r ).
Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el
dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e06 {

    public static void main(String[] args) {

        try {
            String email, dominio;
            Scanner teclado = new Scanner(System.in);
            int posiciPunto, posiciArroba;

            //Primera versi
            System.out.println("Introduce un email: ");
            email = teclado.nextLine();
            posiciPunto = email.indexOf('.');
            posiciArroba = email.indexOf('@');
            dominio = email.substring(posiciArroba + 1, posiciPunto);
            System.out.println("El dominio del email introducido es= " + dominio);
            System.out.println("");
            //Segunda versión: con la posibilidad de mas de un punto
            posiciPunto = 0;
            System.out.println("Introduce otro email (puede haber varios puntos en el dominio): ");
            email = teclado.nextLine();
            posiciArroba = email.indexOf('@');
            posiciPunto= email.lastIndexOf('.');      
            dominio = email.substring(posiciArroba + 1, posiciPunto);
            System.out.println("El dominio del email introducido es= " + dominio);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

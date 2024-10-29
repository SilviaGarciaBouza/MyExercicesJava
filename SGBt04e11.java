/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio: Describe que realiza el código siguiente e indica si contiene algún error.
java.util.Scanner teclado = new java.util.Scanner(System.in);
System.out.println("Introduce una cadena:");
String cadena = teclado.nextLine();
StringBuilder cadenaSB = new StringBuilder(cadena);
int pos;
do {
pos = cadenaSB.indexOf(" ");
if (pos!=-1) cadenaSB.deleteCharAt(pos);
} while (pos != -1);
System.out.println(cadenaSB);
 */
package sgbt04;

public class SGBt04e11 {
    //Convierte la string en stringBuilder y si hay algun espacio lo borra.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1) {
                cadenaSB.deleteCharAt(pos);
            }
        } while (pos != -1);
        System.out.println(cadenaSB);

    }
}

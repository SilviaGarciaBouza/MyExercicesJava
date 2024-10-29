/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.
 */
package sgbt04;

//import java.util.Random;
import java.util.Random;

public class SGBt04e04 {

    public static void main(String[] args) {
        //  Random randomPassword = new Random(10);
        Random random = new Random();
        StringBuilder password= new StringBuilder();
        String aj = "abcdefghij";
        int passwordLength;

        try {

            passwordLength=random.nextInt(5,10);
            
            for (int i = 0; i < passwordLength; i++) {
                password.append(aj.charAt(random.nextInt(0, 10)));
            }

               System.out.println("La contraseña generada automaticamente es: " + password);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:(Opcional) Realizar un programa al que se le introduzca un número decimal y lo convierta a
un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las
clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de
decimal a hexadecimal.
Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes
obtenidos hasta que el cociente sea cero. El número será la concatenación de restos,
convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B…15->F
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e13 {

    public static void main(String[] args) {
        int numero, resto;
        long numeroHexadecimal = 0;
        char num;
        StringBuilder hexadecimal = new StringBuilder();
        Scanner teclado = new Scanner(System.in);
        try {

            System.out.println("Introduce un numero para transformarlo en hexadecimal: ");
            numero = Integer.parseInt(teclado.nextLine());

            if (numero >= 0) {
                if (numero==0){
                    hexadecimal.append("0");
                }
                for (int i = 0; numero > 0; i++) {

                    resto = numero % 16;
                    
                    num = switch (resto) {
                        case 0 ->
                            '0';
                        case 1 ->
                            '1';
                        case 2 ->
                            '2';
                        case 3 ->
                            '3';
                        case 4 ->
                            '4';
                        case 5 ->
                            '5';
                        case 6 ->
                            '6';
                        case 7 ->
                            '7';
                        case 8 ->
                            '8';
                        case 9 ->
                            '9';
                        case 10 ->
                            'a';
                        case 11 ->
                            'b';
                        case 12 ->
                            'c';
                        case 13 ->
                            'd';
                        case 14 ->
                            'e';
                        case 15 ->
                            'f';
                        default ->
                    
                    ' ';

                    };
                    hexadecimal.insert(i, num);
                    numero /= 16;
                }
                System.out.println("El numero en Hexadecimal es: " + hexadecimal);

            } else {
                numero= Math.abs(numero);
            for (int i = 0; numero > 0; i++) {

                 

                    resto = numero % 16;
                    
                    num = switch (resto) {
                        case 0 ->
                            '0';
                        case 1 ->
                            '1';
                        case 2 ->
                            '2';
                        case 3 ->
                            '3';
                        case 4 ->
                            '4';
                        case 5 ->
                            '5';
                        case 6 ->
                            '6';
                        case 7 ->
                            '7';
                        case 8 ->
                            '8';
                        case 9 ->
                            '9';
                        case 10 ->
                            'a';
                        case 11 ->
                            'b';
                        case 12 ->
                            'c';
                        case 13 ->
                            'd';
                        case 14 ->
                            'e';
                        case 15 ->
                            'f';
                        default ->
                    
                    ' ';

                    };
                    hexadecimal.insert(i, num);
                    numero /= 16;
                }
               
                System.out.println("El numero en binario es: -"+hexadecimal);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

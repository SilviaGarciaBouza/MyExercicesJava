

/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas. 
b. Decir si en la cadena aparece el carácter ‘x’. 
c. Decir si la cadena tiene más de 10 posiciones. 
d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición. 
e. Crear una cadena formada por las 5 primeras posiciones de la cadena. 
f. Crear una cadena formada por las 5 últimas posiciones de la cadena. 
g. Decir si la cadena es igual a la cadena “hola”. 
h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
es un número, esto es, contiene solo dígitos decimales (del 0 a 9) 
i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de 
la A a F. 
j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”. 
k. Decir si la primera posición de la cadena es igual a la última. 
l. Decir cuántos dígitos numéricos hay en la cadena. 
Como vimos en el primer capítulo, cuando se solicita al usuario un número con los métodos de la 
clase Scanner: nextInt(), nextFloat(), etc. y luego un String con nextLine() se produce un error, ya 
que interpreta el <ENTER> que introducimos al final del número como el contenido de la cadena, 
por lo que la cadena toma valor vacío. Para evitar esto, a partir de este momento, se recomienda 
dejar de usar nextInt(), nextInt(), etc. y usar solo nextLine() con la conversión correspondiente, por 
ejemplo: 
int i = Integer.parseInt (teclado.nextLine()); 
Programación - Ejercicios - Cadenas 
Fernando Rodríguez Diéguez. IES Fernando Wirtz Pág. 17 
m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás) 
n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
 */
package sgbt04;
import java.util.Scanner;

public class SGBt04e01 {
    
    public static void main(String[] args) {
        String cadena = new String();
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.println("Introduce una cadena: ");
            cadena = teclado.nextLine();
            System.out.println("");

            /*
            //a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas.
            System.out.println("La cadena en mayúsculas: " + cadena.toUpperCase());
            //a. Mostrar por pantalla el contenido de la cadena pasada a minúsculas.

            System.out.println("La cadena en minúsculas: " + cadena.toLowerCase());
            //b. Decir si en la cadena aparece el carácter ‘x’. 
            System.out.println("Aparece el caracter x: " + cadena.contains("x"));
            //c. Decir si la cadena tiene más de 10 posiciones. 
            System.out.println("La cadena tiene mas de 10 posiciones: " + (cadena.length() > 10));
            // e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
            String subcadenaCincoPrimeras = cadena.substring(0, 5);
            System.out.println("Cadena formada por las 5 primeras posiciones de la cadena: " + subcadenaCincoPrimeras);
            //f. Crear una cadena formada por las 5 últimas posiciones de la cadena. 

            String subcadenaCincoUltimas = cadena.substring(cadena.length() - 5);
            System.out.println("Cadena formada por las 5 ultimas posiciones: " + subcadenaCincoUltimas);
            //g. Decir si la cadena es igual a la cadena “hola”. 
            System.out.println("La cadena es igual a la cadena hola: " + cadena.equals("hola"));
            //h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
            //es un número, esto es, contiene solo dígitos decimales (del 0 a 9) 
            int cadenaNumeros = Integer.parseInt(cadena);
            System.out.printf("La cadena pasada a int: %d", cadenaNumeros);
            //i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
            //es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de 
            //la A a F. 
            int cadenaNumerosDesdeHexadecimal = Integer.parseInt(cadena, 16);
            System.out.println("La cadena hexadecimal pasada a int es: " + cadenaNumerosDesdeHexadecimal);
            //j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
            if (cadena.contains("prueva")) {
                System.out.println("La cadena contieve prueva y se cambia por prueba: " + cadena.replace("prueva", "prueba"));
            }
            //k. Decir si la primera posición de la cadena es igual a la última.
            int comparaPrimerUltimoCaracter = Character.compare(cadena.charAt(0),cadena.charAt(cadena.length()));
            if (comparaPrimerUltimoCaracter==0){
            System.out.println("La primera posición es igual a la última");}else{
                System.out.println("La primera y última posición no son iguales");
            }
            
            
            
            
            
            //l. Decir cuántos dígitos numéricos hay en la cadena. 
            //Character.getType(ch1) devuelve el tipo del caractyer
            int contadorDigit=0;
            for(int contador =0; contador<cadena.length();contador++){
                
                if(Character.isDigit(cadena.indexOf(cadena.charAt(contador)))){
                }
                    contadorDigit++;
                }
                
                    System.out.printf("Hay %d digitos en la cadena", contadorDigit);
             //   }
             
            // m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás) 
            boolean isPalindromo = true;
            for (int i = 0; i < cadena.length(); i++) {
                for (int j = cadena.length()-1; j >= 0; j--) {
                    if (!(cadena.charAt(i)== cadena.charAt(j))) {
                        isPalindromo = false;
                    }
                }
            }
            System.out.printf("La cadena es un palindromo: %b", isPalindromo);
*/
            /*n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
            intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
             */
            StringBuilder nuevaCadena= new StringBuilder(cadena);
            nuevaCadena.deleteCharAt(0);
            nuevaCadena.deleteCharAt(nuevaCadena.length()-1);
            nuevaCadena.insert(0, cadena.charAt(cadena.length()-1));
            nuevaCadena.insert(nuevaCadena.length(), cadena.charAt(0));
            System.out.printf("La cadena con la primera y ultima posicion intercambiada es: %s", nuevaCadena);
           
                   
                   
              
            
            
            
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

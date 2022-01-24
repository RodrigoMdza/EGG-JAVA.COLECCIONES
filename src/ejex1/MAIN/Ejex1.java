/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package MAIN;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejex1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> numeros = new ArrayList();
        int suma = 0;
        int cantidadNumeros = 0;
        int num = 0;
        do {
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            if (num != -99) {
                numeros.add(num);
                suma += num;
                cantidadNumeros++;
            }
        } while (num != -99);

        System.out.println(numeros);
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + suma / cantidadNumeros);
    }
}

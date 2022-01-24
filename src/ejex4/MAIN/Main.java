/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package MAIN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Integer> zipcodes = new HashMap();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la ciudad y leugo el zip");
            zipcodes.put(leer.next(), leer.nextInt());
        }
        System.out.println(zipcodes);
        System.out.println("INGRESE EL ZIP A BUSCAR");
        Integer auxzip = leer.nextInt();
        for (Map.Entry<String, Integer> aux : zipcodes.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            if (auxzip == aux.getValue()) {
                System.out.println(aux);
            }
        }
        System.out.println("INGRESE LAS CIUDADES A ELIMINAR");
        zipcodes.remove(leer.next());
        zipcodes.remove(leer.next());
        zipcodes.remove(leer.next());
        System.out.println(zipcodes);
    }
}

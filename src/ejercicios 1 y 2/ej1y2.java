/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 */
package guia3java;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Iterator;
import java.util.Scanner;

public class ej1y2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        String rta;
        do {
            System.out.println("Ingrese una raza de perro");
            String raza = leer.next().toUpperCase().trim();
            razas.add(raza);
            System.out.println("¿Quiere ingresar otra raza?(SI/NO)");
            rta = leer.next().toUpperCase().trim();
        } while (!rta.equals("NO"));
        System.out.println("");
        System.out.println("-----EL CONTENIDO DEL ARRAYLIST ES-----");
        System.out.println("");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("");
        System.out.println("EJERCICIO 2");
        
        // ELIMINANDO SIN EL ITERATOR
        System.out.println("Ingrese la raza a eliminar");
        String aux = leer.next().toUpperCase().trim();
        int contelim = 0;
        for (int i = 0; i < razas.size(); i++) {
            String m = razas.get(i);
            if (m.equals(aux)) {
                razas.remove(m);
                System.out.println(razas);
                contelim++;
            }
        }
        if (contelim == 0) {
            System.out.println("EL NOMBRE INGRESADO NO SE ENCUENTRA EN EL ARRAYLIST");
            sort(razas);
            System.out.println(razas);
        }
        /*
        //ELIMINANDO CON eL ITERATOR
        Iterator<String> it = razas.iterator();
        System.out.println("INGRESE LA RAZA A ELIMINAR");
        String aux2 = leer.next().toUpperCase().trim();
        while (it.hasNext()) {
           String auxi = it.next();
            if (auxi.equals(aux2)) {
                it.remove();
                contelim++;
                System.out.println(razas);
            }
        }
        if (contelim == 0) {
            System.out.println("EL NOMBRE INGRESADO NO SE ENCUENTRA EN EL ARRAYLIST");
            sort(razas);
            System.out.println(razas);
    }
*/
}
}
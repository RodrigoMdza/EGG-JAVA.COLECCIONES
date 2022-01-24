/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package guia3javaej5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GUIA3JAVAEJ5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TreeSet<String> paises = new TreeSet();
        String rta;
        do {
            System.out.println("INGRESE UN PAIS");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("QUIERE AGREGAR OTRO PAIS?");
            rta = leer.next().toUpperCase().trim();
            System.out.println(paises);
        } while (!rta.equals("NO"));
        Iterator<String> it = paises.iterator();
        System.out.println("INGRESE EL PAIS A ELIMINAR");
        String elim = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(elim)) {
                it.remove();
            }
        }
        System.out.println(paises);
    }
}

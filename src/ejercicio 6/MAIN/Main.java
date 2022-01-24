/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package MAIN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Integer> tienda = new HashMap();
        int rta;
        System.out.println("MENU");
        System.out.println("1) AGREGAR PRODUCTO");
        System.out.println("2) MODIFICAR PRECIO");
        System.out.println("3) ELIMINAR PRODUCTO");
        System.out.println("4) MOSTRAR LISTA");
        System.out.println("5) SALIR");

        do {
            System.out.println("QUE OPCION QUIERE REALIZAR");
            rta = leer.nextInt();
            switch (rta) {
                case 1:
                    tienda.put(leer.next(), leer.nextInt());
                    break;
                case 2:
                    System.out.println("Que producto quiere modificar");
                    String modif = leer.next();
                    for (Map.Entry<String, Integer> aux : tienda.entrySet()) {
                        String key = aux.getKey();
                        Integer value = aux.getValue();
                        if (modif.equals(key)) {
                            System.out.println("Establesca nuevo precio");
                            aux.setValue(leer.nextInt());
                        }
                    }
                    System.out.println("Lista con precio modificado" + tienda);
                    break;
                case 3:
                    System.out.println("QUE PRODUCTO QUIERE ELIMINAR");
                    tienda.remove(leer.next());
                    break;
                case 4:
                    System.out.println("LISTA FINAL");
                    System.out.println(tienda);
                    break;
                case 5:
                    System.out.println("SALIR");
                    break;
            }
        } while (rta != 5);
    }
}

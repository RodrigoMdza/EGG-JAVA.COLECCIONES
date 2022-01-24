package SERVICIO;

import ENTIDAD.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CantanteFamoso cantante = new CantanteFamoso();
    ArrayList cantantes = new ArrayList();

    public CantanteFamoso crearcantante() {
        System.out.println("Ingrese el nombre");
        cantante.setNombre(leer.next());
        System.out.println("Ingrese el disco con mas ventas");
        cantante.setDisco(leer.next());
        return new CantanteFamoso(cantante.getNombre(), cantante.getDisco());
    }

    public void agregar() {

        CantanteFamoso cantante1 = crearcantante();
        cantantes.add(cantante1);
    }

    public void Menu() {
        int rta;
        System.out.println("MENU");
        System.out.println(" 1) MOSTRAR LISTA");
        System.out.println(" 2) AGREGAR CANTANTE");
        System.out.println(" 3) ELIMINAR CANTANTE");
        System.out.println(" 4) SALIR");
        System.out.println("");
        do {
            System.out.println("ELIJA UNA OPCION");
            rta = leer.nextInt();
            switch (rta) {
                case 1:
                    System.out.println(cantantes.toString());
                    break;
                case 2:
                    agregar();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre a eliminar");
                    String elim = leer.next();
                    Iterator<CantanteFamoso> it = cantantes.iterator();
                    while (it.hasNext()) {
                        CantanteFamoso aux = it.next();
                        if (aux.getNombre().equals(elim)) {
                            it.remove();
                        }

                    }
                    break;
                case 4:
                    System.out.println("HASTA LA PROXIMA");
                    break;
            }
        } while (rta != 4);
    }
}

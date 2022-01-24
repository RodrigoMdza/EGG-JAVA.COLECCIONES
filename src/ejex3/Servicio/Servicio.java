package Servicio;

import ENTIDADES.Libreria;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Libreria libros = new Libreria();
    HashSet<Libreria> stock = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libreria crearLibro() {
        System.out.println("Ingrese el autor");
        libros.setAutor(leer.next());
        System.out.println("Ingrese el titulo");
        libros.setTitulo(leer.next());
        System.out.println("Unidades total");
        libros.setEjemplaresdisp(leer.nextInt());
        System.out.println("Unidades prestadas");
        libros.setEjemplaresprestados(0);
        return new Libreria(libros.getAutor(), libros.getTitulo(), libros.getEjemplaresdisp(), libros.getEjemplaresprestados());
    }

    public void agregar() {
        Libreria libro1 = crearLibro();
        stock.add(libro1);
    }

    public void prestamo() {
        System.out.println(stock);
        System.out.println("Ingrese el titulo a prestarse");
        String auxLibro = leer.next();
        int contador = 0;
        for (Libreria aux : stock) {
            if (auxLibro.equals(aux.getTitulo())) {
                contador++;
                aux.setEjemplaresprestados(contador);
            }
            if (contador <= aux.getEjemplaresdisp()) {
                System.out.println("PRESTAMO REALIZADO");
            } else {
                System.out.println("ERROR NO QUEDAN UNIDADES DISPONIBLES");
                contador--;
                aux.setEjemplaresprestados(contador);
            }
        }
        System.out.println(stock);
    }

    /*    public void devolucion(){
        System.out.println("Ingrese el titulo a devolver");
        String auxLibro = leer.next();
        for (Libreria aux : stock) {
            if (auxLibro.equals(aux.getTitulo())) {
                int contador = aux.getEjemplaresprestados();
                contador--;
                aux.setEjemplaresprestados(contador);
                if (aux.getEjemplaresprestados()>0) {
                    System.out.println("LIBRO DEVUELTO");
                } else {
                    System.out.println("EL LIBRO NO ESTABA PRESTADO");
                    aux.setEjemplaresprestados(aux.getEjemplaresprestados()+1);
                }
            }
        }
        System.out.println(stock);
    }
     */
    public void devolucion() {
        System.out.println("Ingrese el titulo a devolver");
        String auxLibro = leer.next();
        Iterator<Libreria> it = stock.iterator();
        while (it.hasNext()) {
            Libreria aux = it.next();
            if (aux.getTitulo().equals(auxLibro)) {
                if (aux.getEjemplaresprestados() == 0) {
                    System.out.println("ESTE LIBRO NO HA SIDO PRESTADO");
                } else {
                    aux.setEjemplaresprestados(aux.getEjemplaresprestados() - 1);
                    System.out.println("LIBRO DEVUELTO CORRECTAMENTE");
                }
            }
        }
        System.out.println(stock);
    }
}

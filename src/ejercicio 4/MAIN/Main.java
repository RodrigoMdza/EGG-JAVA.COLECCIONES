/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package MAIN;

import ENTIDADES.Comparadores;
import ENTIDADES.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula pelicula = new Pelicula();
        ArrayList<Pelicula> cartelera = new ArrayList();
        String rta;
        do {
            System.out.println("Ingrese el titulo");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion en horas");
            pelicula.setDuracion(leer.nextInt());
            Pelicula peli = new Pelicula(pelicula.getTitulo(), pelicula.getTitulo(), pelicula.getDuracion());
            cartelera.add(peli);
            System.out.println("¡Quiere ingresar otra pelicula?");
            rta = leer.next().toUpperCase().trim();
        } while (!rta.equals("NO"));
        for (Pelicula aux : cartelera) {
            Collections.shuffle(cartelera);
            System.out.println(cartelera.toString());
        }
        System.out.println("Peliculas de mas de una hora");
        for (Pelicula mas1hora : cartelera) {
            if (mas1hora.getDuracion() > 1) {
                System.out.println(mas1hora);
            }
        }

        System.out.println("");
        System.out.println("------");
        System.out.println("PELICULAS POR DURACION DESC");
        Collections.sort(cartelera, Comparadores.OrdenarPorDuracionDesc);
        System.out.println(cartelera.toString());
        System.out.println("");
        System.out.println("------");
        System.out.println("PELICULAS POR DURACION ASC");
        Collections.sort(cartelera, Comparadores.OrdenarPorDuracionDesc.reversed());
        System.out.println(cartelera.toString());
        System.out.println("");
        System.out.println("------");
        System.out.println("PELICULAS POR TITULO ASC");
        Collections.sort(cartelera, Comparadores.OrdenarPorTituloAsc.reversed());
        System.out.println(cartelera.toString());
        System.out.println("");
        System.out.println("------");
        System.out.println("PELICULAS POR DIRECTOR ASC");
        Collections.sort(cartelera, Comparadores.OrdenarPorDirectorDesc.reversed());
        System.out.println(cartelera.toString());
    }
}

package ENTIDADES;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> OrdenarPorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };

    public static Comparator<Pelicula> OrdenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };

    public static Comparator<Pelicula> OrdenarPorDirectorDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
}

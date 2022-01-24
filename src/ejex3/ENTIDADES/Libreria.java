package ENTIDADES;

import java.util.Objects;

public class Libreria {

    private String autor;
    private String titulo;
    private int ejemplaresdisp;
    private int ejemplaresprestados;

    public Libreria() {
    }

    public Libreria(String autor, String titulo, int ejemplaresdisp, int ejemplaresprestados) {
        this.autor = autor;
        this.titulo = titulo;
        this.ejemplaresdisp = ejemplaresdisp;
        this.ejemplaresprestados = ejemplaresprestados;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEjemplaresdisp() {
        return ejemplaresdisp;
    }

    public void setEjemplaresdisp(int ejemplaresdisp) {
        this.ejemplaresdisp = ejemplaresdisp;
    }

    public int getEjemplaresprestados() {
        return ejemplaresprestados;
    }

    public void setEjemplaresprestados(int ejemplaresprestados) {
        this.ejemplaresprestados = ejemplaresprestados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + this.ejemplaresdisp;
        hash = 41 * hash + this.ejemplaresprestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libreria other = (Libreria) obj;
        if (this.ejemplaresdisp != other.ejemplaresdisp) {
            return false;
        }
        if (this.ejemplaresprestados != other.ejemplaresprestados) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libreria{" + "autor=" + autor + ", titulo=" + titulo + ", ejemplaresdisp=" + ejemplaresdisp + ", ejemplaresprestados=" + ejemplaresprestados + '}';
    }

}

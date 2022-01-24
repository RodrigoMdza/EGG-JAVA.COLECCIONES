package Servicio;

import ENTIDAD.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer;

    Alumno alumno = new Alumno();
    ArrayList<Alumno> curso;

    public Servicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.curso = new ArrayList();
    }

    public Alumno crearAlumno() {
        // tambien podria poner arriba Alumno alunno; y aca poner alumno = new Alumno();
        System.out.println("Ingrese el nombre");
        alumno.setNombre(leer.next());
        System.out.println("Ingrese la nota 1");
        Integer m = leer.nextInt();
        System.out.println("Ingrese la nota 2");
        Integer n = leer.nextInt();
        System.out.println("Ingrese la nota 3");
        Integer o = leer.nextInt();
        ArrayList<Integer> nots = new ArrayList();
        nots.add(m);
        nots.add(n);
        nots.add(o);
        alumno.setNotas(nots);
        return new Alumno(alumno.getNombre(), alumno.getNotas());
    }

    public void crearAniadir(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Alumno alumnonuevo = crearAlumno();
            curso.add(alumnonuevo);
        }
    }

    public void mostrarCurso() {
        for (Alumno aux : curso) {
            System.out.println(aux.toString());
        }
    }

    public void notaFinal() {
        double promedio = 0;
        System.out.println("Ingrese el nombre del alumno a calcular el promedio");
        String auxNombre = leer.next();
        Iterator<Alumno> it = curso.iterator();
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(auxNombre)) {
                for (int i = 0; i < 3; i++) {
                    promedio = promedio + aux.getNotas().get(i);
                }
                promedio = promedio / 3;
                System.out.println("El promedio es " + promedio);
            }
        }
    }
}

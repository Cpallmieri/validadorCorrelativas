import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseño = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseño.agregarCorrelativa(paradigmas);

        Alumno juan = new Alumno("Juan", "Pérez", 12345678);
        juan.aprobarMateria(algoritmos);
        juan.aprobarMateria(paradigmas);

        Inscripcion inscripcion = new Inscripcion(1, juan, Arrays.asList(diseño));
        System.out.println("Inscripción aprobada: " + inscripcion.aprobada());
    }
}
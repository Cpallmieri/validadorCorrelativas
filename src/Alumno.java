import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void aprobarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public boolean puedeCursar(Materia materia) {
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}

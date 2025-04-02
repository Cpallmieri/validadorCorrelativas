import java.util.List;

public class Inscripcion {
    private int id;
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(int id, Alumno alumno, List<Materia> materias) {
        this.id = id;
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada() {
        for (Materia materia : materias) {
            if (!alumno.puedeCursar(materia)) {
                return false;
            }
        }
        return true;
    }
}

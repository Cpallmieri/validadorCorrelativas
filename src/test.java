import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    @Test
    void aceptoInscripcion(){
        Alumno ciro = new Alumno("ciro","palmieri",44560905);
        Materia am1 = new Materia("Analisis Matematico");
        Materia algebra = new Materia("Algebra");
        Materia economia = new Materia("economia");

        ciro.aprobarMateria(am1);
        ciro.aprobarMateria(algebra);

        economia.agregarCorrelativa(am1);
        economia.agregarCorrelativa(algebra);

        List<Materia> materias = new ArrayList<>();
        materias.add(economia);

        Inscripcion inscripcion = new Inscripcion(1,ciro,materias);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void rechazoInscripcion(){
        Alumno ciro = new Alumno("ciro","palmieri",44560905);
        Materia am1 = new Materia("Analisis Matematico");
        Materia algebra = new Materia("Algebra");
        Materia economia = new Materia("economia");

        ciro.aprobarMateria(algebra);

        economia.agregarCorrelativa(am1);
        economia.agregarCorrelativa(algebra);

        List<Materia> materias = new ArrayList<>();
        materias.add(economia);

        Inscripcion inscripcion = new Inscripcion(1,ciro,materias);
        assertFalse(inscripcion.aprobada());
    }

    @Test
    void aceptoSinCorrelativas(){
        Alumno ciro = new Alumno("ciro","palmieri",44560905);
        Materia am1 = new Materia("Analisis Matematico");
        Materia algebra = new Materia("Algebra");
        Materia economia = new Materia("economia");

        List<Materia> materias = new ArrayList<>();
        materias.add(economia);

        Inscripcion inscripcion = new Inscripcion(1,ciro,materias);
        assertTrue(inscripcion.aprobada());
    }
}

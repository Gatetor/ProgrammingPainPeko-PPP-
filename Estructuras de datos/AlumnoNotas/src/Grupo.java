import java.util.Arrays;
import java.util.Scanner;

public class Grupo {
    private Profesor profesor;
    private int boiQuantity;
    private Alumno[] alumnos;
    private static final int MAX_ALUMNOS = 30;

    // actual no clue, on god, on how to do this

    // this.alumnos[0].getAsigantura1.getCalificacion()
    // public void calificar() {}

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getBoiQuantity() {
        return boiQuantity;
    }

    public void setBoiQuantity(int boiQuantity) {
        this.boiQuantity = boiQuantity;
    }

}

// TODO: calificar estudiante
// TODO Obtener media de notas del grupo
// TODO alumno con nota mas alta de una asignatura
// TODO media mas alta en general

// meowzers
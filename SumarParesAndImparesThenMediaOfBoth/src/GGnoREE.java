import java.util.Scanner;

public class GGnoREE {
    public static void main(String[] args) throws Exception {

        // En un curso de informática se han realizado dos exámenes diferentes, A y B,
        // entre sus 50
        // alumnos(alumnos impares, examen A, alumnos pares, examen B). Se desea saber
        // la nota media de cada
        // examen.

        int pares, impares, midpar, midimp, num, tot;

        pares = 0;
        impares = 0;

        for (int i = 1; i <= 50; i++) {

            System.out.println("Introduce notas de los alumnos: ");
            System.out.println("");

            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();

            if (i % 2 == 0) {
                pares += num;
            } else {
                impares += num;
            }

        }
        System.out.println("");
        System.out.println("Media de los pares= " + pares / 25);
        System.out.println("Media de los impares= " + impares / 25);
    }
}
 //un programa que pida por teclado entre el 1 y el 9
 //con validacion
 //ejemplo: introducimos 4; resultado= 1;12;123;1234 (con saltos de linea)
 //depues lo mismo pero de derecha a izq que se muestre en consola
 //otra que sea 1;212;32123;4321234 (piramide real)
 //4321;321;21;1 (mitad piramide invertida)
 //ROMBO YEEEEEEEEEEEEEEEEEEE

 //(juego comprobar si has escogido el nº correcto) adivinar numero entre 1 y X (X configurable por teclado)
 //como obtener un nº aleatorio en java
 //hacer numero de intentos?

 //dado un nº entero (usuario), sacar por pantalla sus cifras (ejemplo= 3456; resultado=3;4;5;6)
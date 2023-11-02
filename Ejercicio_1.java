import java.util.Scanner;

public class Ejercicio_1 {

// idk how this shit works xd

    public static void main(String[] args) {

        final double CONVERT = 2.54;
        //final significa que es una constante(no se puede cambiar una vez introducido)
        //todas las constantes van FULL en MAYUSCULA

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nº en pulgadas: ");

        int teclado = entrada.nextInt();

        System.out.println(teclado+ " pulgadas son: "+(teclado*CONVERT)+ " cm");
        
        entrada.close();


    }
}

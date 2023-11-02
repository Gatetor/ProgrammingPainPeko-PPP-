package Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {

// idk how this shit works xd

    public static void main(String[] args) {
        
    double pi = 3.14;
    double totarea = 0;
    double totvol = 0;


    Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la altura en cm: ");
        
            int altura = entrada.nextInt();

        System.out.println("Introduce el radio del cilindro en cm: ");

            int radio = entrada.nextInt();
        
totarea = (2*pi*radio*altura+(2*pi*radio*radio));
totvol = pi*radio*radio*altura;



        System.out.println("El area del cilindro es: "+totarea+" cm");
        System.out.println("El volumen total del cilindro es: "+totvol+" cm");

    }
}

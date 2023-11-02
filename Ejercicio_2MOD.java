

import java.util.Scanner;

public class Ejercicio_2MOD {

// idk how this shit works xd

    public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la altura en cm: ");
        
            int altura = entrada.nextInt();

        System.out.println("Introduce el radio del cilindro en cm: ");

            int radio = entrada.nextInt();
        

double totvol = (Math.PI*radio*radio*altura);
double totarea = (2*Math.PI*radio*altura)+(2*Math.PI*Math.pow(radio, 2));



        System.out.println("El area del cilindro es: "+totarea+" cm");
        System.out.println("El volumen total del cilindro es: "+totvol+" cm");

    }
}

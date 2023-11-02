import java.util.Scanner;

// Realizar un programa Java que permita introducir 10 parejas de números naturales A,B y para cada
// una de ellas, visualizar su producto por el método de las sumas sucesivas.
// (Nota 7*3=3+3+3+3+3+3+3, es decir se suma B, A veces).

public class ScreamForHelp {
    public static void main(String[] args) throws Exception {

        int a, b, inib, suma;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteracion " + i + "/10");
            System.out.println("Introduce 1st num ");
            a = teclado.nextInt();
            System.out.println("Introduce 2nd num ");
            b = teclado.nextInt();

            inib = b;

            for (int j = 1; j < a; j++) {
                b += inib;
            }
            suma = b;
            System.out.println("Resultado es: " + suma);
            System.out.println("");

        }
teclado.close();
    }
}

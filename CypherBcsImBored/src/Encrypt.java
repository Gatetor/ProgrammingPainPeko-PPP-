import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {

        String texto;
        String input;
        int opc;

        Scanner teclado = new Scanner(System.in);

        System.out.println("1. Cifrar");
        System.out.println("2. Descifrar");

        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Introduce el texto a cifrar");

                input = teclado.nextLine();
                input = teclado.nextLine();

                texto = Caesar.cifrar(input);

                System.out.println("Texto cifrado: " + texto);
                break;

            case 2:
                System.out.println("Introduce el texto a descifrar");

                input = teclado.nextLine();
                input = teclado.nextLine();

                texto = Caesar.descifrar(input);

                System.out.println("Texto cifrado: " + texto);

                break;
        }

    }
}
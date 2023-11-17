import java.util.Scanner;

public class PalindromoMain {

    public static void main(String[] args) {
        String strA;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la palabra a comrpobar");

        strA = teclado.nextLine();

        strA = strA.toUpperCase();
        boolean Ayuda = isPali(strA);

        //FIXME: comentar de aqui

        // for (int i = strA.length() - 1; i < 0; i++) {

        //     if (strA.charAt(i)) {

        //     } else {

        //     }

        // }
        // //FIXME: a aqui



        //TODO: Procesar de 4 en 4 y rellenar con 0s lo necesario

        if (Ayuda == true) {
        System.out.println("La palabra es perfectamente simetrica; que gusto");
        } else {
        System.out.println("Esa palabra es asquerosamente asimetrica, ew");
        }

        teclado.close();
    }

    public static boolean isPali(String str) {
        String reverse = "";

        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            ans = true;
        }
        return ans;
    }
}

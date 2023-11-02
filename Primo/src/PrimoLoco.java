import java.util.Scanner;

public class PrimoLoco {
    public static void main(String[] args) throws Exception {

        int num, resto, divisor;
        boolean esPrimo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce num");
        num = teclado.nextInt();
        esPrimo = true;
        divisor = 2;

    if (num<2) {
        System.out.println("Nº no válido");
    } else {
        while ((divisor < num)&&(esPrimo)) { //Se podría optimizar para que solo leyese hasta la raíz del nº
            resto = num % divisor;
            if (resto == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}
}
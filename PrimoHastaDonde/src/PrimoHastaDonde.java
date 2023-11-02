import java.util.Scanner;

public class PrimoHastaDonde {
    public static void main(String[] args) throws Exception {

        int num, primos, resto, conta, divisor;
        boolean esPrimo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce num");
        primos = teclado.nextInt();
        conta = 0;
        primos = 0;
        esPrimo = true;
        divisor = 2;

        while (conta < primos) {

            if (num < 2) {
                System.out.println("Nº no válido");
            } else {
                while ((divisor < num) && (esPrimo)) { // Se podría optimizar para que solo leyese hasta la raíz del nº
                    resto = num % divisor;
                    if (resto == 0) {
                        esPrimo = false;
                    }
                    divisor++;
                }
                if (esPrimo) {
                    System.out.println(num);
                    primos++;
                }

            }
            num++;
        }
    }
}
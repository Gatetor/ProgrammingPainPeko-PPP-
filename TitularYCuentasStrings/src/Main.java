import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Cuenta cuenta1, cuenta2;
        Titular titular1, titular2;

        int opc, opcCuenta;

        titular1 = new Titular("0000001M", "Alv", "Madre Loco", LocalDate.of(2020, 10, 5));
        titular2 = new Titular("0222002A", "Poggers", "Tolaila", LocalDate.of(1999, 5, 23));

        cuenta1 = new Cuenta(1, 3.14, titular1);
        cuenta2 = new Cuenta(2, 420.69, titular2);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Con qué cuenta vamos a trabajar?");
        System.out.println("1. Cuenta 1");
        System.out.println("2. Cuenta 2");

        opcCuenta = teclado.nextInt();

        System.out.println("Menu");
        System.out.println("");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Comparar Id cuentas");

        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                if (opcCuenta == 1) {
                    cuenta1.ingresar();
                } else {
                    cuenta2.ingresar();
                }

                break;

            case 2:
                if (opcCuenta == 1) {
                    cuenta1.retirar();
                } else {
                    cuenta2.retirar();
                }
                break;

            case 3:
                cuenta1.compararIdCuenta(cuenta2);
                break;
            default:
                System.out.println("*Pinkmin noise*");
                break;
        }
        System.out.println("");
        System.out.println(cuenta1.mostrar());
        System.out.println(cuenta2.mostrar());

        teclado.close();
    }

}

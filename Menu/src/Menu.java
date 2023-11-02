import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {

        // 1.Sumar
        // 2. Restar
        // 3. Multiplicar
        // 4. Dividir

        int opc;
        double a = 0;
        double b = 0;
        double result;

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Whatchugonna do?");

        Scanner teclado = new Scanner(System.in);º
        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Introduce 1º num: ");
                a = teclado.nextDouble();
                System.out.println("Introduce 2º num: ");
                b = teclado.nextDouble();
                result = a + b;
                System.out.println("Resultado: " + result);
                break;
            case 2:
                System.out.println("Introduce 1º num: ");
                a = teclado.nextDouble();
                System.out.println("Introduce 2º num: ");
                b = teclado.nextDouble();
                result = a - b;
                System.out.println("Resultado: " + result);
                break;
            case 3:
                System.out.println("Introduce 1º num: ");
                a = teclado.nextDouble();
                System.out.println("Introduce 2º num: ");
                b = teclado.nextDouble();
                result = a * b;
                System.out.println("Resultado: " + result);
                break;
            case 4:
                System.out.println("Introduce 1º num: ");
                a = teclado.nextDouble();
                System.out.println("Introduce 2º num: ");
                b = teclado.nextDouble();
                result = a / b;
                System.out.println("Resultado: " + result);
                break;

            default:
                System.out.println("No es una opcion");
                break;
        }
        teclado.close();
    }
}

import java.util.Scanner;

public class TablaFor {
    public static void main(String[] args) throws Exception {

        int num, contador, res, tablenum;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        for (tablenum = 1; tablenum <= num; tablenum++) {
            // contador =1;
            System.out.println("");
            System.out.println("Table del " + tablenum);

            for (contador = 1; contador <= 10; contador++) {
                res = tablenum * contador;
                System.out.println(tablenum + " x " + contador + " = " + res);

            }

        }

    }
}

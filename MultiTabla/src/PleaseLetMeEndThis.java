import java.util.Scanner;

public class PleaseLetMeEndThis {
    public static void main(String[] args) throws Exception {

        int num, contador, res, tablenum;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de teclado: ");
        num = teclado.nextInt();

        tablenum = 1;

        while (tablenum <= num) {
            contador = 1;
            System.out.println("");
            System.out.println("Tabla del " + tablenum);

            while (contador <= 10) {
                res = tablenum * contador;
                System.out.println(tablenum + " x " + contador + " = " + res);
                contador++;
            }
            tablenum++;
        }
        teclado.close();
    }
}

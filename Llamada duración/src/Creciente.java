import java.util.Scanner;

public class Creciente {
    public static void main(String[] args) throws Exception {

        int num1, num2, num3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 1º num: ");
        num1=teclado.nextInt();

        System.out.println("Introduce 2º num: ");
        num2=teclado.nextInt();

        System.out.println("Introduce 3º num: ");
        num3=teclado.nextInt();


        if ((num1<num2)&&(num2<num3)) {
            System.out.println("Orden creciente :D");
        } else{
            System.out.println("No creciente :(");
        }

        teclado.close();



    }
}

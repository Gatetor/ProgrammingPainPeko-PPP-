import java.util.Scanner;

public class Rango {
    public static void main(String[] args) throws Exception {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce num: ");
        num=teclado.nextInt();


        if ((num>=10)&&(num<=100)) {
            System.out.println("Dentro, buena crack");
        } else{
            System.out.println("Fuera, pepehands");
        }

        teclado.close();



    }
}

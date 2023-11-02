import java.util.Scanner;

public class CAPITALISM {
    public static void main(String[] args) throws Exception {

        // Un capital C se coloca a un interés R. Al cabo de cuantos años se doblará?.
        // Realizar un programa
        // Java que lo calcule.

        double money, doublemoney, inter, conta, finalmoney;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuanto money metes? ");
        money = teclado.nextDouble();

        System.out.println("Interés ");
        inter = teclado.nextDouble();

        finalmoney = money;
        inter = inter / 100;
        conta = 0;
        doublemoney = money * 2;

        while (finalmoney < doublemoney) {
            finalmoney = money + (money * inter);
            money = finalmoney;
            conta++;
        }

        System.out.println("Años minimos para obtener el doble: " + conta);
        teclado.close();

    }
}

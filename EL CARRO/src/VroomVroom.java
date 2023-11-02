import java.util.Scanner;

public class VroomVroom {
    public static void main(String[] args) throws Exception {

        Car car1;

        int cantidad;
        String opc;
        double tiempo;
        int distancia;

        car1 = new Car();

        System.out.println("Cuanto quieres frenar");
        System.out.println("Velocidad actual: " + car1.getCurrentspeed());

        Scanner teclado = new Scanner(System.in);

        cantidad = teclado.nextInt();

        car1.setCantidad(cantidad);

        car1.slow();

        System.out.println("Velocidad actual: " + car1.getCurrentspeed());

        System.out.println("Frenar?");

        opc = teclado.nextLine();

        opc = teclado.nextLine();

        if (opc.equals("y")) {
            car1.frenar();
        }

        System.out.println("Velocidad actual: " + car1.getCurrentspeed());

        System.out.println("LESGO? ");

        cantidad = teclado.nextInt();
        car1.setCantidad(cantidad);

        car1.LESGO();

        System.out.println("Velocidad actual: " + car1.getCurrentspeed());

        System.out.println("Como de lejos vas a ir? (Km)");

        distancia = teclado.nextInt();

        tiempo = distancia / car1.getCurrentspeed();

        System.out.println("Tiempo approx de llegada :" + tiempo + "h");

        System.out.println(car1);

        

    }
}


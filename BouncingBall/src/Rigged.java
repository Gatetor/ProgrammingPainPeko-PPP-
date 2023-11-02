public class Rigged {
    public static void main(String[] args) throws InterruptedException {
        Jugador jugador1, jugador2;

        int dias = 1;

        jugador1 = new Jugador();
        jugador2 = new Jugador(2, 25, 10, 2, 0, 0);

        System.out.println(jugador1);

        System.out.println(jugador2);


        //aqui se podria poner jugador1,2.entrenar_dos(10) porque le hemos puesto un int en el otro y
        //entrenaria 10 dias porque int dias bla bla bla


        while (dias <= 10) {
            System.out.println(dias + " dias");
            jugador1.entrenar_dos();
            Thread.sleep(300);
            jugador2.entrenar_dos();
            Thread.sleep(300);
            System.out.println();
            jugador1.entrenar_tres();
            Thread.sleep(300);
            jugador2.entrenar_tres();
            Thread.sleep(300);
            System.out.println();

            dias++;

        }

        System.out.println("Entrenamiento de 10 dias finalizado");
        Thread.sleep(2000);
        System.out.println("Comienza entrenamiento hasta 65%");
        Thread.sleep(1000);
        System.out.println();

        while ((jugador1.getPerdouble() < 65) || (jugador2.getPerdouble() < 65) || (jugador1.getPertriple() < 45)
                || (jugador2.getPertriple() < 45)) {

            System.out.println(dias + " dias");

            jugador1.entrenar_dos();
            Thread.sleep(300);

            jugador2.entrenar_dos();
            Thread.sleep(300);

            System.out.println();

            jugador1.entrenar_tres();
            Thread.sleep(300);

            jugador2.entrenar_tres();
            Thread.sleep(300);

            System.out.println();

            dias++;
        }

        Thread.sleep(1500);
        System.out.println("Comenzando tiradas a canasta");
        System.out.println();
        Thread.sleep(2000);

        while ((jugador1.getCanstadoble() < 10) || (jugador2.getCanstadoble() < 10) || (jugador1.getCanastatriple() < 4)
                || (jugador2.getCanastatriple() < 4)) {

            jugador1.lanzarDOS();
            Thread.sleep(300);

            jugador2.lanzarDOS();
            Thread.sleep(300);

            System.out.println();

            jugador1.lanzarTRES();
            Thread.sleep(300);

            jugador2.lanzarTRES();
            Thread.sleep(300);

        }

    }
}

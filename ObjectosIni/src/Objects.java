import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {

        Bicycle bici1, bici2, bici3; // objeto bici1,2,3 en la calse Bicileta
        int cantidad, bici, opc, velocidad, cadence, gear, speed;

        Scanner teclado = new Scanner(System.in);

        bici1 = new Bicycle(cadence=0, speed=0, gear=0); // hace un nuevo objeto bici1 que adquiere los atributos
        bici2 = bici1;

        System.out.println("1. Cambiar marcha");
        System.out.println("2. Acelerar");
        System.out.println("3. Frenar");
        System.out.println("4. Mostrar datos");
        System.out.println("5. Salir");

        opc = teclado.nextInt();

        while (opc != 5) {

            cantidad = 0;

            switch (opc) {
                case 1:
                    System.out.println("Bici 1 o bici 2");
                    bici = teclado.nextInt();

                    while (bici < 1 || bici > 2) {
                        System.out.println("Bici 1 o bici 2");
                        bici = teclado.nextInt();
                    }

                    System.out.println("A que marcha quieres cambiar?");
                    cantidad = teclado.nextInt();

                    if (bici == 1) {
                        bici1.setGear(cantidad);
                    } else {
                        bici2.setGear(cantidad);
                    }

                    break;

                case 2:

                    System.out.println("Bici 1 o bici 2");
                    bici = teclado.nextInt();

                    while (bici < 1 || bici > 2) {
                        System.out.println("Bici 1 o bici 2");
                        bici = teclado.nextInt();
                    }

                    System.out.println("Cuanto quieres acelerar");
                    cantidad = teclado.nextInt();

                    if (bici == 1) {
                        bici1.speedUp(cantidad);
                    } else {
                        bici2.speedUp(cantidad);
                    }

                    break;

                case 3:

                    System.out.println("Bici 1 o bici 2");
                    bici = teclado.nextInt();

                    while (bici < 1 || bici > 2) {
                        System.out.println("Bici 1 o bici 2");
                        bici = teclado.nextInt();
                    }

                    System.out.println("Cuanto quieres frenar");
                    cantidad = teclado.nextInt();

                    if (bici == 1) {
                        bici1.applyBrake(cantidad);
                    } else {
                        bici2.applyBrake(cantidad);
                    }

                    break;

                case 4:

                    System.out.println("Bici 1 o bici 2");
                    bici = teclado.nextInt();

                    while (bici < 1 || bici > 2) {
                        System.out.println("Bici 1 o bici 2");
                        bici = teclado.nextInt();
                    }

                    if (bici == 1) {
                        System.out.println("Cadence " + bici1.getCadence());
                        System.out.println("Gear " + bici1.getGear());
                        System.out.println("Speed " + bici1.getSpeed());

                    } else {
                        bici2.getData();
                    }

                    break;

                case 5:
                    System.out.println("Later aligator");
                    System.exit(1);
            }
            System.out.println("1. Cambiar marcha");
            System.out.println("2. Acelerar");
            System.out.println("3. Frenar");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");

            opc = teclado.nextInt();
        }

        //// TODO Crear menu que sea 1. Cambiar marcha (pregunta sobre que bici(1,2)
        //// despues a que marcha)
        // TODO 2. acelerar 3. Frenar 4. Mostrar datos 5. Salir

        // TODO if (bici1.getSpeed()<bici2.getSpeed())
        // TODO validar la marcha tiene que estar entre 1 y 7, acelerar tiene que ser
        // positivo y frenar igual(+)

        /*
         * bici1 = new Bicycle(1, 2, 3);// se conecta con el otro archivo
         * // los valores son 0 por defecto // y te le pasa los parametros que necesita
         * bici2 = new Bicycle(2, 3, 4);
         * 
         * bici3 = bici1;
         * 
         * bici1.setGear(9); // cambia el valor del atributo gear a 0 para el objeto
         * bici1
         * 
         * //velocidad = bici1.speedUp(3);
         * 
         * bici1.speedUp(3);
         * 
         * velocidad = bici1.getSpeed();
         * 
         * System.out.println(velocidad); // lo que almacena es la dirección en la
         * memoria
         */

    }

}
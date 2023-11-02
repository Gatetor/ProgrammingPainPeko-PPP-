import java.util.Scanner;

public class BoyoEdad {
    public static void main(String[] args) throws Exception {
        int tinyboy, edad, totedad;
        double edadmid, mid;

        totedad = 0;
        mid = 0;
        tinyboy = 0;

        Scanner teclado = new Scanner(System.in);

        while (mid < 4) {
            System.out.println("Introduce la edad de los boyos");
            edad = teclado.nextInt();

            if (mid == 0) {
                tinyboy = edad;
            } else {
                if (edad < 0) {
                    System.out.println("BOY WYDM EDAD<0 BRUH whatever");
                } else {
                    if (edad < tinyboy) {
                        tinyboy = edad;
                    }
                }
            }

            mid++;
            totedad = totedad + edad;

        }

        edadmid = totedad / mid;

        System.out.println("Suma de edades: " + totedad);
        System.out.println("Tiniest boyo: " + tinyboy);
        System.out.println("Media de edades: " + edadmid);

        teclado.close();
    }
}

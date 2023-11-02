import java.util.Random;
import java.util.Scanner;

public class Funnynt {

    // un programa que pida por teclado entre el 1 y el 9 con validacion
    // ejemplo: introducimos 4; resultado= 1;12;123;1234 (con saltos de linea)
    // depues lo mismo pero de derecha a izq que se muestre en consola
    // otra que sea 1;212;32123;4321234 (piramide real)
    // 4321;321;21;1 (mitad piramide invertida)
    // ROMBO YEEEEEEEEEEEEEEEEEEE

    // (juego comprobar si has escogido el nº correcto) adivinar numero entre 1 y X
    // (X configurable por teclado)
    // como obtener un nº aleatorio en java
    // hacer numero de intentos?

    // dado un nº entero (usuario), sacar por pantalla sus cifras (ejemplo= 3456;
    // resultado=3;4;5;6)

    public static void main(String[] args) throws Exception {

        int num, select, keynumgame, trynum, trysofar, pricenum;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecciona una opcion: ");

        select = teclado.nextInt();

        switch (select) {

            case 1:

                Random party = new Random();

                System.out.println("Introduce num: ");

                num = teclado.nextInt();

                for (int i = 1; i <= num; i++) {

                    for (int j = 1; j <= i; j++) {

                        System.out.print(j); // quitamos ln the println para que no salte de linea

                    }
                    System.out.println();
                }

                break;

            case 2:

                pricenum=1+((int)(Math.random()*100)); //whatever the fuck this is
                System.out.println(pricenum);  

                trynum=7;
                trysofar=1;

                System.out.println("Numero: ");
                keynumgame= teclado.nextInt();
                trynum=1;

                while ((keynumgame!=pricenum)&&(trysofar<trynum)) {
                    
                }
                    









        }
        teclado.close();

    }
}

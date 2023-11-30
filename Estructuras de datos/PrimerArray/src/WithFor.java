import java.util.Scanner;

public class WithFor {
    public static void main(String[] args) throws Exception {

        // se crean arrays poninedo [] al lado de cualquier tipo de coso (int, double,
        // etc) int[] anArray;
        // se pone nombreArray = new int [10]; para alocar la memoria para 10 num
        // enteros por ejemplo
        // anArray[0] = 100; asigna valor 100 al primer elemento del arary (como una
        // casilla vamos)
        // anArray[1] = 200; le asgina valor 200 al segundo elemento, etcetc
        // sysout("Element at index 1: " + anArray[0]); muestra "Element at index 1:
        // 100"

        Scanner teclado = new Scanner(System.in);

        // declares an array of integers
        int[] anArray;
        int suma = 0;
        int mayor;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        // TODO: Esto se queda irrelevante con los metodos de mas adelante, pero venian
        // en el ejemplo

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Introduzca valor: ");
            anArray[i] = teclado.nextInt();
        }

        System.out.println("Se han introducido todos los valores");
        Thread.sleep(700);
        System.out.println("Mostrando valores por pantalla: ");

        for (int valor : anArray) {
            Thread.sleep(300);
            System.out.println("Valor: " + valor);
        }

        for (int i = 0; i < anArray.length; i++) {
            suma += anArray[i];
            Thread.sleep(300);
            System.out.println("Suma por ahora: " + suma);
        }

        // mayor = anArray[0];

        // for (int i = 0; i < anArray.length; i++) {
        //     if (anArray[i] > mayor) {
        //         mayor = anArray[i];
        //     }
        // }

        //sysout con el metodo, pasandole el array
        System.out.println("Mayor: " + mayor(anArray));

        rotateBanana(anArray);

        for (int valor : anArray) {
            Thread.sleep(300);
            System.out.println("Valor: " + valor);
        }

        // System.out.println("El mas tocho: " + mayor);

        // creo que se entiende, vamos
        // for (int i = 0; i < anArray.length; i++) {
        // System.out.println("Valor: " + anArray[i]);
        // }

    }

    //lo de coger el mayor del array hecho un metodo
    public static int mayor(int[] valores) {
        int mayorinside = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayorinside) {
                mayorinside = valores[i];
            }
        }
        return mayorinside;
    }

    //contar los positivos en el array
    public static int positivos(int[] anArray) {
        
        int contador = 0;

        for (int valor : anArray ) {
            if (valor > 0) {
                contador++;
            }
        }
        return contador;
    }

    //rotar por la derecha para que los numeros ciclen
    public static int[] rotateBanana(int[] elArray) {
        //creamos un auxiliar para guardar el ultimo numero y no joder todo
        //ya te vale, seguro que lo ibas a hacer mal
        int auxiliar;
        auxiliar = elArray[elArray.length-1];

        //hacemos todo el proceso, que deja la casilla numero 1 sin re-escribir
        for (int i = elArray.length-1; i >= 1; i--) {
            //array-1 es porque si tiene 10 casillas, empieza en la 0 y se para en la 9, hay que restar 1
            elArray[i] = elArray[i-1];    
        }   
        //re-escribimos en casilla 0 para poner el que estaba en la ultima posicion
        elArray[0] = auxiliar;
        return elArray;
    }

}

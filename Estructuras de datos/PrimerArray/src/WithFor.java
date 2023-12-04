import java.util.Arrays;
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
        String[] arrayString;
        int suma = 0;
        String poggers;
        int mayor;

        System.out.println("Introduce frase para cifrar");
        poggers = teclado.nextLine();

        int arrayLength = poggers.length();

        // allocates memory for 10 integers
        anArray = new int[10];
        arrayString = new String[arrayLength];

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
        // FIXME: Esto se queda irrelevante con los metodos de mas adelante, pero venian
        // en el ejemplo

        // TODO: cifrado hecho; apañarlo para string porque encima esta a medias???

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

        //FIXME: esto puede dar error
        mayor = anArray[0];

        for (int i = 0; i < anArray.length; i++) {
        if (anArray[i] > mayor) {
        mayor = anArray[i];
        }
        }
        
    
        // sysout con el metodo, pasandole el array
        System.out.println("Mayor: " + mayor(anArray));

        rotateBanana(anArray);

        for (int valor : anArray) {
        Thread.sleep(300);
        System.out.println("Valor: " + valor);
        }

        System.out.println("El mas tocho: " + mayor);

        //creo que se entiende, vamos
        for (int i = 0; i < anArray.length; i++) {
        System.out.println("Valor: " + anArray[i]);
        }
        //FIXME: hasta aqui

        if (ordenado(anArray) == true) {
            System.out.println("Ta ordenado :)");
        } else {
            System.out.println("No ta ordenao :(");
        }

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        int[] sumaArrays = sumaVectores(array1, array2);

        System.out.println("**********SUMA**********");
        // Arrays.toString pasandole el objeto de la suma para poder mostrarlo por
        // pantalla
        // sin que te de la direccion de memoria y te quedes to loco pensando "wtf did
        // just happen"
        System.out.println(Arrays.toString(sumaArrays));

        teclado.close();
    }

    // lo de coger el mayor del array hecho un metodo
    public static int mayor(int[] valores) {
        int mayorinside = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayorinside) {
                mayorinside = valores[i];
            }
        }
        return mayorinside;
    }

    // contar los positivos en el array
    public static int positivos(int[] anArray) {

        int contador = 0;

        for (int valor : anArray) {
            if (valor > 0) {
                contador++;
            }
        }
        return contador;
    }

    // rotar por la derecha para que los numeros ciclen
    public static int[] rotateBanana(int[] elArray) {
        // creamos un auxiliar para guardar el ultimo numero y no joder todo
        // ya te vale, seguro que lo ibas a hacer mal
        int auxiliar;
        auxiliar = elArray[elArray.length - 1];

        // hacemos todo el proceso, que deja la casilla numero 1 sin re-escribir
        for (int i = elArray.length - 1; i >= 1; i--) {
            // array-1 es porque si tiene 10 casillas, empieza en la 0 y se para en la 9,
            // hay que restar 1
            elArray[i] = elArray[i - 1];
        }
        // re-escribimos en casilla 0 para poner el que estaba en la ultima posicion
        elArray[0] = auxiliar;
        return elArray;
    }

    public static boolean ordenado(int[] numeros) {
        boolean isInOrder = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                isInOrder = false;
            }
        }
        return isInOrder;
    }

    private static int[] sumaVectores(int[] vector1, int[] vector2) {
        int[] suma = null;

        if ((vector1 == null)
                || (vector2 == null)
                || (vector1.length != vector2.length)) {
            return suma;
        }

        suma = new int[vector1.length];

        for (int i = 0; i < suma.length; i++) {
            suma[i] = vector1[i] + vector2[i];
        }

        return suma;
    }

    // metodo que reciba array de numeros naturales, que devuelva
    // cuantos numeros primos hay en el array

    public class contaPrimos {

        private static boolean esPrimo(int[] numeros) {
            int resto, cont = 0;
            boolean esPrimo = true;

            for (int i = 0; i < numeros[i]; i++) {

                if (numeros[i] == 2 || numeros[i] == 1) {
                    return true;
                } else {
                    while (cont < numeros[i] && esPrimo == true) {
                        resto = numeros[i] % cont;

                        if (resto == 0) {
                            return false;
                        }
                        cont++;
                    }
                }
            }
            return true;
        }

        public static int contarPrimos(int[] numeros) {
            int contPrimos = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (esPrimo(numeros)) {
                    contPrimos++;
                }
            }
            return contPrimos;
        }

        // TODO: Aplicar esto en mi main; es del main de Alex

        // public static void main(String[] args) {

        // Scanner sc = new Scanner (System.in);

        // int[] anArray = new int[10];

        // for (int i=0;i<anArray.length;i++) {
        // System.out.println ("Valor " + i);
        // anArray[i] = sc.nextInt();
        // }
        // System.out.println (contarPrimos(anArray));

        // for (int i: anArray) {
        // System.out.println ("Valor: " + i);
        // }
        // sc.close();
        // }
    }

    // public static String cifrar(String texto) {
    // char

    // return resultado;
    // }

    public static char[] cifrar(char[] texto) {
        char[] resultado = new char[texto.length];
        String textoACifrar;
        String textoCifrado;
        char letra;

        for (int i = 0; i < texto.length; i++) {
            letra = texto[i];
            if (letra == 'x') {
                texto[i] = 'a';
            } else {
                if (letra == 'y') {
                    texto[i] = 'b';
                } else {
                    if (letra == 'z') {
                        texto[i] = 'c';
                    } else {
                        texto[i] = (char) (letra + 3);
                    }
                }
            }
        }

        // textoACifrar = new String(texto);
        // textoCifrado = cifrar(textoACifrar);

        // resultado = textoCifrado.toCharArray();

        return resultado;
    }

    private static String mayor(String [] cadenas) {
        String mayor = null;

        if (cadenas != null) {
            //elegir valor no nulo
            mayor = cadenas[0];

            for (int i = 1; i < cadenas.length; i++) {
                //comprarar la longitud de la cadena en el punto i con el anterior POGPOGPOG
                //comprobar esta vez que la casilla a comprobar no está vacia
                if ((cadenas[i].length() > mayor.length())
                && (mayor != null) 
                && (cadenas != null)) {
                    mayor = cadenas[i];
                }
            }

        }
        return mayor;
    }

    private static boolean estaOrdenado(String[] cadenas) {

        boolean ordenado = true;

        //hay que hacer length-1 en esta ocasion porque sino está outOfBounds
        for (int i = 0; i < cadenas.length-1; i++) {
            if (cadenas[i].compareTo(cadenas[i+1]) > 0) {
                return false;
            }
        }

        return ordenado;
    }

    //TODO: Actually make this shit
    // private static int contaLindromos(String[] cadenas) {
    //     int contador = 0;

    //     for (int i = 0; i < cadenas.length; i++) {
    //         if (FIXME: make a fucking method for this) {
    //              contador++;
    //         }
    //     }

    //     return contador;
    // }

}

//booleano que comprueba orden alfabetico poggers
//dado un array de strings devolver cuantos palindromos hay
//dado un array string devuelva otro string texto; darle la vuelta al array
//dado un array de strings me devuelva de manera aleatoria me devulva uno de los elementos del array

//meowzers
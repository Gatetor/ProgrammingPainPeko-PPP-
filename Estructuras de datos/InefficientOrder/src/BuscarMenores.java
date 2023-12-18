import java.util.Arrays;

public class BuscarMenores { // KEKW nombre
    public static void ordenar(int[] numeros) throws Exception {

        int auxiliar, menorPos;
        int menor;
        int[] amogus = {1,2,5,3,4,12};

    Arrays.sort(amogus);

        for (int i = 0; i < numeros.length - 1; i++) {
            // buscar el mas pequeño y ubicarlo
            menor = numeros[i]; // inicia con i para ahorrar problemas al comparar
            menorPos = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < menor) {
                    menor = numeros[j];
                    menorPos = j;
                }

            }
            // intercambio con el mas pequeño
            auxiliar = numeros[i];
            numeros[i] = menor;
            numeros[menorPos] = auxiliar;

        }

        // TODO: crear un metodo que reciba 2 matrices y devuelve la matriz producto

        

    }
}
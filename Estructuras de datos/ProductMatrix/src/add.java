public class add {
    public static int[][] LeBigAdd(int[][] matrizA, int[][] matrizB) {
        
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("Las matrices tienen dimensiones diferentes. No se pueden sumar.");
            return null;
        }

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9}
        };

        int[][] resultadoSuma = LeBigAdd(matrizA, matrizB);

        if (resultadoSuma != null) {
            System.out.println("La suma de las matrices es:");
            for (int i = 0; i < resultadoSuma.length; i++) {
                for (int j = 0; j < resultadoSuma[0].length; j++) {
                    System.out.print(resultadoSuma[i][j]);
                }
                System.out.println();
            }
        }
    }
}
public class Contador {
    public static void main(String[] args) throws Exception {

        int contador = 1;

        while (contador <= 10) {
            System.out.println("Hola " + contador);
            contador++;
            Thread.sleep(500);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boiQuantity = 0;

        Profesor profe1;
        profe1 = new Profesor("Pepe");

        System.out.println("Cuantos boyos vas a calificar?");

        Scanner teclado = new Scanner(System.in);
        boiQuantity = teclado.nextInt(); 

        
    }
}

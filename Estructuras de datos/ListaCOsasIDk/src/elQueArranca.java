import java.util.Scanner;

public class elQueArranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc;
        String otraOpc, sector, telefono, nombre, apellidos;

        opc = Integer.parseInt(teclado.nextLine());

        
        ListaContactos lista = new ListaContactos();

        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. Salir");

        while (opc != 7) {

            switch (opc) {
                case 1:

                    System.out.println("Persona(p)/Empresa(e)");
                    otraOpc = teclado.nextLine();

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:
                    System.out.println("Nopper boyo");
                    break;
            }

        }

    }
}

import java.util.Scanner;

public class elQueArranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc;
        String otraOpc, email, sector, telefono, nombre, apellidos;

        opc = Integer.parseInt(teclado.nextLine());

        
        listaContactos lista = new listaContactos();

        System.out.println("1. Dar de alta Persona/Empresa");
        System.out.println("2. Dar de baja Persona/Empresa");
        System.out.println("3. Modify contact");
        System.out.println("4. Listar ");
        System.out.println("5. Cuantas empresas por sector");
        System.out.println("6. Mostrar emails orden alfabetico");
        System.out.println("7. Salir");

        while (opc != 7) {

            switch (opc) {
                case 1:

                    System.out.println("Persona(p)/Empresa(e)");
                    otraOpc = teclado.nextLine();

                while (opc != 2 ) {
                    
                }

                    if (otraOpc.equals('p')) {
                        while ()
                    } else {
                        if (otraOpc.equals('e')) {
                            
                        } else {
                            System.out.println("Illo loco que me has puesto");
                        }
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    lista.listarDatos();
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


//TODO: Para el ordenador de casa
    //Arreglar ErrorLens, revisar ArrayList y los archivos Persona y Empresa; por algun motivo funcionan como el
    //orto y no los coge bien. Probablemente sea algo relacionado con la estructura de carpetas horrible que tengo
    //probar a iniciarlo en una carpeta aislada o algo idk
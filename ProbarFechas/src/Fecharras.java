public class Fecharras {
    public static void main(String[] args) throws Exception {
        String texto, palabra;

        texto = new String("Hola");
        palabra = new String("caracola"); // <-- texto almacenado en la string

        System.out.println(texto);
        System.out.println(palabra);

        palabra = texto + " " + palabra;

        System.out.println(palabra);

        System.out.println(texto.indexOf(palabra));

        int longitud;

        //for int i=longitud-1; i>=0;i--{
//          alReves=alReves+texto.chatAt(i)
        //}

        

        char ultimoChar;

        ultimoChar = texto.charAt(longitud-1);

    }
}

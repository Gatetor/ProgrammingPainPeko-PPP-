public class Caesar {

    public static String cifrar(String texto) {

        
        String textoCifrado = "";
        int charCifrado;
        int posicion;
        char letra;

        for (int i = 0; i < texto.length(); i++) {

            letra = texto.charAt(i);
            if (letra == 'x') {
                charCifrado = 'a';
            } else {
                if (letra == 'y') {
                    charCifrado = 'b';
                } else {
                    if (letra == 'z') {
                        charCifrado = 'c';
                    } else {
                        charCifrado = letra + 3;
                    }
                }
            }
            textoCifrado = textoCifrado + (char) charCifrado;
        }

        // A --> 64
        // a --> 97 (+32, se activa un bit)

        // indexOf --> posicion
        // letra.charAt(posicion)

        return textoCifrado;
    }

    public static String descifrar(String texto) {

        
        String textoDescifrado = "";
        int charCifrado;
        char letra;

        for (int i = 0; i < texto.length(); i++) {

            letra = texto.charAt(i);
            if (letra == 'a') {
                charCifrado = 'x';
            } else {
                if (letra == 'b') {
                    charCifrado = 'y';
                } else {
                    if (letra == 'c') {
                        charCifrado = 'z';
                    } else {
                        charCifrado = letra - 3;
                    }
                }
            }
            textoDescifrado = textoDescifrado + (char) charCifrado;
        }

        // A --> 64(
        // a --> 97 (+32, se activa un bit)

        // indexOf --> posicion
        // letra.charAt(posicion)


        // for (int i = 0; i < texto.length(); i++) {
        //     letra= texto.charAt(i);
        //     posicion=letra.indexOf(letra);
        //     posicion=posicion+3;
        // }

        return textoDescifrado;
    }

    



}
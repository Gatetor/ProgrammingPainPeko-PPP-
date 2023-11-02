public class imparity {
    public static void main(String[] args) throws Exception {
        
        int pog, impar, suma, contador;

        pog=200;
        suma=0;
        contador=1;
        impar=1;

        while (contador<=10) {
            suma=suma+impar;
        contador++;
        impar+=2;
        pog=pog-2;
        System.out.println("La suma total es: "+suma);
        Thread.sleep(pog);
        System.out.println("El contador va por: "+contador);
        Thread.sleep(pog);
        }
      

        // impar=impar+2 == impar+=2;




    }
}

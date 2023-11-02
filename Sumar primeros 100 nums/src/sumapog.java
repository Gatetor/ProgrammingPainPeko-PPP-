public class sumapog {
    public static void main(String[] args) throws Exception {
        
        int pog, suma, contador;

        pog=200;
        suma=0;
        contador=1;

        while (contador<=100) {
            suma=suma+contador;
        contador++;
        pog=pog-2;
        System.out.println("La suma total es: "+suma);
        Thread.sleep(pog);
        System.out.println("El contador va por: "+contador);
        Thread.sleep(pog);
        }
      

        // impar=impar+2 == impar+=2;




    }
}

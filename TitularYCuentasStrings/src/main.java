public class main {
    public static void main(String[] args) throws Exception {

        Cuenta cuenta1;
        Titular titular1;

        titular1 = new Titular("0000001M", "Alv" , 3.14 , "Madre Loco");
        cuenta1 = new Cuenta(1, 3.14, titular1);

        System.out.println(cuenta1.mostrar());

    }

}

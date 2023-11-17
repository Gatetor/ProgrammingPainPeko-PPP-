public class Cuenta {
    private int id;
    private double saldo;
    private Titular titular;


    public Cuenta(int id, double saldo, Titular titular) {
       this.id = id;
       this.saldo = saldo;
       this.titular = titular;
    }

    public String toStringCuenta() {
        return "Cuenta [id=" + id + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

    public String mostrar() {
        String todo;
        todo = this.toStringCuenta();
        return todo;
    }

    public static void main(String[] args) throws Exception {
    
        Cuenta cuenta1;
        Titular titular1;
    
        titular1 = new Titular("0000001M", "Alv" , 3.14 , "Madre Loco");
        cuenta1 = new Cuenta(1, 3.14, titular1);
    
        System.out.println(cuenta1.mostrar());
    
    }



}

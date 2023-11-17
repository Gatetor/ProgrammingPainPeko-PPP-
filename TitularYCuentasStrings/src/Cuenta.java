import java.util.Scanner;

public class Cuenta {
    private int id;
    private double saldo;
    private Titular titular;
    private double cantidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

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

    public double ingresar() {
        this.setCantidad(cantidad);
        return saldo;
    }

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        Cuenta cuenta1;
        Titular titular1;

        titular1 = new Titular("0000001M", "Alv", 3.14, "Madre Loco");
        cuenta1 = new Cuenta(1, 3.14, titular1);

        System.out.println("Cantidad a ingresar?");
        System.out.println("Cantidad actual: " + cuenta1.saldo);

        this.cantidad = teclado.nextDouble();

        System.out.println(cuenta1.mostrar());

    }

}

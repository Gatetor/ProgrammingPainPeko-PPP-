import java.time.LocalDate;
import java.util.Scanner;

public class Cuenta {
    private int id;
    private double saldo;
    private Titular titular;
    private double cantidad = -1;

    Scanner teclado = new Scanner(System.in);

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
        return "Cuenta [id = " + id + ", saldo = " + saldo + ", titular = " + titular + "]";
    }

    public String mostrar() {
        String todo;
        todo = this.toStringCuenta();
        return todo;
    }

    // public void ingresar(double cantidad) {
    // FIXME: Esto es el metodo pero con la cosa del parentesis
    // if (cantidad > 0) {
    // this.saldo+=cantidad
    // }
    // }

    public double ingresar() {
        while (cantidad < 0) {
            System.out.println("Cantidad a ingresar?");
            System.out.println("Cantidad actual: " + this.saldo);
            cantidad = teclado.nextDouble();
            if (cantidad > 0) {
                this.setCantidad(cantidad);
                this.saldo += cantidad;
                System.out.println("Dinero ingresado: " + cantidad);
                System.out.print("Nuevo saldo :" + this.getSaldo());
            } else {
                System.out.println("Bro, ingresar dinero negativo? :v");
            }
        }
        cantidad = -1;
        return saldo;
    }

    public double retirar() {

        while (cantidad < 0) {
            System.out.println("Cantidad a retirar?");
            System.out.println("Cantidad actual: " + this.saldo);
            cantidad = teclado.nextDouble();
            if ((cantidad > 0) && (saldo - cantidad > 0)) {
                this.setCantidad(cantidad);
                saldo = saldo - cantidad;
                System.out.println("Dinero retirado: " + cantidad);
                System.out.println("Nuevo saldo :" + this.getSaldo());
            } else {
                if (cantidad < 0) {
                    System.out.println("FUCKING NEGATIVE NUM?????? :v");
                } else {
                    if (saldo - cantidad < 0) {
                        System.out.println(
                                "Tas broke bro, no hay suficiente dinero en tu cuenta como para retirar esa cantidubi");
                        cantidad = -1;
                    }
                }

            }
        }
        cantidad = -1;
        return saldo;
    }

    // sin mensaje?
    // TODO: Hacer el for con contadorDiferencias++

    public boolean compararIdCuenta(Cuenta cuenta2) {
        boolean iguales = false;

        if (this.id == cuenta2.id) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }
}

// public boolean igualQue(Titular titular) {
// boolean iguales = false;
// if (this) {

// }
// }

// public boolean compararTitular(Cuenta cuenta2) {

// if (this.titular.igualQue(cuenta2.titular)) {
// return true;
// } else {
// return false;
// }
// }

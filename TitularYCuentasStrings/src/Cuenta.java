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

    public double ingresar() {

        while (cantidad < 0) {
            System.out.println("Cantidad a ingresar?");
            System.out.println("Cantidad actual: " + this.saldo);
            cantidad = teclado.nextDouble();
            if (cantidad > 0) {
                this.setCantidad(cantidad);
                saldo = saldo + cantidad;
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

    // public int compararIdCuenta(Cuenta cuenta2) {
    //     int siono;

    //     int id1 = cuenta2.getId();
    //     int id2;

    //     if () {
            
    //     } else {
            
    //     }

    //     return siono;
    // }

    public static void main(String[] args) throws Exception {

        Cuenta cuenta1, cuenta2;
        Titular titular1, titular2;

        int opc, opcCuenta;

        titular1 = new Titular("0000001M", "Alv", "Madre Loco");
        titular2 = new Titular("0222002A", "Poggers", "Tolaila");

        cuenta1 = new Cuenta(1, 3.14, titular1);
        cuenta2 = new Cuenta(2, 420.69, titular2);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Con qué cuenta vamos a trabajar?");
        System.out.println("1. Cuenta 1");
        System.out.println("2. Cuenta 2");

        opcCuenta = teclado.nextInt();

        System.out.println("Menu");
        System.out.println("");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");

        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                if (opcCuenta == 1) {
                    cuenta1.ingresar();
                } else {
                    cuenta2.ingresar();
                }

                break;

            case 2:
                if (opcCuenta == 1) {
                    cuenta1.retirar();
                } else {
                    cuenta2.retirar();
                }
                break;

            default:
                System.out.println("*Pinkmin noise*");
                break;
        }
        System.out.println(cuenta1.mostrar());
        System.out.println(cuenta2.mostrar());

        teclado.close();
    }

}

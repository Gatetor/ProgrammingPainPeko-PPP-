import java.util.Scanner;

public class Cuenta {
    private int cantidad;
    private int suma;
    private int id;

    public Cuenta() {

        this.cantidad = 0;
        this.id = 0;

    }

    Scanner teclado = new Scanner(System.in);

    public int ingresar() {
        System.out.println("Cantidad en esta cuenta: " + this.getCantidad());
        System.out.println("Cuanto desea ingresar?");

        suma = teclado.nextInt();

        this.setCantidad(cantidad + suma);

        return getCantidad();
    }

    public String mostrar() {
        return "Cuenta [cantidad=" + cantidad + ", id=" + id + "]";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

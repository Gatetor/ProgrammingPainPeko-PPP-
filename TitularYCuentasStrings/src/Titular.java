import java.time.LocalDate;

public class Titular {
    private String nif = "nifpog";
    private String nombre = "nombrepog";
    private String apellidos = "apepog";
    private LocalDate fecha;

    Titular titular1;

    public Titular(String nif, double saldo, Titular titular) {
       this.nif = "";
       this.nombre = "";
       this.apellidos = "";
       //this.fecha =
    }
    
    

    @Override
    public String toString() {
        return "titular [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + "]";
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

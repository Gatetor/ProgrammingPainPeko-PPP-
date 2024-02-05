public class Producto {

    public String nombre;
    public String codigo;
    public String precio;
    public String existencias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getExistencias() {
        return existencias;
    }

    public void setExistencias(String existencias) {
        this.existencias = existencias;
    }

    // TODO: tipo enumerado para el estado civil en el otro ejercicio
    // abstracto: no crea objeto, sirve para plantilla de la que heredan otros
    // metodos pueden ser NO abstractos si todos los hijos van a funcionar de igual
    // menera
    // los metodos abstractos pueden adaptarse a las necesidades de los hijos (por
    // ejemplo del metodo dibujar tiene que ser abstracto bcs no dibujas un
    // triangulo de la misma manera que un rectangulo)

}
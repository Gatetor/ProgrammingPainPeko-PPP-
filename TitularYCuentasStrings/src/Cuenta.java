public class Cuenta {
    private int id;
    private double saldo;
    private Titular titular;


    public Cuenta(int id, double saldo, Titular titular) {
       this.id = 0;
       this.saldo = 0;
       
    }

    public String toStringCuenta() {
        return "Cuenta [id=" + id + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

    public String mostrar() {
        String todo;
        todo = this.toStringCuenta();
        todo = todo + this.titular.getNif();
        todo = todo + this.titular.getNombre();
        todo = todo + this.titular.getApellidos();
        return todo;
    }



}

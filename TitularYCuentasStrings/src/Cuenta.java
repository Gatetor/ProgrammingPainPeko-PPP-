public class Cuenta {
    private int id;
    private double saldo;
    private Titular titular;

    Cuenta cuenta1;

    public Cuenta(int id, double saldo, Titular titular) {
       this.id = 0;
       this.saldo = 0;
       
    }

    @Override
    public String toString() {
        return "Cuenta [id=" + id + ", saldo=" + saldo + ", titular=" + titular + ", cuenta1=" + cuenta1 + "]";
    }

    public String mostrar() {
        String todo;
        todo = this.titular.toString();
        todo = todo + this.toString();
        return todo;
    }



}

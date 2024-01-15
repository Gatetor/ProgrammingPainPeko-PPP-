import java.util.ArrayList;

public class listaContactos {

    ArrayList<Persona> listaPersonas;
    ArrayList<Empresa> listaEmpresas;

    public void altaPersona(Persona p) {

    }

    public void altaEmpresa(Empresa e) {
        this.listaEmpresas(e);
    }

    public boolean baja() {
        boolean yesnt = false;

        return yesnt;
    }

    public boolean modyPhone(int id, String nuevoPhone) {
        boolean yesnt = false;

        return yesnt;
    }

    public void listarDatos() {
        // mostrar los datos de la listao

        for (Persona p : this.listaPersonas) {
            System.out.println(p);
        }
        for (int i = 0; i < this.listaEmpresas.size(); i++) {
            System.out.println(this.listaEmpresas.get(i));
        }
    }

    public int numeroEmpresasPorSector(String sector) {
        int num = 0;

        return num;
    }

    public void listarPorEmail() {

    }

}

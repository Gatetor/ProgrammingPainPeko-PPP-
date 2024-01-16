import java.util.ArrayList;

public class listaContactos {

    ArrayList<Persona> listaPersonas;
    ArrayList<Empresa> listaEmpresas;

    public void altaPersona(Persona p) {
        int posicion;
        boolean resultado;
        if ((posicion = this.buscarPersona(id)) != -1) {
            Persona persona = this.listaPersoas.get(posicion);
            persona.setTelefono(nuevoTelefono);
            this.listaPersonas.remove(posicion);
            resultado = true;
        } else {
            if ((posicion = this.buscarEmpresa(id)) != 1) {
                this.listaEmpresas.remove(posicion);
                resultado = true;
            } else {
                resultado = false;
            }
        }
    }

    public void altaEmpresa(Empresa e) {
        this.listaEmpresas(e);
    }

    // TODO: Whatever the fuck is this
    // int posicion;
    // boolean resultado;
    // if ((posicion = this.buscarPersona(id)) != -1) {
    // Persona persona=this.listaPersoas.get(posicion)
    // persona.setTelefono(nuevoTelefono)
    // this.listaPersonas.set(posicion,persona); <-- alta
    // this.listaPersonas.remove(posicion); <-- baja
    // resultado = true;
    // } else {
    // if ((posicion = this.buscarEmpresa(id)) != 1) {
    // this.listaEmpresas.remove(posicion);
    // resultado = true;
    // } else {
    // resultado = false;
    // }
    // }

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

    @Override
    public String toString() {
        return "listaContactos [listaPersonas=" + listaPersonas + ", listaEmpresas=" + listaEmpresas + "]";
    }

    public int numeroEmpresasPorSector(String sector) {
        int num = 0;

        return num;
    }

    public void listarPorEmail() {

    }

}

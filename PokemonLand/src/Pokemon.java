public class Poki {

    private char tipo;
    private int atk;
    private int dfn;
    private int hp;

    public char getTipo() {
        return tipo;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk; // this se refiere a "este objeto"
    }

    public int getDfn() {
        return dfn;
    }

    public int getHp() {
        return hp;
    }

    public Poki(String string, int atk, int dfn, int hp) {
        this.tipo = string;
        this.atk = atk;
        this.dfn = dfn;
        this.hp = hp;
    }

    public Poki() {
    }

    @Override
    public String toString() {
        return "Poki [tipo=" + tipo + ", atk=" + atk + ", dfn=" + dfn + ", hp=" + hp + "]";
    }

    // teniendo los datos hasta aqui, tenemos un setup basico llamado POJO

    public void comerBaya() {
        this.hp += 5;
        // necesita el return para que no te de error si es int
    }

    public void zzz() {
        // TODO limitar veces de descanso
        this.dfn += 4;
    }

    public int ganador = 0;

    public int lucha(Poki otherPoki) { // Poki <-- Clase otherPoki <-- Variable?
                                             // Poki contra el que va a luchar
        

        while ((this.hp > 0) && (otherPoki.hp > 0)) { //si alguno muere termina
            this.hp -= (otherPoki.atk - this.dfn); //mi ataque - su defensa
            otherPoki.hp -= (this.atk - otherPoki.dfn); //su ataque - mi defensa
        }

        if (this.hp > otherPoki.hp) {
            this.ganador=1;
        } else {
            if (otherPoki.hp > this.hp) {
                this.ganador=2;
            } else {
                this.ganador=3;
            }
        }

        

        //TODO completar como se elige ganador
        return ganador;
    }

    public int getGanador() {
        return ganador;
    }

    public void nombreRandom() {
    }

    public void ponerNombre() {
    }

    public void setTipo() {
    }

}

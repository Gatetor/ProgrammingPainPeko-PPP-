public class Jugador {

    private double altura;
    private double perdouble;
    private double pertriple;
    private int num;
    private int canstadoble;
    private int canastatriple;

    public Jugador() {
        this.altura = 1.85;
        this.perdouble = 40;
        if (perdouble > 100) {
            perdouble = 100;
        }
        this.pertriple = 25;
        if (pertriple > 100) {
            pertriple = 100;
        }
        this.num = 1;
        this.canastatriple = 0;
        this.canstadoble = 0;
    }

    public Jugador(double altura, double perdouble, double pertriple, int num, int canstadoble, int canastatriple) {
        // la variable escrita aqui (this.altura) se refiere al atributo que hay aqui
        // arriba
        this.altura = altura;
        this.perdouble = perdouble;
        if (perdouble > 100) {
            perdouble = 100;
        }
        this.pertriple = pertriple;
        if (pertriple > 100) {
            pertriple = 100;
        }
        this.num = num;
        this.canastatriple = canstadoble;
        this.canstadoble = canastatriple;
    }

    public int getCanstadoble() {
        return canstadoble;
    }

    public void setCanstadoble(int canstadoble) {
        this.canstadoble = canstadoble;
    }

    public int getCanastatriple() {
        return canastatriple;
    }

    public void setCanastatriple(int canastatriple) {
        this.canastatriple = canastatriple;
    }

    public int getNum() {
        return num;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerdouble() {
        return perdouble;
    }

    public void setPerdouble(double perdouble) {
        this.perdouble = perdouble;
    }

    public double getPertriple() {
        return pertriple;
    }

    @Override
    public String toString() {
        return "Jugador " + num;
    }

    public void setPertriple(double pertriple) {
        this.pertriple = pertriple;
    }

    public void entrenar_dos() {
        if (Math.random() < 0.5) {
            this.setPerdouble(perdouble + 0.5); // se ejecuta con 50% prob
            System.out.println(this + " entrenó con exito " + perdouble + ", probabilidad ");

        } else {
            System.out.println(this + " no entréno con exito ");
            // 50% probabilidad
        }
    }

    public void entrenar_tres() {
        if (Math.random() < 0.5) {
            this.setPertriple(pertriple + 0.5); // se ejecuta con 50% prob
            System.out.println(this + " entrenó triples con exito " + perdouble + ", probabilidad ");

        } else {
            System.out.println(this + " no entréno triples con exito ");
            // 50% probabilidad
        }
    }

    public void lanzarTRES() throws InterruptedException {
        if ((Math.random() * 100) < this.getPertriple()) {
            System.out.println("ABSOLUTE INSANITY TREMENDO TRIPLE AAAAAAAAAAAAAAAAAAAA");
            System.out.println(this + " Lleva " + this.getCanastatriple() + " tremendos triples");
            System.out.println();
            Thread.sleep(300);

            canastatriple++;
            Thread.sleep(300);

        } else {
            System.out.println(this + " no metió triple *sad* ");
            System.out.println();

            Thread.sleep(300);
        }
    }

    public void lanzarDOS() throws InterruptedException {
        if ((Math.random() * 100) < this.getPerdouble()) {
            System.out.println("LOCOOOOOOOOOOO CANASTA DOBLE SIIIIUUUUUUUUUUUUUUUUUUUUUUUUUU");

            canstadoble++;
            System.out.println(this + " Lleva " + this.getCanstadoble() + " canastas dobles");
            System.out.println();
            Thread.sleep(300);
        } else {
            System.out.println(this + " no metió doble :( *sad* ");
            System.out.println();
            Thread.sleep(300);
        }
    }

    public void entrenar_dos(int dias) {
        for (int i = 1; i < dias; i++) {
            entrenar_dos();
        }
    }

    public void entrenar_tres(int dias) {
        for (int i = 0; i < dias; i++) {
            entrenar_tres();
        }
    }

    // if(Math.random()<0.4)
    // {
    // //se ejecuta con 40% prob
    // } else {
    // //60% probabilidad
    // }
    // }

}
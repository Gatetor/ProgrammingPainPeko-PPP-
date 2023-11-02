public class Car {

    private String Marca;
    private int año;
    private int volmotor;
    private char fuel;
    private String tipo;
    private int puertas;
    private int seats;
    private int maxspeed;
    private String color;
    private int currentspeed;
    private int cantidad;

    public Car() {

        this.Marca = "Koenigsegg";
        this.año = 1900;
        this.volmotor = 5000;
        this.fuel = 'D';
        this.tipo = "Supercoche";
        this.puertas = 2;
        this.seats = 2;
        this.maxspeed = 400;
        this.color = "Blanco";
        this.currentspeed = 200;

    }

    @Override
    public String toString() {
        return "Car [Marca=" + Marca + ", año=" + año + ", volmotor=" + volmotor + ", fuel=" + fuel + ", tipo=" + tipo
                + ", puertas=" + puertas + ", seats=" + seats + ", maxspeed=" + maxspeed + ", color=" + color
                + ", currentspeed=" + currentspeed + "]";
    }

    public int slow() {
        this.setCurrentspeed(currentspeed - this.getCantidad());
        return getCurrentspeed();
    }

    public int LESGO() {
        if (currentspeed + cantidad > maxspeed) {
            System.out.println("Te pasaste loco, te pongo al ma que te permite el coche");
            this.setCurrentspeed(currentspeed = 400);
            return getCurrentspeed();
        } else {
            this.setCurrentspeed(currentspeed + this.getCantidad());
            return getCurrentspeed();
        }

    }

    public int frenar() {
        this.setCurrentspeed(currentspeed = 0);
        return getCurrentspeed();
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVolmotor() {
        return volmotor;
    }

    public void setVolmotor(int volmotor) {
        this.volmotor = volmotor;
    }

    public char getFuel() {
        return fuel;
    }

    public void setFuel(char fuel) {
        this.fuel = fuel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}


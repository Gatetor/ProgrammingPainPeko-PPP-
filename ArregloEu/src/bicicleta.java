package objetos;

public class bicicleta {
	// the Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;
        
    // the Bicycle class has one constructor (he puesto el void por recomendacion del programa)
    public void Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int cadence) {
        cadence = cadence;
    }
        
    public void setGear(int gear) {
        gear = gear;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void mostrarDatos() {
    	System.out.println("Cadence: "+this.cadence);
    	System.out.println("Gear: "+this.gear);
    	System.out.println("Speed: "+this.speed);
    }
}

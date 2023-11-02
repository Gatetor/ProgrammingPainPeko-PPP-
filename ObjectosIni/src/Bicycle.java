// int pokemonID;
// int hp;
// double atk;
// double dfn;
//                                    <-- INEFICIENTE, mejor usar obetos para dar propiedades a cada entidad
// int pokemon2ID;
// int hp2;
// double atk2;
// double dfn2;

//Las CLASES definen como van a ser los objetos que se van a utilizar
//System.out <-- esto es un objeto?? :OOOO 
//System.in <-- LO MISMO PERO PARA ENTRADA???? WHAT ;O;
//Scanner teclado = new Scanner(System.in); <-- oBjEtO oRiEnTaDo A eNtRaDa???

//vamos a hacer cosas privadas en clase :/?
//se necesita un constructor con el mismo nombre que la clase

//los void son paquetes de instrucciones que se pueden llamar

//int cantidad;
//bici1.speedUp(cantidad)

public class Bicycle { // crear clase bicicleta

    // the Bicycle class has
    // three fields
    private int cadence;
    private int gear;
    private int speed;

    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) { // crear constructor
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public Bicycle() { // puede haber varios; para que haya referencia al de por defecto? :D
        gear = 1;
        cadence = 2;
        speed = 3;
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int cadence) { // <-- esto es un metodo :O
        cadence = cadence;
    }

    // click derecho, source actions; create getters and setters for EZEZ stuff

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        gear = gear;
    }

    // this.gear haría referencia al objeto que llama al metodo

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // significa que la velocidad solo puede subir y bajar, no obtener
    // un valor directamente
    public void speedUp(int increment) { // hay que cambiar void por int; porque void NO devuelve nada
        speed += increment; // y queremos que haga RETURN
        // return speed; //devuelve un valor y termina la ejecucion del metodo
    }

    public int getSpeed() { // set para crear/dar y get para obtener
        return speed;
    }

    public void getData() {
        System.out.println("Candence: " + this.cadence);
        System.out.println("Gear: " + this.gear);
        System.out.println("Speed: " + this.speed);
    }

    public class MountainBike extends Bicycle {

        // the MountainBike subclass has
        // one field
        public int seatHeight;

        // the MountainBike subclass has
        // one constructor
        public MountainBike(int startHeight, int startCadence,
                int startSpeed, int startGear) {
            super(startCadence, startSpeed, startGear);
            seatHeight = startHeight;
        }

        // the MountainBike subclass has
        // one method
        public void setHeight(int Height) {
            seatHeight = seatHeight;
        }

    }

}

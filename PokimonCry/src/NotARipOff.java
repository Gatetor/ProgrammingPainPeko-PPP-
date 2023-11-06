public class NotARipOff {
    public static void main(String[] args) {

        Poki Planty, Fuegy, Awawa, primerPoki;

        int ganador;

        Planty = new Poki("HierbaBuena", 400, 500, 500);
        Fuegy = new Poki("Fuegoso", 50, 3, 28);
        Awawa = new Poki("Bezolla", 40, 50, 50);
        primerPoki = new Poki();

        // System.out.println(Planty);
        // Planty.comerBaya(); // esto hace que el pokemon 1 se coma una baya y sus
        // puntos de vida aumenten
        // System.out.println("Pokimon come baya, suma +5hp " + Planty);

        System.out.println(primerPoki);

        primerPoki.setTipo();

        System.out.println(primerPoki);

        System.out.println("A luchar owo");

        // ganador = firstPoki.getGanador();
        ganador = 0;

        if (ganador == 1) {
            System.out.println("Has ganado!");
        } else {
            if (ganador == 2) {
                System.out.println("Has perdido :(");
            } else {
                System.out.println("Habeis empatado!");
            }
        }

    }
}

package objetos;

import java.util.Scanner;

public class AprendiendoObjetos {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int gear, speed, cadence, bici, cantidad, opcion, bici1, bici2;
		
		System.out.println("1. Cambiar marcha\r\n"
				+ "2. Acelerar\r\n"
				+ "3. Frenar \r\n"
				+ "4. Mostrar datos \r\n"
				+ "5. Salir");
		opcion=teclado.nextInt();
		
		while (opcion!=5) {
			switch(opcion) {
			
			case 1:
				System.out.println("1. Bici1 o Bici2:");
				bici=teclado.nextInt();
				while(bici<1 || bici>2) {
					System.out.println("1. Bici1 o 2. Bici2");
					bici=teclado.nextInt();
				}
				System.out.println("Nueva marcha:");
				cantidad=teclado.nextInt();
				if(bici==1) {
					bici1.setGear(cantidad);
				}else {
					bici2.setGear(cantidad);
				}
				break;
				
			case 2:
				System.out.println("1. Bici1 o Bici2:");
				bici=teclado.nextInt();
				while(bici<1 || bici>2) {
					System.out.println("1. Bici1 o 2. Bici2");
					bici=teclado.nextInt();
				}
				System.out.println("Acelerar:");
				cantidad=teclado.nextInt();
				if(bici==1) {
					bici1.speedUp(cantidad);
				}else {
					bici2.speedUp(cantidad);
				}
				break;
				
			case 3:
				System.out.println("1. Bici1 o Bici2:");
				bici=teclado.nextInt();
				while(bici<1 || bici>2) {
					System.out.println("1. Bici1 o 2. Bici2");
					bici=teclado.nextInt();
				}
				System.out.println("Frenar:");
				cantidad=teclado.nextInt();
				if(bici==1) {
					bici1.applyBreak(cantidad);
				}else {
					bici2.applyBreak(cantidad);
				}
				break;
				
			case 4:
				System.out.println("1. Bici1 o Bici2:");
				bici=teclado.nextInt();
				while(bici<1 || bici>2) {
					System.out.println("1. Bici1 o 2. Bici2");
					bici=teclado.nextInt();
				}
				if(bici==1) {
					System.out.println("Cadence:"+bici1.getCadence());
					System.out.println("Gear:"+bici1.getGear());
					System.out.println("Speed:"+bici1.getSpeed());
				}else {
					bici2.mostrarDatos();
				}
				break;
				
			case 5:
				System.out.println("Gracias por usar bicicleta.");
				System.exit(0);
			}
			
			System.out.println("1. Cambiar marcha\r\n"
					+ "2. Acelerar\r\n"
					+ "3. Frenar \r\n"
					+ "4. Mostrar datos \r\n"
					+ "5. Salir");
			opcion=teclado.nextInt();
		}
	}
}
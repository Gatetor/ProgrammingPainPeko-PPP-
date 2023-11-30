import java.util.Scanner;
import java.util.regex.Pattern;

public class ComparameEsta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String texto;
		boolean b = false;
		
		System.out.println ("Escriba por pantalla lo que se le pide a continuación.");
		
		while (!b) {
			
			System.out.println ("1. 1 minúscula");
				texto = sc.nextLine();
			b = Pattern.matches("[a-z]",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("2. 1 mayúscula o 1 minúscula");
				texto = sc.nextLine();
			b = Pattern.matches("[a-zA-Z]",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("3. x, y o z + 1 número");
				texto = sc.nextLine();
			b = Pattern.matches("[x-z]\\d",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("4. 1 máyuscula 0-n veces + 1 número");
				texto = sc.nextLine();
			b = Pattern.matches("[A-Z]*\\d",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("5. 8 números + 1 mayúscula");
				texto = sc.nextLine();
			b = Pattern.matches("\\d{8}[A-Z]",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("6. (+,num,num)opcional + 9-12 números");
				texto = sc.nextLine();
			b = Pattern.matches("[+\\d{2}]?\\d{9,12}",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("7. aaaa/mm/dd o aaaa-mm-dd");
				texto = sc.nextLine();
			b = Pattern.matches("\\d{4}/\\d{2}/\\d{2}|\\d{4}-\\d{2}-\\d{2}",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("8. email");
				texto = sc.nextLine();
			b = Pattern.matches(".+@.+\\..+",texto);
			System.out.println (b);
		}
		b = false;
		
		while (!b) {
			
			System.out.println ("9. dirección IPV4 válida");
				texto = sc.nextLine();
			b = Pattern.matches("[[0-9][0-9]||1[0-9][0-9]||2[0-4][0-9]||25[0-5].]{3}[0-9][0-9]||1[0-9][0-9]||2[0-4][0-9]||25[0-5]",texto);
			System.out.println (b);
		}
		
		sc.close();
	}
}
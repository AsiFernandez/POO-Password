import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Password{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Password> contrasenias = new ArrayList<Password>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< 5; i++) {
			
			System.out.println("Contrasenia " + (i+1) + " de " + 5);
			
			Password contrasenia1 = new Password();
			String Contrasenia = contrasenia1.generarPassword();
			int Longitud = contrasenia1.longitudPassword(Contrasenia);
			
			contrasenia1.setContrase�a(Contrasenia);
			contrasenia1.setLongitud(Longitud);
			
			contrasenias.add(contrasenia1);
		}
		
		for(int i= 0; i<=contrasenias.size(); i++) {
			System.out.println("Contrase�a " + (i+1));
			System.out.println("Contrase�a Guardada " + contrasenias.get(i).getContrase�a());
			System.out.println("Longitud de la contrase�a " + contrasenias.get(i).getLongitud());
			System.out.println("Es fuerte la contrase�a " + contrasenias.get(i).esFuerte());
		 
		}	 
		
		
	
		
		
	}

}

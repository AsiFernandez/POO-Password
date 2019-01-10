import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main extends Password{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Password> contrasenias = new ArrayList<Password>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< 1; i++) {
			
			System.out.println("Contrasenia " + (i+1) + " de " + 5);
			
			Password contrasenia1 = new Password();
			String Contrasenia = contrasenia1.generarPassword();
			int Longitud = contrasenia1.longitudPassword(Contrasenia);
			
			contrasenia1.setContraseña(Contrasenia);
			contrasenia1.setLongitud(Longitud);
			
			contrasenias.add(contrasenia1);
		} 
		
		Iterator<Password> i = contrasenias.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
				
	}

}

import java.util.Scanner;

public class Password {
 
	private String contrase�a;
	private int longitud;
	
	
	//GETTERS Y SETTERS
	
	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	//CONSTRUCTOR
	 public Password (int longitud){
	        this.longitud=longitud;
	        contrase�a=generarPassword();
	    }
 
	
	//COMPROBAR SI LA CONTRASE�A ES FUERTE O NO
	 public boolean esFuerte(){
		boolean fuerte = true;
		int minusculas = 0;
		int mayusculas = 0; 
		int numeros = 0;
		
		for(int i= 0; i <= longitud; i++) {
			if(Character.isUpperCase(i)) {
				mayusculas ++;
			}else if (Character.isLowerCase(i)) {
				minusculas ++;
			}else {
				numeros ++;
			}
		} 
		
		if (mayusculas > 2 && minusculas > 1 && numeros >5 ) {
			fuerte = true;
		}else {
			fuerte = false;
		}
		 
		 return fuerte;
	}
	 
	 
	// COMPROBAR LA LONGITUD DE LA CONTRASE�A
	 public  int longitudPassword(String Password){
		 int longitud = this.getLongitud();
		 
		 return longitud;
	 }
	 
	 
	 //CREAR CONTRASE�A
	 public String generarPassword(){
	 
	String contrasenia = "";
	boolean aceptable;
		 
	do {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Introduce una contrase�a");
		 contrasenia = scan.nextLine();
		 
		if(contrasenia.length() < 11){
			aceptable = false;
		}
		
		for(int i = 0; i< contrasenia.length(); i++) {
			if (Character.isLetter(contrasenia.charAt(i))) {
				aceptable = false;
			}else {
				aceptable = true;
			}
		}
		 
	 }while(aceptable = false );
	 
	 return contrasenia;
	 }
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

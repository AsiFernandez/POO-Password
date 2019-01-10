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
	 public Password (){
	        
	        
	    }
 
	
	//COMPROBAR SI LA CONTRASE�A ES FUERTE O NO
	 public boolean esFuerte(){
		boolean fuerte = true;
		int minusculas = 0;
		int mayusculas = 0; 
		int numeros = 0;
		
		for(int i= 0; i <= contrase�a.length(); i++) {
			if(Character.isUpperCase(i)) {
				mayusculas = mayusculas +1;
			}else if (Character.isLowerCase(i)) {
				minusculas = minusculas +1;
			}else {
				numeros ++;
			}
		} 
		
		if ( mayusculas > 2 && minusculas > 1 && numeros >5 ) {
			fuerte = false;
		}else {
			fuerte = true;
		}
		 return fuerte;
	}
	 
	 
	// COMPROBAR LA LONGITUD DE LA CONTRASE�A
	 public  int longitudPassword(String Password){
		 int longitud = Password.length();
		 
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
		 
		if(contrasenia.length() > 11){
			aceptable = true;
			
			for(int i = 0; i< contrasenia.length(); i++) {
				if (Character.isLetter(contrasenia.charAt(i))) {
					aceptable = true;
				}else if(Character.isDigit(contrasenia.charAt(i))){
					aceptable = true;
				}else {
					aceptable = false;
				}
			}
		}else {
			aceptable = false;
		}
		
		 
	 }while(aceptable != true );
	 
	 return contrasenia;
	 }
		 
	 @Override
	 public String toString() {
		 return "Longitud de la contrase�a:" + this.longitud
				 + "\nContrase�a fuerte: " + esFuerte() 
				 + "\nContrse�a: " + this.contrase�a
				 + " \n";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

import java.util.Scanner;

public class Password {
 
	private String contraseña;
	private int longitud;
	
	
	//GETTERS Y SETTERS
	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
 
	
	//COMPROBAR SI LA CONTRASEÑA ES FUERTE O NO
	 public boolean esFuerte(){
		boolean fuerte = true;
		int minusculas = 0;
		int mayusculas = 0; 
		int numeros = 0;
		
		for(int i= 0; i <= contraseña.length(); i++) {
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
	 
	 
	// COMPROBAR LA LONGITUD DE LA CONTRASEÑA
	 public  int longitudPassword(String Password){
		 int longitud = Password.length();
		 
		 return longitud;
	 }
	 
	 
	 //CREAR CONTRASEÑA
	 public String generarPassword(){
	 
	String contrasenia = "";
	boolean aceptable;
		 
	do {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Introduce una contraseña");
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
		 return "Longitud de la contraseña:" + this.longitud
				 + "\nContraseña fuerte: " + esFuerte() 
				 + "\nContrseña: " + this.contraseña
				 + " \n";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

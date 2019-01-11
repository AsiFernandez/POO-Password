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
	 public boolean esFuerte()
	 {
		
		int minusculas = 0;
		int mayusculas = 0; 
		int numeros = 0;
		
		
		 for (int i=0;i<contraseña.length();i++)
		 {
             if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                 minusculas+=1;
             }else if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                     mayusculas+=1;
             }else{
                 numeros+=1;
                 }
             
         }
         //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
         if (numeros>=5 && minusculas>=1 && mayusculas>=2)
         return true;
         else
         return false;
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

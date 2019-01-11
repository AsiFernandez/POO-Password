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
	 public boolean esFuerte()
	 {
		
		int minusculas = 0;
		int mayusculas = 0; 
		int numeros = 0;
		
		
		 for (int i=0;i<contrase�a.length();i++)
		 {
             if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                 minusculas+=1;
             }else if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
                     mayusculas+=1;
             }else{
                 numeros+=1;
                 }
             
         }
         //Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
         if (numeros>=5 && minusculas>=1 && mayusculas>=2)
         return true;
         else
         return false;
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

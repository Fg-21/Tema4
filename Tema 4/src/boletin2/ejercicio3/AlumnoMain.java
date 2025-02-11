package boletin2.ejercicio3;

public class AlumnoMain {
public static void main(String[] args) {
	//Objetos alumno
	Alumno a1 = new Alumno("Fran González", 6.5);
	Alumno a2 = new Alumno("Fran González", 6.5);
	
	
	//Método to String
	System.out.println(a1 + "\n" + a2);
	
	//Método equals
	System.out.println(a1.equals(a2));
}
	
	
}

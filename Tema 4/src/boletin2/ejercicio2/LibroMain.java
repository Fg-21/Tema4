package boletin2.ejercicio2;

public class LibroMain {
public static void main(String[] args) {
	//Objetos libro
	Libro l1 = new Libro("El Quijote", "Cervantes", 10, 6, "NARRATIVO");
	Libro l2 = new Libro("El Quijotex", "Cervantes", 10, 6, "NARRATIVO");
	
	//Préstamo
	l1.prestamo(2);
	
	//Devolución
	l1.devolucion(4);
	
	//To string
	System.out.println(l1);
	
	//Equals
	System.out.println(l1.equals(l2));
	
	
}
}

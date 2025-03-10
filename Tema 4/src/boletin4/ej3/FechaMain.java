package boletin4.ej3;

public class FechaMain {
	public static void main(String[] args) {
		//Objeto fecha
		Fecha f1 = new Fecha(29, 2, 2004);
		
		//Comprobamos si es bisiesto
		System.out.println(f1.esBissiesto());
		
		//Comprobamos si la fecha es correcta
		System.out.println(f1.fechaCorrecta());
		
		//To string
		System.out.println(f1);
		
		//Incrementamos un dia
		f1.diaSiguiente();
		
		//To string
		System.out.println(f1);
	}
}

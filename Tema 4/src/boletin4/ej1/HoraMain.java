package boletin4.ej1;

public class HoraMain {
	public static void main(String[] args) {
		//Objetos con diferentes horas
		Hora time1 = new Hora(0, 0, 59);
		Hora time2 = new Hora(12, 59, 59);
		Hora time3 = new Hora(23, 59, 59);
		

		
		//Muestro la hora
		System.out.println("Hora 1-> " + time1);
		System.out.println("Hora 2-> " + time2);
		System.out.println("Hora 3-> " + time3);
		
		//Salto de linea
		System.out.println();
		
		//Incremento un segundo a los objetos
		time1.increase1Second();
		time2.increase1Second();
		time3.increase1Second();
		
		//Muestro de nuevo
		System.out.println("Hora 1-> " + time1);
		System.out.println("Hora 2-> " + time2);
		System.out.println("Hora 3-> " + time3);
	}
}

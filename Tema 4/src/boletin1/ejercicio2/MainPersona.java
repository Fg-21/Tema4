package boletin1.ejercicio2;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		// Objetos persona definidos
		Persona per1;
		Persona per2;

		// Objeto Scanner
		Scanner rd = new Scanner(System.in);
		
//		Variables para los atributos de Persona
		String dni;
		String nombre;
		String apellidos;
		int edad;

		// Pedimos los datos de las personas por pantalla
		System.out.println("DNI de la persona 1:");
		dni = rd.nextLine();
		System.out.println("Introduce el nombre de la persona 1:");
		nombre = rd.nextLine();
		System.out.println("Apellido de la persona 1:");
		apellidos = rd.nextLine();
		System.out.println("Edad de la persona 1:");
		edad = rd.nextInt();

		//Creamos el objeto per1 con los atributos pedidos al usuario
		per1 = new Persona(dni, nombre, apellidos, edad);
		
		// Limpiamos buffer
		rd.nextLine();

		System.out.println("DNI de la persona 2:");
		dni = rd.nextLine();
		System.out.println("Introduce el nombre de la persona 2:");
		nombre = rd.nextLine();
		System.out.println("Apellido de la persona 2:");
		apellidos = rd.nextLine();
		System.out.println("Edad de la persona 1:");
		edad = rd.nextInt();
		
		//Creamos el objeto per1 con los atributos pedidos al usuario
		per2 = new Persona(dni, nombre, apellidos, edad);

		// Imprimimos los datos y si es mayor de edad
		System.out.println(per1.nombre +  " " + per1.apellidos + " con dni " + per1.dni
				+ (per1.edad >= 18 ? " es mayor de edad" : "es menor de edad"));
		
		System.out.println(per2.nombre + " " + per2.apellidos + " con dni " + per2.dni
				+ (per2.edad >= 18 ? " es mayor de edad" : " es menor de edad"));
		
		//Cerramos scanner
		rd.close();
	}
}

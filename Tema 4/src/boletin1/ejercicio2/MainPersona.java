package boletin1.ejercicio2;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		// Objetos persona
		Persona per1 = new Persona();
		Persona per2 = new Persona();

		// Objeto Scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos los datos de las personas por pantalla
		System.out.println("DNI de la persona 1:");
		per1.dni = rd.nextLine();
		System.out.println("Introduce el nombre de la persona 1:");
		per1.nombre = rd.nextLine();
		System.out.println("Apellido de la persona 1:");
		per1.apellidos = rd.nextLine();
		System.out.println("Edad de la persona 1:");
		per1.edad = rd.nextInt();

		// Limpiamos buffer
		rd.nextLine();

		System.out.println("DNI de la persona 2:");
		per2.dni = rd.nextLine();
		System.out.println("Introduce el nombre de la persona 2:");
		per2.nombre = rd.nextLine();
		System.out.println("Apellido de la persona 2:");
		per2.apellidos = rd.nextLine();
		System.out.println("Edad de la persona 1:");
		per2.edad = rd.nextInt();

		// Imprimimos los datos y si es mayor de edad
		System.out.println(per1.nombre +  " " + per1.apellidos + " con dni " + per1.dni
				+ (per1.edad >= 18 ? " es mayor de edad" : "es menor de edad"));
		
		System.out.println(per2.nombre + " " + per2.apellidos + " con dni " + per2.dni
				+ (per2.edad >= 18 ? " es mayor de edad" : " es menor de edad"));
		
		//Cerramos scanner
		rd.close();
	}
}

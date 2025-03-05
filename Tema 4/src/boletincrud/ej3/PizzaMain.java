package boletincrud.ej3;

import java.util.Scanner;

public class PizzaMain {
	public static void main(String[] args) {
		// Scanner
		Scanner rd = new Scanner(System.in);

		// Opción del usuario
		char option;

		// Codigo de la Pizza
		int code;

		// Tamaño de la pizza
		String tamaño;

		// Tipo de la pizza
		String tipo;

		// Bucle principal del menu
		do {
			// Imprimo menu
			printMenu();

			// Leo la opcion del usuario
			option = rd.next().toLowerCase().charAt(0);
			rd.nextLine();
			switch (option) {
			case 'a' -> {
				// Muestro listado de articulos
				PizzaCRUD.listado();
			}
			case 'b' -> {
				//Pregunto el codigo del pedido, el tamaño y el tipo de la pizza
				System.out.println("Codigo del pedido");
				code = rd.nextInt();
				rd.nextLine();
				
				System.out.println("Tamaño de la pizza");
				tamaño = rd.nextLine();
				
				System.out.println("Tipo de la pizza");
				tipo = rd.nextLine();
				
				//Añadimos un pedido
				PizzaCRUD.addPedido(code, tamaño, tipo);
			}
			case 'c' -> {
				//Pregunto el codigo de la pizza para servirla
				System.out.println("Codigo de la Pizza a servir");
				code = rd.nextInt();
				rd.nextLine();
				
				//Sirvo la pizza
				PizzaCRUD.serve(code);
			}
			}
		} while (option != 'd');

		// Cierro scanner
		rd.close();

	}

	static void printMenu() {
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo Pedido");
		System.out.println("c. Pizza Servida");
		System.out.println("d. Salir");
	}
}

package boletincrud.ej2;

import java.util.Scanner;

public class ArticuloMain {
	public static void main(String[] args) {
		//Scanner
		Scanner rd = new Scanner(System.in);
		
		//Opción del usuario
		char option;
		
		//Nombre del artículo
		String name;
		
		//Precio del artículo
		double price;
		
		//Stock del artículo
		int stock;
		
		//Bucle principal del menú, hasta que no introduzca g no sale
		do {
			//Imprimo menu
			printMenu();
			
			//Leo la opcion del usuario
			option = rd.next().toLowerCase().charAt(0);
			rd.nextLine();
			
			switch (option) {
			case 'a' ->{
				//Muestro listado de articulos
				ArticuloCRUD.listado();
			}
			case 'b' ->{
				//Pregunto, nombre, precio y stock del articulo para añadirlo
				System.out.println("Nombre del articulo a dar de alta");
				name = rd.nextLine();
				System.out.println("Precio sin IVA del articulo a dar de alta");
				price = rd.nextDouble();
				rd.nextLine();
				System.out.println("Stock Inicial del articulo a dar de alta");
				stock = rd.nextInt();
				rd.nextLine();
				
				//Añado el articulo
				ArticuloCRUD.altaArt(name, price, stock);
			}
			case 'c' ->{
				//Pregunto el nombre del articulo a dar de baja
				System.out.println("Nombre del articulo a dar de baja");
				name = rd.nextLine();
				
				//Doy de baja el articulo
				ArticuloCRUD.bajaArt(name);
			}
			case 'd' ->{
				//Pregunto el nombre y el Precio sin IVA del articulo a modificar
				System.out.println("Nombre del articulo a modificar");
				name = rd.nextLine();
				
				System.out.println("Precio sin IVA nuevo");
				price = rd.nextDouble();
				rd.nextLine();
				
				//Modifico el articulo
				ArticuloCRUD.modArt(name, price);
			}
			case 'e' ->{
				//Pregunto el nombre del articulo del que va a entrar stock y el stock que va a entrar
				System.out.println("Nombre del articulo del cual va a entrar mercancia");
				name = rd.nextLine();
				
				System.out.println("Stock que va a entrar");
				stock = rd.nextInt();
				rd.nextLine();
				
				//Añado el stock
				ArticuloCRUD.entradaMerca(name, stock);
			}
			case 'f' ->{
				//Pregunto el nombre del articulo del que va a salir stock y el stock que va a salie
				System.out.println("Nombre del articulo del cual va a salir mercancia");
				name = rd.nextLine();
				
				System.out.println("Stock que va a salir");
				stock = rd.nextInt();
				rd.nextLine();
				
				//Elimino el stock
				ArticuloCRUD.salidaMerca(name, stock);
			}
			}
			
			
		} while (option != 'g');
		
		//Cierro scanner
		rd.close();

	}
	
	static void printMenu() {
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificación");
		System.out.println("e. Entrada de Mercancía");
		System.out.println("f. Salida de Mercancía");
		System.out.println("g. Salir");
	}
}

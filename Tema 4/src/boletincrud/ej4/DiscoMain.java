package boletincrud.ej4;

import java.util.Scanner;

public class DiscoMain {
public static void main(String[] args) {
	Scanner rd = new Scanner(System.in);
	
	char option;
	
	int codigo;
	
	String titulo;
	
	String autor;
	
	int duracion;
	
	String genero;
	
	
	do {
		printMenu();
		option = rd.nextLine().toLowerCase().charAt(0);
		
		switch (option) {
		case 'a' ->{
			DiscoCRUD.listado();
		}
		case 'b' ->{
			System.out.println("Introduce el codigo del disco");
			codigo = rd.nextInt();
			rd.nextLine();
			
			System.out.println("Introduce el titulo del disco");
			titulo = rd.nextLine();
			
			System.out.println("Introduce el autor del disco");
			autor = rd.nextLine();
			
			System.out.println("Introduce la duracion del disco");
			duracion = rd.nextInt();
			rd.nextLine();
			
			System.out.println("Introduce el genero del disco");
			genero = rd.nextLine();
			
			Disco disc = new Disco(codigo, autor, titulo, duracion, genero);
			
			DiscoCRUD.addDisco(disc);
		}
		case 'c' -> {
			System.out.println("Introduce el codigo del disco a borrar");
			codigo = rd.nextInt();
			rd.nextLine();
			
			Disco disc = new Disco(codigo);
			
			DiscoCRUD.delDisco(disc);
		}
		case 'd' ->{
			System.out.println("Introduce el codigo del disco a modificar");
			codigo = rd.nextInt();
			rd.nextLine();
			
			System.out.println("Introduce el nuevo autor del disco");
			autor = rd.nextLine();
			
			Disco disc = new Disco(codigo);
			
			DiscoCRUD.modDisc(disc, autor);
		}
		}
		
		
	} while(option != 'e');
	
	rd.close();
}
private static void printMenu() {
System.out.println("a.Listado");
System.out.println("b.Añadir");
System.out.println("c.Borrar");
System.out.println("d.Modificar");
System.out.println("e.Salir");
}

	
}


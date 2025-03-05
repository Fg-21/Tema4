package boletincrud.ej5;

import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		//Scanner
		Scanner rd = new Scanner(System.in);
		
		//Opcion del usuario
		char option;
		
		//DNI de la cuenta
		String dni;
		
		//Nombre de la cuenta
		String nombre;
		
		//Saldo de la cuenta
		int saldo;
		
		//Nacionalidad de la cuenta
		String nacionalidad;
		
		//Bucle principal del menu
		do {
			//Imprimo menu
			printMenu();
			
			//Leo la opcion del menu
			option = rd.nextLine().toLowerCase().charAt(0);
			
			switch (option) {
			case 'a' ->{
				//Muestro el conjunto de cuentas
				CuentaCorrienteCRUD.listado();
			}
			case 'b' ->{
				//Pido nombre, dni y nacionalidad de la cuenta, puesto que al crearla su saldo será 0 siempre
				System.out.println("Introduce el DNI de la cuenta");
				dni = rd.nextLine();
				System.out.println("Introduce el Nombre de la cuenta");
				nombre = rd.nextLine();
				System.out.println("Introduce la Nacionalidad de la cuenta (ESPAÑOLA o EXTRANGERA)");
				nacionalidad = rd.nextLine();
				
				//Creo un objeto con estos datos
				CuentaCorriente acc = new CuentaCorriente(dni, nombre, 0, nacionalidad);
				
				//Añado el objeto a la coleccion
				if (CuentaCorrienteCRUD.addCuenta(acc)) {
					System.out.println("Cuenta añadida");
				} else {
					System.out.println("Cuenta no añadida");
				}
			}
			case 'c' -> {
				//Pido dni de la cuenta
				System.out.println("Introduce el DNI de la cuenta");
				dni = rd.nextLine();
				
				//Construyo el la cuenta con el dni
				CuentaCorriente acc = new CuentaCorriente(dni);
				
				//Borro el objeto a la coleccion
				if (CuentaCorrienteCRUD.delCuenta(acc)) {
					System.out.println("Cuenta borrada");
				} else {
					System.out.println("Cuenta no borrada");
				}
			}
			case 'd' ->{
				//Pido dni de la cuenta y saldo a añadir 
				System.out.println("Introduce el DNI de la cuenta");
				dni = rd.nextLine();
				
				System.out.println("Saldo a ingresar");
				saldo = rd.nextInt();
				rd.nextLine();
				
				//Creo un objeto con el dni
				CuentaCorriente acc = new CuentaCorriente(dni);
				
				//Ingreso el dinero en la cuenta
				if (CuentaCorrienteCRUD.ingresar(acc, saldo)) {
					System.out.println("Ingreso realizado");
				} else {
					System.out.println("Ingreso no realizado, ha habido un problema");
				}
				
			}
			case 'e' ->{
				//Pido dni de la cuenta y saldo a retirar 
				System.out.println("Introduce el DNI de la cuenta");
				dni = rd.nextLine();
				
				System.out.println("Saldo a retirar");
				saldo = rd.nextInt();
				rd.nextLine();
				
				//Creo un objeto con el dni
				CuentaCorriente acc = new CuentaCorriente(dni);
				
				//Retiro el dinero de la cuenta
				if (CuentaCorrienteCRUD.retirar(acc, saldo)) {
					System.out.println("Retiro realizado");
				} else {
					System.out.println("Retiro no realizado, ha habido un problema");
				}
			}
			}
			
		} while(option != 'f');
		
		//Cierro scanner
		rd.close();
		
	}
	private static void printMenu() {
		System.out.println("a.Listado");
		System.out.println("b.Añadir Cuenta");
		System.out.println("c.Borrar Cuenta");
		System.out.println("d.Ingresar");
		System.out.println("e.Retirar");
		System.out.println("f.Salir");
		}
	
}

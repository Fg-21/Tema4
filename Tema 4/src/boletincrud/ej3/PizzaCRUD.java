package boletincrud.ej3;

import java.util.ArrayList;

public class PizzaCRUD {
	static ArrayList<Pizza> pedidos = new ArrayList<Pizza>();

	/**
	 * Metodo que da un listado de todos las pedidos agregadas
	 */
	public static void listado() {
		for (Pizza pedido : pedidos) {
			System.out.println(pedido);
		}
	}
	
	/**
	 * Metodo que añade un pedido con una pizza
	 * @param codigo Codigo de la pizza del pedido
	 * @param tamaño Tamaño de la pizza del pedido
	 * @param tipo Tipo de la pizza del pedido
	 * @return True si se ha añadido y false si no
	 */
	public static boolean addPedido(int codigo, String tamaño, String tipo) {
		Pizza pizz = new Pizza(codigo, tamaño, tipo);
		return pedidos.add(pizz);
	}
	
	/**
	 * Metodo que cambia el estado del pedido a servido
	 * @param codigo
	 * @return
	 */
	public static boolean serve(int codigo) {
		boolean served = false;
		
		for (Pizza pizz : pedidos) {
			if (pizz.getCodigo() == codigo) {
				pizz.setState("SERVIDA");
				served = true;
			}
		}
		
		return served;
	}
	
	

}

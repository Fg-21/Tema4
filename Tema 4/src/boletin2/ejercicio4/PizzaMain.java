package boletin2.ejercicio4;

public class PizzaMain {
public static void main(String[] args) {
	//Objetos Pizza
	Pizza pizz1 = new Pizza(2549, "MEDIANA", "FUNGHI");
	Pizza pizz2 = new Pizza(2549, "FAMILIAR", "CUATRO_QUESOS");
	
	//Asignamos el estado de la pizza
	pizz1.setState("servida");
	
	//to String
	System.out.println(pizz1);
	
	//Equals
	System.out.println(pizz1.equals(pizz2));
	
	//to String de la otra pizza
	System.out.println(pizz2);
	
	
}
}

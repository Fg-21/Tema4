package boletin1.ejercicio1;

public class PrincipalPunto {
public static void main(String[] args) {
	
	//Objetos punto
	Punto  punto1 = new Punto(5,0);
	Punto  punto2 = new Punto(10,10);
	Punto  punto3 = new Punto(-3,7);
	
	//Imprimimos las coordenadas de cada punto
	System.out.println(punto1.getX() + ", " + punto1.getY());
	System.out.println(punto2.getX() + ", " + punto2.getY());
	System.out.println(punto3.getX() + ", " + punto3.getY());
}
}

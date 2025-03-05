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
	
	//Modificamos coordenadas
	punto1.setXY(2, 4);
	
	//Imprimimos coordenadas modificadas
	System.out.println("Coords modificadas con setXY: " + punto1.getX() + ", " + punto1.getY());
	
	//Desplazamos las coordenadas uno a la derecha y 2 hacia abajo
	punto1.desplaza(1, -2);
	
	//Imprimimos las coordenadas modificadas
	System.out.println("Coords modificadas con desplaza: " + punto1.getX() + ", " + punto1.getY());
	
	//Calculamos la distancia que hay entre unas coordenadas y las nuestras
	System.out.println("Distancia entre el punto1 y el punto2: " + punto1.distancia(punto2));
	
	//Devolvemos una cadena de las coordenadas usando el toString (Ya implementado en el syso)
	System.out.println("Cadena de las coordenadas con toString: " + punto1);
		
}
}

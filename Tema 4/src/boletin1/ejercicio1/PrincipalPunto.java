package boletin1.ejercicio1;

public class PrincipalPunto {
public static void main(String[] args) {
	
	//Objetos punto
	Punto  punto1 = new Punto();
	Punto  punto2 = new Punto();
	Punto  punto3 = new Punto();
	
	//Asignamos valores a los atributos de punto en los diferentes objetos
	punto1.x = 5;
	punto1.y = 0;
	
	punto2.x = 10;
	punto2.y = 10;
	
	punto3.x = -3;
	punto3.y = 7;
	
	//Imprimimos las coordenadas de cada punto
	System.out.println(punto1.x + ", " + punto1.y);
	System.out.println(punto2.x + ", " + punto2.y);
	System.out.println(punto3.x + ", " + punto3.y);
}
}

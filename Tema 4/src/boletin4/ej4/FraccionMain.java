package boletin4.ej4;

public class FraccionMain {
public static void main(String[] args) {
	//Objeto fraccion
	Fraccion f1 = new Fraccion(18, 16);
	Fraccion f2 = new Fraccion(6, 3);
	
	//Simplificamos
	f1.simplify();
	
	//Muestro la simplificacion
	System.out.println(f1);
	System.out.println(f2);
	
	//Sumamos y mostramos el resultado
	System.out.println(f1.suma(f2));
	
	//Multiplicamos y mostramos el resultado
	System.out.println(f1.multiplica(f2));
	
	//Dividimos y mostramos el resultado
	System.out.println(f1.divide(f2));
	
	
}
}

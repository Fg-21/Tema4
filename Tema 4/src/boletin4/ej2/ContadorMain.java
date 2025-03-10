package boletin4.ej2;

public class ContadorMain {
public static void main(String[] args) {
	//Objeto contador
	Contador c1 = new Contador(2);
	
	//Getter de contador
	System.out.println(c1.getCont());
	
	//Setter de contador
	c1.setCont(-1);
	System.out.println(c1.getCont());
	c1.setCont(1);
	System.out.println(c1.getCont());
	
	//Incrementar
	c1.incrementar();
	System.out.println(c1.getCont());
	
	//Decrementar
	c1.decrementar();
	c1.decrementar();
	System.out.println(c1.getCont());
	c1.decrementar();
	System.out.println(c1.getCont());
	
}
}

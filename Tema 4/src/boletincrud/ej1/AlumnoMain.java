package boletincrud.ej1;

public class AlumnoMain {
	public static void main(String[] args) {
<<<<<<< HEAD

=======
		// Objetos alumno
		Alumno a1 = new Alumno("Fran González", 6.5);
		Alumno a2 = new Alumno("Fran González", 6.5);

		// Método to String
		System.out.println(a1 + "\n" + a2);

		// Método equals
		System.out.println(a1.equals(a2));

		AlumnoCRUD.addAlumno("Fran", 8);
		AlumnoCRUD.addAlumno("Pablo", 8);
		AlumnoCRUD.addAlumno("Angel", 8);

		AlumnoCRUD.listado();
		
		AlumnoCRUD.delAlumno("Fran");
		
		AlumnoCRUD.listado();
>>>>>>> branch 'master' of https://github.com/Fg-21/Tema4.git
		
		
	}

}

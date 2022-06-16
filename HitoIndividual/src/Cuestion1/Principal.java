package Cuestion1;

public class Principal {

	public static void main(String[] args) {
		Profesor miProfesor = new Profesor("Alvaro", "66666666", "Matematicas");
		
		System.out.println(miProfesor.andar(10));
		System.out.println(miProfesor.andar());

	}

}

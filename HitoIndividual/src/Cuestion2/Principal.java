package Cuestion2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Principal {
	public static void main(String[] args) throws FileNotFoundException {

		File fichero = new File("preguntas.txt");
		Scanner lector = new Scanner(fichero);
		Scanner lector1 = new Scanner(System.in);
		String pre1 = lector.nextLine();
		System.out.println("1: " + pre1);
		String resp1 = lector1.nextLine();
		double nota = 0;
		if (resp1.equals("Madrid")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		}else{
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre2 = lector.nextLine();
		System.out.println("2: " + pre2);
		String resp2 = lector1.nextLine();
		if (resp2.equals("Antártida")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;

		}
		String pre3 = lector.nextLine();
		System.out.println("3: " + pre3);
		String resp3 = lector1.nextLine();
		if (resp3.equals("Ulán Bator")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre4 = lector.nextLine();
		System.out.println("4: " + pre4);
		String resp4 = lector1.nextLine();
		if (resp4.equals("Amazonas")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre5 = lector.nextLine();
		System.out.println("5: " + pre5);
		String resp5 = lector1.nextLine();
		if (resp5.equals("Isabel")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre6 = lector.nextLine();
		System.out.println("6: " + pre6);
		String resp6 = lector1.nextLine();
		if (resp6.equals("América del Sur")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre7 = lector.nextLine();
		System.out.println("7: " + pre7);
		String resp7 = lector1.nextLine();
		if (resp7.equals("Grecia")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre8 = lector.nextLine();
		System.out.println("8: " + pre8);
		String resp8 = lector1.nextLine();
		if (resp8.equals("Mamífero")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre9 = lector.nextLine();
		System.out.println("9: " + pre9);
		String resp9 = lector1.nextLine();
		if (resp9.equals("Italia")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre10 = lector.nextLine();
		System.out.println("10: " + pre10);
		String resp10 = lector1.nextLine();
		if (resp10.equals("Rusia")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		System.out.println("--------FIN DEL TEST----------");
		System.out.println("-------NOTA TEST: " + nota + "----");
		lector.close();
	}

}
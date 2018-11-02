package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Problemas losProblemas = new Problemas();
		System.out.println("Hola");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = "";
		String gola = "";
		
		while(!(cadena = br.readLine()).equals("")) {
			gola += cadena;
		}
	
		String[] numeros = gola.split("");
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
	}

}

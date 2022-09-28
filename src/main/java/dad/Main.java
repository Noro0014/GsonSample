package dad;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		p.setNombre(entrada.nextLine());
		
		System.out.println("Introduce tu apellido: ");
		p.setApellidos(entrada.nextLine());
		
		System.out.println("Introduce tu edad: ");
		p.setEdad(entrada.nextInt());
		
		entrada.close();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		
		
		
		

	}

}

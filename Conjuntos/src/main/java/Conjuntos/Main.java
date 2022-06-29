package Conjuntos;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/*
		  // Set<Integer> numeros = new HashSet<>(); // Imprime, mas imprime os números
		  em // ordem aleatória. Set<Integer> numeros = new LinkedHashSet<>(); //
		  Imprime os números ordem crescente.
		  
		  numeros.add(1); numeros.add(2); numeros.add(10); numeros.add(22);
		  
		  for (Integer n : numeros) { System.out.println("=> " + n); }
		  
		  System.out.println(numeros.contains(2)); // Verifica se o número existe
		  dentro do Array. Retorna True or False.
		 */
		
		Mes m1 = new Mes("Janeiro",1);
		Mes m2 = new Mes("Fevereiro",2);
		Mes m3 = new Mes("Março", 3);
		Mes m4 = new Mes("Abril", 4);
		
		Set<Mes> meses = new HashSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
	}

}

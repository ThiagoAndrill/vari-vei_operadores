package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1_Explicacao {

	public static void main(String[] args) {

		//Explicação sobre Colleciton
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(3);
		minhaLista.add(10);
		
		for(Integer listaElementos:minhaLista)	{
			
			System.out.println(listaElementos);
			
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista)	{
					
			System.out.println(listaElementos);
					
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da lista é: "+primeiroElemento);
		
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++);
		
			System.out.println("\nElemento: "+minhaLista.get(i));		
		}
	
		Collections.sort(minhaLista);
}

package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(new Integer(12).intValue());
		lst.add(new String("Opaa"));
		lst.add(new Boolean(true));
		// a linha abaixo dá exceção pois compara objetos diferentes para ordenar.
		Arrays.sort(lst.toArray());		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).toString());
		}
		
	}
}

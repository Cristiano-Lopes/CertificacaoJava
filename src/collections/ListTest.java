package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList();
		nomes.add("William");
		nomes.add("DevDojo");
		
		nomes.remove(0);
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			nomes.add("Cristiano");
		}

		// for (String nome : nomes) {
		// System.out.println(nome);
		// }
		// nomes.add("Suanne");
		//
		// for (String nome : nomes) {
		// System.out.println(nome);
		// }

	}

}

package wladyka.rodrigo.palavrasEmbaralhas.bancoPalavras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDePalavras {

	private static List<String> palavras = new ArrayList<>();

	public BancoDePalavras() {
		carregarPalavras();
	}

	public String next() {
		int size = palavras.size();
		int random = (int) (Math.random() * (size - 1));
		return palavras.get(random);
	}

	public static boolean hasNext() {
		return !palavras.isEmpty();
	}

	public boolean contains(String palavra) {
		return palavras.contains(palavra);
	}

	public int quantidade() {
		return palavras.size();
	}

	public void remover(String palavra) {
		palavras.remove(palavras.indexOf(palavra));
	}

	@SuppressWarnings("resource")
	private void carregarPalavras() {
		Scanner scan = null;
		File file = new File("files/palavras");
		try {
			scan = new Scanner(file).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scan.hasNext()) {
			palavras.add(scan.next());
		}
	}

}

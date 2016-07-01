package wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {

	private List<String> palavras = new ArrayList<>();

	public BancoDePalavras() {
		carregarPalavras();
	}

	public String next() {
		Random generator = new Random();
		int random = generator.nextInt(palavras.size());
		return palavras.get(random);
	}

	public boolean hasNext() {
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

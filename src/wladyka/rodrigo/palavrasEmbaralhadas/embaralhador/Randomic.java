package wladyka.rodrigo.palavrasEmbaralhadas.embaralhador;

import java.util.Random;

public class Randomic implements Embaralhador {

	private Integer[] randomizados;
	private int tamanhoPalavra;
	private Random generetor = new Random();

	@Override
	public String embaralhar(String palavra) {
		String embaralhada = "";
		char[] chars = palavra.toCharArray();
		tamanhoPalavra = palavra.length();
		randomizados = new Integer[tamanhoPalavra];
		for (int i = 0; i < palavra.length(); i++) {
			int random = random();
			embaralhada += chars[random];
		}
		return embaralhada;
	}

	public int random() {
		do {
			int random = generetor.nextInt(tamanhoPalavra);
			if (randomizados[random] == null) {
				randomizados[random] = random;
				return random;
			}
		} while (true);
	}

}

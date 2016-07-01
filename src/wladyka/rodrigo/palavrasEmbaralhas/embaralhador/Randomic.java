package wladyka.rodrigo.palavrasEmbaralhas.embaralhador;

public class Randomic implements Embaralhador {

	private Integer[] randomizados;
	private int tamanhoPalavra;

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
			int random = (int) (Math.random() * tamanhoPalavra);
			if (randomizados[random] == null) {
				randomizados[random] = random;
				return random;
			}
		} while (true);
	}

}

package wladyka.rodrigo.palavrasEmbaralhadas.embaralhador;

public class TrasPraFrente implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String embaralhada = "";
		char[] chars = palavra.toCharArray();
		for (int i = palavra.length() - 1; i >= 0; i--) {
			embaralhada += chars[i];
		}
		return embaralhada;
	}

}

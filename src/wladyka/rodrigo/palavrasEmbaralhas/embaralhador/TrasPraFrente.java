package wladyka.rodrigo.palavrasEmbaralhas.embaralhador;

public class TrasPraFrente implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder embaralhada = new StringBuilder(palavra);
		return embaralhada.reverse().toString();
	}

}

package wladyka.rodrigo.palavrasEmbaralhas.model;

public class Erro {

	private String palavra;
	private String erro;

	public Erro(String palavra, String erro) {
		this.palavra = palavra;
		this.erro = erro;
	}

	public String getPalavra() {
		return palavra;
	}

	public String getErro() {
		return erro;
	}

	@Override
	public String toString() {
		return "Palavra Correta: " + palavra + " Palavra Digitada: " + erro;
	}

}

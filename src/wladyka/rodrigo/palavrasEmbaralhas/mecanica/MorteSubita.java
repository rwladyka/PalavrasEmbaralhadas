package wladyka.rodrigo.palavrasEmbaralhas.mecanica;

public class MorteSubita extends MecanicaAbstract {

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
			return true;
		}
		adicionarErro(palavra, indicacao);
		return false;
	}

}

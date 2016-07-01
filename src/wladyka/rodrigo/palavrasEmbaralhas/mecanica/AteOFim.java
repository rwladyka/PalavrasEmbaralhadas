package wladyka.rodrigo.palavrasEmbaralhas.mecanica;

import wladyka.rodrigo.palavrasEmbaralhas.bancoPalavras.BancoDePalavras;

public class AteOFim extends MecanicaAbstract {

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
		} else {
			adicionarErro(palavra, indicacao);
		}
		return BancoDePalavras.hasNext();
	}

}

package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;

public class AteOFim extends MecanicaAbstract {

	public AteOFim(BancoDePalavras banco) {
		super(banco);
	}

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
		} else {
			adicionarErro(palavra, indicacao);
		}
		return hasNext();
	}

	@Override
	public String toString() {
		return "Até o Fim";
	}

}
